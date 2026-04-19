---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventWriter$.html
title: EventWriter$
---

# EventWriter$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class EventWriter$

- java.lang.Object
- - akka.persistence.typed.internal.EventWriter$

- ---

```
public class EventWriter$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventWriter$](EventWriter$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventWriter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[EventWriter.Command](EventWriter.Command.html "interface in akka.persistence.typed.internal")>` | `[apply](#apply(akka.actor.typed.ActorRef,akka.persistence.typed.internal.EventWriter.EventWriterSettings))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[JournalProtocol.Message](../../JournalProtocol.Message.html "interface in akka.persistence")> journal,  [EventWriter.EventWriterSettings](EventWriter.EventWriterSettings.html "class in akka.persistence.typed.internal") settings)` |  |
	| `[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[EventWriter.Command](EventWriter.Command.html "interface in akka.persistence.typed.internal")>` | `[apply](#apply(java.lang.String,akka.persistence.typed.internal.EventWriter.EventWriterSettings))​(java.lang.String journalPluginId,  [EventWriter.EventWriterSettings](EventWriter.EventWriterSettings.html "class in akka.persistence.typed.internal") settings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventWriter$](EventWriter$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventWriter$
		
		
		
		```
		public EventWriter$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[EventWriter.Command](EventWriter.Command.html "interface in akka.persistence.typed.internal")> apply​(java.lang.String journalPluginId,
		                                           [EventWriter.EventWriterSettings](EventWriter.EventWriterSettings.html "class in akka.persistence.typed.internal") settings)
		```
		- #### apply
		
		
		
		```
		public [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[EventWriter.Command](EventWriter.Command.html "interface in akka.persistence.typed.internal")> apply​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[JournalProtocol.Message](../../JournalProtocol.Message.html "interface in akka.persistence")> journal,
		                                           [EventWriter.EventWriterSettings](EventWriter.EventWriterSettings.html "class in akka.persistence.typed.internal") settings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/JournalProtocol.Message.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventWriter$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventWriter.Command.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventWriter.EventWriterSettings.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventWriter$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventWriter$.html)*
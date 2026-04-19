---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriter.html
title: EventWriter
---

# EventWriter

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class EventWriter

- java.lang.Object
- - akka.persistence.typed.internal.EventWriter

- ---

```
public class EventWriter
extends java.lang.Object
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[EventWriter.AskMaxSeqNrReason](EventWriter.AskMaxSeqNrReason.html "interface in akka.persistence.typed.internal")` |  |
	| `static interface` | `[EventWriter.Command](EventWriter.Command.html "interface in akka.persistence.typed.internal")` |  |
	| `static class` | `[EventWriter.EventWriterSettings](EventWriter.EventWriterSettings.html "class in akka.persistence.typed.internal")` |  |
	| `static class` | `[EventWriter.EventWriterSettings$](EventWriter.EventWriterSettings$.html "class in akka.persistence.typed.internal")` |  |
	| `static class` | `[EventWriter.Write](EventWriter.Write.html "class in akka.persistence.typed.internal")` |  |
	| `static class` | `[EventWriter.Write$](EventWriter.Write$.html "class in akka.persistence.typed.internal")` |  |
	| `static class` | `[EventWriter.WriteAck](EventWriter.WriteAck.html "class in akka.persistence.typed.internal")` |  |
	| `static class` | `[EventWriter.WriteAck$](EventWriter.WriteAck$.html "class in akka.persistence.typed.internal")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventWriter](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[EventWriter.Command](EventWriter.Command.html "interface in akka.persistence.typed.internal")>` | `[apply](#apply(akka.actor.typed.ActorRef,akka.persistence.typed.internal.EventWriter.EventWriterSettings))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[JournalProtocol.Message](../../JournalProtocol.Message.html "interface in akka.persistence")> journal,  [EventWriter.EventWriterSettings](EventWriter.EventWriterSettings.html "class in akka.persistence.typed.internal") settings)` |  |
	| `static [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[EventWriter.Command](EventWriter.Command.html "interface in akka.persistence.typed.internal")>` | `[apply](#apply(java.lang.String,akka.persistence.typed.internal.EventWriter.EventWriterSettings))​(java.lang.String journalPluginId,  [EventWriter.EventWriterSettings](EventWriter.EventWriterSettings.html "class in akka.persistence.typed.internal") settings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventWriter
		
		
		
		```
		public EventWriter()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[EventWriter.Command](EventWriter.Command.html "interface in akka.persistence.typed.internal")> apply​(java.lang.String journalPluginId,
		                                                  [EventWriter.EventWriterSettings](EventWriter.EventWriterSettings.html "class in akka.persistence.typed.internal") settings)
		```
		- #### apply
		
		
		
		```
		public static [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[EventWriter.Command](EventWriter.Command.html "interface in akka.persistence.typed.internal")> apply​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[JournalProtocol.Message](../../JournalProtocol.Message.html "interface in akka.persistence")> journal,
		                                                  [EventWriter.EventWriterSettings](EventWriter.EventWriterSettings.html "class in akka.persistence.typed.internal") settings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.Message.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriter.AskMaxSeqNrReason.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriter.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriter.EventWriterSettings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriter.EventWriterSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriter.Write$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriter.Write.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriter.WriteAck$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriter.WriteAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriter.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriter.html)*
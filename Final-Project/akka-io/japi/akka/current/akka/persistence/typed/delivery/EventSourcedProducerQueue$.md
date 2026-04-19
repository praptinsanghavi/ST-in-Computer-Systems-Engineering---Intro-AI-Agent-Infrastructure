---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue$.html
title: EventSourcedProducerQueue$
---

# EventSourcedProducerQueue$

## Content

Package [akka.persistence.typed.delivery](package-summary.html)
## Class EventSourcedProducerQueue$

- java.lang.Object
- - akka.persistence.typed.delivery.EventSourcedProducerQueue$

- ---

```
public class EventSourcedProducerQueue$
extends java.lang.Object
```

`DurableProducerQueue` that can be used with [`ProducerController`](../../../actor/typed/delivery/ProducerController.html "class in akka.actor.typed.delivery")
 for reliable delivery of messages. It is implemented with Event Sourcing and stores one
 event before sending the message to the destination and one event for the confirmation
 that the message has been delivered and processed.
 
 The `DurableProducerQueue.LoadState` request is used at startup to retrieve the unconfirmed messages.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventSourcedProducerQueue$](EventSourcedProducerQueue$.html "class in akka.persistence.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSourcedProducerQueue$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(akka.persistence.typed.PersistenceId))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId)` |  |
	| `<A> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(akka.persistence.typed.PersistenceId,akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,  [EventSourcedProducerQueue.Settings](EventSourcedProducerQueue.Settings.html "class in akka.persistence.typed.delivery") settings)` |  |
	| `<A> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[create](#create(akka.persistence.typed.PersistenceId))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId)` | Java API |
	| `<A> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[create](#create(akka.persistence.typed.PersistenceId,akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,  [EventSourcedProducerQueue.Settings](EventSourcedProducerQueue.Settings.html "class in akka.persistence.typed.delivery") settings)` | Java API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventSourcedProducerQueue$](EventSourcedProducerQueue$.html "class in akka.persistence.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventSourcedProducerQueue$
		
		
		
		```
		public EventSourcedProducerQueue$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>> apply​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId)
		```
		- #### apply
		
		
		
		```
		public <A> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>> apply​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                                           [EventSourcedProducerQueue.Settings](EventSourcedProducerQueue.Settings.html "class in akka.persistence.typed.delivery") settings)
		```
		- #### create
		
		
		
		```
		public <A> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>> create​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId)
		```
		
		Java API
		- #### create
		
		
		
		```
		public <A> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>> create​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                                            [EventSourcedProducerQueue.Settings](EventSourcedProducerQueue.Settings.html "class in akka.persistence.typed.delivery") settings)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue.Settings.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/delivery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue$.html)*
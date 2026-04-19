---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:28:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/event/ActorEventBus.html
title: ActorEventBus
---

# ActorEventBus

## Content

Package [akka.event](package-summary.html)
## Interface ActorEventBus

- All Superinterfaces:
`[EventBus](EventBus.html "interface in akka.event")`

All Known Subinterfaces:
`[LoggingBus](LoggingBus.html "interface in akka.event")`

All Known Implementing Classes:
`[EventStream](EventStream.html "class in akka.event")`

---

```
public interface ActorEventBus
extends [EventBus](EventBus.html "interface in akka.event")
```

Represents an EventBus where the Subscriber type is ActorRef

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `int` | `[compareSubscribers](#compareSubscribers(akka.actor.ActorRef,akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") a,  [ActorRef](../actor/ActorRef.html "class in akka.actor") b)` |  |
	
	
		- ### Methods inherited from interface akka.event.[EventBus](EventBus.html "interface in akka.event")
		
		
		`[publish](EventBus.html#publish(akka.event.EventBus)), [subscribe](EventBus.html#subscribe(akka.event.EventBus,akka.event.EventBus)), [unsubscribe](EventBus.html#unsubscribe(akka.event.EventBus)), [unsubscribe](EventBus.html#unsubscribe(akka.event.EventBus,akka.event.EventBus))`

- - ### Method Detail
	
	
	
		- #### compareSubscribers
		
		
		
		```
		int compareSubscribers​([ActorRef](../actor/ActorRef.html "class in akka.actor") a,
		                       [ActorRef](../actor/ActorRef.html "class in akka.actor") b)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventBus.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LoggingBus.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/event/ActorEventBus.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/event/ActorEventBus.html)*
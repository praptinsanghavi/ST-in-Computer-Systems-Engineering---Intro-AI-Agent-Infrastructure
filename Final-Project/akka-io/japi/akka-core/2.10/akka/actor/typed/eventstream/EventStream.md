---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:20:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/eventstream/EventStream.html
title: EventStream
---

# EventStream

## Content

Package [akka.actor.typed.eventstream](package-summary.html)
## Class EventStream

- java.lang.Object
- - akka.actor.typed.eventstream.EventStream

- ---

```
public class EventStream
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[EventStream.Command](EventStream.Command.html "interface in akka.actor.typed.eventstream")` | The set of commands accepted by the `akka.actor.typed.ActorSystem.eventStream`. |
	| `static class` | `[EventStream.Publish](EventStream.Publish.html "class in akka.actor.typed.eventstream")<[E](EventStream.Publish.html "type parameter in EventStream.Publish")>` | Publish an event of type E by sending this command to  the `akka.actor.typed.ActorSystem.eventStream`. |
	| `static class` | `[EventStream.Publish$](EventStream.Publish$.html "class in akka.actor.typed.eventstream")` |  |
	| `static class` | `[EventStream.Subscribe](EventStream.Subscribe.html "class in akka.actor.typed.eventstream")<[E](EventStream.Subscribe.html "type parameter in EventStream.Subscribe")>` | Subscribe a typed actor to listen for types and subtypes of E  by sending this command to the `akka.actor.typed.ActorSystem.eventStream`. |
	| `static class` | `[EventStream.Subscribe$](EventStream.Subscribe$.html "class in akka.actor.typed.eventstream")` |  |
	| `static class` | `[EventStream.Unsubscribe](EventStream.Unsubscribe.html "class in akka.actor.typed.eventstream")<[E](EventStream.Unsubscribe.html "type parameter in EventStream.Unsubscribe")>` | Unsubscribe all subscriptions created by this actor from the event stream  by sending this command to the `akka.actor.typed.ActorSystem.eventStream`. |
	| `static class` | `[EventStream.Unsubscribe$](EventStream.Unsubscribe$.html "class in akka.actor.typed.eventstream")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventStream](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventStream
		
		
		
		```
		public EventStream()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/eventstream/EventStream.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/eventstream/EventStream.Publish$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/eventstream/EventStream.Publish.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/eventstream/EventStream.Subscribe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/eventstream/EventStream.Subscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/eventstream/EventStream.Unsubscribe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/eventstream/EventStream.Unsubscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/eventstream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/eventstream/EventStream.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/eventstream/EventStream.html)*
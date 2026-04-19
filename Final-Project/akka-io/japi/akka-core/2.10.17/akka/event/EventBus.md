---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:28:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventBus.html
title: EventBus
---

# EventBus

## Content

Package [akka.event](package-summary.html)
## Interface EventBus

- All Known Subinterfaces:
`[ActorEventBus](ActorEventBus.html "interface in akka.event")`, `[LoggingBus](LoggingBus.html "interface in akka.event")`

All Known Implementing Classes:
`[EventStream](EventStream.html "class in akka.event")`

---

```
public interface EventBus
```

Represents the base type for EventBuses
 Internally has an Event type, a Classifier type and a Subscriber type
 
 For the Java API, see akka.event.japi.\*

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[publish](#publish(akka.event.EventBus))​([EventBus](EventBus.html "interface in akka.event") event)` | Publishes the specified Event to this bus |
	| `boolean` | `[subscribe](#subscribe(akka.event.EventBus,akka.event.EventBus))​([EventBus](EventBus.html "interface in akka.event") subscriber,  [EventBus](EventBus.html "interface in akka.event") to)` |  |
	| `void` | `[unsubscribe](#unsubscribe(akka.event.EventBus))​([EventBus](EventBus.html "interface in akka.event") subscriber)` | Attempts to deregister the subscriber from all Classifiers it may be subscribed to |
	| `boolean` | `[unsubscribe](#unsubscribe(akka.event.EventBus,akka.event.EventBus))​([EventBus](EventBus.html "interface in akka.event") subscriber,  [EventBus](EventBus.html "interface in akka.event") from)` | Attempts to deregister the subscriber from the specified Classifier |

- - ### Method Detail
	
	
	
		- #### publish
		
		
		
		```
		void publish​([EventBus](EventBus.html "interface in akka.event") event)
		```
		
		Publishes the specified Event to this bus
		- #### subscribe
		
		
		
		```
		boolean subscribe​([EventBus](EventBus.html "interface in akka.event") subscriber,
		                  [EventBus](EventBus.html "interface in akka.event") to)
		```
		- #### unsubscribe
		
		
		
		```
		boolean unsubscribe​([EventBus](EventBus.html "interface in akka.event") subscriber,
		                    [EventBus](EventBus.html "interface in akka.event") from)
		```
		
		Attempts to deregister the subscriber from the specified Classifier
		
		Returns:
		true if successful and false if not (because it wasn't subscribed
		 to that Classifier, or otherwise)
		- #### unsubscribe
		
		
		
		```
		void unsubscribe​([EventBus](EventBus.html "interface in akka.event") subscriber)
		```
		
		Attempts to deregister the subscriber from all Classifiers it may be subscribed to

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/ActorEventBus.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventBus.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LoggingBus.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventBus.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventBus.html)*
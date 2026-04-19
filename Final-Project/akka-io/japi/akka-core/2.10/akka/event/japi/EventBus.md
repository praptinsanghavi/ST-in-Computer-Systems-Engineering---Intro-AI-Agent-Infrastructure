---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/EventBus.html
title: EventBus
---

# EventBus

## Content

Package [akka.event.japi](package-summary.html)
## Interface EventBus\<E,​S,​C\>

- All Known Implementing Classes:
`[LookupEventBus](LookupEventBus.html "class in akka.event.japi")`, `[ManagedActorEventBus](ManagedActorEventBus.html "class in akka.event.japi")`, `[ScanningEventBus](ScanningEventBus.html "class in akka.event.japi")`, `[SubchannelEventBus](SubchannelEventBus.html "class in akka.event.japi")`

---

```
public interface EventBus<E,​S,​C>
```

Java API: See documentation for [`EventBus`](../EventBus.html "interface in akka.event")
 E is the Event type
 S is the Subscriber type
 C is the Classifier type

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[publish](#publish(E))​([E](EventBus.html "type parameter in EventBus") event)` | Publishes the specified Event to this bus |
	| `boolean` | `[subscribe](#subscribe(S,C))​([S](EventBus.html "type parameter in EventBus") subscriber,  [C](EventBus.html "type parameter in EventBus") to)` | Attempts to register the subscriber to the specified Classifier |
	| `void` | `[unsubscribe](#unsubscribe(S))​([S](EventBus.html "type parameter in EventBus") subscriber)` | Attempts to deregister the subscriber from all Classifiers it may be subscribed to |
	| `boolean` | `[unsubscribe](#unsubscribe(S,C))​([S](EventBus.html "type parameter in EventBus") subscriber,  [C](EventBus.html "type parameter in EventBus") from)` | Attempts to deregister the subscriber from the specified Classifier |

- - ### Method Detail
	
	
	
		- #### publish
		
		
		
		```
		void publish​([E](EventBus.html "type parameter in EventBus") event)
		```
		
		Publishes the specified Event to this bus
		- #### subscribe
		
		
		
		```
		boolean subscribe​([S](EventBus.html "type parameter in EventBus") subscriber,
		                  [C](EventBus.html "type parameter in EventBus") to)
		```
		
		Attempts to register the subscriber to the specified Classifier
		
		Returns:
		true if successful and false if not (because it was already subscribed to that Classifier, or otherwise)
		- #### unsubscribe
		
		
		
		```
		boolean unsubscribe​([S](EventBus.html "type parameter in EventBus") subscriber,
		                    [C](EventBus.html "type parameter in EventBus") from)
		```
		
		Attempts to deregister the subscriber from the specified Classifier
		
		Returns:
		true if successful and false if not (because it wasn't subscribed to that Classifier, or otherwise)
		- #### unsubscribe
		
		
		
		```
		void unsubscribe​([S](EventBus.html "type parameter in EventBus") subscriber)
		```
		
		Attempts to deregister the subscriber from all Classifiers it may be subscribed to

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/EventBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/EventBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/LookupEventBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/ManagedActorEventBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/ScanningEventBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/SubchannelEventBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/EventBus.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/EventBus.html)*
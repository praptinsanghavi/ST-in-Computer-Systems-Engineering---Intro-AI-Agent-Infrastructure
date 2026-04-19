---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:12:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/ScanningEventBus.html
title: ScanningEventBus
---

# ScanningEventBus

## Content

Package [akka.event.japi](package-summary.html)
## Class ScanningEventBus\<E,​S,​C\>

- java.lang.Object
- - akka.event.japi.ScanningEventBus\<E,​S,​C\>

- All Implemented Interfaces:
`[EventBus](EventBus.html "interface in akka.event.japi")<E,​S,​C>`

---

```
public abstract class ScanningEventBus<E,​S,​C>
extends java.lang.Object
implements [EventBus](EventBus.html "interface in akka.event.japi")<E,​S,​C>
```

Java API: See documentation for [`ScanningClassification`](../ScanningClassification.html "interface in akka.event")
 E is the Event type
 S is the Subscriber type
 C is the Classifier type

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ScanningEventBus](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected abstract int` | `[compareClassifiers](#compareClassifiers(C,C))​([C](ScanningEventBus.html "type parameter in ScanningEventBus") a,  [C](ScanningEventBus.html "type parameter in ScanningEventBus") b)` | Provides a total ordering of Classifiers (think java.util.Comparator.compare) |
	| `protected abstract int` | `[compareSubscribers](#compareSubscribers(S,S))​([S](ScanningEventBus.html "type parameter in ScanningEventBus") a,  [S](ScanningEventBus.html "type parameter in ScanningEventBus") b)` | Provides a total ordering of Subscribers (think java.util.Comparator.compare) |
	| `protected abstract boolean` | `[matches](#matches(C,E))​([C](ScanningEventBus.html "type parameter in ScanningEventBus") classifier,  [E](ScanningEventBus.html "type parameter in ScanningEventBus") event)` | Returns whether the specified Classifier matches the specified Event |
	| `void` | `[publish](#publish(E))​([E](ScanningEventBus.html "type parameter in ScanningEventBus") event)` | Publishes the specified Event to this bus |
	| `protected abstract void` | `[publish](#publish(E,S))​([E](ScanningEventBus.html "type parameter in ScanningEventBus") event,  [S](ScanningEventBus.html "type parameter in ScanningEventBus") subscriber)` | Publishes the specified Event to the specified Subscriber |
	| `boolean` | `[subscribe](#subscribe(S,C))​([S](ScanningEventBus.html "type parameter in ScanningEventBus") subscriber,  [C](ScanningEventBus.html "type parameter in ScanningEventBus") to)` | Attempts to register the subscriber to the specified Classifier |
	| `void` | `[unsubscribe](#unsubscribe(S))​([S](ScanningEventBus.html "type parameter in ScanningEventBus") subscriber)` | Attempts to deregister the subscriber from all Classifiers it may be subscribed to |
	| `boolean` | `[unsubscribe](#unsubscribe(S,C))​([S](ScanningEventBus.html "type parameter in ScanningEventBus") subscriber,  [C](ScanningEventBus.html "type parameter in ScanningEventBus") from)` | Attempts to deregister the subscriber from the specified Classifier |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ScanningEventBus
		
		
		
		```
		public ScanningEventBus()
		```

	- ### Method Detail
	
	
	
		- #### compareClassifiers
		
		
		
		```
		protected abstract int compareClassifiers​([C](ScanningEventBus.html "type parameter in ScanningEventBus") a,
		                                          [C](ScanningEventBus.html "type parameter in ScanningEventBus") b)
		```
		
		Provides a total ordering of Classifiers (think java.util.Comparator.compare)
		- #### compareSubscribers
		
		
		
		```
		protected abstract int compareSubscribers​([S](ScanningEventBus.html "type parameter in ScanningEventBus") a,
		                                          [S](ScanningEventBus.html "type parameter in ScanningEventBus") b)
		```
		
		Provides a total ordering of Subscribers (think java.util.Comparator.compare)
		- #### matches
		
		
		
		```
		protected abstract boolean matches​([C](ScanningEventBus.html "type parameter in ScanningEventBus") classifier,
		                                   [E](ScanningEventBus.html "type parameter in ScanningEventBus") event)
		```
		
		Returns whether the specified Classifier matches the specified Event
		- #### publish
		
		
		
		```
		protected abstract void publish​([E](ScanningEventBus.html "type parameter in ScanningEventBus") event,
		                                [S](ScanningEventBus.html "type parameter in ScanningEventBus") subscriber)
		```
		
		Publishes the specified Event to the specified Subscriber
		- #### publish
		
		
		
		```
		public void publish​([E](ScanningEventBus.html "type parameter in ScanningEventBus") event)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#publish(E))`
		Publishes the specified Event to this bus
		
		Specified by:
		`[publish](EventBus.html#publish(E))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](ScanningEventBus.html "type parameter in ScanningEventBus"),​[S](ScanningEventBus.html "type parameter in ScanningEventBus"),​[C](ScanningEventBus.html "type parameter in ScanningEventBus")>`
		- #### subscribe
		
		
		
		```
		public boolean subscribe​([S](ScanningEventBus.html "type parameter in ScanningEventBus") subscriber,
		                         [C](ScanningEventBus.html "type parameter in ScanningEventBus") to)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#subscribe(S,C))`
		Attempts to register the subscriber to the specified Classifier
		
		Specified by:
		`[subscribe](EventBus.html#subscribe(S,C))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](ScanningEventBus.html "type parameter in ScanningEventBus"),​[S](ScanningEventBus.html "type parameter in ScanningEventBus"),​[C](ScanningEventBus.html "type parameter in ScanningEventBus")>`
		Returns:
		true if successful and false if not (because it was already subscribed to that Classifier, or otherwise)
		- #### unsubscribe
		
		
		
		```
		public boolean unsubscribe​([S](ScanningEventBus.html "type parameter in ScanningEventBus") subscriber,
		                           [C](ScanningEventBus.html "type parameter in ScanningEventBus") from)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#unsubscribe(S,C))`
		Attempts to deregister the subscriber from the specified Classifier
		
		Specified by:
		`[unsubscribe](EventBus.html#unsubscribe(S,C))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](ScanningEventBus.html "type parameter in ScanningEventBus"),​[S](ScanningEventBus.html "type parameter in ScanningEventBus"),​[C](ScanningEventBus.html "type parameter in ScanningEventBus")>`
		Returns:
		true if successful and false if not (because it wasn't subscribed to that Classifier, or otherwise)
		- #### unsubscribe
		
		
		
		```
		public void unsubscribe​([S](ScanningEventBus.html "type parameter in ScanningEventBus") subscriber)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#unsubscribe(S))`
		Attempts to deregister the subscriber from all Classifiers it may be subscribed to
		
		Specified by:
		`[unsubscribe](EventBus.html#unsubscribe(S))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](ScanningEventBus.html "type parameter in ScanningEventBus"),​[S](ScanningEventBus.html "type parameter in ScanningEventBus"),​[C](ScanningEventBus.html "type parameter in ScanningEventBus")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/ScanningClassification.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/EventBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/ScanningEventBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/ScanningEventBus.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/ScanningEventBus.html)*
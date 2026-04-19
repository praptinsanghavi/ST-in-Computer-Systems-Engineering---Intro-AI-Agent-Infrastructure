---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:16:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/japi/LookupEventBus.html
title: LookupEventBus
---

# LookupEventBus

## Content

Package [akka.event.japi](package-summary.html)
## Class LookupEventBus\<E,​S,​C\>

- java.lang.Object
- - akka.event.japi.LookupEventBus\<E,​S,​C\>

- All Implemented Interfaces:
`[EventBus](EventBus.html "interface in akka.event.japi")<E,​S,​C>`

---

```
public abstract class LookupEventBus<E,​S,​C>
extends java.lang.Object
implements [EventBus](EventBus.html "interface in akka.event.japi")<E,​S,​C>
```

Java API: See documentation for [`LookupClassification`](../LookupClassification.html "interface in akka.event")
 E is the Event type
 S is the Subscriber type
 C is the Classifier type

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LookupEventBus](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected abstract [C](LookupEventBus.html "type parameter in LookupEventBus")` | `[classify](#classify(E))​([E](LookupEventBus.html "type parameter in LookupEventBus") event)` | Returns the Classifier associated with the given Event |
	| `protected abstract int` | `[compareSubscribers](#compareSubscribers(S,S))​([S](LookupEventBus.html "type parameter in LookupEventBus") a,  [S](LookupEventBus.html "type parameter in LookupEventBus") b)` | Provides a total ordering of Subscribers (think java.util.Comparator.compare) |
	| `protected abstract int` | `[mapSize](#mapSize())()` | This is a size hint for the number of Classifiers you expect to have (use powers of 2\) |
	| `void` | `[publish](#publish(E))​([E](LookupEventBus.html "type parameter in LookupEventBus") event)` | Publishes the specified Event to this bus |
	| `protected abstract void` | `[publish](#publish(E,S))​([E](LookupEventBus.html "type parameter in LookupEventBus") event,  [S](LookupEventBus.html "type parameter in LookupEventBus") subscriber)` | Publishes the given Event to the given Subscriber |
	| `boolean` | `[subscribe](#subscribe(S,C))​([S](LookupEventBus.html "type parameter in LookupEventBus") subscriber,  [C](LookupEventBus.html "type parameter in LookupEventBus") to)` | Attempts to register the subscriber to the specified Classifier |
	| `void` | `[unsubscribe](#unsubscribe(S))​([S](LookupEventBus.html "type parameter in LookupEventBus") subscriber)` | Attempts to deregister the subscriber from all Classifiers it may be subscribed to |
	| `boolean` | `[unsubscribe](#unsubscribe(S,C))​([S](LookupEventBus.html "type parameter in LookupEventBus") subscriber,  [C](LookupEventBus.html "type parameter in LookupEventBus") from)` | Attempts to deregister the subscriber from the specified Classifier |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LookupEventBus
		
		
		
		```
		public LookupEventBus()
		```

	- ### Method Detail
	
	
	
		- #### classify
		
		
		
		```
		protected abstract [C](LookupEventBus.html "type parameter in LookupEventBus") classify​([E](LookupEventBus.html "type parameter in LookupEventBus") event)
		```
		
		Returns the Classifier associated with the given Event
		- #### compareSubscribers
		
		
		
		```
		protected abstract int compareSubscribers​([S](LookupEventBus.html "type parameter in LookupEventBus") a,
		                                          [S](LookupEventBus.html "type parameter in LookupEventBus") b)
		```
		
		Provides a total ordering of Subscribers (think java.util.Comparator.compare)
		- #### mapSize
		
		
		
		```
		protected abstract int mapSize()
		```
		
		This is a size hint for the number of Classifiers you expect to have (use powers of 2\)
		- #### publish
		
		
		
		```
		protected abstract void publish​([E](LookupEventBus.html "type parameter in LookupEventBus") event,
		                                [S](LookupEventBus.html "type parameter in LookupEventBus") subscriber)
		```
		
		Publishes the given Event to the given Subscriber
		- #### publish
		
		
		
		```
		public void publish​([E](LookupEventBus.html "type parameter in LookupEventBus") event)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#publish(E))`
		Publishes the specified Event to this bus
		
		Specified by:
		`[publish](EventBus.html#publish(E))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](LookupEventBus.html "type parameter in LookupEventBus"),​[S](LookupEventBus.html "type parameter in LookupEventBus"),​[C](LookupEventBus.html "type parameter in LookupEventBus")>`
		- #### subscribe
		
		
		
		```
		public boolean subscribe​([S](LookupEventBus.html "type parameter in LookupEventBus") subscriber,
		                         [C](LookupEventBus.html "type parameter in LookupEventBus") to)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#subscribe(S,C))`
		Attempts to register the subscriber to the specified Classifier
		
		Specified by:
		`[subscribe](EventBus.html#subscribe(S,C))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](LookupEventBus.html "type parameter in LookupEventBus"),​[S](LookupEventBus.html "type parameter in LookupEventBus"),​[C](LookupEventBus.html "type parameter in LookupEventBus")>`
		Returns:
		true if successful and false if not (because it was already subscribed to that Classifier, or otherwise)
		- #### unsubscribe
		
		
		
		```
		public boolean unsubscribe​([S](LookupEventBus.html "type parameter in LookupEventBus") subscriber,
		                           [C](LookupEventBus.html "type parameter in LookupEventBus") from)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#unsubscribe(S,C))`
		Attempts to deregister the subscriber from the specified Classifier
		
		Specified by:
		`[unsubscribe](EventBus.html#unsubscribe(S,C))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](LookupEventBus.html "type parameter in LookupEventBus"),​[S](LookupEventBus.html "type parameter in LookupEventBus"),​[C](LookupEventBus.html "type parameter in LookupEventBus")>`
		Returns:
		true if successful and false if not (because it wasn't subscribed to that Classifier, or otherwise)
		- #### unsubscribe
		
		
		
		```
		public void unsubscribe​([S](LookupEventBus.html "type parameter in LookupEventBus") subscriber)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#unsubscribe(S))`
		Attempts to deregister the subscriber from all Classifiers it may be subscribed to
		
		Specified by:
		`[unsubscribe](EventBus.html#unsubscribe(S))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](LookupEventBus.html "type parameter in LookupEventBus"),​[S](LookupEventBus.html "type parameter in LookupEventBus"),​[C](LookupEventBus.html "type parameter in LookupEventBus")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/LookupClassification.html
- https://doc.akka.io/japi/akka/current/akka/event/japi/EventBus.html
- https://doc.akka.io/japi/akka/current/akka/event/japi/LookupEventBus.html
- https://doc.akka.io/japi/akka/current/akka/event/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/japi/LookupEventBus.html](https://doc.akka.io/japi/akka/current/akka/event/japi/LookupEventBus.html)*
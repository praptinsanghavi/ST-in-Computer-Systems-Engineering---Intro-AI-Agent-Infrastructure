---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:12:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/SubchannelEventBus.html
title: SubchannelEventBus
---

# SubchannelEventBus

## Content

Package [akka.event.japi](package-summary.html)
## Class SubchannelEventBus\<E,​S,​C\>

- java.lang.Object
- - akka.event.japi.SubchannelEventBus\<E,​S,​C\>

- All Implemented Interfaces:
`[EventBus](EventBus.html "interface in akka.event.japi")<E,​S,​C>`

---

```
public abstract class SubchannelEventBus<E,​S,​C>
extends java.lang.Object
implements [EventBus](EventBus.html "interface in akka.event.japi")<E,​S,​C>
```

Java API: See documentation for [`SubchannelClassification`](../SubchannelClassification.html "interface in akka.event")
 E is the Event type
 S is the Subscriber type
 C is the Classifier type

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SubchannelEventBus](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected abstract [C](SubchannelEventBus.html "type parameter in SubchannelEventBus")` | `[classify](#classify(E))​([E](SubchannelEventBus.html "type parameter in SubchannelEventBus") event)` | Returns the Classifier associated with the given Event |
	| `void` | `[publish](#publish(E))​([E](SubchannelEventBus.html "type parameter in SubchannelEventBus") event)` | Publishes the specified Event to this bus |
	| `protected abstract void` | `[publish](#publish(E,S))​([E](SubchannelEventBus.html "type parameter in SubchannelEventBus") event,  [S](SubchannelEventBus.html "type parameter in SubchannelEventBus") subscriber)` | Publishes the given Event to the given Subscriber |
	| `abstract [Subclassification](../../util/Subclassification.html "interface in akka.util")<[C](SubchannelEventBus.html "type parameter in SubchannelEventBus")>` | `[subclassification](#subclassification())()` | The logic to form sub\-class hierarchy |
	| `boolean` | `[subscribe](#subscribe(S,C))​([S](SubchannelEventBus.html "type parameter in SubchannelEventBus") subscriber,  [C](SubchannelEventBus.html "type parameter in SubchannelEventBus") to)` | Attempts to register the subscriber to the specified Classifier |
	| `void` | `[unsubscribe](#unsubscribe(S))​([S](SubchannelEventBus.html "type parameter in SubchannelEventBus") subscriber)` | Attempts to deregister the subscriber from all Classifiers it may be subscribed to |
	| `boolean` | `[unsubscribe](#unsubscribe(S,C))​([S](SubchannelEventBus.html "type parameter in SubchannelEventBus") subscriber,  [C](SubchannelEventBus.html "type parameter in SubchannelEventBus") from)` | Attempts to deregister the subscriber from the specified Classifier |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SubchannelEventBus
		
		
		
		```
		public SubchannelEventBus()
		```

	- ### Method Detail
	
	
	
		- #### classify
		
		
		
		```
		protected abstract [C](SubchannelEventBus.html "type parameter in SubchannelEventBus") classify​([E](SubchannelEventBus.html "type parameter in SubchannelEventBus") event)
		```
		
		Returns the Classifier associated with the given Event
		- #### publish
		
		
		
		```
		protected abstract void publish​([E](SubchannelEventBus.html "type parameter in SubchannelEventBus") event,
		                                [S](SubchannelEventBus.html "type parameter in SubchannelEventBus") subscriber)
		```
		
		Publishes the given Event to the given Subscriber
		- #### publish
		
		
		
		```
		public void publish​([E](SubchannelEventBus.html "type parameter in SubchannelEventBus") event)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#publish(E))`
		Publishes the specified Event to this bus
		
		Specified by:
		`[publish](EventBus.html#publish(E))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](SubchannelEventBus.html "type parameter in SubchannelEventBus"),​[S](SubchannelEventBus.html "type parameter in SubchannelEventBus"),​[C](SubchannelEventBus.html "type parameter in SubchannelEventBus")>`
		- #### subclassification
		
		
		
		```
		public abstract [Subclassification](../../util/Subclassification.html "interface in akka.util")<[C](SubchannelEventBus.html "type parameter in SubchannelEventBus")> subclassification()
		```
		
		The logic to form sub\-class hierarchy
		- #### subscribe
		
		
		
		```
		public boolean subscribe​([S](SubchannelEventBus.html "type parameter in SubchannelEventBus") subscriber,
		                         [C](SubchannelEventBus.html "type parameter in SubchannelEventBus") to)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#subscribe(S,C))`
		Attempts to register the subscriber to the specified Classifier
		
		Specified by:
		`[subscribe](EventBus.html#subscribe(S,C))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](SubchannelEventBus.html "type parameter in SubchannelEventBus"),​[S](SubchannelEventBus.html "type parameter in SubchannelEventBus"),​[C](SubchannelEventBus.html "type parameter in SubchannelEventBus")>`
		Returns:
		true if successful and false if not (because it was already subscribed to that Classifier, or otherwise)
		- #### unsubscribe
		
		
		
		```
		public boolean unsubscribe​([S](SubchannelEventBus.html "type parameter in SubchannelEventBus") subscriber,
		                           [C](SubchannelEventBus.html "type parameter in SubchannelEventBus") from)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#unsubscribe(S,C))`
		Attempts to deregister the subscriber from the specified Classifier
		
		Specified by:
		`[unsubscribe](EventBus.html#unsubscribe(S,C))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](SubchannelEventBus.html "type parameter in SubchannelEventBus"),​[S](SubchannelEventBus.html "type parameter in SubchannelEventBus"),​[C](SubchannelEventBus.html "type parameter in SubchannelEventBus")>`
		Returns:
		true if successful and false if not (because it wasn't subscribed to that Classifier, or otherwise)
		- #### unsubscribe
		
		
		
		```
		public void unsubscribe​([S](SubchannelEventBus.html "type parameter in SubchannelEventBus") subscriber)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#unsubscribe(S))`
		Attempts to deregister the subscriber from all Classifiers it may be subscribed to
		
		Specified by:
		`[unsubscribe](EventBus.html#unsubscribe(S))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](SubchannelEventBus.html "type parameter in SubchannelEventBus"),​[S](SubchannelEventBus.html "type parameter in SubchannelEventBus"),​[C](SubchannelEventBus.html "type parameter in SubchannelEventBus")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/SubchannelClassification.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/EventBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/SubchannelEventBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Subclassification.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/SubchannelEventBus.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/SubchannelEventBus.html)*
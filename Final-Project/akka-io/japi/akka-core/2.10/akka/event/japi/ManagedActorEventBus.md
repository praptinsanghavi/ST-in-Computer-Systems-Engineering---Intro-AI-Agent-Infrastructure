---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:12:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/ManagedActorEventBus.html
title: ManagedActorEventBus
---

# ManagedActorEventBus

## Content

Package [akka.event.japi](package-summary.html)
## Class ManagedActorEventBus\<E\>

- java.lang.Object
- - akka.event.japi.ManagedActorEventBus\<E\>

- All Implemented Interfaces:
`[EventBus](EventBus.html "interface in akka.event.japi")<E,​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>`

---

```
public abstract class ManagedActorEventBus<E>
extends java.lang.Object
implements [EventBus](EventBus.html "interface in akka.event.japi")<E,​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>
```

Java API: See documentation for [`ManagedActorClassification`](../ManagedActorClassification.html "interface in akka.event")
 An EventBus where the Subscribers are ActorRefs and the Classifier is ActorRef
 Means that ActorRefs "listen" to other ActorRefs
 E is the Event type

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ManagedActorEventBus](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected abstract [ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[classify](#classify(E))​([E](ManagedActorEventBus.html "type parameter in ManagedActorEventBus") event)` | Returns the Classifier associated with the given Event |
	| `protected abstract int` | `[mapSize](#mapSize())()` | This is a size hint for the number of Classifiers you expect to have (use powers of 2\) |
	| `void` | `[publish](#publish(E))​([E](ManagedActorEventBus.html "type parameter in ManagedActorEventBus") event)` | Publishes the specified Event to this bus |
	| `boolean` | `[subscribe](#subscribe(akka.actor.ActorRef,akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") subscriber,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") to)` | Attempts to register the subscriber to the specified Classifier |
	| `void` | `[unsubscribe](#unsubscribe(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") subscriber)` | Attempts to deregister the subscriber from all Classifiers it may be subscribed to |
	| `boolean` | `[unsubscribe](#unsubscribe(akka.actor.ActorRef,akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") subscriber,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") from)` | Attempts to deregister the subscriber from the specified Classifier |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ManagedActorEventBus
		
		
		
		```
		public ManagedActorEventBus​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### classify
		
		
		
		```
		protected abstract [ActorRef](../../actor/ActorRef.html "class in akka.actor") classify​([E](ManagedActorEventBus.html "type parameter in ManagedActorEventBus") event)
		```
		
		Returns the Classifier associated with the given Event
		- #### mapSize
		
		
		
		```
		protected abstract int mapSize()
		```
		
		This is a size hint for the number of Classifiers you expect to have (use powers of 2\)
		- #### publish
		
		
		
		```
		public void publish​([E](ManagedActorEventBus.html "type parameter in ManagedActorEventBus") event)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#publish(E))`
		Publishes the specified Event to this bus
		
		Specified by:
		`[publish](EventBus.html#publish(E))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](ManagedActorEventBus.html "type parameter in ManagedActorEventBus"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>`
		- #### subscribe
		
		
		
		```
		public boolean subscribe​([ActorRef](../../actor/ActorRef.html "class in akka.actor") subscriber,
		                         [ActorRef](../../actor/ActorRef.html "class in akka.actor") to)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#subscribe(S,C))`
		Attempts to register the subscriber to the specified Classifier
		
		Specified by:
		`[subscribe](EventBus.html#subscribe(S,C))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](ManagedActorEventBus.html "type parameter in ManagedActorEventBus"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>`
		Returns:
		true if successful and false if not (because it was already subscribed to that Classifier, or otherwise)
		- #### unsubscribe
		
		
		
		```
		public boolean unsubscribe​([ActorRef](../../actor/ActorRef.html "class in akka.actor") subscriber,
		                           [ActorRef](../../actor/ActorRef.html "class in akka.actor") from)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#unsubscribe(S,C))`
		Attempts to deregister the subscriber from the specified Classifier
		
		Specified by:
		`[unsubscribe](EventBus.html#unsubscribe(S,C))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](ManagedActorEventBus.html "type parameter in ManagedActorEventBus"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>`
		Returns:
		true if successful and false if not (because it wasn't subscribed to that Classifier, or otherwise)
		- #### unsubscribe
		
		
		
		```
		public void unsubscribe​([ActorRef](../../actor/ActorRef.html "class in akka.actor") subscriber)
		```
		
		Description copied from interface: `[EventBus](EventBus.html#unsubscribe(S))`
		Attempts to deregister the subscriber from all Classifiers it may be subscribed to
		
		Specified by:
		`[unsubscribe](EventBus.html#unsubscribe(S))` in interface `[EventBus](EventBus.html "interface in akka.event.japi")<[E](ManagedActorEventBus.html "type parameter in ManagedActorEventBus"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/ManagedActorClassification.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/EventBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/ManagedActorEventBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/ManagedActorEventBus.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/ManagedActorEventBus.html)*
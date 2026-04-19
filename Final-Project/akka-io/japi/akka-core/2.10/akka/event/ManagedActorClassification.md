---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/ManagedActorClassification.html
title: ManagedActorClassification
---

# ManagedActorClassification

## Content

Package [akka.event](package-summary.html)
## Interface ManagedActorClassification

- ---

```
public interface ManagedActorClassification
```

Maps ActorRefs to ActorRefs to form an EventBus where ActorRefs can listen to other ActorRefs.
 
 All subscribers will be watched by an `akka.event.ActorClassificationUnsubscriber` and unsubscribed when they terminate.
 The unsubscriber actor will not be stopped automatically, and if you want to stop using the bus you should stop it yourself.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[associate](#associate(akka.actor.ActorRef,akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") monitored,  [ActorRef](../actor/ActorRef.html "class in akka.actor") monitor)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[classify](#classify(akka.event.ManagedActorClassification))​([ManagedActorClassification](ManagedActorClassification.html "interface in akka.event") event)` | Returns the Classifier associated with the specified Event |
	| `void` | `[dissociate](#dissociate(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor)` |  |
	| `boolean` | `[dissociate](#dissociate(akka.actor.ActorRef,akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") monitored,  [ActorRef](../actor/ActorRef.html "class in akka.actor") monitor)` |  |
	| `int` | `[mapSize](#mapSize())()` | This is a size hint for the number of Classifiers you expect to have (use powers of 2\) |
	| `void` | `[publish](#publish(akka.event.ManagedActorClassification))​([ManagedActorClassification](ManagedActorClassification.html "interface in akka.event") event)` |  |
	| `boolean` | `[registerWithUnsubscriber](#registerWithUnsubscriber(akka.actor.ActorRef,int))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,  int seqNr)` | INTERNAL API |
	| `boolean` | `[subscribe](#subscribe(akka.actor.ActorRef,akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,  [ActorRef](../actor/ActorRef.html "class in akka.actor") to)` |  |
	| `[ActorSystem](../actor/ActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	| `boolean` | `[unregisterFromUnsubscriber](#unregisterFromUnsubscriber(akka.actor.ActorRef,int))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,  int seqNr)` | INTERNAL API |
	| `void` | `[unsubscribe](#unsubscribe(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber)` |  |
	| `boolean` | `[unsubscribe](#unsubscribe(akka.actor.ActorRef,akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,  [ActorRef](../actor/ActorRef.html "class in akka.actor") from)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[unsubscriber](#unsubscriber())()` | The unsubscriber takes care of unsubscribing actors, which have terminated. |

- - ### Method Detail
	
	
	
		- #### associate
		
		
		
		```
		boolean associate​([ActorRef](../actor/ActorRef.html "class in akka.actor") monitored,
		                  [ActorRef](../actor/ActorRef.html "class in akka.actor") monitor)
		```
		- #### classify
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") classify​([ManagedActorClassification](ManagedActorClassification.html "interface in akka.event") event)
		```
		
		Returns the Classifier associated with the specified Event
		- #### dissociate
		
		
		
		```
		void dissociate​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor)
		```
		- #### dissociate
		
		
		
		```
		boolean dissociate​([ActorRef](../actor/ActorRef.html "class in akka.actor") monitored,
		                   [ActorRef](../actor/ActorRef.html "class in akka.actor") monitor)
		```
		- #### mapSize
		
		
		
		```
		int mapSize()
		```
		
		This is a size hint for the number of Classifiers you expect to have (use powers of 2\)
		- #### publish
		
		
		
		```
		void publish​([ManagedActorClassification](ManagedActorClassification.html "interface in akka.event") event)
		```
		- #### registerWithUnsubscriber
		
		
		
		```
		boolean registerWithUnsubscriber​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,
		                                 int seqNr)
		```
		
		INTERNAL API
		- #### subscribe
		
		
		
		```
		boolean subscribe​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,
		                  [ActorRef](../actor/ActorRef.html "class in akka.actor") to)
		```
		- #### system
		
		
		
		```
		[ActorSystem](../actor/ActorSystem.html "class in akka.actor") system()
		```
		- #### unregisterFromUnsubscriber
		
		
		
		```
		boolean unregisterFromUnsubscriber​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,
		                                   int seqNr)
		```
		
		INTERNAL API
		- #### unsubscribe
		
		
		
		```
		boolean unsubscribe​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,
		                    [ActorRef](../actor/ActorRef.html "class in akka.actor") from)
		```
		- #### unsubscribe
		
		
		
		```
		void unsubscribe​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber)
		```
		- #### unsubscriber
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") unsubscriber()
		```
		
		The unsubscriber takes care of unsubscribing actors, which have terminated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/ManagedActorClassification.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/ManagedActorClassification.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/ManagedActorClassification.html)*
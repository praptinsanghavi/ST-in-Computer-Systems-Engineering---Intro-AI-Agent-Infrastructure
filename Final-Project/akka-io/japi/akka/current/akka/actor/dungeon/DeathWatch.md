---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/dungeon/DeathWatch.html
title: DeathWatch
---

# DeathWatch

## Content

Package [akka.actor.dungeon](package-summary.html)
## Interface DeathWatch

- ---

```
public interface DeathWatch
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[addressTerminated](#addressTerminated(akka.actor.Address))​([Address](../Address.html "class in akka.actor") address)` |  |
	| `void` | `[addWatcher](#addWatcher(akka.actor.ActorRef,akka.actor.ActorRef))​([ActorRef](../ActorRef.html "class in akka.actor") watchee,  [ActorRef](../ActorRef.html "class in akka.actor") watcher)` |  |
	| `void` | `[checkWatchingSame](#checkWatchingSame(akka.actor.InternalActorRef,scala.Option))​(akka.actor.InternalActorRef ref,  scala.Option<java.lang.Object> newMessage)` | Call only if it was checked before that \`watching contains ref\` |
	| `boolean` | `[isWatching](#isWatching(akka.actor.ActorRef))​([ActorRef](../ActorRef.html "class in akka.actor") ref)` |  |
	| `<T> T` | `[maintainAddressTerminatedSubscription](#maintainAddressTerminatedSubscription(akka.actor.ActorRef,scala.Function0))​([ActorRef](../ActorRef.html "class in akka.actor") change,  scala.Function0<T> block)` | Starts subscription to AddressTerminated if not already subscribing and the  block adds a non\-local ref to watching or watchedBy. |
	| `<T> [ActorRef](../ActorRef.html "class in akka.actor")` | `[maintainAddressTerminatedSubscription$default$1](#maintainAddressTerminatedSubscription$default$1())()` |  |
	| `void` | `[receivedTerminated](#receivedTerminated(akka.actor.Terminated))​([Terminated](../Terminated.html "class in akka.actor") t)` |  |
	| `void` | `[remWatcher](#remWatcher(akka.actor.ActorRef,akka.actor.ActorRef))​([ActorRef](../ActorRef.html "class in akka.actor") watchee,  [ActorRef](../ActorRef.html "class in akka.actor") watcher)` |  |
	| `void` | `[subscribeAddressTerminated](#subscribeAddressTerminated())()` |  |
	| `void` | `[tellWatchersWeDied](#tellWatchersWeDied())()` |  |
	| `void` | `[terminatedQueued_$eq](#terminatedQueued_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<[ActorRef](../ActorRef.html "class in akka.actor"),​scala.Option<java.lang.Object>> x$1)` |  |
	| `void` | `[terminatedQueuedFor](#terminatedQueuedFor(akka.actor.ActorRef,scala.Option))​([ActorRef](../ActorRef.html "class in akka.actor") subject,  scala.Option<java.lang.Object> customMessage)` |  |
	| `void` | `[unsubscribeAddressTerminated](#unsubscribeAddressTerminated())()` |  |
	| `[ActorRef](../ActorRef.html "class in akka.actor")` | `[unwatch](#unwatch(akka.actor.ActorRef))​([ActorRef](../ActorRef.html "class in akka.actor") subject)` |  |
	| `void` | `[unwatchWatchedActors](#unwatchWatchedActors(akka.actor.Actor))​([Actor](../Actor.html "interface in akka.actor") actor)` |  |
	| `void` | `[updateWatching](#updateWatching(akka.actor.InternalActorRef,scala.Option))​(akka.actor.InternalActorRef ref,  scala.Option<java.lang.Object> newMessage)` |  |
	| `[ActorRef](../ActorRef.html "class in akka.actor")` | `[watch](#watch(akka.actor.ActorRef))​([ActorRef](../ActorRef.html "class in akka.actor") subject)` |  |
	| `void` | `[watchedActorTerminated](#watchedActorTerminated(akka.actor.ActorRef,boolean,boolean))​([ActorRef](../ActorRef.html "class in akka.actor") actor,  boolean existenceConfirmed,  boolean addressTerminated)` | When this actor is watching the subject of [`Terminated`](../Terminated.html "class in akka.actor") message  it will be propagated to user's receive. |
	| `void` | `[watchedBy_$eq](#watchedBy_$eq(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")> x$1)` |  |
	| `void` | `[watching_$eq](#watching_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<[ActorRef](../ActorRef.html "class in akka.actor"),​scala.Option<java.lang.Object>> x$1)` |  |
	| `[ActorRef](../ActorRef.html "class in akka.actor")` | `[watchWith](#watchWith(akka.actor.ActorRef,java.lang.Object))​([ActorRef](../ActorRef.html "class in akka.actor") subject,  java.lang.Object msg)` |  |

- - ### Method Detail
	
	
	
		- #### addWatcher
		
		
		
		```
		void addWatcher​([ActorRef](../ActorRef.html "class in akka.actor") watchee,
		                [ActorRef](../ActorRef.html "class in akka.actor") watcher)
		```
		- #### addressTerminated
		
		
		
		```
		void addressTerminated​([Address](../Address.html "class in akka.actor") address)
		```
		- #### checkWatchingSame
		
		
		
		```
		void checkWatchingSame​(akka.actor.InternalActorRef ref,
		                       scala.Option<java.lang.Object> newMessage)
		```
		
		Call only if it was checked before that \`watching contains ref\`
		- #### isWatching
		
		
		
		```
		boolean isWatching​([ActorRef](../ActorRef.html "class in akka.actor") ref)
		```
		- #### maintainAddressTerminatedSubscription
		
		
		
		```
		<T> T maintainAddressTerminatedSubscription​([ActorRef](../ActorRef.html "class in akka.actor") change,
		                                            scala.Function0<T> block)
		```
		
		Starts subscription to AddressTerminated if not already subscribing and the
		 block adds a non\-local ref to watching or watchedBy.
		 Ends subscription to AddressTerminated if subscribing and the
		 block removes the last non\-local ref from watching and watchedBy.
		- #### maintainAddressTerminatedSubscription$default$1
		
		
		
		```
		<T> [ActorRef](../ActorRef.html "class in akka.actor") maintainAddressTerminatedSubscription$default$1()
		```
		- #### receivedTerminated
		
		
		
		```
		void receivedTerminated​([Terminated](../Terminated.html "class in akka.actor") t)
		```
		- #### remWatcher
		
		
		
		```
		void remWatcher​([ActorRef](../ActorRef.html "class in akka.actor") watchee,
		                [ActorRef](../ActorRef.html "class in akka.actor") watcher)
		```
		- #### subscribeAddressTerminated
		
		
		
		```
		void subscribeAddressTerminated()
		```
		- #### tellWatchersWeDied
		
		
		
		```
		void tellWatchersWeDied()
		```
		- #### terminatedQueuedFor
		
		
		
		```
		void terminatedQueuedFor​([ActorRef](../ActorRef.html "class in akka.actor") subject,
		                         scala.Option<java.lang.Object> customMessage)
		```
		- #### terminatedQueued\_$eq
		
		
		
		```
		void terminatedQueued_$eq​(scala.collection.immutable.Map<[ActorRef](../ActorRef.html "class in akka.actor"),​scala.Option<java.lang.Object>> x$1)
		```
		- #### unsubscribeAddressTerminated
		
		
		
		```
		void unsubscribeAddressTerminated()
		```
		- #### unwatch
		
		
		
		```
		[ActorRef](../ActorRef.html "class in akka.actor") unwatch​([ActorRef](../ActorRef.html "class in akka.actor") subject)
		```
		- #### unwatchWatchedActors
		
		
		
		```
		void unwatchWatchedActors​([Actor](../Actor.html "interface in akka.actor") actor)
		```
		- #### updateWatching
		
		
		
		```
		void updateWatching​(akka.actor.InternalActorRef ref,
		                    scala.Option<java.lang.Object> newMessage)
		```
		- #### watch
		
		
		
		```
		[ActorRef](../ActorRef.html "class in akka.actor") watch​([ActorRef](../ActorRef.html "class in akka.actor") subject)
		```
		- #### watchWith
		
		
		
		```
		[ActorRef](../ActorRef.html "class in akka.actor") watchWith​([ActorRef](../ActorRef.html "class in akka.actor") subject,
		                   java.lang.Object msg)
		```
		- #### watchedActorTerminated
		
		
		
		```
		void watchedActorTerminated​([ActorRef](../ActorRef.html "class in akka.actor") actor,
		                            boolean existenceConfirmed,
		                            boolean addressTerminated)
		```
		
		When this actor is watching the subject of [`Terminated`](../Terminated.html "class in akka.actor") message
		 it will be propagated to user's receive.
		- #### watchedBy\_$eq
		
		
		
		```
		void watchedBy_$eq​(scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")> x$1)
		```
		- #### watching\_$eq
		
		
		
		```
		void watching_$eq​(scala.collection.immutable.Map<[ActorRef](../ActorRef.html "class in akka.actor"),​scala.Option<java.lang.Object>> x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/dungeon/DeathWatch.html](https://doc.akka.io/japi/akka/current/akka/actor/dungeon/DeathWatch.html)*
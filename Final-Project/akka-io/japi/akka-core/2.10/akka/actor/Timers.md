---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:47:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/Timers.html
title: Timers
---

# Timers

## Content

Package [akka.actor](package-summary.html)
## Interface Timers

- All Superinterfaces:
`[Actor](Actor.html "interface in akka.actor")`

All Known Implementing Classes:
`[AbstractActorWithTimers](AbstractActorWithTimers.html "class in akka.actor")`, `[AbstractPersistentActorWithTimers](../persistence/AbstractPersistentActorWithTimers.html "class in akka.persistence")`, `[PersistentShardCoordinator](../cluster/sharding/PersistentShardCoordinator.html "class in akka.cluster.sharding")`, `[ShardCoordinator](../cluster/sharding/ShardCoordinator.html "class in akka.cluster.sharding")`

---

```
public interface Timers
extends [Actor](Actor.html "interface in akka.actor")
```

Scala API: Mix in Timers into your Actor to get support for scheduled
 `self` messages via [`TimerScheduler`](TimerScheduler.html "class in akka.actor").
 
 Timers are bound to the lifecycle of the actor that owns it,
 and thus are cancelled automatically when it is restarted or stopped.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.ActorCell` | `[actorCell](#actorCell())()` |  |
	| `void` | `[aroundPostStop](#aroundPostStop())()` | INTERNAL API. |
	| `void` | `[aroundPreRestart](#aroundPreRestart(java.lang.Throwable,scala.Option))​(java.lang.Throwable reason,  scala.Option<java.lang.Object> message)` | INTERNAL API. |
	| `void` | `[aroundReceive](#aroundReceive(scala.PartialFunction,java.lang.Object))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,  java.lang.Object msg)` | INTERNAL API. |
	| `void` | `[super$aroundPostStop](#super$aroundPostStop())()` |  |
	| `void` | `[super$aroundPreRestart](#super$aroundPreRestart(java.lang.Throwable,scala.Option))​(java.lang.Throwable reason,  scala.Option<java.lang.Object> message)` | Start and cancel timers via the enclosed `TimerScheduler`. |
	| `void` | `[super$aroundReceive](#super$aroundReceive(scala.PartialFunction,java.lang.Object))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,  java.lang.Object msg)` |  |
	| `[TimerScheduler](TimerScheduler.html "class in akka.actor")` | `[timers](#timers())()` | Start and cancel timers via the enclosed `TimerScheduler`. |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPreStart](Actor.html#aroundPreStart()), [context](Actor.html#context()), [postRestart](Actor.html#postRestart(java.lang.Throwable)), [postStop](Actor.html#postStop()), [preRestart](Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](Actor.html#preStart()), [receive](Actor.html#receive()), [self](Actor.html#self()), [sender](Actor.html#sender()), [supervisorStrategy](Actor.html#supervisorStrategy()), [unhandled](Actor.html#unhandled(java.lang.Object))`

- - ### Method Detail
	
	
	
		- #### actorCell
		
		
		
		```
		akka.actor.ActorCell actorCell()
		```
		- #### aroundPostStop
		
		
		
		```
		void aroundPostStop()
		```
		
		Description copied from interface: `[Actor](Actor.html#aroundPostStop())`
		INTERNAL API.
		 
		 Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.
		
		
		
		Specified by:
		`[aroundPostStop](Actor.html#aroundPostStop())` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### aroundPreRestart
		
		
		
		```
		void aroundPreRestart​(java.lang.Throwable reason,
		                      scala.Option<java.lang.Object> message)
		```
		
		Description copied from interface: `[Actor](Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option))`
		INTERNAL API.
		 
		 Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.
		
		
		
		Specified by:
		`[aroundPreRestart](Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option))` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### aroundReceive
		
		
		
		```
		void aroundReceive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,
		                   java.lang.Object msg)
		```
		
		Description copied from interface: `[Actor](Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object))`
		INTERNAL API.
		 
		 Can be overridden to intercept calls to this actor's current behavior.
		 
		
		
		
		Specified by:
		`[aroundReceive](Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object))` in interface `[Actor](Actor.html "interface in akka.actor")`
		Parameters:
		`receive` \- current behavior.
		`msg` \- current message.
		- #### super$aroundPostStop
		
		
		
		```
		void super$aroundPostStop()
		```
		- #### super$aroundPreRestart
		
		
		
		```
		void super$aroundPreRestart​(java.lang.Throwable reason,
		                            scala.Option<java.lang.Object> message)
		```
		
		Start and cancel timers via the enclosed `TimerScheduler`.
		- #### super$aroundReceive
		
		
		
		```
		void super$aroundReceive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,
		                         java.lang.Object msg)
		```
		- #### timers
		
		
		
		```
		[TimerScheduler](TimerScheduler.html "class in akka.actor") timers()
		```
		
		Start and cancel timers via the enclosed `TimerScheduler`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActorWithTimers.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/TimerScheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithTimers.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/Timers.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Timers.html)*
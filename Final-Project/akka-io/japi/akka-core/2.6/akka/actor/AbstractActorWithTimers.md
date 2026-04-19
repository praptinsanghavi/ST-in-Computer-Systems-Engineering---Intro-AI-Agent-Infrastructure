---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActorWithTimers.html
title: AbstractActorWithTimers
---

# AbstractActorWithTimers

## Content

Package [akka.actor](package-summary.html)
## Class AbstractActorWithTimers

- java.lang.Object
- - [akka.actor.AbstractActor](AbstractActor.html "class in akka.actor")
	- - akka.actor.AbstractActorWithTimers

- All Implemented Interfaces:
`[Actor](Actor.html "interface in akka.actor")`, `[Timers](Timers.html "interface in akka.actor")`

---

```
public abstract class AbstractActorWithTimers
extends [AbstractActor](AbstractActor.html "class in akka.actor")
implements [Timers](Timers.html "interface in akka.actor")
```

Java API: Support for scheduled `self` messages via [`TimerScheduler`](TimerScheduler.html "class in akka.actor").
 
 Timers are bound to the lifecycle of the actor that owns it,
 and thus are cancelled automatically when it is restarted or stopped.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.[AbstractActor](AbstractActor.html "class in akka.actor")
		
		
		`[AbstractActor.ActorContext](AbstractActor.ActorContext.html "interface in akka.actor"), [AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractActorWithTimers](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TimerScheduler](TimerScheduler.html "class in akka.actor")` | `[getTimers](#getTimers())()` | Start and cancel timers via the enclosed `TimerScheduler`. |
	
	
		- ### Methods inherited from class akka.actor.[AbstractActor](AbstractActor.html "class in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](AbstractActor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](AbstractActor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](AbstractActor.html#context()), [createReceive](AbstractActor.html#createReceive()), [emptyBehavior](AbstractActor.html#emptyBehavior()), [getContext](AbstractActor.html#getContext()), [getSelf](AbstractActor.html#getSelf()), [getSender](AbstractActor.html#getSender()), [postRestart](AbstractActor.html#postRestart(java.lang.Throwable)), [postStop](AbstractActor.html#postStop()), [preRestart](AbstractActor.html#preRestart(java.lang.Throwable,java.util.Optional)), [preRestart](AbstractActor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](AbstractActor.html#preStart()), [receive](AbstractActor.html#receive()), [receiveBuilder](AbstractActor.html#receiveBuilder()), [self](AbstractActor.html#self()), [supervisorStrategy](AbstractActor.html#supervisorStrategy())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPreStart](Actor.html#aroundPreStart()), [context](Actor.html#context()), [postRestart](Actor.html#postRestart(java.lang.Throwable)), [postStop](Actor.html#postStop()), [preRestart](Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](Actor.html#preStart()), [receive](Actor.html#receive()), [self](Actor.html#self()), [sender](Actor.html#sender()), [supervisorStrategy](Actor.html#supervisorStrategy()), [unhandled](Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[Timers](Timers.html "interface in akka.actor")
		
		
		`[actorCell](Timers.html#actorCell()), [aroundPostStop](Timers.html#aroundPostStop()), [aroundPreRestart](Timers.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundReceive](Timers.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [super$aroundPostStop](Timers.html#super$aroundPostStop()), [super$aroundPreRestart](Timers.html#super$aroundPreRestart(java.lang.Throwable,scala.Option)), [super$aroundReceive](Timers.html#super$aroundReceive(scala.PartialFunction,java.lang.Object)), [timers](Timers.html#timers())`

- - ### Constructor Detail
	
	
	
		- #### AbstractActorWithTimers
		
		
		
		```
		public AbstractActorWithTimers()
		```

	- ### Method Detail
	
	
	
		- #### getTimers
		
		
		
		```
		public final [TimerScheduler](TimerScheduler.html "class in akka.actor") getTimers()
		```
		
		Start and cancel timers via the enclosed `TimerScheduler`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.Receive.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/TimerScheduler.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Timers.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActorWithTimers.html](https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActorWithTimers.html)*
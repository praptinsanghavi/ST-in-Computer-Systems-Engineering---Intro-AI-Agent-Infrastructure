---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractLoggingActor.html
title: AbstractLoggingActor
---

# AbstractLoggingActor

## Content

Package [akka.actor](package-summary.html)
## Class AbstractLoggingActor

- java.lang.Object
- - [akka.actor.AbstractActor](AbstractActor.html "class in akka.actor")
	- - akka.actor.AbstractLoggingActor

- All Implemented Interfaces:
`[Actor](Actor.html "interface in akka.actor")`, `[ActorLogging](ActorLogging.html "interface in akka.actor")`

---

```
public abstract class AbstractLoggingActor
extends [AbstractActor](AbstractActor.html "class in akka.actor")
implements [ActorLogging](ActorLogging.html "interface in akka.actor")
```

Java API: compatible with lambda expressions
 
 Actor base class that mixes in logging into the Actor.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.[AbstractActor](AbstractActor.html "class in akka.actor")
		
		
		`[AbstractActor.ActorContext](AbstractActor.ActorContext.html "interface in akka.actor"), [AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractLoggingActor](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.actor.[AbstractActor](AbstractActor.html "class in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](AbstractActor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](AbstractActor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](AbstractActor.html#context()), [createReceive](AbstractActor.html#createReceive()), [emptyBehavior](AbstractActor.html#emptyBehavior()), [getContext](AbstractActor.html#getContext()), [getSelf](AbstractActor.html#getSelf()), [getSender](AbstractActor.html#getSender()), [postRestart](AbstractActor.html#postRestart(java.lang.Throwable)), [postStop](AbstractActor.html#postStop()), [preRestart](AbstractActor.html#preRestart(java.lang.Throwable,java.util.Optional)), [preRestart](AbstractActor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](AbstractActor.html#preStart()), [receive](AbstractActor.html#receive()), [receiveBuilder](AbstractActor.html#receiveBuilder()), [self](AbstractActor.html#self()), [supervisorStrategy](AbstractActor.html#supervisorStrategy())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](Actor.html#aroundPostStop()), [aroundPreRestart](Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](Actor.html#aroundPreStart()), [aroundReceive](Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [sender](Actor.html#sender()), [unhandled](Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](ActorLogging.html#log())`

- - ### Constructor Detail
	
	
	
		- #### AbstractLoggingActor
		
		
		
		```
		public AbstractLoggingActor()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.Receive.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractLoggingActor.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractLoggingActor.html)*
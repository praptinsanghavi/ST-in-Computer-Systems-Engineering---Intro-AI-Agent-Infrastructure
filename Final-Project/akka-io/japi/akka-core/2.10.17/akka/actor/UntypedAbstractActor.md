---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:46:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/UntypedAbstractActor.html
title: UntypedAbstractActor
---

# UntypedAbstractActor

## Content

Package [akka.actor](package-summary.html)
## Class UntypedAbstractActor

- java.lang.Object
- - [akka.actor.AbstractActor](AbstractActor.html "class in akka.actor")
	- - akka.actor.UntypedAbstractActor

- All Implemented Interfaces:
`[Actor](Actor.html "interface in akka.actor")`

---

```
public abstract class UntypedAbstractActor
extends [AbstractActor](AbstractActor.html "class in akka.actor")
```

If the validation of the `ReceiveBuilder` match logic turns out to be a bottleneck for some of your
 actors you can consider to implement it at lower level by extending `UntypedAbstractActor` instead
 of `AbstractActor`. The partial functions created by the `ReceiveBuilder` consist of multiple lambda
 expressions for every match statement, where each lambda is referencing the code to be run. This is something
 that the JVM can have problems optimizing and the resulting code might not be as performant as the
 untyped version. When extending `UntypedAbstractActor` each message is received as an untyped
 `Object` and you have to inspect and cast it to the actual message type in other ways (instanceof checks).

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.[AbstractActor](AbstractActor.html "class in akka.actor")
		
		
		`[AbstractActor.ActorContext](AbstractActor.ActorContext.html "interface in akka.actor"), [AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UntypedAbstractActor](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor")` | `[createReceive](#createReceive())()` | An actor has to define its initial receive behavior by implementing  the `createReceive` method. |
	| `abstract void` | `[onReceive](#onReceive(java.lang.Object))​(java.lang.Object message)` | To be implemented by concrete UntypedAbstractActor, this defines the behavior of the  actor. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `void` | `[unhandled](#unhandled(java.lang.Object))​(java.lang.Object message)` | Recommended convention is to call this method if the message  isn't handled in [`onReceive(java.lang.Object)`](#onReceive(java.lang.Object)) (e.g. |
	
	
		- ### Methods inherited from class akka.actor.[AbstractActor](AbstractActor.html "class in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](AbstractActor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](AbstractActor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](AbstractActor.html#context()), [emptyBehavior](AbstractActor.html#emptyBehavior()), [getContext](AbstractActor.html#getContext()), [getSelf](AbstractActor.html#getSelf()), [getSender](AbstractActor.html#getSender()), [postRestart](AbstractActor.html#postRestart(java.lang.Throwable)), [postStop](AbstractActor.html#postStop()), [preRestart](AbstractActor.html#preRestart(java.lang.Throwable,java.util.Optional)), [preRestart](AbstractActor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](AbstractActor.html#preStart()), [receiveBuilder](AbstractActor.html#receiveBuilder()), [self](AbstractActor.html#self()), [supervisorStrategy](AbstractActor.html#supervisorStrategy())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](Actor.html#aroundPostStop()), [aroundPreRestart](Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](Actor.html#aroundPreStart()), [aroundReceive](Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [sender](Actor.html#sender())`

- - ### Constructor Detail
	
	
	
		- #### UntypedAbstractActor
		
		
		
		```
		public UntypedAbstractActor()
		```

	- ### Method Detail
	
	
	
		- #### createReceive
		
		
		
		```
		public final [AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor") createReceive()
		```
		
		Description copied from class: `[AbstractActor](AbstractActor.html#createReceive())`
		An actor has to define its initial receive behavior by implementing
		 the `createReceive` method.
		
		Specified by:
		`[createReceive](AbstractActor.html#createReceive())` in class `[AbstractActor](AbstractActor.html "class in akka.actor")`
		- #### onReceive
		
		
		
		```
		public abstract void onReceive​(java.lang.Object message)
		                        throws java.lang.Throwable
		```
		
		To be implemented by concrete UntypedAbstractActor, this defines the behavior of the
		 actor.
		
		Throws:
		`java.lang.Throwable`
		- #### receive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](Actor.html#receive())` in interface `[Actor](Actor.html "interface in akka.actor")`
		Overrides:
		`[receive](AbstractActor.html#receive())` in class `[AbstractActor](AbstractActor.html "class in akka.actor")`
		- #### unhandled
		
		
		
		```
		public void unhandled​(java.lang.Object message)
		```
		
		Recommended convention is to call this method if the message
		 isn't handled in [`onReceive(java.lang.Object)`](#onReceive(java.lang.Object)) (e.g. unknown message type).
		 By default it fails with either a [`DeathPactException`](DeathPactException.html "class in akka.actor") (in
		 case of an unhandled [`Terminated`](Terminated.html "class in akka.actor") message) or publishes an [`UnhandledMessage`](UnhandledMessage.html "class in akka.actor")
		 to the actor's system's [`EventStream`](../event/EventStream.html "class in akka.event").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.Receive.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DeathPactException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/UnhandledMessage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventStream.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/UntypedAbstractActor.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/UntypedAbstractActor.html)*
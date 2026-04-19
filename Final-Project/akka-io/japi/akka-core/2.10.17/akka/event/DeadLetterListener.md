---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:13:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/event/DeadLetterListener.html
title: DeadLetterListener
---

# DeadLetterListener

## Content

Package [akka.event](package-summary.html)
## Class DeadLetterListener

- java.lang.Object
- - akka.event.DeadLetterListener

- All Implemented Interfaces:
`[Actor](../actor/Actor.html "interface in akka.actor")`

---

```
public class DeadLetterListener
extends java.lang.Object
implements [Actor](../actor/Actor.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeadLetterListener](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `[ActorContext](../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected int` | `[count](#count())()` |  |
	| `protected void` | `[count_$eq](#count_$eq(int))​(int x$1)` |  |
	| `[EventStream](EventStream.html "class in akka.event")` | `[eventStream](#eventStream())()` |  |
	| `protected int` | `[maxCount](#maxCount())()` |  |
	| `void` | `[postRestart](#postRestart(java.lang.Throwable))​(java.lang.Throwable reason)` | User overridable callback: By default it calls `preStart()`. |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `void` | `[preRestart](#preRestart(java.lang.Throwable,scala.Option))​(java.lang.Throwable reason,  scala.Option<java.lang.Object> message)` | Scala API: User overridable callback: '''By default it disposes of all children and then calls `postStop()`.''' |
	| `void` | `[preStart](#preStart())()` | User overridable callback. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../actor/Actor.html#aroundPreStart()), [aroundReceive](../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [sender](../actor/Actor.html#sender()), [supervisorStrategy](../actor/Actor.html#supervisorStrategy()), [unhandled](../actor/Actor.html#unhandled(java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### DeadLetterListener
		
		
		
		```
		public DeadLetterListener()
		```

	- ### Method Detail
	
	
	
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](../actor/ActorContext.html "interface in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$context_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$self\_$eq
		
		
		
		```
		protected final void akka$actor$Actor$_setter_$self_$eq​([ActorRef](../actor/ActorRef.html "class in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### context
		
		
		
		```
		public [ActorContext](../actor/ActorContext.html "interface in akka.actor") context()
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#context())`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[context](../actor/Actor.html#context())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### count
		
		
		
		```
		protected int count()
		```
		- #### count\_$eq
		
		
		
		```
		protected void count_$eq​(int x$1)
		```
		- #### eventStream
		
		
		
		```
		public [EventStream](EventStream.html "class in akka.event") eventStream()
		```
		- #### maxCount
		
		
		
		```
		protected int maxCount()
		```
		- #### postRestart
		
		
		
		```
		public void postRestart​(java.lang.Throwable reason)
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#postRestart(java.lang.Throwable))`
		User overridable callback: By default it calls `preStart()`.
		
		Specified by:
		`[postRestart](../actor/Actor.html#postRestart(java.lang.Throwable))` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		Parameters:
		`reason` \- the Throwable that caused the restart to happen
		 
		 Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.
		- #### postStop
		
		
		
		```
		public void postStop()
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#postStop())`
		User overridable callback.
		 
		 Is called asynchronously after 'actor.stop()' is invoked.
		 Empty default implementation.
		
		Specified by:
		`[postStop](../actor/Actor.html#postStop())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### preRestart
		
		
		
		```
		public void preRestart​(java.lang.Throwable reason,
		                       scala.Option<java.lang.Object> message)
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option))`
		Scala API: User overridable callback: '''By default it disposes of all children and then calls `postStop()`.'''
		
		Specified by:
		`[preRestart](../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option))` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		Parameters:
		`reason` \- the Throwable that caused the restart to happen
		`message` \- optionally the current message the actor processed when failing, if applicable
		 
		 Is called on a crashed Actor right BEFORE it is restarted to allow clean
		 up of resources before Actor is terminated.
		- #### preStart
		
		
		
		```
		public void preStart()
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#preStart())`
		User overridable callback.
		 
		 Is called when an Actor is started.
		 Actors are automatically started asynchronously when created.
		 Empty default implementation.
		
		Specified by:
		`[preStart](../actor/Actor.html#preStart())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### receive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../actor/Actor.html#receive())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### self
		
		
		
		```
		public final [ActorRef](../actor/ActorRef.html "class in akka.actor") self()
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](../actor/Actor.html#self())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/event/DeadLetterListener.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/event/DeadLetterListener.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:47:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/SimpleDnsManager.html
title: SimpleDnsManager
---

# SimpleDnsManager

## Content

Package [akka.io](package-summary.html)
## Class SimpleDnsManager

- java.lang.Object
- - akka.io.SimpleDnsManager

- All Implemented Interfaces:
`[Actor](../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../actor/ActorLogging.html "interface in akka.actor")`, `[RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[UnboundedMessageQueueSemantics](../dispatch/UnboundedMessageQueueSemantics.html "interface in akka.dispatch")>`

---

```
public final class SimpleDnsManager
extends java.lang.Object
implements [Actor](../actor/Actor.html "interface in akka.actor"), [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[UnboundedMessageQueueSemantics](../dispatch/UnboundedMessageQueueSemantics.html "interface in akka.dispatch")>, [ActorLogging](../actor/ActorLogging.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SimpleDnsManager](#%3Cinit%3E(akka.io.DnsExt))​([DnsExt](DnsExt.html "class in akka.io") ext)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `[ActorContext](../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `[DnsExt](DnsExt.html "class in akka.io")` | `[ext](#ext())()` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[oldApis](#oldApis())()` |  |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../actor/Actor.html#aroundPreStart()), [aroundReceive](../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../actor/Actor.html#postRestart(java.lang.Throwable)), [preRestart](../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../actor/Actor.html#preStart()), [sender](../actor/Actor.html#sender()), [supervisorStrategy](../actor/Actor.html#supervisorStrategy()), [unhandled](../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../actor/ActorLogging.html#log())`

- - ### Constructor Detail
	
	
	
		- #### SimpleDnsManager
		
		
		
		```
		public SimpleDnsManager​([DnsExt](DnsExt.html "class in akka.io") ext)
		```

	- ### Method Detail
	
	
	
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
		- #### ext
		
		
		
		```
		public [DnsExt](DnsExt.html "class in akka.io") ext()
		```
		- #### oldApis
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> oldApis()
		```
		- #### receive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../actor/Actor.html#receive())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/DnsExt.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/SimpleDnsManager.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/SimpleDnsManager.html)*
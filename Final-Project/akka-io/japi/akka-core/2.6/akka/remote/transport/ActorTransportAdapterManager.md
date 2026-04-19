---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/remote/transport/ActorTransportAdapterManager.html
title: ActorTransportAdapterManager
---

# ActorTransportAdapterManager

## Content

Package [akka.remote.transport](package-summary.html)
## Class ActorTransportAdapterManager

- java.lang.Object
- - akka.remote.transport.ActorTransportAdapterManager

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[UnboundedMessageQueueSemantics](../../dispatch/UnboundedMessageQueueSemantics.html "interface in akka.dispatch")>`

---

```
public abstract class ActorTransportAdapterManager
extends java.lang.Object
implements [Actor](../../actor/Actor.html "interface in akka.actor"), [RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[UnboundedMessageQueueSemantics](../../dispatch/UnboundedMessageQueueSemantics.html "interface in akka.dispatch")>
```

Deprecated.
Classic remoting is deprecated, use Artery. Since 2\.6\.0\.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorTransportAdapterManager](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)` | Deprecated. Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` | Deprecated. The 'self' field holds the ActorRef for this actor. |
	| `protected [Transport.AssociationEventListener](Transport.AssociationEventListener.html "interface in akka.remote.transport")` | `[associationListener](#associationListener())()` | Deprecated. |
	| `protected void` | `[associationListener_$eq](#associationListener_$eq(akka.remote.transport.Transport.AssociationEventListener))​([Transport.AssociationEventListener](Transport.AssociationEventListener.html "interface in akka.remote.transport") x$1)` | Deprecated. |
	| `[ActorContext](../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Deprecated. Scala API: Stores the context for this actor, including self, and sender. |
	| `protected [Address](../../actor/Address.html "class in akka.actor")` | `[localAddress](#localAddress())()` | Deprecated. |
	| `protected void` | `[localAddress_$eq](#localAddress_$eq(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") x$1)` | Deprecated. |
	| `protected long` | `[nextId](#nextId())()` | Deprecated. |
	| `protected abstract scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[ready](#ready())()` | Deprecated. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Deprecated. Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | Deprecated. The 'self' field holds the ActorRef for this actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [postStop](../../actor/Actor.html#postStop()), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../../actor/Actor.html#preStart()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### ActorTransportAdapterManager
		
		
		
		```
		public ActorTransportAdapterManager()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)
		```
		
		Deprecated.
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$self\_$eq
		
		
		
		```
		protected final void akka$actor$Actor$_setter_$self_$eq​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)
		```
		
		Deprecated.
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### associationListener
		
		
		
		```
		protected [Transport.AssociationEventListener](Transport.AssociationEventListener.html "interface in akka.remote.transport") associationListener()
		```
		
		Deprecated.
		- #### associationListener\_$eq
		
		
		
		```
		protected void associationListener_$eq​([Transport.AssociationEventListener](Transport.AssociationEventListener.html "interface in akka.remote.transport") x$1)
		```
		
		Deprecated.
		- #### context
		
		
		
		```
		public [ActorContext](../../actor/ActorContext.html "interface in akka.actor") context()
		```
		
		Deprecated.
		Description copied from interface: `[Actor](../../actor/Actor.html#context())`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[context](../../actor/Actor.html#context())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### localAddress
		
		
		
		```
		protected [Address](../../actor/Address.html "class in akka.actor") localAddress()
		```
		
		Deprecated.
		- #### localAddress\_$eq
		
		
		
		```
		protected void localAddress_$eq​([Address](../../actor/Address.html "class in akka.actor") x$1)
		```
		
		Deprecated.
		- #### nextId
		
		
		
		```
		protected long nextId()
		```
		
		Deprecated.
		- #### ready
		
		
		
		```
		protected abstract scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> ready()
		```
		
		Deprecated.
		- #### receive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Deprecated.
		Description copied from interface: `[Actor](../../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../../actor/Actor.html#receive())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### self
		
		
		
		```
		public final [ActorRef](../../actor/ActorRef.html "class in akka.actor") self()
		```
		
		Deprecated.
		Description copied from interface: `[Actor](../../actor/Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](../../actor/Actor.html#self())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.6/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.6/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/transport/Transport.AssociationEventListener.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/transport/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/remote/transport/ActorTransportAdapterManager.html](https://doc.akka.io/japi/akka-core/2.6/akka/remote/transport/ActorTransportAdapterManager.html)*
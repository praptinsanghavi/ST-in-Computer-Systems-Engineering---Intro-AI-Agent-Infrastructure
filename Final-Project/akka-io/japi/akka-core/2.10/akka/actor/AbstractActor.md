---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:29:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.ActorContext.html
title: AbstractActor.ActorContext
---

# AbstractActor.ActorContext

## Content

Package [akka.actor](package-summary.html)
## Interface AbstractActor.ActorContext

- All Superinterfaces:
`[ActorContext](ActorContext.html "interface in akka.actor")`, `[ActorRefFactory](ActorRefFactory.html "interface in akka.actor")`, `[ClassicActorContextProvider](ClassicActorContextProvider.html "interface in akka.actor")`

Enclosing class:
[AbstractActor](AbstractActor.html "class in akka.actor")

---

```
public static interface AbstractActor.ActorContext
extends [ActorContext](ActorContext.html "interface in akka.actor")
```

The actor context \- the view of the actor cell from the actor.
 Exposes contextual information for the actor and the current message.
 
 Not intended for public inheritance/implementation

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[become](#become(akka.actor.AbstractActor.Receive))​([AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor") behavior)` | Changes the Actor's behavior to become the new 'Receive' handler. |
	| `void` | `[become](#become(akka.actor.AbstractActor.Receive,boolean))​([AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor") behavior,  boolean discardOld)` | Changes the Actor's behavior to become the new 'Receive' handler. |
	| `void` | `[cancelReceiveTimeout](#cancelReceiveTimeout())()` | Cancel the sending of receive timeout notifications. |
	| `java.util.Optional<[ActorRef](ActorRef.html "class in akka.actor")>` | `[findChild](#findChild(java.lang.String))​(java.lang.String name)` | Returns a reference to the named child if it exists. |
	| `java.lang.Iterable<[ActorRef](ActorRef.html "class in akka.actor")>` | `[getChildren](#getChildren())()` | Returns an unmodifiable Java Collection containing the linked actors |
	| `scala.concurrent.ExecutionContextExecutor` | `[getDispatcher](#getDispatcher())()` | Returns the dispatcher (MessageDispatcher) that is used for this Actor. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[getParent](#getParent())()` | Returns the supervisor of this actor. |
	| `[Props](Props.html "class in akka.actor")` | `[getProps](#getProps())()` | Retrieve the Props which were used to create this actor. |
	| `java.time.Duration` | `[getReceiveTimeout](#getReceiveTimeout())()` | Gets the current receive timeout. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[getSelf](#getSelf())()` | The ActorRef representing this actor |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[getSender](#getSender())()` | Returns the sender 'ActorRef' of the current message. |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[getSystem](#getSystem())()` | Returns the system this actor is running in. |
	| `void` | `[setReceiveTimeout](#setReceiveTimeout(java.time.Duration))​(java.time.Duration timeout)` | Defines the inactivity timeout after which the sending of a [`ReceiveTimeout`](ReceiveTimeout.html "class in akka.actor") message is triggered. |
	
	
		- ### Methods inherited from interface akka.actor.[ActorContext](ActorContext.html "interface in akka.actor")
		
		
		`[become](ActorContext.html#become(scala.PartialFunction)), [become](ActorContext.html#become(scala.PartialFunction,boolean)), [child](ActorContext.html#child(java.lang.String)), [children](ActorContext.html#children()), [dispatcher](ActorContext.html#dispatcher()), [parent](ActorContext.html#parent()), [props](ActorContext.html#props()), [receiveTimeout](ActorContext.html#receiveTimeout()), [self](ActorContext.html#self()), [sender](ActorContext.html#sender()), [setReceiveTimeout](ActorContext.html#setReceiveTimeout(scala.concurrent.duration.Duration)), [system](ActorContext.html#system()), [unbecome](ActorContext.html#unbecome()), [unwatch](ActorContext.html#unwatch(akka.actor.ActorRef)), [watch](ActorContext.html#watch(akka.actor.ActorRef)), [watchWith](ActorContext.html#watchWith(akka.actor.ActorRef,java.lang.Object)), [writeObject](ActorContext.html#writeObject(java.io.ObjectOutputStream))`
		- ### Methods inherited from interface akka.actor.[ActorRefFactory](ActorRefFactory.html "interface in akka.actor")
		
		
		`[actorOf](ActorRefFactory.html#actorOf(akka.actor.Props)), [actorOf](ActorRefFactory.html#actorOf(akka.actor.Props,java.lang.String)), [actorSelection](ActorRefFactory.html#actorSelection(akka.actor.ActorPath)), [actorSelection](ActorRefFactory.html#actorSelection(java.lang.String)), [guardian](ActorRefFactory.html#guardian()), [lookupRoot](ActorRefFactory.html#lookupRoot()), [provider](ActorRefFactory.html#provider()), [stop](ActorRefFactory.html#stop(akka.actor.ActorRef)), [systemImpl](ActorRefFactory.html#systemImpl())`
		- ### Methods inherited from interface akka.actor.[ClassicActorContextProvider](ClassicActorContextProvider.html "interface in akka.actor")
		
		
		`[classicActorContext](ClassicActorContextProvider.html#classicActorContext())`

- - ### Method Detail
	
	
	
		- #### become
		
		
		
		```
		void become​([AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor") behavior)
		```
		
		Changes the Actor's behavior to become the new 'Receive' handler.
		 Replaces the current behavior on the top of the behavior stack.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### become
		
		
		
		```
		void become​([AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor") behavior,
		            boolean discardOld)
		```
		
		Changes the Actor's behavior to become the new 'Receive' handler.
		 This method acts upon the behavior stack as follows:
		 
		 \- if `discardOld = true` it will replace the top element (i.e. the current behavior)
		 \- if `discardOld = false` it will keep the current behavior and push the given one atop
		 
		
		
		 The default of replacing the current behavior on the stack has been chosen to avoid memory
		 leaks in case client code is written without consulting this documentation first (i.e.
		 always pushing new behaviors and never issuing an `unbecome()`)
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### cancelReceiveTimeout
		
		
		
		```
		void cancelReceiveTimeout()
		```
		
		Cancel the sending of receive timeout notifications.
		- #### findChild
		
		
		
		```
		java.util.Optional<[ActorRef](ActorRef.html "class in akka.actor")> findChild​(java.lang.String name)
		```
		
		Returns a reference to the named child if it exists.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### getChildren
		
		
		
		```
		java.lang.Iterable<[ActorRef](ActorRef.html "class in akka.actor")> getChildren()
		```
		
		Returns an unmodifiable Java Collection containing the linked actors
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### getDispatcher
		
		
		
		```
		scala.concurrent.ExecutionContextExecutor getDispatcher()
		```
		
		Returns the dispatcher (MessageDispatcher) that is used for this Actor.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### getParent
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") getParent()
		```
		
		Returns the supervisor of this actor.
		 
		 Same as `parent()`.
		 
		
		
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		- #### getProps
		
		
		
		```
		[Props](Props.html "class in akka.actor") getProps()
		```
		
		Retrieve the Props which were used to create this actor.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### getReceiveTimeout
		
		
		
		```
		java.time.Duration getReceiveTimeout()
		```
		
		Gets the current receive timeout.
		 When specified, the receive method should be able to handle a [`ReceiveTimeout`](ReceiveTimeout.html "class in akka.actor") message.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### getSelf
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") getSelf()
		```
		
		The ActorRef representing this actor
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### getSender
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") getSender()
		```
		
		Returns the sender 'ActorRef' of the current message.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### getSystem
		
		
		
		```
		[ActorSystem](ActorSystem.html "class in akka.actor") getSystem()
		```
		
		Returns the system this actor is running in.
		 
		 Same as `system()`
		
		
		
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		- #### setReceiveTimeout
		
		
		
		```
		void setReceiveTimeout​(java.time.Duration timeout)
		```
		
		Defines the inactivity timeout after which the sending of a [`ReceiveTimeout`](ReceiveTimeout.html "class in akka.actor") message is triggered.
		 When specified, the receive function should be able to handle a [`ReceiveTimeout`](ReceiveTimeout.html "class in akka.actor") message.
		 1 millisecond is the minimum supported timeout.
		 
		 Please note that the receive timeout might fire and enqueue the `ReceiveTimeout` message right after
		 another message was enqueued; hence it is '''not guaranteed''' that upon reception of the receive
		 timeout there must have been an idle period beforehand as configured via this method.
		 
		
		
		 Once set, the receive timeout stays in effect (i.e. continues firing repeatedly after inactivity
		 periods). Pass in `Duration.Undefined` to switch off this feature.
		 
		
		
		 Messages marked with [`NotInfluenceReceiveTimeout`](NotInfluenceReceiveTimeout.html "interface in akka.actor") will not reset the timer. This can be useful when
		 `ReceiveTimeout` should be fired by external inactivity but not influenced by internal activity,
		 e.g. scheduled tick messages.
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` and `Future` callbacks.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.Receive.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRefFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NotInfluenceReceiveTimeout.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ReceiveTimeout.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.ActorContext.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.ActorContext.html)*
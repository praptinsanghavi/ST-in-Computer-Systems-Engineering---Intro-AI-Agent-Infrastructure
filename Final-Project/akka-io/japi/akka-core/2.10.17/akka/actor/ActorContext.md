---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:43:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorContext.html
title: ActorContext
---

# ActorContext

## Content

Package [akka.actor](package-summary.html)
## Interface ActorContext

- All Superinterfaces:
`[ActorRefFactory](ActorRefFactory.html "interface in akka.actor")`, `[ClassicActorContextProvider](ClassicActorContextProvider.html "interface in akka.actor")`

All Known Subinterfaces:
`[AbstractActor.ActorContext](AbstractActor.ActorContext.html "interface in akka.actor")`

---

```
public interface ActorContext
extends [ActorRefFactory](ActorRefFactory.html "interface in akka.actor"), [ClassicActorContextProvider](ClassicActorContextProvider.html "interface in akka.actor")
```

The actor context \- the view of the actor cell from the actor.
 Exposes contextual information for the actor and the current message.
 
 There are several possibilities for creating actors (see [`Props`](Props.html "class in akka.actor")
 for details on `props`):
 

```

 // Java or Scala
 context.actorOf(props, "name")
 context.actorOf(props)

 // Scala
 context.actorOf(Props[MyActor])
 context.actorOf(Props(classOf[MyActor], arg1, arg2), "name")

 // Java
 getContext().actorOf(Props.create(MyActor.class));
 getContext().actorOf(Props.create(MyActor.class, arg1, arg2), "name");
 
```

 Where no name is given explicitly, one will be automatically generated.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[become](#become(scala.PartialFunction))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> behavior)` | Changes the Actor's behavior to become the new 'Receive' (PartialFunction\[Any, Unit]) handler. |
	| `void` | `[become](#become(scala.PartialFunction,boolean))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> behavior,  boolean discardOld)` | Changes the Actor's behavior to become the new 'Receive' (PartialFunction\[Any, Unit]) handler. |
	| `scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>` | `[child](#child(java.lang.String))​(java.lang.String name)` | Get the child with the given name if it exists. |
	| `scala.collection.immutable.Iterable<[ActorRef](ActorRef.html "class in akka.actor")>` | `[children](#children())()` | Returns all supervised children; this method returns a view (i.e. |
	| `scala.concurrent.ExecutionContextExecutor` | `[dispatcher](#dispatcher())()` | Returns the dispatcher (MessageDispatcher) that is used for this Actor. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[parent](#parent())()` | Returns the supervising parent ActorRef. |
	| `[Props](Props.html "class in akka.actor")` | `[props](#props())()` | Retrieve the Props which were used to create this actor. |
	| `scala.concurrent.duration.Duration` | `[receiveTimeout](#receiveTimeout())()` | Gets the current receive timeout. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[self](#self())()` | The ActorRef representing this actor |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[sender](#sender())()` | Returns the sender 'ActorRef' of the current message. |
	| `void` | `[setReceiveTimeout](#setReceiveTimeout(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration timeout)` | Defines the inactivity timeout after which the sending of a [`ReceiveTimeout`](ReceiveTimeout.html "class in akka.actor") message is triggered. |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[system](#system())()` | The system that the actor belongs to. |
	| `void` | `[unbecome](#unbecome())()` | Reverts the Actor behavior to the previous one on the behavior stack. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[unwatch](#unwatch(akka.actor.ActorRef))​([ActorRef](ActorRef.html "class in akka.actor") subject)` | Unregisters this actor as Monitor for the provided ActorRef. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[watch](#watch(akka.actor.ActorRef))​([ActorRef](ActorRef.html "class in akka.actor") subject)` | Registers this actor as a Monitor for the provided ActorRef. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[watchWith](#watchWith(akka.actor.ActorRef,java.lang.Object))​([ActorRef](ActorRef.html "class in akka.actor") subject,  java.lang.Object msg)` | Registers this actor as a Monitor for the provided ActorRef. |
	| `void` | `[writeObject](#writeObject(java.io.ObjectOutputStream))​(java.io.ObjectOutputStream o)` | ActorContexts shouldn't be Serializable |
	
	
		- ### Methods inherited from interface akka.actor.[ActorRefFactory](ActorRefFactory.html "interface in akka.actor")
		
		
		`[actorOf](ActorRefFactory.html#actorOf(akka.actor.Props)), [actorOf](ActorRefFactory.html#actorOf(akka.actor.Props,java.lang.String)), [actorSelection](ActorRefFactory.html#actorSelection(akka.actor.ActorPath)), [actorSelection](ActorRefFactory.html#actorSelection(java.lang.String)), [guardian](ActorRefFactory.html#guardian()), [lookupRoot](ActorRefFactory.html#lookupRoot()), [provider](ActorRefFactory.html#provider()), [stop](ActorRefFactory.html#stop(akka.actor.ActorRef)), [systemImpl](ActorRefFactory.html#systemImpl())`
		- ### Methods inherited from interface akka.actor.[ClassicActorContextProvider](ClassicActorContextProvider.html "interface in akka.actor")
		
		
		`[classicActorContext](ClassicActorContextProvider.html#classicActorContext())`

- - ### Method Detail
	
	
	
		- #### become
		
		
		
		```
		void become​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> behavior)
		```
		
		Changes the Actor's behavior to become the new 'Receive' (PartialFunction\[Any, Unit]) handler.
		 Replaces the current behavior on the top of the behavior stack.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### become
		
		
		
		```
		void become​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> behavior,
		            boolean discardOld)
		```
		
		Changes the Actor's behavior to become the new 'Receive' (PartialFunction\[Any, Unit]) handler.
		 This method acts upon the behavior stack as follows:
		 
		 \- if `discardOld = true` it will replace the top element (i.e. the current behavior)
		 \- if `discardOld = false` it will keep the current behavior and push the given one atop
		 
		
		
		 The default of replacing the current behavior on the stack has been chosen to avoid memory
		 leaks in case client code is written without consulting this documentation first (i.e.
		 always pushing new behaviors and never issuing an `unbecome()`)
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### child
		
		
		
		```
		scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> child​(java.lang.String name)
		```
		
		Get the child with the given name if it exists.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### children
		
		
		
		```
		scala.collection.immutable.Iterable<[ActorRef](ActorRef.html "class in akka.actor")> children()
		```
		
		Returns all supervised children; this method returns a view (i.e. a lazy
		 collection) onto the internal collection of children. Targeted lookups
		 should be using `child` instead for performance reasons:
		 
		
		
		
		```
		
		 val badLookup = context.children find (_.path.name == "kid")
		 // should better be expressed as:
		 val goodLookup = context.child("kid")
		 
		```
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### dispatcher
		
		
		
		```
		scala.concurrent.ExecutionContextExecutor dispatcher()
		```
		
		Returns the dispatcher (MessageDispatcher) that is used for this Actor.
		 Importing this member will place an implicit ExecutionContext in scope.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		
		
		
		Specified by:
		`[dispatcher](ActorRefFactory.html#dispatcher())` in interface `[ActorRefFactory](ActorRefFactory.html "interface in akka.actor")`
		- #### parent
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") parent()
		```
		
		Returns the supervising parent ActorRef.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### props
		
		
		
		```
		[Props](Props.html "class in akka.actor") props()
		```
		
		Retrieve the Props which were used to create this actor.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### receiveTimeout
		
		
		
		```
		scala.concurrent.duration.Duration receiveTimeout()
		```
		
		Gets the current receive timeout.
		 When specified, the receive method should be able to handle a [`ReceiveTimeout`](ReceiveTimeout.html "class in akka.actor") message.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### self
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") self()
		```
		
		The ActorRef representing this actor
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### sender
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") sender()
		```
		
		Returns the sender 'ActorRef' of the current message.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### setReceiveTimeout
		
		
		
		```
		void setReceiveTimeout​(scala.concurrent.duration.Duration timeout)
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
		- #### system
		
		
		
		```
		[ActorSystem](ActorSystem.html "class in akka.actor") system()
		```
		
		The system that the actor belongs to.
		 Importing this member will place an implicit ActorSystem in scope.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### unbecome
		
		
		
		```
		void unbecome()
		```
		
		Reverts the Actor behavior to the previous one on the behavior stack.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### unwatch
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") unwatch​([ActorRef](ActorRef.html "class in akka.actor") subject)
		```
		
		Unregisters this actor as Monitor for the provided ActorRef.
		
		Returns:
		the provided ActorRef
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		- #### watch
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") watch​([ActorRef](ActorRef.html "class in akka.actor") subject)
		```
		
		Registers this actor as a Monitor for the provided ActorRef.
		 This actor will receive a Terminated(subject) message when watched
		 actor is terminated.
		 
		`watch` is idempotent if it is not mixed with `watchWith`.
		 
		
		
		 It will fail with an `IllegalStateException` if the same subject was watched before using `watchWith`.
		 To clear the termination message, unwatch first.
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		 
		
		
		
		Returns:
		the provided ActorRef
		- #### watchWith
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") watchWith​([ActorRef](ActorRef.html "class in akka.actor") subject,
		                   java.lang.Object msg)
		```
		
		Registers this actor as a Monitor for the provided ActorRef.
		 This actor will receive the specified message when watched
		 actor is terminated.
		 
		`watchWith` is idempotent if it is called with the same `msg` and not mixed with `watch`.
		 
		
		
		 It will fail with an `IllegalStateException` if the same subject was watched before using `watch` or `watchWith` with
		 another termination message. To change the termination message, unwatch first.
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` and `Future` callbacks.
		 
		
		
		
		Returns:
		the provided ActorRef
		- #### writeObject
		
		
		
		```
		void writeObject​(java.io.ObjectOutputStream o)
		```
		
		ActorContexts shouldn't be Serializable

## Code Examples

### Example 1: Interface ActorContext

```text
// Java or Scala
 context.actorOf(props, "name")
 context.actorOf(props)

 // Scala
 context.actorOf(Props[MyActor])
 context.actorOf(Props(classOf[MyActor], arg1, arg2), "name")

 // Java
 getContext().actorOf(Props.create(MyActor.class));
 getContext().actorOf(Props.create(MyActor.class, arg1, arg2), "name");
```

### Example 2: children

```text
val badLookup = context.children find (_.path.name == "kid")
 // should better be expressed as:
 val goodLookup = context.child("kid")
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRefFactory.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/NotInfluenceReceiveTimeout.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ReceiveTimeout.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorContext.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorContext.html)*
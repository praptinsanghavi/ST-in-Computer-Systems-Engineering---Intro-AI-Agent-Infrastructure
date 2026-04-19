---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/AbstractActor.html
title: AbstractActor
---

# AbstractActor

## Content

Package [akka.actor](package-summary.html)
## Class AbstractActor

- java.lang.Object
- - akka.actor.AbstractActor

- All Implemented Interfaces:
`[Actor](Actor.html "interface in akka.actor")`

Direct Known Subclasses:
`[AbstractActorWithStash](AbstractActorWithStash.html "class in akka.actor")`, `[AbstractActorWithTimers](AbstractActorWithTimers.html "class in akka.actor")`, `[AbstractActorWithUnboundedStash](AbstractActorWithUnboundedStash.html "class in akka.actor")`, `[AbstractActorWithUnrestrictedStash](AbstractActorWithUnrestrictedStash.html "class in akka.actor")`, `[AbstractLoggingActor](AbstractLoggingActor.html "class in akka.actor")`, `[AbstractPersistentActor](../persistence/AbstractPersistentActor.html "class in akka.persistence")`, `[AbstractPersistentActorWithTimers](../persistence/AbstractPersistentActorWithTimers.html "class in akka.persistence")`, `[UntypedAbstractActor](UntypedAbstractActor.html "class in akka.actor")`

---

```
public abstract class AbstractActor
extends java.lang.Object
implements [Actor](Actor.html "interface in akka.actor")
```

Java API: compatible with lambda expressions
 
 Actor base class that should be extended to create Java actors that use lambdas.
 

 Example:
 
```

 public class MyActorForJavaDoc extends AbstractActor{
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(Double.class, d -> {
                    sender().tell(d.isNaN() ? 0 : d, self());
                })
                .match(Integer.class, i -> {
                    sender().tell(i * 10, self());
                })
                .match(String.class, s -> s.startsWith("foo"), s -> {
                    sender().tell(s.toUpperCase(), self());
                })
                .build();
    }
 }
 
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[AbstractActor.ActorContext](AbstractActor.ActorContext.html "interface in akka.actor")` | The actor context \- the view of the actor cell from the actor. |
	| `static class` | `[AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor")` | Defines which messages the Actor can handle, along with the implementation of  how the messages should be processed. |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractActor](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `[ActorContext](ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `abstract [AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor")` | `[createReceive](#createReceive())()` | An actor has to define its initial receive behavior by implementing  the `createReceive` method. |
	| `static [AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor")` | `[emptyBehavior](#emptyBehavior())()` | emptyBehavior is a Receive\-expression that matches no messages at all, ever. |
	| `[AbstractActor.ActorContext](AbstractActor.ActorContext.html "interface in akka.actor")` | `[getContext](#getContext())()` | Returns this AbstractActor's ActorContext  The ActorContext is not thread safe so do not expose it outside of the  AbstractActor. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[getSelf](#getSelf())()` | Returns the ActorRef for this actor. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[getSender](#getSender())()` | The reference sender Actor of the currently processed message. |
	| `void` | `[postRestart](#postRestart(java.lang.Throwable))​(java.lang.Throwable reason)` | User overridable callback: By default it calls `preStart()`. |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `void` | `[preRestart](#preRestart(java.lang.Throwable,java.util.Optional))​(java.lang.Throwable reason,  java.util.Optional<java.lang.Object> message)` | User overridable callback: '''By default it disposes of all children and then calls `postStop()`.''' |
	| `void` | `[preRestart](#preRestart(java.lang.Throwable,scala.Option))​(java.lang.Throwable reason,  scala.Option<java.lang.Object> message)` | Deprecated. Override preRestart with message parameter with Optional type instead. |
	| `void` | `[preStart](#preStart())()` | User overridable callback. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `[ReceiveBuilder](../japi/pf/ReceiveBuilder.html "class in akka.japi.pf")` | `[receiveBuilder](#receiveBuilder())()` | Convenience factory of the `ReceiveBuilder`. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	| `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")` | `[supervisorStrategy](#supervisorStrategy())()` | User overridable definition the strategy to use for supervising  child actors. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](Actor.html#aroundPostStop()), [aroundPreRestart](Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](Actor.html#aroundPreStart()), [aroundReceive](Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [sender](Actor.html#sender()), [unhandled](Actor.html#unhandled(java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### AbstractActor
		
		
		
		```
		public AbstractActor()
		```

	- ### Method Detail
	
	
	
		- #### emptyBehavior
		
		
		
		```
		public static final [AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor") emptyBehavior()
		```
		
		emptyBehavior is a Receive\-expression that matches no messages at all, ever.
		- #### context
		
		
		
		```
		public [ActorContext](ActorContext.html "interface in akka.actor") context()
		```
		
		Description copied from interface: `[Actor](Actor.html#context())`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[context](Actor.html#context())` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### self
		
		
		
		```
		public final [ActorRef](ActorRef.html "class in akka.actor") self()
		```
		
		Description copied from interface: `[Actor](Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](Actor.html#self())` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](ActorContext.html "interface in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$context_$eq](Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$self\_$eq
		
		
		
		```
		protected final void akka$actor$Actor$_setter_$self_$eq​([ActorRef](ActorRef.html "class in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### getContext
		
		
		
		```
		public [AbstractActor.ActorContext](AbstractActor.ActorContext.html "interface in akka.actor") getContext()
		```
		
		Returns this AbstractActor's ActorContext
		 The ActorContext is not thread safe so do not expose it outside of the
		 AbstractActor.
		- #### getSelf
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") getSelf()
		```
		
		Returns the ActorRef for this actor.
		 
		 Same as `self()`.
		- #### getSender
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") getSender()
		```
		
		The reference sender Actor of the currently processed message. This is
		 always a legal destination to send to, even if there is no logical recipient
		 for the reply, in which case it will be sent to the dead letter mailbox.
		 
		 Same as `sender()`.
		 
		
		
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		- #### supervisorStrategy
		
		
		
		```
		public [SupervisorStrategy](SupervisorStrategy.html "class in akka.actor") supervisorStrategy()
		```
		
		User overridable definition the strategy to use for supervising
		 child actors.
		
		Specified by:
		`[supervisorStrategy](Actor.html#supervisorStrategy())` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### preStart
		
		
		
		```
		public void preStart()
		              throws java.lang.Exception
		```
		
		User overridable callback.
		 
		 Is called when an Actor is started.
		 Actor are automatically started asynchronously when created.
		 Empty default implementation.
		
		Specified by:
		`[preStart](Actor.html#preStart())` in interface `[Actor](Actor.html "interface in akka.actor")`
		Throws:
		`java.lang.Exception`
		- #### postStop
		
		
		
		```
		public void postStop()
		              throws java.lang.Exception
		```
		
		User overridable callback.
		 
		 Is called asynchronously after `getContext().stop()` is invoked.
		 Empty default implementation.
		
		Specified by:
		`[postStop](Actor.html#postStop())` in interface `[Actor](Actor.html "interface in akka.actor")`
		Throws:
		`java.lang.Exception`
		- #### preRestart
		
		
		
		```
		public void preRestart​(java.lang.Throwable reason,
		                       scala.Option<java.lang.Object> message)
		                throws java.lang.Exception
		```
		
		Deprecated.
		Override preRestart with message parameter with Optional type instead. Since 2\.5\.0\.
		
		Description copied from interface: `[Actor](Actor.html#preRestart(java.lang.Throwable,scala.Option))`
		Scala API: User overridable callback: '''By default it disposes of all children and then calls `postStop()`.'''
		
		Specified by:
		`[preRestart](Actor.html#preRestart(java.lang.Throwable,scala.Option))` in interface `[Actor](Actor.html "interface in akka.actor")`
		Parameters:
		`reason` \- the Throwable that caused the restart to happen
		`message` \- optionally the current message the actor processed when failing, if applicable
		 
		 Is called on a crashed Actor right BEFORE it is restarted to allow clean
		 up of resources before Actor is terminated.
		Throws:
		`java.lang.Exception`
		- #### preRestart
		
		
		
		```
		public void preRestart​(java.lang.Throwable reason,
		                       java.util.Optional<java.lang.Object> message)
		                throws java.lang.Exception
		```
		
		User overridable callback: '''By default it disposes of all children and then calls `postStop()`.'''
		 
		 Is called on a crashed Actor right BEFORE it is restarted to allow clean
		 up of resources before Actor is terminated.
		
		Throws:
		`java.lang.Exception`
		- #### postRestart
		
		
		
		```
		public void postRestart​(java.lang.Throwable reason)
		                 throws java.lang.Exception
		```
		
		User overridable callback: By default it calls `preStart()`.
		 
		 Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.
		
		Specified by:
		`[postRestart](Actor.html#postRestart(java.lang.Throwable))` in interface `[Actor](Actor.html "interface in akka.actor")`
		Parameters:
		`reason` \- the Throwable that caused the restart to happen
		 
		 Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.
		Throws:
		`java.lang.Exception`
		- #### createReceive
		
		
		
		```
		public abstract [AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor") createReceive()
		```
		
		An actor has to define its initial receive behavior by implementing
		 the `createReceive` method.
		- #### receive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](Actor.html#receive())` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### receiveBuilder
		
		
		
		```
		public final [ReceiveBuilder](../japi/pf/ReceiveBuilder.html "class in akka.japi.pf") receiveBuilder()
		```
		
		Convenience factory of the `ReceiveBuilder`.
		 Creates a new empty `ReceiveBuilder`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/AbstractActor.Receive.html
- https://doc.akka.io/japi/akka/current/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/japi/akka/current/akka/actor/AbstractActorWithTimers.html
- https://doc.akka.io/japi/akka/current/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/japi/akka/current/akka/actor/AbstractActorWithUnrestrictedStash.html
- https://doc.akka.io/japi/akka/current/akka/actor/AbstractLoggingActor.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/actor/UntypedAbstractActor.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/ReceiveBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/japi/akka/current/akka/persistence/AbstractPersistentActorWithTimers.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/AbstractActor.html](https://doc.akka.io/japi/akka/current/akka/actor/AbstractActor.html)*
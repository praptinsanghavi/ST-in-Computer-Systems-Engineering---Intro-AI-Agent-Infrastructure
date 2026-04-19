---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:30:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActorWithUnboundedStash.html
title: AbstractActorWithUnboundedStash
---

# AbstractActorWithUnboundedStash

## Content

Package [akka.actor](package-summary.html)
## Class AbstractActorWithUnboundedStash

- java.lang.Object
- - [akka.actor.AbstractActor](AbstractActor.html "class in akka.actor")
	- - akka.actor.AbstractActorWithUnboundedStash

- All Implemented Interfaces:
`[Actor](Actor.html "interface in akka.actor")`, `[StashSupport](StashSupport.html "interface in akka.actor")`, `[UnboundedStash](UnboundedStash.html "interface in akka.actor")`, `[UnrestrictedStash](UnrestrictedStash.html "interface in akka.actor")`, `[RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[UnboundedDequeBasedMessageQueueSemantics](../dispatch/UnboundedDequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`

---

```
public abstract class AbstractActorWithUnboundedStash
extends [AbstractActor](AbstractActor.html "class in akka.actor")
implements [UnboundedStash](UnboundedStash.html "interface in akka.actor")
```

Java API: compatible with lambda expressions
 
 Actor base class with `Stash` that enforces an unbounded deque for the actor. The proper mailbox has to be configured
 manually, and the mailbox should extend the [`DequeBasedMessageQueueSemantics`](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") marker trait.
 See [`AbstractActorWithStash`](AbstractActorWithStash.html "class in akka.actor") for details on how `Stash` works.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.[AbstractActor](AbstractActor.html "class in akka.actor")
		
		
		`[AbstractActor.ActorContext](AbstractActor.ActorContext.html "interface in akka.actor"), [AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractActorWithUnboundedStash](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$StashSupport$_setter_$mailbox_$eq](#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics))​([DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") x$1)` |  |
	
	
		- ### Methods inherited from class akka.actor.[AbstractActor](AbstractActor.html "class in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](AbstractActor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](AbstractActor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](AbstractActor.html#context()), [createReceive](AbstractActor.html#createReceive()), [emptyBehavior](AbstractActor.html#emptyBehavior()), [getContext](AbstractActor.html#getContext()), [getSelf](AbstractActor.html#getSelf()), [getSender](AbstractActor.html#getSender()), [postRestart](AbstractActor.html#postRestart(java.lang.Throwable)), [postStop](AbstractActor.html#postStop()), [preRestart](AbstractActor.html#preRestart(java.lang.Throwable,java.util.Optional)), [preRestart](AbstractActor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](AbstractActor.html#preStart()), [receive](AbstractActor.html#receive()), [receiveBuilder](AbstractActor.html#receiveBuilder()), [self](AbstractActor.html#self()), [supervisorStrategy](AbstractActor.html#supervisorStrategy())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](Actor.html#aroundPostStop()), [aroundPreRestart](Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](Actor.html#aroundPreStart()), [aroundReceive](Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](Actor.html#context()), [postRestart](Actor.html#postRestart(java.lang.Throwable)), [preStart](Actor.html#preStart()), [receive](Actor.html#receive()), [self](Actor.html#self()), [sender](Actor.html#sender()), [supervisorStrategy](Actor.html#supervisorStrategy()), [unhandled](Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[StashSupport](StashSupport.html "interface in akka.actor")
		
		
		`[actorCell](StashSupport.html#actorCell()), [clearStash](StashSupport.html#clearStash()), [context](StashSupport.html#context()), [enqueueFirst](StashSupport.html#enqueueFirst(akka.dispatch.Envelope)), [prepend](StashSupport.html#prepend(scala.collection.immutable.Seq)), [self](StashSupport.html#self()), [stash](StashSupport.html#stash()), [stashAtHead](StashSupport.html#stashAtHead()), [theStash_$eq](StashSupport.html#theStash_$eq(scala.collection.immutable.Vector)), [unstash](StashSupport.html#unstash()), [unstashAll](StashSupport.html#unstashAll()), [unstashAll](StashSupport.html#unstashAll(scala.Function1))`
		- ### Methods inherited from interface akka.actor.[UnrestrictedStash](UnrestrictedStash.html "interface in akka.actor")
		
		
		`[postStop](UnrestrictedStash.html#postStop()), [preRestart](UnrestrictedStash.html#preRestart(java.lang.Throwable,scala.Option)), [super$postStop](UnrestrictedStash.html#super$postStop()), [super$preRestart](UnrestrictedStash.html#super$preRestart(java.lang.Throwable,scala.Option))`

- - ### Constructor Detail
	
	
	
		- #### AbstractActorWithUnboundedStash
		
		
		
		```
		public AbstractActorWithUnboundedStash()
		```

	- ### Method Detail
	
	
	
		- #### akka$actor$StashSupport$\_setter\_$mailbox\_$eq
		
		
		
		```
		protected void akka$actor$StashSupport$_setter_$mailbox_$eq​([DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") x$1)
		```
		
		
		Specified by:
		`[akka$actor$StashSupport$_setter_$mailbox_$eq](StashSupport.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics))` in interface `[StashSupport](StashSupport.html "interface in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.Receive.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/UnboundedStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedDequeBasedMessageQueueSemantics.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActorWithUnboundedStash.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActorWithUnboundedStash.html)*
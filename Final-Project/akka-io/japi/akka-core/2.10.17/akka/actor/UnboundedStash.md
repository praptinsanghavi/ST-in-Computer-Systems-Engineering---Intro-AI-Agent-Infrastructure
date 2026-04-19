---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/UnboundedStash.html
title: UnboundedStash
---

# UnboundedStash

## Content

Package [akka.actor](package-summary.html)
## Interface UnboundedStash

- All Superinterfaces:
`[Actor](Actor.html "interface in akka.actor")`, `[RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[UnboundedDequeBasedMessageQueueSemantics](../dispatch/UnboundedDequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`, `[StashSupport](StashSupport.html "interface in akka.actor")`, `[UnrestrictedStash](UnrestrictedStash.html "interface in akka.actor")`

All Known Implementing Classes:
`[AbstractActorWithUnboundedStash](AbstractActorWithUnboundedStash.html "class in akka.actor")`

---

```
public interface UnboundedStash
extends [UnrestrictedStash](UnrestrictedStash.html "interface in akka.actor"), [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[UnboundedDequeBasedMessageQueueSemantics](../dispatch/UnboundedDequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>
```

The `UnboundedStash` trait is a version of [`Stash`](Stash.html "interface in akka.actor") that enforces an unbounded stash for you actor.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Method Summary
	
	
		- ### Methods inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](Actor.html#aroundPostStop()), [aroundPreRestart](Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](Actor.html#aroundPreStart()), [aroundReceive](Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](Actor.html#context()), [postRestart](Actor.html#postRestart(java.lang.Throwable)), [preStart](Actor.html#preStart()), [receive](Actor.html#receive()), [self](Actor.html#self()), [sender](Actor.html#sender()), [supervisorStrategy](Actor.html#supervisorStrategy()), [unhandled](Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[StashSupport](StashSupport.html "interface in akka.actor")
		
		
		`[actorCell](StashSupport.html#actorCell()), [akka$actor$StashSupport$_setter_$mailbox_$eq](StashSupport.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics)), [clearStash](StashSupport.html#clearStash()), [context](StashSupport.html#context()), [enqueueFirst](StashSupport.html#enqueueFirst(akka.dispatch.Envelope)), [mailbox](StashSupport.html#mailbox()), [prepend](StashSupport.html#prepend(scala.collection.immutable.Seq)), [self](StashSupport.html#self()), [stash](StashSupport.html#stash()), [stashAtHead](StashSupport.html#stashAtHead()), [theStash_$eq](StashSupport.html#theStash_$eq(scala.collection.immutable.Vector)), [unstash](StashSupport.html#unstash()), [unstashAll](StashSupport.html#unstashAll()), [unstashAll](StashSupport.html#unstashAll(scala.Function1))`
		- ### Methods inherited from interface akka.actor.[UnrestrictedStash](UnrestrictedStash.html "interface in akka.actor")
		
		
		`[postStop](UnrestrictedStash.html#postStop()), [preRestart](UnrestrictedStash.html#preRestart(java.lang.Throwable,scala.Option)), [super$postStop](UnrestrictedStash.html#super$postStop()), [super$preRestart](UnrestrictedStash.html#super$preRestart(java.lang.Throwable,scala.Option))`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Stash.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedDequeBasedMessageQueueSemantics.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/UnboundedStash.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/UnboundedStash.html)*
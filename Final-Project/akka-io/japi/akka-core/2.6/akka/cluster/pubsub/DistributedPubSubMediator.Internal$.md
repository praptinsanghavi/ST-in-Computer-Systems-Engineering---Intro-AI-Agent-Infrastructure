---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.TopicLike.html
title: DistributedPubSubMediator.Internal$.TopicLike
---

# DistributedPubSubMediator.Internal$.TopicLike

## Content

Package [akka.cluster.pubsub](package-summary.html)
## Interface DistributedPubSubMediator.Internal$.TopicLike

- All Superinterfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`

Enclosing class:
[DistributedPubSubMediator.Internal$](DistributedPubSubMediator.Internal$.html "class in akka.cluster.pubsub")

---

```
public static interface DistributedPubSubMediator.Internal$.TopicLike
extends [Actor](../../actor/Actor.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[akka$cluster$pubsub$DistributedPubSubMediator$Internal$TopicLike$_setter_$pruneInterval_$eq](#akka$cluster$pubsub$DistributedPubSubMediator$Internal$TopicLike$_setter_$pruneInterval_$eq(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration x$1)` |  |
	| `void` | `[akka$cluster$pubsub$DistributedPubSubMediator$Internal$TopicLike$_setter_$pruneTask_$eq](#akka$cluster$pubsub$DistributedPubSubMediator$Internal$TopicLike$_setter_$pruneTask_$eq(akka.actor.Cancellable))​([Cancellable](../../actor/Cancellable.html "interface in akka.actor") x$1)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[business](#business())()` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[defaultReceive](#defaultReceive())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[emptyTimeToLive](#emptyTimeToLive())()` |  |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `scala.Option<scala.concurrent.duration.Deadline>` | `[pruneDeadline](#pruneDeadline())()` |  |
	| `void` | `[pruneDeadline_$eq](#pruneDeadline_$eq(scala.Option))​(scala.Option<scala.concurrent.duration.Deadline> x$1)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[pruneInterval](#pruneInterval())()` |  |
	| `[Cancellable](../../actor/Cancellable.html "interface in akka.actor")` | `[pruneTask](#pruneTask())()` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `void` | `[remove](#remove(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[subscribers](#subscribers())()` |  |
	| `void` | `[subscribers_$eq](#subscribers_$eq(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)` |  |
	| `void` | `[super$postStop](#super$postStop())()` |  |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](../../actor/Actor.html#context()), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../../actor/Actor.html#preStart()), [self](../../actor/Actor.html#self()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`

- - ### Method Detail
	
	
	
		- #### akka$cluster$pubsub$DistributedPubSubMediator$Internal$TopicLike$\_setter\_$pruneInterval\_$eq
		
		
		
		```
		void akka$cluster$pubsub$DistributedPubSubMediator$Internal$TopicLike$_setter_$pruneInterval_$eq​(scala.concurrent.duration.FiniteDuration x$1)
		```
		- #### akka$cluster$pubsub$DistributedPubSubMediator$Internal$TopicLike$\_setter\_$pruneTask\_$eq
		
		
		
		```
		void akka$cluster$pubsub$DistributedPubSubMediator$Internal$TopicLike$_setter_$pruneTask_$eq​([Cancellable](../../actor/Cancellable.html "interface in akka.actor") x$1)
		```
		- #### business
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> business()
		```
		- #### defaultReceive
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> defaultReceive()
		```
		- #### emptyTimeToLive
		
		
		
		```
		scala.concurrent.duration.FiniteDuration emptyTimeToLive()
		```
		- #### postStop
		
		
		
		```
		void postStop()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#postStop())`
		User overridable callback.
		 
		 Is called asynchronously after 'actor.stop()' is invoked.
		 Empty default implementation.
		
		Specified by:
		`[postStop](../../actor/Actor.html#postStop())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### pruneDeadline
		
		
		
		```
		scala.Option<scala.concurrent.duration.Deadline> pruneDeadline()
		```
		- #### pruneDeadline\_$eq
		
		
		
		```
		void pruneDeadline_$eq​(scala.Option<scala.concurrent.duration.Deadline> x$1)
		```
		- #### pruneInterval
		
		
		
		```
		scala.concurrent.duration.FiniteDuration pruneInterval()
		```
		- #### pruneTask
		
		
		
		```
		[Cancellable](../../actor/Cancellable.html "interface in akka.actor") pruneTask()
		```
		- #### receive
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../../actor/Actor.html#receive())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### remove
		
		
		
		```
		void remove​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		- #### subscribers
		
		
		
		```
		scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> subscribers()
		```
		- #### subscribers\_$eq
		
		
		
		```
		void subscribers_$eq​(scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)
		```
		- #### super$postStop
		
		
		
		```
		void super$postStop()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.TopicLike.html](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.TopicLike.html)*
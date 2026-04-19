---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:33:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData.html
title: RemoveInternalClusterShardingData
---

# RemoveInternalClusterShardingData

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class RemoveInternalClusterShardingData

- java.lang.Object
- - akka.cluster.sharding.RemoveInternalClusterShardingData

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`

---

```
public class RemoveInternalClusterShardingData
extends java.lang.Object
implements [Actor](../../actor/Actor.html "interface in akka.actor"), [ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
```

See Also:
[`RemoveInternalClusterShardingData companion object`](RemoveInternalClusterShardingData$.html "class in akka.cluster.sharding")

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[RemoveInternalClusterShardingData.RemoveOnePersistenceId$](RemoveInternalClusterShardingData.RemoveOnePersistenceId$.html "class in akka.cluster.sharding")` | INTERNAL API |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoveInternalClusterShardingData](#%3Cinit%3E(java.lang.String,scala.collection.immutable.Set,scala.concurrent.Promise,boolean))​(java.lang.String journalPluginId,  scala.collection.immutable.Set<java.lang.String> typeNames,  scala.concurrent.Promise<scala.runtime.BoxedUnit> completion,  boolean remove2dot3Data)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `[ActorContext](../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `java.lang.String` | `[currentPid](#currentPid())()` |  |
	| `void` | `[currentPid_$eq](#currentPid_$eq(java.lang.String))​(java.lang.String x$1)` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[currentRef](#currentRef())()` |  |
	| `void` | `[currentRef_$eq](#currentRef_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` |  |
	| `void` | `[done](#done())()` |  |
	| `void` | `[failure](#failure(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `static void` | `[main](#main(java.lang.String%5B%5D))​(java.lang.String[] args)` |  |
	| `java.lang.String` | `[persistenceId](#persistenceId(java.lang.String))​(java.lang.String typeName)` |  |
	| `java.lang.String` | `[persistenceId2dot3](#persistenceId2dot3(java.lang.String))​(java.lang.String typeName)` |  |
	| `void` | `[preStart](#preStart())()` | User overridable callback. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `scala.collection.immutable.Set<java.lang.String>` | `[remainingPids](#remainingPids())()` |  |
	| `void` | `[remainingPids_$eq](#remainingPids_$eq(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> x$1)` |  |
	| `static scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[remove](#remove(akka.actor.ActorSystem,java.lang.String,scala.collection.immutable.Set,boolean))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system,  java.lang.String journalPluginId,  scala.collection.immutable.Set<java.lang.String> typeNames,  boolean remove2dot3Data)` | API corresponding to the [`main(java.lang.String[])`](#main(java.lang.String%5B%5D)) method as described in the  [`RemoveInternalClusterShardingData companion object`](RemoveInternalClusterShardingData$.html "class in akka.cluster.sharding") |
	| `void` | `[removeNext](#removeNext())()` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [postStop](../../actor/Actor.html#postStop()), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`

- - ### Constructor Detail
	
	
	
		- #### RemoveInternalClusterShardingData
		
		
		
		```
		public RemoveInternalClusterShardingData​(java.lang.String journalPluginId,
		                                         scala.collection.immutable.Set<java.lang.String> typeNames,
		                                         scala.concurrent.Promise<scala.runtime.BoxedUnit> completion,
		                                         boolean remove2dot3Data)
		```

	- ### Method Detail
	
	
	
		- #### main
		
		
		
		```
		public static void main​(java.lang.String[] args)
		```
		
		
		See Also:
		[`RemoveInternalClusterShardingData companion object`](RemoveInternalClusterShardingData$.html "class in akka.cluster.sharding")
		- #### remove
		
		
		
		```
		public static scala.concurrent.Future<scala.runtime.BoxedUnit> remove​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system,
		                                                                      java.lang.String journalPluginId,
		                                                                      scala.collection.immutable.Set<java.lang.String> typeNames,
		                                                                      boolean remove2dot3Data)
		```
		
		API corresponding to the [`main(java.lang.String[])`](#main(java.lang.String%5B%5D)) method as described in the
		 [`RemoveInternalClusterShardingData companion object`](RemoveInternalClusterShardingData$.html "class in akka.cluster.sharding")
		- #### context
		
		
		
		```
		public [ActorContext](../../actor/ActorContext.html "interface in akka.actor") context()
		```
		
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
		- #### self
		
		
		
		```
		public final [ActorRef](../../actor/ActorRef.html "class in akka.actor") self()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](../../actor/Actor.html#self())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)
		```
		
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
		
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### currentPid
		
		
		
		```
		public java.lang.String currentPid()
		```
		- #### currentPid\_$eq
		
		
		
		```
		public void currentPid_$eq​(java.lang.String x$1)
		```
		- #### currentRef
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") currentRef()
		```
		- #### currentRef\_$eq
		
		
		
		```
		public void currentRef_$eq​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)
		```
		- #### remainingPids
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> remainingPids()
		```
		- #### remainingPids\_$eq
		
		
		
		```
		public void remainingPids_$eq​(scala.collection.immutable.Set<java.lang.String> x$1)
		```
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId​(java.lang.String typeName)
		```
		- #### persistenceId2dot3
		
		
		
		```
		public java.lang.String persistenceId2dot3​(java.lang.String typeName)
		```
		- #### preStart
		
		
		
		```
		public void preStart()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#preStart())`
		User overridable callback.
		 
		 Is called when an Actor is started.
		 Actors are automatically started asynchronously when created.
		 Empty default implementation.
		
		Specified by:
		`[preStart](../../actor/Actor.html#preStart())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### removeNext
		
		
		
		```
		public void removeNext()
		```
		- #### receive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../../actor/Actor.html#receive())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### done
		
		
		
		```
		public void done()
		```
		- #### failure
		
		
		
		```
		public void failure​(java.lang.Throwable cause)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData.RemoveOnePersistenceId$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData.html)*
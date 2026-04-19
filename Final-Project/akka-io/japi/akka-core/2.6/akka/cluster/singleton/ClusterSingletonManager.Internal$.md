---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.html
title: ClusterSingletonManager.Internal$.OldestChangedBuffer
---

# ClusterSingletonManager.Internal$.OldestChangedBuffer

## Content

Package [akka.cluster.singleton](package-summary.html)
## Class ClusterSingletonManager.Internal$.OldestChangedBuffer

- java.lang.Object
- - akka.cluster.singleton.ClusterSingletonManager.Internal$.OldestChangedBuffer

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`

Enclosing class:
[ClusterSingletonManager.Internal$](ClusterSingletonManager.Internal$.html "class in akka.cluster.singleton")

---

```
public class ClusterSingletonManager.Internal$.OldestChangedBuffer
extends java.lang.Object
implements [Actor](../../actor/Actor.html "interface in akka.actor")
```

Notifications of member events that track oldest member are tunneled
 via this actor (child of ClusterSingletonManager) to be able to deliver
 one change at a time. Avoiding simultaneous changes simplifies
 the process in ClusterSingletonManager. ClusterSingletonManager requests
 next event with `GetNext` when it is ready for it. Only one outstanding
 `GetNext` request is allowed. Incoming events are buffered and delivered
 upon `GetNext` request.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[ClusterSingletonManager.Internal$.OldestChangedBuffer.GetNext$](ClusterSingletonManager.Internal$.OldestChangedBuffer.GetNext$.html "class in akka.cluster.singleton")` | Request to deliver one more event. |
	| `class` | `[ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState](ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState.html "class in akka.cluster.singleton")` | The first event, corresponding to CurrentClusterState. |
	| `class` | `[ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$](ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged](ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$](ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$.html "class in akka.cluster.singleton")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OldestChangedBuffer](#%3Cinit%3E(scala.Option))​(scala.Option<java.lang.String> role)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[add](#add(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` |  |
	| `scala.math.Ordering<[Member](../Member.html "class in akka.cluster")>` | `[ageOrdering](#ageOrdering())()` |  |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `scala.collection.immutable.Vector<java.lang.Object>` | `[changes](#changes())()` |  |
	| `void` | `[changes_$eq](#changes_$eq(scala.collection.immutable.Vector))​(scala.collection.immutable.Vector<java.lang.Object> x$1)` |  |
	| `[Cluster](../Cluster.html "class in akka.cluster")` | `[cluster](#cluster())()` |  |
	| `[ActorContext](../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `void` | `[deliverChanges](#deliverChanges())()` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[deliverNext](#deliverNext())()` |  |
	| `void` | `[handleInitial](#handleInitial(akka.cluster.ClusterEvent.CurrentClusterState))​([ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") state)` |  |
	| `boolean` | `[matchingRole](#matchingRole(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") member)` |  |
	| `scala.collection.immutable.SortedSet<[Member](../Member.html "class in akka.cluster")>` | `[membersByAge](#membersByAge())()` |  |
	| `void` | `[membersByAge_$eq](#membersByAge_$eq(scala.collection.immutable.SortedSet))​(scala.collection.immutable.SortedSet<[Member](../Member.html "class in akka.cluster")> x$1)` |  |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `void` | `[preStart](#preStart())()` | User overridable callback. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `void` | `[remove](#remove(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	| `void` | `[sendFirstChange](#sendFirstChange())()` |  |
	| `void` | `[trackChange](#trackChange(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> block)` |  |
	| `void` | `[unhandled](#unhandled(java.lang.Object))​(java.lang.Object msg)` | User overridable callback. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy())`

- - ### Constructor Detail
	
	
	
		- #### OldestChangedBuffer
		
		
		
		```
		public OldestChangedBuffer​(scala.Option<java.lang.String> role)
		```

	- ### Method Detail
	
	
	
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
		- #### cluster
		
		
		
		```
		public [Cluster](../Cluster.html "class in akka.cluster") cluster()
		```
		- #### ageOrdering
		
		
		
		```
		public scala.math.Ordering<[Member](../Member.html "class in akka.cluster")> ageOrdering()
		```
		- #### membersByAge
		
		
		
		```
		public scala.collection.immutable.SortedSet<[Member](../Member.html "class in akka.cluster")> membersByAge()
		```
		- #### membersByAge\_$eq
		
		
		
		```
		public void membersByAge_$eq​(scala.collection.immutable.SortedSet<[Member](../Member.html "class in akka.cluster")> x$1)
		```
		- #### changes
		
		
		
		```
		public scala.collection.immutable.Vector<java.lang.Object> changes()
		```
		- #### changes\_$eq
		
		
		
		```
		public void changes_$eq​(scala.collection.immutable.Vector<java.lang.Object> x$1)
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
		- #### postStop
		
		
		
		```
		public void postStop()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#postStop())`
		User overridable callback.
		 
		 Is called asynchronously after 'actor.stop()' is invoked.
		 Empty default implementation.
		
		Specified by:
		`[postStop](../../actor/Actor.html#postStop())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### matchingRole
		
		
		
		```
		public boolean matchingRole​([Member](../Member.html "class in akka.cluster") member)
		```
		- #### trackChange
		
		
		
		```
		public void trackChange​(scala.Function0<scala.runtime.BoxedUnit> block)
		```
		- #### handleInitial
		
		
		
		```
		public void handleInitial​([ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") state)
		```
		- #### add
		
		
		
		```
		public void add​([Member](../Member.html "class in akka.cluster") m)
		```
		- #### remove
		
		
		
		```
		public void remove​([Member](../Member.html "class in akka.cluster") m)
		```
		- #### sendFirstChange
		
		
		
		```
		public void sendFirstChange()
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
		- #### deliverNext
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> deliverNext()
		```
		- #### deliverChanges
		
		
		
		```
		public void deliverChanges()
		```
		- #### unhandled
		
		
		
		```
		public void unhandled​(java.lang.Object msg)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#unhandled(java.lang.Object))`
		User overridable callback.
		 
		 Is called when a message isn't handled by the current behavior of the actor
		 by default it fails with either a [`DeathPactException`](../../actor/DeathPactException.html "class in akka.actor") (in
		 case of an unhandled [`Terminated`](../../actor/Terminated.html "class in akka.actor") message) or publishes an [`UnhandledMessage`](../../actor/UnhandledMessage.html "class in akka.actor")
		 to the actor's system's [`EventStream`](../../event/EventStream.html "class in akka.event")
		
		Specified by:
		`[unhandled](../../actor/Actor.html#unhandled(java.lang.Object))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ClusterEvent.CurrentClusterState.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.GetNext$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManager.Internal$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/singleton/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/EventStream.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.html](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.html)*
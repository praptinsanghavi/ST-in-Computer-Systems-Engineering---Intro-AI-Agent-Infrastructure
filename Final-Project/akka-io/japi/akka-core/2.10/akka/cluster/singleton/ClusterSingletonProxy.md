---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:47:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxy.html
title: ClusterSingletonProxy
---

# ClusterSingletonProxy

## Content

Package [akka.cluster.singleton](package-summary.html)
## Class ClusterSingletonProxy

- java.lang.Object
- - akka.cluster.singleton.ClusterSingletonProxy

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`

---

```
public final class ClusterSingletonProxy
extends java.lang.Object
implements [Actor](../../actor/Actor.html "interface in akka.actor"), [ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
```

The `ClusterSingletonProxy` works together with the [`ClusterSingletonManager`](ClusterSingletonManager.html "class in akka.cluster.singleton") to provide a
 distributed proxy to the singleton actor.
 
 The proxy can be started on every node where the singleton needs to be reached and used as if it were the singleton
 itself. It will then act as a router to the currently running singleton instance. If the singleton is not currently
 available, e.g., during hand off or startup, the proxy will buffer the messages sent to the singleton and then deliver
 them when the singleton is finally available. The size of the buffer is configurable and it can be disabled by using
 a buffer size of 0\. When the buffer is full old messages will be dropped when new messages are sent via the proxy.
 

 The proxy works by keeping track of the oldest cluster member. When a new oldest member is identified, e.g. because
 the older one left the cluster, or at startup, the proxy will try to identify the singleton on the oldest member by
 periodically sending an [`Identify`](../../actor/Identify.html "class in akka.actor") message until the singleton responds with its
 [`ActorIdentity`](../../actor/ActorIdentity.html "class in akka.actor").
 

 Note that this is a best effort implementation: messages can always be lost due to the distributed nature of the
 actors involved.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingletonProxy](#%3Cinit%3E(java.lang.String,akka.cluster.singleton.ClusterSingletonProxySettings))​(java.lang.String singletonManagerPath,  [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") settings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[add](#add(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` | Adds new member if it has the right role. |
	| `scala.math.Ordering<[Member](../Member.html "class in akka.cluster")>` | `[ageOrdering](#ageOrdering())()` |  |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `[MessageBuffer](../../util/MessageBuffer.html "class in akka.util")` | `[buffer](#buffer())()` |  |
	| `void` | `[buffer](#buffer(java.lang.Object))​(java.lang.Object msg)` |  |
	| `void` | `[buffer_$eq](#buffer_$eq(akka.util.MessageBuffer))​([MessageBuffer](../../util/MessageBuffer.html "class in akka.util") x$1)` |  |
	| `void` | `[cancelTimer](#cancelTimer())()` |  |
	| `[Cluster](../Cluster.html "class in akka.cluster")` | `[cluster](#cluster())()` |  |
	| `[ActorContext](../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `java.lang.String` | `[createIdentifyId](#createIdentifyId(int))​(int i)` |  |
	| `void` | `[handleInitial](#handleInitial(akka.cluster.ClusterEvent.CurrentClusterState))​([ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") state)` |  |
	| `int` | `[identifyCounter](#identifyCounter())()` |  |
	| `void` | `[identifyCounter_$eq](#identifyCounter_$eq(int))​(int x$1)` |  |
	| `java.lang.String` | `[identifyId](#identifyId())()` |  |
	| `void` | `[identifyId_$eq](#identifyId_$eq(java.lang.String))​(java.lang.String x$1)` |  |
	| `void` | `[identifySingleton](#identifySingleton())()` | Discard old singleton ActorRef and send a periodic message to self to identify the singleton. |
	| `scala.Option<[Cancellable](../../actor/Cancellable.html "interface in akka.actor")>` | `[identifyTimer](#identifyTimer())()` |  |
	| `void` | `[identifyTimer_$eq](#identifyTimer_$eq(scala.Option))​(scala.Option<[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> x$1)` |  |
	| `boolean` | `[matchingRole](#matchingRole(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") member)` |  |
	| `scala.collection.immutable.SortedSet<[Member](../Member.html "class in akka.cluster")>` | `[membersByAge](#membersByAge())()` |  |
	| `void` | `[membersByAge_$eq](#membersByAge_$eq(scala.collection.immutable.SortedSet))​(scala.collection.immutable.SortedSet<[Member](../Member.html "class in akka.cluster")> x$1)` |  |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `void` | `[preStart](#preStart())()` | User overridable callback. |
	| `static [Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(java.lang.String,akka.cluster.singleton.ClusterSingletonProxySettings))​(java.lang.String singletonManagerPath,  [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") settings)` | Scala API: Factory method for `ClusterSingletonProxy` [`Props`](../../actor/Props.html "class in akka.actor"). |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `void` | `[remove](#remove(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` | Removes a member. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	| `void` | `[sendBuffered](#sendBuffered())()` |  |
	| `scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[singleton](#singleton())()` |  |
	| `void` | `[singleton_$eq](#singleton_$eq(scala.Option))​(scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)` |  |
	| `java.lang.String[]` | `[singletonPath](#singletonPath())()` |  |
	| `void` | `[trackChange](#trackChange(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> block)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`

- - ### Constructor Detail
	
	
	
		- #### ClusterSingletonProxy
		
		
		
		```
		public ClusterSingletonProxy​(java.lang.String singletonManagerPath,
		                             [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") settings)
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public static [Props](../../actor/Props.html "class in akka.actor") props​(java.lang.String singletonManagerPath,
		                          [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") settings)
		```
		
		Scala API: Factory method for `ClusterSingletonProxy` [`Props`](../../actor/Props.html "class in akka.actor").
		 
		
		Parameters:
		`singletonManagerPath` \- The logical path of the singleton manager, e.g. `/user/singletonManager`,
		 which ends with the name you defined in `actorOf` when creating the [`ClusterSingletonManager`](ClusterSingletonManager.html "class in akka.cluster.singleton").
		`settings` \- see [`ClusterSingletonProxySettings`](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")
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
		- #### singletonPath
		
		
		
		```
		public java.lang.String[] singletonPath()
		```
		- #### identifyCounter
		
		
		
		```
		public int identifyCounter()
		```
		- #### identifyCounter\_$eq
		
		
		
		```
		public void identifyCounter_$eq​(int x$1)
		```
		- #### identifyId
		
		
		
		```
		public java.lang.String identifyId()
		```
		- #### identifyId\_$eq
		
		
		
		```
		public void identifyId_$eq​(java.lang.String x$1)
		```
		- #### createIdentifyId
		
		
		
		```
		public java.lang.String createIdentifyId​(int i)
		```
		- #### identifyTimer
		
		
		
		```
		public scala.Option<[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> identifyTimer()
		```
		- #### identifyTimer\_$eq
		
		
		
		```
		public void identifyTimer_$eq​(scala.Option<[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> x$1)
		```
		- #### cluster
		
		
		
		```
		public [Cluster](../Cluster.html "class in akka.cluster") cluster()
		```
		- #### singleton
		
		
		
		```
		public scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> singleton()
		```
		- #### singleton\_$eq
		
		
		
		```
		public void singleton_$eq​(scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)
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
		- #### buffer
		
		
		
		```
		public [MessageBuffer](../../util/MessageBuffer.html "class in akka.util") buffer()
		```
		- #### buffer\_$eq
		
		
		
		```
		public void buffer_$eq​([MessageBuffer](../../util/MessageBuffer.html "class in akka.util") x$1)
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
		- #### cancelTimer
		
		
		
		```
		public void cancelTimer()
		```
		- #### matchingRole
		
		
		
		```
		public boolean matchingRole​([Member](../Member.html "class in akka.cluster") member)
		```
		- #### handleInitial
		
		
		
		```
		public void handleInitial​([ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") state)
		```
		- #### identifySingleton
		
		
		
		```
		public void identifySingleton()
		```
		
		Discard old singleton ActorRef and send a periodic message to self to identify the singleton.
		- #### trackChange
		
		
		
		```
		public void trackChange​(scala.Function0<scala.runtime.BoxedUnit> block)
		```
		- #### add
		
		
		
		```
		public void add​([Member](../Member.html "class in akka.cluster") m)
		```
		
		Adds new member if it has the right role.
		
		Parameters:
		`m` \- New cluster member.
		- #### remove
		
		
		
		```
		public void remove​([Member](../Member.html "class in akka.cluster") m)
		```
		
		Removes a member.
		
		Parameters:
		`m` \- Cluster member to remove.
		- #### receive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../../actor/Actor.html#receive())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### buffer
		
		
		
		```
		public void buffer​(java.lang.Object msg)
		```
		- #### sendBuffered
		
		
		
		```
		public void sendBuffered()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorIdentity.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Identify.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.CurrentClusterState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/MessageBuffer.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxy.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxy.html)*
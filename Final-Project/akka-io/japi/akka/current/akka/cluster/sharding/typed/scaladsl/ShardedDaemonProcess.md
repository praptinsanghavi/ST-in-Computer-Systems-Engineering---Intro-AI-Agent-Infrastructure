---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html
title: ShardedDaemonProcess
---

# ShardedDaemonProcess

## Content

Package [akka.cluster.sharding.typed.scaladsl](package-summary.html)
## Interface ShardedDaemonProcess

- All Superinterfaces:
`[Extension](../../../../actor/typed/Extension.html "interface in akka.actor.typed")`

---

```
public interface ShardedDaemonProcess
extends [Extension](../../../../actor/typed/Extension.html "interface in akka.actor.typed")
```

This extension runs a pre set number of actors in a cluster.
 
 The typical use case is when you have a task that can be divided in a number of workers, each doing a
 sharded part of the work, for example consuming the read side events from Akka Persistence through
 tagged events where each tag decides which consumer that should consume the event.
 

 Each named set needs to be started on all the nodes of the cluster on start up.
 

 The processes are spread out across the cluster, when the cluster topology changes the processes may be stopped
 and started anew on a new node to rebalance them.
 

 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ShardedDaemonProcess](../javadsl/ShardedDaemonProcess.html "class in akka.cluster.sharding.typed.javadsl")` | `[asJava](#asJava())()` | INTERNAL API |
	| `<T> void` | `[init](#init(java.lang.String,int,scala.Function1,akka.cluster.sharding.typed.ShardedDaemonProcessSettings,scala.Option,scala.Option,scala.reflect.ClassTag))​(java.lang.String name,  int numberOfInstances,  scala.Function1<java.lang.Object,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,  [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,  scala.Option<T> stopMessage,  scala.Option<[ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")> shardAllocationStrategy,  scala.reflect.ClassTag<T> classTag)` | Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster. |
	| `<T> void` | `[init](#init(java.lang.String,int,scala.Function1,akka.cluster.sharding.typed.ShardedDaemonProcessSettings,scala.Option,scala.reflect.ClassTag))​(java.lang.String name,  int numberOfInstances,  scala.Function1<java.lang.Object,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,  [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,  scala.Option<T> stopMessage,  scala.reflect.ClassTag<T> classTag)` | Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster. |
	| `<T> void` | `[init](#init(java.lang.String,int,scala.Function1,scala.reflect.ClassTag))​(java.lang.String name,  int numberOfInstances,  scala.Function1<java.lang.Object,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,  scala.reflect.ClassTag<T> classTag)` | Start a specific number of actors that is then kept alive in the cluster. |
	| `<T> void` | `[init](#init(java.lang.String,int,scala.Function1,T,scala.reflect.ClassTag))​(java.lang.String name,  int numberOfInstances,  scala.Function1<java.lang.Object,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,  T stopMessage,  scala.reflect.ClassTag<T> classTag)` | Start a specific number of actors that is then kept alive in the cluster. |
	| `<T> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")>` | `[initWithContext](#initWithContext(java.lang.String,int,scala.Function1,akka.cluster.sharding.typed.ShardedDaemonProcessSettings,scala.Option,scala.Option,scala.reflect.ClassTag))​(java.lang.String name,  int initialNumberOfInstances,  scala.Function1<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,  [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,  scala.Option<T> stopMessage,  scala.Option<[ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")> shardAllocationStrategy,  scala.reflect.ClassTag<T> classTag)` | Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster. |
	| `<T> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")>` | `[initWithContext](#initWithContext(java.lang.String,int,scala.Function1,akka.cluster.sharding.typed.ShardedDaemonProcessSettings,T,scala.reflect.ClassTag))​(java.lang.String name,  int initialNumberOfInstances,  scala.Function1<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,  [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,  T stopMessage,  scala.reflect.ClassTag<T> classTag)` | Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster. |
	| `<T> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")>` | `[initWithContext](#initWithContext(java.lang.String,int,scala.Function1,scala.reflect.ClassTag))​(java.lang.String name,  int initialNumberOfInstances,  scala.Function1<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,  scala.reflect.ClassTag<T> classTag)` | Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster. |

- - ### Method Detail
	
	
	
		- #### init
		
		
		
		```
		<T> void init​(java.lang.String name,
		              int numberOfInstances,
		              scala.Function1<java.lang.Object,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,
		              scala.reflect.ClassTag<T> classTag)
		```
		
		Start a specific number of actors that is then kept alive in the cluster.
		 The number of processing actors can be rescaled by interacting with the returned actor.
		 
		
		Parameters:
		`behaviorFactory` \- Given a unique id of `0` until `numberOfInstance` create the behavior for that actor.
		- #### init
		
		
		
		```
		<T> void init​(java.lang.String name,
		              int numberOfInstances,
		              scala.Function1<java.lang.Object,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,
		              T stopMessage,
		              scala.reflect.ClassTag<T> classTag)
		```
		
		Start a specific number of actors that is then kept alive in the cluster.
		 The number of processing actors can be rescaled by interacting with the returned actor.
		 
		
		Parameters:
		`behaviorFactory` \- Given a unique id of `0` until `numberOfInstance` create the behavior for that actor.
		`stopMessage` \- sent to the actors when they need to stop because of a rebalance across the nodes of the cluster
		 or cluster shutdown.
		- #### init
		
		
		
		```
		<T> void init​(java.lang.String name,
		              int numberOfInstances,
		              scala.Function1<java.lang.Object,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,
		              [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,
		              scala.Option<T> stopMessage,
		              scala.reflect.ClassTag<T> classTag)
		```
		
		Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.
		 The number of processing actors can be rescaled by interacting with the returned actor.
		 
		
		Parameters:
		`behaviorFactory` \- Given a unique id of `0` until `numberOfInstance` create the behavior for that actor.
		`stopMessage` \- if defined sent to the actors when they need to stop because of a rebalance across the nodes of the cluster
		 or cluster shutdown.
		- #### init
		
		
		
		```
		<T> void init​(java.lang.String name,
		              int numberOfInstances,
		              scala.Function1<java.lang.Object,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,
		              [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,
		              scala.Option<T> stopMessage,
		              scala.Option<[ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")> shardAllocationStrategy,
		              scala.reflect.ClassTag<T> classTag)
		```
		
		Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.
		 The number of processing actors can be rescaled by interacting with the returned actor.
		 
		
		Parameters:
		`behaviorFactory` \- Given a unique id of `0` until `numberOfInstance` create the behavior for that actor.
		`stopMessage` \- if defined sent to the actors when they need to stop because of a rebalance across the nodes of the cluster
		 or cluster shutdown.
		`shardAllocationStrategy` \- if defined used by entities to control the shard allocation
		- #### initWithContext
		
		
		
		```
		<T> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")> initWithContext​(java.lang.String name,
		                                                          int initialNumberOfInstances,
		                                                          scala.Function1<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,
		                                                          scala.reflect.ClassTag<T> classTag)
		```
		
		Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.
		 The number of processing actors can be rescaled by interacting with the returned actor.
		 
		
		Parameters:
		`behaviorFactory` \- Given a unique sharded daemon process context containing the total number of workers and the id
		 the specific worker being started, create the behavior for that actor.
		- #### initWithContext
		
		
		
		```
		<T> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")> initWithContext​(java.lang.String name,
		                                                          int initialNumberOfInstances,
		                                                          scala.Function1<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,
		                                                          [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,
		                                                          T stopMessage,
		                                                          scala.reflect.ClassTag<T> classTag)
		```
		
		Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.
		 The number of processing actors can be rescaled by interacting with the returned actor.
		 
		
		Parameters:
		`behaviorFactory` \- Given a unique sharded daemon process context containing the total number of workers and the id
		 the specific worker being started, create the behavior for that actor.
		`stopMessage` \- Sent to the actors when they need to stop because of a worker resize, re\-balance across the
		 nodes of the cluster or cluster shutdown.
		- #### initWithContext
		
		
		
		```
		<T> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")> initWithContext​(java.lang.String name,
		                                                          int initialNumberOfInstances,
		                                                          scala.Function1<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,
		                                                          [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,
		                                                          scala.Option<T> stopMessage,
		                                                          scala.Option<[ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")> shardAllocationStrategy,
		                                                          scala.reflect.ClassTag<T> classTag)
		```
		
		Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.
		 The number of processing actors can be rescaled by interacting with the returned actor.
		 
		
		Parameters:
		`behaviorFactory` \- Given a unique sharded daemon process context containing the total number of workers
		 and the id the specific worker being started, create the behavior for that actor.
		`stopMessage` \- If defined, sent to the actors when they need to stop because of a worker resize,
		 re\-balance across the nodes of the cluster or cluster shutdown.
		`shardAllocationStrategy` \- If defined, used by entities to control the shard allocation.
		- #### asJava
		
		
		
		```
		[ShardedDaemonProcess](../javadsl/ShardedDaemonProcess.html "class in akka.cluster.sharding.typed.javadsl") asJava()
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessCommand.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessContext.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html)*
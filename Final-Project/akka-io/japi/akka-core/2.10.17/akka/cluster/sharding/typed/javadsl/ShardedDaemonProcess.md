---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:28:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html
title: ShardedDaemonProcess
---

# ShardedDaemonProcess

## Content

Package [akka.cluster.sharding.typed.javadsl](package-summary.html)
## Class ShardedDaemonProcess

- java.lang.Object
- - akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess

- ---

```
public abstract class ShardedDaemonProcess
extends java.lang.Object
```

This extension runs a pre set number of actors in a cluster.
 
 The typical use case is when you have a task that can be divided in a number of workers, each doing a
 sharded part of the work, for example consuming the read side events from Akka Persistence through
 tagged events where each tag decides which consumer that should consume the event.
 

 Each named set needs to be started on all the nodes of the cluster on start up.
 

 The processes are spread out across the cluster, when the cluster topology changes the processes may be stopped
 and started anew on a new node to rebalance them.
 

 Not for user extension.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardedDaemonProcess](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ShardedDaemonProcess](ShardedDaemonProcess.html "class in akka.cluster.sharding.typed.javadsl")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `abstract <T> void` | `[init](#init(java.lang.Class,java.lang.String,int,java.util.function.IntFunction))​(java.lang.Class<T> messageClass,  java.lang.String name,  int numberOfInstances,  java.util.function.IntFunction<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory)` | Start a specific number of actors that is then kept alive in the cluster. |
	| `abstract <T> void` | `[init](#init(java.lang.Class,java.lang.String,int,java.util.function.IntFunction,akka.cluster.sharding.typed.ShardedDaemonProcessSettings,java.util.Optional))​(java.lang.Class<T> messageClass,  java.lang.String name,  int numberOfInstances,  java.util.function.IntFunction<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,  [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,  java.util.Optional<T> stopMessage)` | Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster. |
	| `abstract <T> void` | `[init](#init(java.lang.Class,java.lang.String,int,java.util.function.IntFunction,akka.cluster.sharding.typed.ShardedDaemonProcessSettings,java.util.Optional,java.util.Optional))​(java.lang.Class<T> messageClass,  java.lang.String name,  int numberOfInstances,  java.util.function.IntFunction<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,  [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,  java.util.Optional<T> stopMessage,  java.util.Optional<[ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")> shardAllocationStrategy)` | Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster. |
	| `abstract <T> void` | `[init](#init(java.lang.Class,java.lang.String,int,java.util.function.IntFunction,T))​(java.lang.Class<T> messageClass,  java.lang.String name,  int numberOfInstances,  java.util.function.IntFunction<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,  T stopMessage)` | Start a specific number of actors that is then kept alive in the cluster. |
	| `abstract <T> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")>` | `[initWithContext](#initWithContext(java.lang.Class,java.lang.String,int,java.util.function.Function))​(java.lang.Class<T> messageClass,  java.lang.String name,  int initialNumberOfInstances,  java.util.function.Function<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory)` | Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster. |
	| `abstract <T> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")>` | `[initWithContext](#initWithContext(java.lang.Class,java.lang.String,int,java.util.function.Function,akka.cluster.sharding.typed.ShardedDaemonProcessSettings,java.util.Optional))​(java.lang.Class<T> messageClass,  java.lang.String name,  int initialNumberOfInstances,  java.util.function.Function<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,  [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,  java.util.Optional<T> stopMessage)` | Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster. |
	| `abstract <T> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")>` | `[initWithContext](#initWithContext(java.lang.Class,java.lang.String,int,java.util.function.Function,akka.cluster.sharding.typed.ShardedDaemonProcessSettings,java.util.Optional,java.util.Optional))​(java.lang.Class<T> messageClass,  java.lang.String name,  int numberOfInstances,  java.util.function.Function<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,  [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,  java.util.Optional<T> stopMessage,  java.util.Optional<[ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")> shardAllocationStrategy)` | Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ShardedDaemonProcess
		
		
		
		```
		public ShardedDaemonProcess()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [ShardedDaemonProcess](ShardedDaemonProcess.html "class in akka.cluster.sharding.typed.javadsl") get​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### init
		
		
		
		```
		public abstract <T> void init​(java.lang.Class<T> messageClass,
		                              java.lang.String name,
		                              int numberOfInstances,
		                              java.util.function.IntFunction<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory)
		```
		
		Start a specific number of actors that is then kept alive in the cluster.
		
		Parameters:
		`behaviorFactory` \- Given a unique id of `0` until `numberOfInstance` create the behavior for that actor.
		- #### init
		
		
		
		```
		public abstract <T> void init​(java.lang.Class<T> messageClass,
		                              java.lang.String name,
		                              int numberOfInstances,
		                              java.util.function.IntFunction<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,
		                              T stopMessage)
		```
		
		Start a specific number of actors that is then kept alive in the cluster.
		 
		
		Parameters:
		`behaviorFactory` \- Given a unique id of `0` until `numberOfInstance` create the behavior for that actor.
		`stopMessage` \- sent to the actors when they need to stop because of a rebalance across the nodes of the cluster
		 or cluster shutdown.
		- #### init
		
		
		
		```
		public abstract <T> void init​(java.lang.Class<T> messageClass,
		                              java.lang.String name,
		                              int numberOfInstances,
		                              java.util.function.IntFunction<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,
		                              [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,
		                              java.util.Optional<T> stopMessage)
		```
		
		Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.
		
		Parameters:
		`behaviorFactory` \- Given a unique id of `0` until `numberOfInstance` create the behavior for that actor.
		`stopMessage` \- if defined sent to the actors when they need to stop because of a rebalance across the nodes of the cluster
		 or cluster shutdown.
		- #### init
		
		
		
		```
		public abstract <T> void init​(java.lang.Class<T> messageClass,
		                              java.lang.String name,
		                              int numberOfInstances,
		                              java.util.function.IntFunction<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,
		                              [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,
		                              java.util.Optional<T> stopMessage,
		                              java.util.Optional<[ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")> shardAllocationStrategy)
		```
		
		Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.
		
		Parameters:
		`behaviorFactory` \- Given a unique id of `0` until `numberOfInstance` create the behavior for that actor.
		`stopMessage` \- if defined sent to the actors when they need to stop because of a rebalance across the nodes of the cluster,
		 rescale or cluster shutdown.
		`shardAllocationStrategy` \- if defined used by entities to control the shard allocation
		- #### initWithContext
		
		
		
		```
		public abstract <T> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")> initWithContext​(java.lang.Class<T> messageClass,
		                                                                          java.lang.String name,
		                                                                          int initialNumberOfInstances,
		                                                                          java.util.function.Function<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory)
		```
		
		Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.
		 The number of processing actors can be rescaled by interacting with the returned actor.
		 
		
		Parameters:
		`behaviorFactory` \- Given a unique id of `0` until `numberOfInstance` and total number of processes, create the behavior for that actor.
		- #### initWithContext
		
		
		
		```
		public abstract <T> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")> initWithContext​(java.lang.Class<T> messageClass,
		                                                                          java.lang.String name,
		                                                                          int initialNumberOfInstances,
		                                                                          java.util.function.Function<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,
		                                                                          [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,
		                                                                          java.util.Optional<T> stopMessage)
		```
		
		Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.
		 The number of processing actors can be rescaled by interacting with the returned actor.
		 
		
		Parameters:
		`behaviorFactory` \- Given a unique id of `0` until `numberOfInstance` and total number of processes, create the behavior for that actor.
		`stopMessage` \- Sent to the actors when they need to stop because of a rebalance across the nodes of the cluster
		 or cluster shutdown.
		- #### initWithContext
		
		
		
		```
		public abstract <T> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")> initWithContext​(java.lang.Class<T> messageClass,
		                                                                          java.lang.String name,
		                                                                          int numberOfInstances,
		                                                                          java.util.function.Function<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory,
		                                                                          [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,
		                                                                          java.util.Optional<T> stopMessage,
		                                                                          java.util.Optional<[ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")> shardAllocationStrategy)
		```
		
		Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.
		 
		
		Parameters:
		`behaviorFactory` \- Given a unique sharded daemon process context containing the total number of workers and the id
		 the specific worker being started, create the behavior for that actor.
		`stopMessage` \- If defined: sent to the actors when they need to stop because of a rebalance across the nodes of the cluster,
		 rescale or cluster shutdown.
		`shardAllocationStrategy` \- If defined: used by entities to control the shard allocation

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardedDaemonProcessCommand.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardedDaemonProcessContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html)*
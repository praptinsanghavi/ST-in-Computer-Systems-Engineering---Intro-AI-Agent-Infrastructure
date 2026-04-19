---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.html
title: ShardedDaemonProcessCoordinator
---

# ShardedDaemonProcessCoordinator

## Content

Package [akka.cluster.sharding.typed.internal](package-summary.html)
## Class ShardedDaemonProcessCoordinator

- java.lang.Object
- - akka.cluster.sharding.typed.internal.ShardedDaemonProcessCoordinator

- ---

```
public final class ShardedDaemonProcessCoordinator
extends java.lang.Object
```

Rescaling workflow overview:
 
 1\. stop pinging workers
 2\. Write to ddata new size and revision, in progress/not complete
 3\. Stop shards for all workers via shard coordinator
 4\. Update ddata state, mark rescaling completed
 5\. start pinging workers again
 

 If coordinator moved before completing it will re\-trigger workflow from step 2 on start, worst case stopping all
 workers before starting them again.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply](ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal")` |  |
	| `static class` | `[ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$](ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$.html "class in akka.cluster.sharding.typed.internal")` |  |
	| `static interface` | `[ShardedDaemonProcessCoordinator.InternalMessage](ShardedDaemonProcessCoordinator.InternalMessage.html "interface in akka.cluster.sharding.typed.internal")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardedDaemonProcessCoordinator](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")>` | `[apply](#apply(akka.cluster.sharding.typed.ShardedDaemonProcessSettings,akka.cluster.sharding.typed.ClusterShardingSettings,int,java.lang.String,akka.actor.typed.ActorRef))​([ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,  [ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding.typed") shardingSettings,  int initialNumberOfProcesses,  java.lang.String daemonProcessName,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<T>> shardingRef)` |  |
	| `[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")>` | `[start](#start())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ShardedDaemonProcessCoordinator
		
		
		
		```
		public ShardedDaemonProcessCoordinator()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")> apply​([ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,
		                                                              [ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding.typed") shardingSettings,
		                                                              int initialNumberOfProcesses,
		                                                              java.lang.String daemonProcessName,
		                                                              [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<T>> shardingRef)
		```
		- #### start
		
		
		
		```
		public [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")> start()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessCommand.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.InternalMessage.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator$.html
title: ShardedDaemonProcessCoordinator$
---

# ShardedDaemonProcessCoordinator$

## Content

Package [akka.cluster.sharding.typed.internal](package-summary.html)
## Class ShardedDaemonProcessCoordinator$

- java.lang.Object
- - akka.cluster.sharding.typed.internal.ShardedDaemonProcessCoordinator$

- ---

```
public class ShardedDaemonProcessCoordinator$
extends java.lang.Object
```

INTERNAL API
 
 A ShardedDaemonProcessCoordinator manages dynamic scaling of one setup of ShardedDaemonProcess

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardedDaemonProcessCoordinator$](ShardedDaemonProcessCoordinator$.html "class in akka.cluster.sharding.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardedDaemonProcessCoordinator$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")>` | `[apply](#apply(akka.cluster.sharding.typed.ShardedDaemonProcessSettings,akka.cluster.sharding.typed.ClusterShardingSettings,int,java.lang.String,akka.actor.typed.ActorRef))​([ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,  [ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding.typed") shardingSettings,  int initialNumberOfProcesses,  java.lang.String daemonProcessName,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<T>> shardingRef)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardedDaemonProcessCoordinator$](ShardedDaemonProcessCoordinator$.html "class in akka.cluster.sharding.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardedDaemonProcessCoordinator$
		
		
		
		```
		public ShardedDaemonProcessCoordinator$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")> apply​([ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") settings,
		                                                       [ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding.typed") shardingSettings,
		                                                       int initialNumberOfProcesses,
		                                                       java.lang.String daemonProcessName,
		                                                       [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<T>> shardingRef)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessCommand.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator$.html)*
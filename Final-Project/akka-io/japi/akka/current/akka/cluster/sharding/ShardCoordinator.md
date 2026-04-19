---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:07:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy$.html
title: ShardCoordinator.ShardAllocationStrategy$
---

# ShardCoordinator.ShardAllocationStrategy$

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ShardCoordinator.ShardAllocationStrategy$

- java.lang.Object
- - akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy$

- Enclosing class:
[ShardCoordinator](ShardCoordinator.html "class in akka.cluster.sharding")

---

```
public static class ShardCoordinator.ShardAllocationStrategy$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardCoordinator.ShardAllocationStrategy$](ShardCoordinator.ShardAllocationStrategy$.html "class in akka.cluster.sharding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardAllocationStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")` | `[leastShardAllocationStrategy](#leastShardAllocationStrategy(int,double))​(int absoluteLimit,  double relativeLimit)` | Scala API: `ShardAllocationStrategy` that allocates new shards to the `ShardRegion` (node) with least  number of previously allocated shards. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardCoordinator.ShardAllocationStrategy$](ShardCoordinator.ShardAllocationStrategy$.html "class in akka.cluster.sharding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardAllocationStrategy$
		
		
		
		```
		public ShardAllocationStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### leastShardAllocationStrategy
		
		
		
		```
		public [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") leastShardAllocationStrategy​(int absoluteLimit,
		                                                                             double relativeLimit)
		```
		
		Scala API: `ShardAllocationStrategy` that allocates new shards to the `ShardRegion` (node) with least
		 number of previously allocated shards.
		 
		 When a node is added to the cluster the shards on the existing nodes will be rebalanced to the new node.
		 The `LeastShardAllocationStrategy` picks shards for rebalancing from the `ShardRegion`s with most number
		 of previously allocated shards. They will then be allocated to the `ShardRegion` with least number of
		 previously allocated shards, i.e. new members in the cluster. The amount of shards to rebalance in each
		 round can be limited to make it progress slower since rebalancing too many shards at the same time could
		 result in additional load on the system. For example, causing many Event Sourced entites to be started
		 at the same time.
		 
		
		
		 It will not rebalance when there is already an ongoing rebalance in progress.
		 
		
		
		
		Parameters:
		`absoluteLimit` \- the maximum number of shards that will be rebalanced in one rebalance round
		`relativeLimit` \- fraction (\< 1\.0\) of total number of (known) shards that will be rebalanced
		 in one rebalance round

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy$.html)*
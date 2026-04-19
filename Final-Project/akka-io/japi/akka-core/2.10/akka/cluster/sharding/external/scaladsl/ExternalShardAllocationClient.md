---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html
title: ExternalShardAllocationClient
---

# ExternalShardAllocationClient

## Content

Package [akka.cluster.sharding.external.scaladsl](package-summary.html)
## Interface ExternalShardAllocationClient

- ---

```
public interface ExternalShardAllocationClient
```

Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[ShardLocations](../ShardLocations.html "class in akka.cluster.sharding.external")>` | `[shardLocations](#shardLocations())()` | Get all the current shard locations that have been set via updateShardLocation |
	| `scala.concurrent.Future<[Done](../../../../Done.html "class in akka")>` | `[updateShardLocation](#updateShardLocation(java.lang.String,akka.actor.Address))​(java.lang.String shard,  [Address](../../../../actor/Address.html "class in akka.actor") location)` | Update the given shard's location. |
	| `scala.concurrent.Future<[Done](../../../../Done.html "class in akka")>` | `[updateShardLocations](#updateShardLocations(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​[Address](../../../../actor/Address.html "class in akka.actor")> locations)` | Update all of the provided ShardLocations. |

- - ### Method Detail
	
	
	
		- #### shardLocations
		
		
		
		```
		scala.concurrent.Future<[ShardLocations](../ShardLocations.html "class in akka.cluster.sharding.external")> shardLocations()
		```
		
		Get all the current shard locations that have been set via updateShardLocation
		- #### updateShardLocation
		
		
		
		```
		scala.concurrent.Future<[Done](../../../../Done.html "class in akka")> updateShardLocation​(java.lang.String shard,
		                                                  [Address](../../../../actor/Address.html "class in akka.actor") location)
		```
		
		Update the given shard's location. The `Address` should
		 match one of the nodes in the cluster. If the node has not joined
		 the cluster yet it will be moved to that node after the first cluster
		 sharding rebalance it does.
		 
		
		Parameters:
		`shard` \- The shard identifier
		`location` \- Location (akka node) to allocate the shard to
		Returns:
		Confirmation that the update has been propagated to a majority of cluster nodes
		- #### updateShardLocations
		
		
		
		```
		scala.concurrent.Future<[Done](../../../../Done.html "class in akka")> updateShardLocations​(scala.collection.immutable.Map<java.lang.String,​[Address](../../../../actor/Address.html "class in akka.actor")> locations)
		```
		
		Update all of the provided ShardLocations.
		 The `Address` should match one of the nodes in the cluster. If the node has not joined
		 the cluster yet it will be moved to that node after the first cluster
		 sharding rebalance it does.
		 
		
		Parameters:
		`locations` \- to update
		Returns:
		Confirmation that the update has been propagates to a majority of cluster nodes

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/ShardLocations.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html)*
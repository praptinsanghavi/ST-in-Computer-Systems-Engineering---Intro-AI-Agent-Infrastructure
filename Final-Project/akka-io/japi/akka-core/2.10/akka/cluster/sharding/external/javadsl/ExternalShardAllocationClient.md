---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/javadsl/ExternalShardAllocationClient.html
title: ExternalShardAllocationClient
---

# ExternalShardAllocationClient

## Content

Package [akka.cluster.sharding.external.javadsl](package-summary.html)
## Interface ExternalShardAllocationClient

- ---

```
public interface ExternalShardAllocationClient
```

Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.CompletionStage<[ShardLocations](../ShardLocations.html "class in akka.cluster.sharding.external")>` | `[getShardLocations](#getShardLocations())()` | Get all the current shard locations that have been set via setShardLocation |
	| `java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")>` | `[setShardLocation](#setShardLocation(java.lang.String,akka.actor.Address))​(java.lang.String shard,  [Address](../../../../actor/Address.html "class in akka.actor") location)` | Update the given shard's location. |
	| `java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")>` | `[setShardLocations](#setShardLocations(java.util.Map))​(java.util.Map<java.lang.String,​[Address](../../../../actor/Address.html "class in akka.actor")> locations)` | Update all of the provided ShardLocations. |

- - ### Method Detail
	
	
	
		- #### getShardLocations
		
		
		
		```
		java.util.concurrent.CompletionStage<[ShardLocations](../ShardLocations.html "class in akka.cluster.sharding.external")> getShardLocations()
		```
		
		Get all the current shard locations that have been set via setShardLocation
		- #### setShardLocation
		
		
		
		```
		java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")> setShardLocation​(java.lang.String shard,
		                                                            [Address](../../../../actor/Address.html "class in akka.actor") location)
		```
		
		Update the given shard's location. The `Address` should
		 match one of the nodes in the cluster. If the node has not joined
		 the cluster yet it will be moved to that node after the first cluster
		 sharding rebalance.
		 
		
		Parameters:
		`shard` \- The shard identifier
		`location` \- Location (akka node) to allocate the shard to
		Returns:
		Conformation that the update has been written to the local node
		- #### setShardLocations
		
		
		
		```
		java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")> setShardLocations​(java.util.Map<java.lang.String,​[Address](../../../../actor/Address.html "class in akka.actor")> locations)
		```
		
		Update all of the provided ShardLocations.
		 The `Address` should match one of the nodes in the cluster. If the node has not joined
		 the cluster yet it will be moved to that node after the first cluster
		 sharding rebalance it does.
		 
		
		Parameters:
		`locations` \- to update
		Returns:
		Confirmation that the update has been written to the local node

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/ShardLocations.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/javadsl/ExternalShardAllocationClient.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/javadsl/ExternalShardAllocationClient.html)*
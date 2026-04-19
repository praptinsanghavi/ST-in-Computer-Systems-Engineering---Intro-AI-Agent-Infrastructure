---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:10:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ReplicatedShardingExtension.html
title: ReplicatedShardingExtension
---

# ReplicatedShardingExtension

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Interface ReplicatedShardingExtension

- All Superinterfaces:
`[Extension](../../../actor/typed/Extension.html "interface in akka.actor.typed")`

---

```
public interface ReplicatedShardingExtension
extends [Extension](../../../actor/typed/Extension.html "interface in akka.actor.typed")
```

Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<M> [ReplicatedSharding](ReplicatedSharding.html "interface in akka.cluster.sharding.typed")<M>` | `[init](#init(akka.cluster.sharding.typed.ReplicatedEntityProvider))​([ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M> settings)` | Init one instance sharding per replica in the given settings and return a [`ReplicatedSharding`](ReplicatedSharding.html "interface in akka.cluster.sharding.typed") representing those. |
	| `<M> [ReplicatedSharding](ReplicatedSharding.html "interface in akka.cluster.sharding.typed")<M>` | `[init](#init(akka.persistence.typed.ReplicaId,akka.cluster.sharding.typed.ReplicatedEntityProvider))​([ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed") thisReplica,  [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M> settings)` | Init one instance sharding per replica in the given settings and return a [`ReplicatedSharding`](ReplicatedSharding.html "interface in akka.cluster.sharding.typed") representing those. |

- - ### Method Detail
	
	
	
		- #### init
		
		
		
		```
		<M> [ReplicatedSharding](ReplicatedSharding.html "interface in akka.cluster.sharding.typed")<M> init​([ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M> settings)
		```
		
		Init one instance sharding per replica in the given settings and return a [`ReplicatedSharding`](ReplicatedSharding.html "interface in akka.cluster.sharding.typed") representing those.
		- #### init
		
		
		
		```
		<M> [ReplicatedSharding](ReplicatedSharding.html "interface in akka.cluster.sharding.typed")<M> init​([ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed") thisReplica,
		                               [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M> settings)
		```
		
		Init one instance sharding per replica in the given settings and return a [`ReplicatedSharding`](ReplicatedSharding.html "interface in akka.cluster.sharding.typed") representing those.
		 
		
		Parameters:
		`thisReplica` \- If provided saves messages being forwarded to sharding for this replica

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ReplicatedEntityProvider.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ReplicatedSharding.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/ReplicaId.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ReplicatedShardingExtension.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ReplicatedShardingExtension.html)*
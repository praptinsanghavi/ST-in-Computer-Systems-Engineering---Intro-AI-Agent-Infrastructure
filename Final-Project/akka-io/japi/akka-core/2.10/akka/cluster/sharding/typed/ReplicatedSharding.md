---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:03:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedSharding.html
title: ReplicatedSharding
---

# ReplicatedSharding

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Interface ReplicatedSharding\<M\>

- ---

```
public interface ReplicatedSharding<M>
```

Represents the sharding instances for the replicas of one Replicated Event Sourcing entity type
 
 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Map<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​[EntityRef](scaladsl/EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl")<[M](ReplicatedSharding.html "type parameter in ReplicatedSharding")>>` | `[entityRefsFor](#entityRefsFor(java.lang.String))​(java.lang.String entityId)` | Scala API: Returns the entity ref for each replica for user defined routing/replica selection |
	| `java.util.Map<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​[EntityRef](javadsl/EntityRef.html "class in akka.cluster.sharding.typed.javadsl")<[M](ReplicatedSharding.html "type parameter in ReplicatedSharding")>>` | `[getEntityRefsFor](#getEntityRefsFor(java.lang.String))​(java.lang.String entityId)` | Java API: Returns the entity ref for each replica for user defined routing/replica selection |

- - ### Method Detail
	
	
	
		- #### entityRefsFor
		
		
		
		```
		scala.collection.immutable.Map<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​[EntityRef](scaladsl/EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl")<[M](ReplicatedSharding.html "type parameter in ReplicatedSharding")>> entityRefsFor​(java.lang.String entityId)
		```
		
		Scala API: Returns the entity ref for each replica for user defined routing/replica selection
		- #### getEntityRefsFor
		
		
		
		```
		java.util.Map<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​[EntityRef](javadsl/EntityRef.html "class in akka.cluster.sharding.typed.javadsl")<[M](ReplicatedSharding.html "type parameter in ReplicatedSharding")>> getEntityRefsFor​(java.lang.String entityId)
		```
		
		Java API: Returns the entity ref for each replica for user defined routing/replica selection

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedSharding.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedSharding.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedSharding.html)*
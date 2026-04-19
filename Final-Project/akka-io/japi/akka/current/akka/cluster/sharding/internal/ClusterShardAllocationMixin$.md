---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin$.html
title: ClusterShardAllocationMixin$
---

# ClusterShardAllocationMixin$

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class ClusterShardAllocationMixin$

- java.lang.Object
- - akka.cluster.sharding.internal.ClusterShardAllocationMixin$

- ---

```
public class ClusterShardAllocationMixin$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterShardAllocationMixin$](ClusterShardAllocationMixin$.html "class in akka.cluster.sharding.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterShardAllocationMixin$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Set<[MemberStatus](../../MemberStatus.html "class in akka.cluster")>` | `[JoiningCluster](#JoiningCluster())()` |  |
	| `scala.collection.immutable.Set<[MemberStatus](../../MemberStatus.html "class in akka.cluster")>` | `[LeavingClusterStatuses](#LeavingClusterStatuses())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterShardAllocationMixin$](ClusterShardAllocationMixin$.html "class in akka.cluster.sharding.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterShardAllocationMixin$
		
		
		
		```
		public ClusterShardAllocationMixin$()
		```

	- ### Method Detail
	
	
	
		- #### JoiningCluster
		
		
		
		```
		public scala.collection.immutable.Set<[MemberStatus](../../MemberStatus.html "class in akka.cluster")> JoiningCluster()
		```
		- #### LeavingClusterStatuses
		
		
		
		```
		public scala.collection.immutable.Set<[MemberStatus](../../MemberStatus.html "class in akka.cluster")> LeavingClusterStatuses()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/MemberStatus.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin$.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:33:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
title: RemoveInternalClusterShardingData$
---

# RemoveInternalClusterShardingData$

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class RemoveInternalClusterShardingData$

- java.lang.Object
- - akka.cluster.sharding.RemoveInternalClusterShardingData$

- ---

```
public class RemoveInternalClusterShardingData$
extends java.lang.Object
```

Utility program that removes the internal data stored with Akka Persistence
 by the Cluster `ShardCoordinator`. The data contains the locations of the
 shards using Akka Persistence and it can safely be removed when restarting
 the whole Akka Cluster. Note that this is not application data.
 
**Never use this program while there are running Akka Cluster that is
 using Cluster Sharding. Stop all Cluster nodes before using this program.**

 It can be needed to remove the data if the Cluster `ShardCoordinator`
 cannot startup because of corrupt data, which may happen if accidentally
 two clusters were running at the same time, e.g. caused by using auto\-down
 and there was a network partition.
 

 Use this program as a standalone Java main program:
 

```

 java -classpath <jar files, including akka-cluster-sharding>
   akka.cluster.sharding.RemoveInternalClusterShardingData
     -2.3 entityType1 entityType2 entityType3
 
```

 The program is included in the `akka-cluster-sharding` jar file. It
 is easiest to run it with same classpath and configuration as your ordinary
 application. It can be run from sbt or maven in similar way.
 

 Specify the entity type names (same as you use in the `start` method
 of `ClusterSharding`) as program arguments.
 

 If you specify `-2.3` as the first program argument it will also try
 to remove data that was stored by Cluster Sharding in Akka 2\.3\.x using
 different persistenceId.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RemoveInternalClusterShardingData$](RemoveInternalClusterShardingData$.html "class in akka.cluster.sharding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoveInternalClusterShardingData$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[main](#main(java.lang.String%5B%5D))​(java.lang.String[] args)` |  |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[remove](#remove(akka.actor.ActorSystem,java.lang.String,scala.collection.immutable.Set,boolean))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system,  java.lang.String journalPluginId,  scala.collection.immutable.Set<java.lang.String> typeNames,  boolean remove2dot3Data)` | API corresponding to the [`main(java.lang.String[])`](#main(java.lang.String%5B%5D)) method as described in the  [`RemoveInternalClusterShardingData companion object`](RemoveInternalClusterShardingData$.html "class in akka.cluster.sharding") |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RemoveInternalClusterShardingData$](RemoveInternalClusterShardingData$.html "class in akka.cluster.sharding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RemoveInternalClusterShardingData$
		
		
		
		```
		public RemoveInternalClusterShardingData$()
		```

	- ### Method Detail
	
	
	
		- #### main
		
		
		
		```
		public void main​(java.lang.String[] args)
		```
		
		
		See Also:
		[`RemoveInternalClusterShardingData companion object`](RemoveInternalClusterShardingData$.html "class in akka.cluster.sharding")
		- #### remove
		
		
		
		```
		public scala.concurrent.Future<scala.runtime.BoxedUnit> remove​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system,
		                                                               java.lang.String journalPluginId,
		                                                               scala.collection.immutable.Set<java.lang.String> typeNames,
		                                                               boolean remove2dot3Data)
		```
		
		API corresponding to the [`main(java.lang.String[])`](#main(java.lang.String%5B%5D)) method as described in the
		 [`RemoveInternalClusterShardingData companion object`](RemoveInternalClusterShardingData$.html "class in akka.cluster.sharding")

## Code Examples

### Example 1: Class RemoveInternalClusterShardingData$

```text
java -classpath <jar files, including akka-cluster-sharding>
   akka.cluster.sharding.RemoveInternalClusterShardingData
     -2.3 entityType1 entityType2 entityType3
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData$.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:40:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html
title: ClusterShardingHealthCheckSettings
---

# ClusterShardingHealthCheckSettings

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ClusterShardingHealthCheckSettings

- java.lang.Object
- - akka.cluster.sharding.ClusterShardingHealthCheckSettings

- ---

```
public final class ClusterShardingHealthCheckSettings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterShardingHealthCheckSettings](#%3Cinit%3E(scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration))​(scala.collection.immutable.Set<java.lang.String> names,  scala.concurrent.duration.FiniteDuration timeout)` | Deprecated. Use full constructor. |
	| `[ClusterShardingHealthCheckSettings](#%3Cinit%3E(scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(scala.collection.immutable.Set<java.lang.String> names,  scala.concurrent.duration.FiniteDuration timeout,  scala.concurrent.duration.FiniteDuration disableAfter)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ClusterShardingHealthCheckSettings](ClusterShardingHealthCheckSettings.html "class in akka.cluster.sharding")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[disableAfter](#disableAfter())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[names](#names())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[timeout](#timeout())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterShardingHealthCheckSettings
		
		
		
		```
		public ClusterShardingHealthCheckSettings​(scala.collection.immutable.Set<java.lang.String> names,
		                                          scala.concurrent.duration.FiniteDuration timeout,
		                                          scala.concurrent.duration.FiniteDuration disableAfter)
		```
		- #### ClusterShardingHealthCheckSettings
		
		
		
		```
		public ClusterShardingHealthCheckSettings​(scala.collection.immutable.Set<java.lang.String> names,
		                                          scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Deprecated.
		Use full constructor. Since 2\.8\.0\.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ClusterShardingHealthCheckSettings](ClusterShardingHealthCheckSettings.html "class in akka.cluster.sharding") apply​(com.typesafe.config.Config config)
		```
		- #### names
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> names()
		```
		- #### timeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration timeout()
		```
		- #### disableAfter
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration disableAfter()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html)*
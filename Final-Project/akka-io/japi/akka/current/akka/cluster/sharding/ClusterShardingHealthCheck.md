---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:07:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingHealthCheck.html
title: ClusterShardingHealthCheck
---

# ClusterShardingHealthCheck

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ClusterShardingHealthCheck

- java.lang.Object
- - akka.cluster.sharding.ClusterShardingHealthCheck

- All Implemented Interfaces:
`scala.Function0<scala.concurrent.Future<java.lang.Object>>`

---

```
public final class ClusterShardingHealthCheck
extends java.lang.Object
implements scala.Function0<scala.concurrent.Future<java.lang.Object>>
```

INTERNAL API (ctr)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterShardingHealthCheck](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<java.lang.Object>` | `[apply](#apply())()` |  |
	| `static scala.concurrent.Future<java.lang.Object>` | `[Success](#Success())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Function0
		
		
		`apply$mcB$sp, apply$mcC$sp, apply$mcD$sp, apply$mcF$sp, apply$mcI$sp, apply$mcJ$sp, apply$mcS$sp, apply$mcV$sp, apply$mcZ$sp, toString`

- - ### Constructor Detail
	
	
	
		- #### ClusterShardingHealthCheck
		
		
		
		```
		public ClusterShardingHealthCheck​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### Success
		
		
		
		```
		public static scala.concurrent.Future<java.lang.Object> Success()
		```
		- #### apply
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> apply()
		```
		
		
		Specified by:
		`apply` in interface `scala.Function0<scala.concurrent.Future<java.lang.Object>>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingHealthCheck.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingHealthCheck.html)*
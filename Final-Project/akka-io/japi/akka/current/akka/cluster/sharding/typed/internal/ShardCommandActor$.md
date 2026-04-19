---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardCommandActor$.html
title: ShardCommandActor$
---

# ShardCommandActor$

## Content

Package [akka.cluster.sharding.typed.internal](package-summary.html)
## Class ShardCommandActor$

- java.lang.Object
- - akka.cluster.sharding.typed.internal.ShardCommandActor$

- ---

```
public class ShardCommandActor$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardCommandActor$](ShardCommandActor$.html "class in akka.cluster.sharding.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardCommandActor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ClusterSharding.ShardCommand](../scaladsl/ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.scaladsl")>` | `[behavior](#behavior(java.lang.Object))​(java.lang.Object stopMessage)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardCommandActor$](ShardCommandActor$.html "class in akka.cluster.sharding.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardCommandActor$
		
		
		
		```
		public ShardCommandActor$()
		```

	- ### Method Detail
	
	
	
		- #### behavior
		
		
		
		```
		public [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ClusterSharding.ShardCommand](../scaladsl/ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.scaladsl")> behavior​(java.lang.Object stopMessage)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardCommandActor$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding.ShardCommand.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardCommandActor$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardCommandActor$.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ShardingFlightRecorder$.html
title: ShardingFlightRecorder$
---

# ShardingFlightRecorder$

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class ShardingFlightRecorder$

- java.lang.Object
- - akka.cluster.sharding.internal.ShardingFlightRecorder$

- ---

```
public class ShardingFlightRecorder$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardingFlightRecorder$](ShardingFlightRecorder$.html "class in akka.cluster.sharding.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingFlightRecorder$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[entityPassivate](#entityPassivate(java.lang.String))​(java.lang.String entityId)` |  |
	| `void` | `[entityPassivateRestart](#entityPassivateRestart(java.lang.String))​(java.lang.String entityId)` |  |
	| `void` | `[rememberEntityAdd](#rememberEntityAdd(java.lang.String))​(java.lang.String entityId)` |  |
	| `void` | `[rememberEntityOperation](#rememberEntityOperation(long))​(long duration)` |  |
	| `void` | `[rememberEntityRemove](#rememberEntityRemove(java.lang.String))​(java.lang.String entityId)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardingFlightRecorder$](ShardingFlightRecorder$.html "class in akka.cluster.sharding.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardingFlightRecorder$
		
		
		
		```
		public ShardingFlightRecorder$()
		```

	- ### Method Detail
	
	
	
		- #### rememberEntityOperation
		
		
		
		```
		public void rememberEntityOperation​(long duration)
		```
		- #### rememberEntityAdd
		
		
		
		```
		public void rememberEntityAdd​(java.lang.String entityId)
		```
		- #### rememberEntityRemove
		
		
		
		```
		public void rememberEntityRemove​(java.lang.String entityId)
		```
		- #### entityPassivate
		
		
		
		```
		public void entityPassivate​(java.lang.String entityId)
		```
		- #### entityPassivateRestart
		
		
		
		```
		public void entityPassivateRestart​(java.lang.String entityId)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ShardingFlightRecorder$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ShardingFlightRecorder$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ShardingFlightRecorder$.html)*
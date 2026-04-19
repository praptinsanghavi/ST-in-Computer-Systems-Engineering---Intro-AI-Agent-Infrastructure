---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ShardingFlightRecorder.html
title: ShardingFlightRecorder
---

# ShardingFlightRecorder

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class ShardingFlightRecorder

- java.lang.Object
- - akka.cluster.sharding.internal.ShardingFlightRecorder

- ---

```
public class ShardingFlightRecorder
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingFlightRecorder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[entityPassivate](#entityPassivate(java.lang.String))​(java.lang.String entityId)` |  |
	| `static void` | `[entityPassivateRestart](#entityPassivateRestart(java.lang.String))​(java.lang.String entityId)` |  |
	| `static void` | `[rememberEntityAdd](#rememberEntityAdd(java.lang.String))​(java.lang.String entityId)` |  |
	| `static void` | `[rememberEntityOperation](#rememberEntityOperation(long))​(long duration)` |  |
	| `static void` | `[rememberEntityRemove](#rememberEntityRemove(java.lang.String))​(java.lang.String entityId)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ShardingFlightRecorder
		
		
		
		```
		public ShardingFlightRecorder()
		```

	- ### Method Detail
	
	
	
		- #### rememberEntityOperation
		
		
		
		```
		public static void rememberEntityOperation​(long duration)
		```
		- #### rememberEntityAdd
		
		
		
		```
		public static void rememberEntityAdd​(java.lang.String entityId)
		```
		- #### rememberEntityRemove
		
		
		
		```
		public static void rememberEntityRemove​(java.lang.String entityId)
		```
		- #### entityPassivate
		
		
		
		```
		public static void entityPassivate​(java.lang.String entityId)
		```
		- #### entityPassivateRestart
		
		
		
		```
		public static void entityPassivateRestart​(java.lang.String entityId)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ShardingFlightRecorder.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ShardingFlightRecorder.html)*
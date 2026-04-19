---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DisabledEntityPassivationStrategy.html
title: DisabledEntityPassivationStrategy
---

# DisabledEntityPassivationStrategy

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class DisabledEntityPassivationStrategy

- java.lang.Object
- - akka.cluster.sharding.internal.DisabledEntityPassivationStrategy

- ---

```
public class DisabledEntityPassivationStrategy
extends java.lang.Object
```

INTERNAL API: No\-op passivation strategy for when automatic passivation is disabled.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DisabledEntityPassivationStrategy](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[entityTerminated](#entityTerminated(java.lang.String))​(java.lang.String id)` |  |
	| `static scala.collection.immutable.Seq<java.lang.String>` | `[entityTouched](#entityTouched(java.lang.String))​(java.lang.String id)` |  |
	| `static scala.collection.immutable.Seq<java.lang.String>` | `[intervalPassed](#intervalPassed())()` |  |
	| `static scala.collection.immutable.Seq<java.lang.String>` | `[limitUpdated](#limitUpdated(int))​(int newLimit)` |  |
	| `static scala.Option<scala.concurrent.duration.FiniteDuration>` | `[scheduledInterval](#scheduledInterval())()` |  |
	| `static scala.collection.immutable.Seq<java.lang.String>` | `[shardsUpdated](#shardsUpdated(int))​(int activeShards)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DisabledEntityPassivationStrategy
		
		
		
		```
		public DisabledEntityPassivationStrategy()
		```

	- ### Method Detail
	
	
	
		- #### limitUpdated
		
		
		
		```
		public static scala.collection.immutable.Seq<java.lang.String> limitUpdated​(int newLimit)
		```
		- #### shardsUpdated
		
		
		
		```
		public static scala.collection.immutable.Seq<java.lang.String> shardsUpdated​(int activeShards)
		```
		- #### entityTouched
		
		
		
		```
		public static scala.collection.immutable.Seq<java.lang.String> entityTouched​(java.lang.String id)
		```
		- #### entityTerminated
		
		
		
		```
		public static void entityTerminated​(java.lang.String id)
		```
		- #### scheduledInterval
		
		
		
		```
		public static scala.Option<scala.concurrent.duration.FiniteDuration> scheduledInterval()
		```
		- #### intervalPassed
		
		
		
		```
		public static scala.collection.immutable.Seq<java.lang.String> intervalPassed()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DisabledEntityPassivationStrategy.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DisabledEntityPassivationStrategy.html)*
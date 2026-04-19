---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoAdmissionOptimizer.html
title: NoAdmissionOptimizer
---

# NoAdmissionOptimizer

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class NoAdmissionOptimizer

- java.lang.Object
- - akka.cluster.sharding.internal.NoAdmissionOptimizer

- ---

```
public class NoAdmissionOptimizer
extends java.lang.Object
```

INTERNAL API
 
 Disabled admission window proportion optimizer.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoAdmissionOptimizer](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static double` | `[calculateAdjustment](#calculateAdjustment())()` |  |
	| `static void` | `[recordActive](#recordActive())()` |  |
	| `static void` | `[recordPassive](#recordPassive())()` |  |
	| `static void` | `[updateLimit](#updateLimit(int))​(int newLimit)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NoAdmissionOptimizer
		
		
		
		```
		public NoAdmissionOptimizer()
		```

	- ### Method Detail
	
	
	
		- #### recordActive
		
		
		
		```
		public static void recordActive()
		```
		- #### recordPassive
		
		
		
		```
		public static void recordPassive()
		```
		- #### updateLimit
		
		
		
		```
		public static void updateLimit​(int newLimit)
		```
		- #### calculateAdjustment
		
		
		
		```
		public static double calculateAdjustment()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoAdmissionOptimizer.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoAdmissionOptimizer.html)*
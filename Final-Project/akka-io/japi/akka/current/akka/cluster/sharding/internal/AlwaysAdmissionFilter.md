---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/AlwaysAdmissionFilter.html
title: AlwaysAdmissionFilter
---

# AlwaysAdmissionFilter

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class AlwaysAdmissionFilter

- java.lang.Object
- - akka.cluster.sharding.internal.AlwaysAdmissionFilter

- ---

```
public class AlwaysAdmissionFilter
extends java.lang.Object
```

INTERNAL API
 
 Disabled admission filter, always admit candidates to the main area.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AlwaysAdmissionFilter](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[admit](#admit(java.lang.String,java.lang.String))​(java.lang.String candidate,  java.lang.String selected)` |  |
	| `static void` | `[update](#update(java.lang.String))​(java.lang.String id)` |  |
	| `static void` | `[updateCapacity](#updateCapacity(int))​(int newCapacity)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AlwaysAdmissionFilter
		
		
		
		```
		public AlwaysAdmissionFilter()
		```

	- ### Method Detail
	
	
	
		- #### updateCapacity
		
		
		
		```
		public static void updateCapacity​(int newCapacity)
		```
		- #### update
		
		
		
		```
		public static void update​(java.lang.String id)
		```
		- #### admit
		
		
		
		```
		public static boolean admit​(java.lang.String candidate,
		                            java.lang.String selected)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/AlwaysAdmissionFilter.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/AlwaysAdmissionFilter.html)*
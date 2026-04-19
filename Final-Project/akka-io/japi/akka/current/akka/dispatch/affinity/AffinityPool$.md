---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/affinity/AffinityPool$.html
title: AffinityPool$
---

# AffinityPool$

## Content

Package [akka.dispatch.affinity](package-summary.html)
## Class AffinityPool$

- java.lang.Object
- - akka.dispatch.affinity.AffinityPool$

- ---

```
public class AffinityPool$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AffinityPool$](AffinityPool$.html "class in akka.dispatch.affinity")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AffinityPool$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[Initial](#Initial())()` |  |
	| `int` | `[Initializing](#Initializing())()` |  |
	| `int` | `[Parking](#Parking())()` |  |
	| `int` | `[Running](#Running())()` |  |
	| `int` | `[ShutDown](#ShutDown())()` |  |
	| `int` | `[ShuttingDown](#ShuttingDown())()` |  |
	| `int` | `[Spinning](#Spinning())()` |  |
	| `int` | `[Terminated](#Terminated())()` |  |
	| `int` | `[Uninitialized](#Uninitialized())()` |  |
	| `int` | `[Yielding](#Yielding())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AffinityPool$](AffinityPool$.html "class in akka.dispatch.affinity") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AffinityPool$
		
		
		
		```
		public AffinityPool$()
		```

	- ### Method Detail
	
	
	
		- #### Uninitialized
		
		
		
		```
		public final int Uninitialized()
		```
		- #### Initializing
		
		
		
		```
		public final int Initializing()
		```
		- #### Running
		
		
		
		```
		public final int Running()
		```
		- #### ShuttingDown
		
		
		
		```
		public final int ShuttingDown()
		```
		- #### ShutDown
		
		
		
		```
		public final int ShutDown()
		```
		- #### Terminated
		
		
		
		```
		public final int Terminated()
		```
		- #### Initial
		
		
		
		```
		public final int Initial()
		```
		- #### Spinning
		
		
		
		```
		public final int Spinning()
		```
		- #### Yielding
		
		
		
		```
		public final int Yielding()
		```
		- #### Parking
		
		
		
		```
		public final int Parking()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/affinity/AffinityPool$.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/affinity/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/affinity/AffinityPool$.html](https://doc.akka.io/japi/akka/current/akka/dispatch/affinity/AffinityPool$.html)*
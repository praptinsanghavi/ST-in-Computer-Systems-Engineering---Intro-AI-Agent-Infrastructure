---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:04:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/ThrottleMode$.html
title: ThrottleMode$
---

# ThrottleMode$

## Content

Package [akka.stream](package-summary.html)
## Class ThrottleMode$

- java.lang.Object
- - akka.stream.ThrottleMode$

- ---

```
public class ThrottleMode$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ThrottleMode$](ThrottleMode$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThrottleMode$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ThrottleMode.Enforcing$](ThrottleMode.Enforcing$.html "class in akka.stream")` | `[enforcing](#enforcing())()` | Java API: Makes throttle fail with exception when upstream is faster than throttle rate |
	| `[ThrottleMode.Shaping$](ThrottleMode.Shaping$.html "class in akka.stream")` | `[shaping](#shaping())()` | Java API: Tells throttle to make pauses before emitting messages to meet the throttle rate |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ThrottleMode$](ThrottleMode$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ThrottleMode$
		
		
		
		```
		public ThrottleMode$()
		```

	- ### Method Detail
	
	
	
		- #### shaping
		
		
		
		```
		public [ThrottleMode.Shaping$](ThrottleMode.Shaping$.html "class in akka.stream") shaping()
		```
		
		Java API: Tells throttle to make pauses before emitting messages to meet the throttle rate
		- #### enforcing
		
		
		
		```
		public [ThrottleMode.Enforcing$](ThrottleMode.Enforcing$.html "class in akka.stream") enforcing()
		```
		
		Java API: Makes throttle fail with exception when upstream is faster than throttle rate

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/ThrottleMode$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/ThrottleMode.Enforcing$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/ThrottleMode.Shaping$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/ThrottleMode$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/ThrottleMode$.html)*
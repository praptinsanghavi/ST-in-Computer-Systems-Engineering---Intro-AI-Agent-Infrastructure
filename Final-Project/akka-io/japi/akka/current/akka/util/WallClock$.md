---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/WallClock$.html
title: WallClock$
---

# WallClock$

## Content

Package [akka.util](package-summary.html)
## Class WallClock$

- java.lang.Object
- - akka.util.WallClock$

- ---

```
public class WallClock$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WallClock$](WallClock$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WallClock$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WallClock](WallClock.html "interface in akka.util")` | `[AlwaysIncreasingClock](#AlwaysIncreasingClock())()` | Always increasing time source. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WallClock$](WallClock$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WallClock$
		
		
		
		```
		public WallClock$()
		```

	- ### Method Detail
	
	
	
		- #### AlwaysIncreasingClock
		
		
		
		```
		public [WallClock](WallClock.html "interface in akka.util") AlwaysIncreasingClock()
		```
		
		Always increasing time source. Based on `System.currentTimeMillis()` but
		 guaranteed to always increase for each invocation.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/WallClock$.html
- https://doc.akka.io/japi/akka/current/akka/util/WallClock.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/WallClock$.html](https://doc.akka.io/japi/akka/current/akka/util/WallClock$.html)*
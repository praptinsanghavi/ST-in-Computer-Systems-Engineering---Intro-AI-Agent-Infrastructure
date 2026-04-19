---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/Direction$.html
title: Direction$
---

# Direction$

## Content

Package [akka.remote.testkit](package-summary.html)
## Class Direction$

- java.lang.Object
- - akka.remote.testkit.Direction$

- ---

```
public class Direction$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Direction$](Direction$.html "class in akka.remote.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Direction$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Direction](Direction.html "interface in akka.remote.testkit")` | `[bothDirection](#bothDirection())()` | Java API: get the Direction.Both instance |
	| `[Direction](Direction.html "interface in akka.remote.testkit")` | `[receiveDirection](#receiveDirection())()` | Java API: get the Direction.Receive instance |
	| `[Direction](Direction.html "interface in akka.remote.testkit")` | `[sendDirection](#sendDirection())()` | Java API: get the Direction.Send instance |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Direction$](Direction$.html "class in akka.remote.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Direction$
		
		
		
		```
		public Direction$()
		```

	- ### Method Detail
	
	
	
		- #### sendDirection
		
		
		
		```
		public [Direction](Direction.html "interface in akka.remote.testkit") sendDirection()
		```
		
		Java API: get the Direction.Send instance
		- #### receiveDirection
		
		
		
		```
		public [Direction](Direction.html "interface in akka.remote.testkit") receiveDirection()
		```
		
		Java API: get the Direction.Receive instance
		- #### bothDirection
		
		
		
		```
		public [Direction](Direction.html "interface in akka.remote.testkit") bothDirection()
		```
		
		Java API: get the Direction.Both instance

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/Direction$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/Direction.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/Direction$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/Direction$.html)*
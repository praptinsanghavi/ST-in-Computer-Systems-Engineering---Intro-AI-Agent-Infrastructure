---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:03:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CapabilityFlag.html
title: CapabilityFlag
---

# CapabilityFlag

## Content

Package [akka.persistence](package-summary.html)
## Class CapabilityFlag

- java.lang.Object
- - akka.persistence.CapabilityFlag

- ---

```
public abstract class CapabilityFlag
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CapabilityFlag](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [CapabilityFlag](CapabilityFlag.html "class in akka.persistence")` | `[create](#create(boolean))​(boolean val)` | Java DSL |
	| `static [CapabilityFlag](CapabilityFlag.html "class in akka.persistence")` | `[mkFlag](#mkFlag(boolean))​(boolean v)` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `static [CapabilityFlag](CapabilityFlag.html "class in akka.persistence")` | `[off](#off())()` |  |
	| `static [CapabilityFlag](CapabilityFlag.html "class in akka.persistence")` | `[on](#on())()` |  |
	| `abstract boolean` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CapabilityFlag
		
		
		
		```
		public CapabilityFlag()
		```

	- ### Method Detail
	
	
	
		- #### on
		
		
		
		```
		public static [CapabilityFlag](CapabilityFlag.html "class in akka.persistence") on()
		```
		- #### off
		
		
		
		```
		public static [CapabilityFlag](CapabilityFlag.html "class in akka.persistence") off()
		```
		- #### create
		
		
		
		```
		public static [CapabilityFlag](CapabilityFlag.html "class in akka.persistence") create​(boolean val)
		```
		
		Java DSL
		- #### mkFlag
		
		
		
		```
		public static [CapabilityFlag](CapabilityFlag.html "class in akka.persistence") mkFlag​(boolean v)
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### value
		
		
		
		```
		public abstract boolean value()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CapabilityFlag.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CapabilityFlag.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CapabilityFlag.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:45:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/JVMShutdownHooks$.html
title: JVMShutdownHooks$
---

# JVMShutdownHooks$

## Content

Package [akka.actor](package-summary.html)
## Class JVMShutdownHooks$

- java.lang.Object
- - akka.actor.JVMShutdownHooks$

- All Implemented Interfaces:
`[JVMShutdownHooks](JVMShutdownHooks.html "interface in akka.actor")`

---

```
public class JVMShutdownHooks$
extends java.lang.Object
implements [JVMShutdownHooks](JVMShutdownHooks.html "interface in akka.actor")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JVMShutdownHooks$](JVMShutdownHooks$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JVMShutdownHooks$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[addHook](#addHook(java.lang.Thread))​(java.lang.Thread t)` |  |
	| `boolean` | `[removeHook](#removeHook(java.lang.Thread))​(java.lang.Thread t)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JVMShutdownHooks$](JVMShutdownHooks$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### JVMShutdownHooks$
		
		
		
		```
		public JVMShutdownHooks$()
		```

	- ### Method Detail
	
	
	
		- #### addHook
		
		
		
		```
		public void addHook​(java.lang.Thread t)
		```
		
		
		Specified by:
		`[addHook](JVMShutdownHooks.html#addHook(java.lang.Thread))` in interface `[JVMShutdownHooks](JVMShutdownHooks.html "interface in akka.actor")`
		- #### removeHook
		
		
		
		```
		public boolean removeHook​(java.lang.Thread t)
		```
		
		
		Specified by:
		`[removeHook](JVMShutdownHooks.html#removeHook(java.lang.Thread))` in interface `[JVMShutdownHooks](JVMShutdownHooks.html "interface in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/JVMShutdownHooks$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/JVMShutdownHooks.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/JVMShutdownHooks$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/JVMShutdownHooks$.html)*
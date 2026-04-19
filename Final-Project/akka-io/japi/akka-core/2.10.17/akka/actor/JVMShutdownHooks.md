---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/JVMShutdownHooks.html
title: JVMShutdownHooks
---

# JVMShutdownHooks

## Content

Package [akka.actor](package-summary.html)
## Interface JVMShutdownHooks

- All Known Implementing Classes:
`[JVMShutdownHooks$](JVMShutdownHooks$.html "class in akka.actor")`

---

```
public interface JVMShutdownHooks
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[addHook](#addHook(java.lang.Thread))​(java.lang.Thread t)` |  |
	| `boolean` | `[removeHook](#removeHook(java.lang.Thread))​(java.lang.Thread t)` |  |

- - ### Method Detail
	
	
	
		- #### addHook
		
		
		
		```
		void addHook​(java.lang.Thread t)
		```
		- #### removeHook
		
		
		
		```
		boolean removeHook​(java.lang.Thread t)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/JVMShutdownHooks$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/JVMShutdownHooks.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/JVMShutdownHooks.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/ThrowExceptionConfigurator.html
title: ThrowExceptionConfigurator
---

# ThrowExceptionConfigurator

## Content

Package [akka.persistence](package-summary.html)
## Class ThrowExceptionConfigurator

- java.lang.Object
- - akka.persistence.ThrowExceptionConfigurator

- All Implemented Interfaces:
`[StashOverflowStrategyConfigurator](StashOverflowStrategyConfigurator.html "interface in akka.persistence")`

---

```
public final class ThrowExceptionConfigurator
extends java.lang.Object
implements [StashOverflowStrategyConfigurator](StashOverflowStrategyConfigurator.html "interface in akka.persistence")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThrowExceptionConfigurator](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ThrowOverflowExceptionStrategy$](ThrowOverflowExceptionStrategy$.html "class in akka.persistence")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ThrowExceptionConfigurator
		
		
		
		```
		public ThrowExceptionConfigurator()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [ThrowOverflowExceptionStrategy$](ThrowOverflowExceptionStrategy$.html "class in akka.persistence") create​(com.typesafe.config.Config config)
		```
		
		
		Specified by:
		`[create](StashOverflowStrategyConfigurator.html#create(com.typesafe.config.Config))` in interface `[StashOverflowStrategyConfigurator](StashOverflowStrategyConfigurator.html "interface in akka.persistence")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/StashOverflowStrategyConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/ThrowOverflowExceptionStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/ThrowExceptionConfigurator.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/ThrowExceptionConfigurator.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DiscardConfigurator.html
title: DiscardConfigurator
---

# DiscardConfigurator

## Content

Package [akka.persistence](package-summary.html)
## Class DiscardConfigurator

- java.lang.Object
- - akka.persistence.DiscardConfigurator

- All Implemented Interfaces:
`[StashOverflowStrategyConfigurator](StashOverflowStrategyConfigurator.html "interface in akka.persistence")`

---

```
public final class DiscardConfigurator
extends java.lang.Object
implements [StashOverflowStrategyConfigurator](StashOverflowStrategyConfigurator.html "interface in akka.persistence")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DiscardConfigurator](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DiscardToDeadLetterStrategy$](DiscardToDeadLetterStrategy$.html "class in akka.persistence")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DiscardConfigurator
		
		
		
		```
		public DiscardConfigurator()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [DiscardToDeadLetterStrategy$](DiscardToDeadLetterStrategy$.html "class in akka.persistence") create​(com.typesafe.config.Config config)
		```
		
		
		Specified by:
		`[create](StashOverflowStrategyConfigurator.html#create(com.typesafe.config.Config))` in interface `[StashOverflowStrategyConfigurator](StashOverflowStrategyConfigurator.html "interface in akka.persistence")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DiscardToDeadLetterStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/StashOverflowStrategyConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DiscardConfigurator.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DiscardConfigurator.html)*
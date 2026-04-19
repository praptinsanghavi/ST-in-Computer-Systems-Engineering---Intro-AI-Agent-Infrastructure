---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/StashOverflowStrategyConfigurator.html
title: StashOverflowStrategyConfigurator
---

# StashOverflowStrategyConfigurator

## Content

Package [akka.persistence](package-summary.html)
## Interface StashOverflowStrategyConfigurator

- All Known Implementing Classes:
`[DiscardConfigurator](DiscardConfigurator.html "class in akka.persistence")`, `[ThrowExceptionConfigurator](ThrowExceptionConfigurator.html "class in akka.persistence")`

---

```
public interface StashOverflowStrategyConfigurator
```

Implement this interface in order to configure the stashOverflowStrategy for
 the internal stash of persistent actor.
 An instance of this class must be instantiable using a no\-arg constructor.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |

- - ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence") create​(com.typesafe.config.Config config)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DiscardConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/StashOverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/ThrowExceptionConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/StashOverflowStrategyConfigurator.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/StashOverflowStrategyConfigurator.html)*
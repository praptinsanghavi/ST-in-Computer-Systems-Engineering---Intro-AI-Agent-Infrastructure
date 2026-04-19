---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:11:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategyConfigurator.html
title: SupervisorStrategyConfigurator
---

# SupervisorStrategyConfigurator

## Content

Package [akka.actor](package-summary.html)
## Interface SupervisorStrategyConfigurator

- All Known Implementing Classes:
`[DefaultSupervisorStrategy](DefaultSupervisorStrategy.html "class in akka.actor")`, `[StoppingSupervisorStrategy](StoppingSupervisorStrategy.html "class in akka.actor")`

---

```
public interface SupervisorStrategyConfigurator
```

Implement this interface in order to configure the supervisorStrategy for
 the top\-level guardian actor (`/user`). An instance of this class must be
 instantiable using a no\-arg constructor.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")` | `[create](#create())()` |  |

- - ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor") create()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DefaultSupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/StoppingSupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategyConfigurator.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategyConfigurator.html)*
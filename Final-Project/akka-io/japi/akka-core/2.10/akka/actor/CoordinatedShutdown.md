---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:20:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/CoordinatedShutdown.PhaseDefinition.html
title: CoordinatedShutdown.PhaseDefinition
---

# CoordinatedShutdown.PhaseDefinition

## Content

Package [akka.actor](package-summary.html)
## Interface CoordinatedShutdown.PhaseDefinition

- Enclosing class:
[CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor")

---

```
public static interface CoordinatedShutdown.PhaseDefinition
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[Done](../Done.html "class in akka")>` | `[run](#run(boolean,scala.concurrent.ExecutionContext))​(boolean recoverEnabled,  scala.concurrent.ExecutionContext ec)` |  |
	| `int` | `[size](#size())()` |  |

- - ### Method Detail
	
	
	
		- #### run
		
		
		
		```
		scala.concurrent.Future<[Done](../Done.html "class in akka")> run​(boolean recoverEnabled,
		                                  scala.concurrent.ExecutionContext ec)
		```
		- #### size
		
		
		
		```
		int size()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/CoordinatedShutdown.PhaseDefinition.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/CoordinatedShutdown.PhaseDefinition.html)*
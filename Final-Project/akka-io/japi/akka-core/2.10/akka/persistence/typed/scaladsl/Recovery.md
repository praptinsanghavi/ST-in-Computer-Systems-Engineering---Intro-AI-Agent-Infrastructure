---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:51:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/Recovery.html
title: Recovery
---

# Recovery

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Interface Recovery

- All Known Implementing Classes:
`[DefaultRecovery$](../internal/DefaultRecovery$.html "class in akka.persistence.typed.internal")`, `[DisabledRecovery$](../internal/DisabledRecovery$.html "class in akka.persistence.typed.internal")`, `[ReplayOnlyLastRecovery$](../internal/ReplayOnlyLastRecovery$.html "class in akka.persistence.typed.internal")`

---

```
public interface Recovery
```

Strategy for recovery of snapshots and events.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Recovery](../javadsl/Recovery.html "class in akka.persistence.typed.javadsl")` | `[asJava](#asJava())()` |  |
	| `[Recovery](../../Recovery.html "class in akka.persistence")` | `[toClassic](#toClassic())()` | INTERNAL API |

- - ### Method Detail
	
	
	
		- #### asJava
		
		
		
		```
		[Recovery](../javadsl/Recovery.html "class in akka.persistence.typed.javadsl") asJava()
		```
		- #### toClassic
		
		
		
		```
		[Recovery](../../Recovery.html "class in akka.persistence") toClassic()
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/DefaultRecovery$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/DisabledRecovery$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/ReplayOnlyLastRecovery$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/Recovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/Recovery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/Recovery.html)*
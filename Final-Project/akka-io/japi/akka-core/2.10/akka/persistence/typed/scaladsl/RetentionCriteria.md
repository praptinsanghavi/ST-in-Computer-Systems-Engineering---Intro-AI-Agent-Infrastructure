---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:51:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/RetentionCriteria.html
title: RetentionCriteria
---

# RetentionCriteria

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Interface RetentionCriteria

- All Known Subinterfaces:
`[SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "interface in akka.persistence.typed.scaladsl")`

All Known Implementing Classes:
`[DisabledRetentionCriteria$](../internal/DisabledRetentionCriteria$.html "class in akka.persistence.typed.internal")`

---

```
public interface RetentionCriteria
```

Criteria for retention/deletion of snapshots and events.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[RetentionCriteria](../javadsl/RetentionCriteria.html "class in akka.persistence.typed.javadsl")` | `[asJava](#asJava())()` |  |

- - ### Method Detail
	
	
	
		- #### asJava
		
		
		
		```
		[RetentionCriteria](../javadsl/RetentionCriteria.html "class in akka.persistence.typed.javadsl") asJava()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/DisabledRetentionCriteria$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/RetentionCriteria.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/RetentionCriteria.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/RetentionCriteria.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/scalatest/OptionalTests.html
title: OptionalTests
---

# OptionalTests

## Content

Package [akka.persistence.scalatest](package-summary.html)
## Interface OptionalTests

- All Known Implementing Classes:
`[JavaJournalPerfSpec](../japi/journal/JavaJournalPerfSpec.html "class in akka.persistence.japi.journal")`, `[JavaJournalSpec](../japi/journal/JavaJournalSpec.html "class in akka.persistence.japi.journal")`, `[JavaSnapshotStoreSpec](../japi/snapshot/JavaSnapshotStoreSpec.html "class in akka.persistence.japi.snapshot")`, `[JournalPerfSpec](../journal/JournalPerfSpec.html "class in akka.persistence.journal")`, `[JournalSpec](../journal/JournalSpec.html "class in akka.persistence.journal")`, `[SnapshotStoreSpec](../snapshot/SnapshotStoreSpec.html "class in akka.persistence.snapshot")`

---

```
public interface OptionalTests
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[optional](#optional(akka.persistence.CapabilityFlag,scala.Function0))​([CapabilityFlag](../CapabilityFlag.html "class in akka.persistence") flag,  scala.Function0<scala.runtime.BoxedUnit> test)` |  |

- - ### Method Detail
	
	
	
		- #### optional
		
		
		
		```
		void optional​([CapabilityFlag](../CapabilityFlag.html "class in akka.persistence") flag,
		              scala.Function0<scala.runtime.BoxedUnit> test)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/CapabilityFlag.html
- https://doc.akka.io/japi/akka/current/akka/persistence/japi/journal/JavaJournalPerfSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/japi/journal/JavaJournalSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/japi/snapshot/JavaSnapshotStoreSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/scalatest/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/snapshot/SnapshotStoreSpec.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/scalatest/OptionalTests.html](https://doc.akka.io/japi/akka/current/akka/persistence/scalatest/OptionalTests.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/ClearPreservingSeqNums.html
title: ClearPreservingSeqNums
---

# ClearPreservingSeqNums

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Interface ClearPreservingSeqNums

- All Known Subinterfaces:
`[PersistenceTestKitOps](PersistenceTestKitOps.html "interface in akka.persistence.testkit.scaladsl")<S,​P>`

All Known Implementing Classes:
`[PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.scaladsl")`

---

```
public interface ClearPreservingSeqNums
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[clearAllPreservingSeqNumbers](#clearAllPreservingSeqNumbers())()` | Clear all data in the storage preserving sequence numbers. |
	| `void` | `[clearByIdPreservingSeqNumbers](#clearByIdPreservingSeqNumbers(java.lang.String))​(java.lang.String persistenceId)` | Clear all data in the storage for particular persistence id preserving sequence numbers. |

- - ### Method Detail
	
	
	
		- #### clearAllPreservingSeqNumbers
		
		
		
		```
		void clearAllPreservingSeqNumbers()
		```
		
		Clear all data in the storage preserving sequence numbers.
		- #### clearByIdPreservingSeqNumbers
		
		
		
		```
		void clearByIdPreservingSeqNumbers​(java.lang.String persistenceId)
		```
		
		Clear all data in the storage for particular persistence id preserving sequence numbers.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKitOps.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/ClearPreservingSeqNums.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/ClearPreservingSeqNums.html)*
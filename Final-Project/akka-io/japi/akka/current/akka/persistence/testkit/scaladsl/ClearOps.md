---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/ClearOps.html
title: ClearOps
---

# ClearOps

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Interface ClearOps

- All Known Subinterfaces:
`[CommonTestKitOps](CommonTestKitOps.html "interface in akka.persistence.testkit.scaladsl")<S,​P>`, `[PersistenceTestKitOps](PersistenceTestKitOps.html "interface in akka.persistence.testkit.scaladsl")<S,​P>`

All Known Implementing Classes:
`[PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.scaladsl")`, `[SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.scaladsl")`

---

```
public interface ClearOps
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[clearAll](#clearAll())()` | Clear all data from the storage. |
	| `void` | `[clearByPersistenceId](#clearByPersistenceId(java.lang.String))​(java.lang.String persistenceId)` | Clear all data from the storage for particular persistence id. |

- - ### Method Detail
	
	
	
		- #### clearAll
		
		
		
		```
		void clearAll()
		```
		
		Clear all data from the storage.
		 
		 NOTE! Also clears sequence numbers in storage!
		- #### clearByPersistenceId
		
		
		
		```
		void clearByPersistenceId​(java.lang.String persistenceId)
		```
		
		Clear all data from the storage for particular persistence id.
		 
		 NOTE! Also clears sequence number in the storage!

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/CommonTestKitOps.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKitOps.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/ClearOps.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/ClearOps.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.html
title: ProcessingPolicy.DefaultPolicies
---

# ProcessingPolicy.DefaultPolicies

## Content

Package [akka.persistence.testkit](package-summary.html)
## Interface ProcessingPolicy.DefaultPolicies\<U\>

- All Known Implementing Classes:
`[EventStorage.JournalPolicies$](EventStorage.JournalPolicies$.html "class in akka.persistence.testkit")`, `[SnapshotStorage.SnapshotPolicies$](SnapshotStorage.SnapshotPolicies$.html "class in akka.persistence.testkit")`

Enclosing interface:
[ProcessingPolicy](ProcessingPolicy.html "interface in akka.persistence.testkit")\<[U](ProcessingPolicy.html "type parameter in ProcessingPolicy")\>

---

```
public static interface ProcessingPolicy.DefaultPolicies<U>
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[ProcessingPolicy.DefaultPolicies.CountNextNCond](ProcessingPolicy.DefaultPolicies.CountNextNCond.html "class in akka.persistence.testkit")` |  |
	| `static class` | `[ProcessingPolicy.DefaultPolicies.FailNextN](ProcessingPolicy.DefaultPolicies.FailNextN.html "class in akka.persistence.testkit")` |  |
	| `static class` | `[ProcessingPolicy.DefaultPolicies.FailNextN$](ProcessingPolicy.DefaultPolicies.FailNextN$.html "class in akka.persistence.testkit")` |  |
	| `static class` | `[ProcessingPolicy.DefaultPolicies.FailNextNCond](ProcessingPolicy.DefaultPolicies.FailNextNCond.html "class in akka.persistence.testkit")` |  |
	| `static class` | `[ProcessingPolicy.DefaultPolicies.FailNextNCond$](ProcessingPolicy.DefaultPolicies.FailNextNCond$.html "class in akka.persistence.testkit")` |  |
	| `static class` | `[ProcessingPolicy.DefaultPolicies.PassAll](ProcessingPolicy.DefaultPolicies.PassAll.html "class in akka.persistence.testkit")` |  |
	| `static class` | `[ProcessingPolicy.DefaultPolicies.PassAll$](ProcessingPolicy.DefaultPolicies.PassAll$.html "class in akka.persistence.testkit")` |  |
	| `static class` | `[ProcessingPolicy.DefaultPolicies.RejectNextN](ProcessingPolicy.DefaultPolicies.RejectNextN.html "class in akka.persistence.testkit")` |  |
	| `static class` | `[ProcessingPolicy.DefaultPolicies.RejectNextN$](ProcessingPolicy.DefaultPolicies.RejectNextN$.html "class in akka.persistence.testkit")` |  |
	| `static class` | `[ProcessingPolicy.DefaultPolicies.RejectNextNCond](ProcessingPolicy.DefaultPolicies.RejectNextNCond.html "class in akka.persistence.testkit")` |  |
	| `static class` | `[ProcessingPolicy.DefaultPolicies.RejectNextNCond$](ProcessingPolicy.DefaultPolicies.RejectNextNCond$.html "class in akka.persistence.testkit")` |  |
	| `static class` | `[ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond](ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond.html "class in akka.persistence.testkit")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ProcessingPolicy.DefaultPolicies.FailNextN$](ProcessingPolicy.DefaultPolicies.FailNextN$.html "class in akka.persistence.testkit")` | `[FailNextN](#FailNextN())()` |  |
	| `[ProcessingPolicy.DefaultPolicies.FailNextNCond$](ProcessingPolicy.DefaultPolicies.FailNextNCond$.html "class in akka.persistence.testkit")` | `[FailNextNCond](#FailNextNCond())()` |  |
	| `[ProcessingPolicy.DefaultPolicies.PassAll$](ProcessingPolicy.DefaultPolicies.PassAll$.html "class in akka.persistence.testkit")` | `[PassAll](#PassAll())()` |  |
	| `[ProcessingPolicy.DefaultPolicies.RejectNextN$](ProcessingPolicy.DefaultPolicies.RejectNextN$.html "class in akka.persistence.testkit")` | `[RejectNextN](#RejectNextN())()` |  |
	| `[ProcessingPolicy.DefaultPolicies.RejectNextNCond$](ProcessingPolicy.DefaultPolicies.RejectNextNCond$.html "class in akka.persistence.testkit")` | `[RejectNextNCond](#RejectNextNCond())()` |  |

- - ### Method Detail
	
	
	
		- #### FailNextN
		
		
		
		```
		[ProcessingPolicy.DefaultPolicies.FailNextN$](ProcessingPolicy.DefaultPolicies.FailNextN$.html "class in akka.persistence.testkit") FailNextN()
		```
		- #### FailNextNCond
		
		
		
		```
		[ProcessingPolicy.DefaultPolicies.FailNextNCond$](ProcessingPolicy.DefaultPolicies.FailNextNCond$.html "class in akka.persistence.testkit") FailNextNCond()
		```
		- #### PassAll
		
		
		
		```
		[ProcessingPolicy.DefaultPolicies.PassAll$](ProcessingPolicy.DefaultPolicies.PassAll$.html "class in akka.persistence.testkit") PassAll()
		```
		- #### RejectNextN
		
		
		
		```
		[ProcessingPolicy.DefaultPolicies.RejectNextN$](ProcessingPolicy.DefaultPolicies.RejectNextN$.html "class in akka.persistence.testkit") RejectNextN()
		```
		- #### RejectNextNCond
		
		
		
		```
		[ProcessingPolicy.DefaultPolicies.RejectNextNCond$](ProcessingPolicy.DefaultPolicies.RejectNextNCond$.html "class in akka.persistence.testkit") RejectNextNCond()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/EventStorage.JournalPolicies$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.CountNextNCond.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.FailNextN$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.FailNextN.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.FailNextNCond$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.FailNextNCond.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.PassAll$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.PassAll.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextN$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextN.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextNCond$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextNCond.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotStorage.SnapshotPolicies$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.html)*
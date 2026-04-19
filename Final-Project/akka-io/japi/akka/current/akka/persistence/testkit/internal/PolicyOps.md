---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/PolicyOps.html
title: PolicyOps
---

# PolicyOps

## Content

Package [akka.persistence.testkit.internal](package-summary.html)
## Interface PolicyOps\<U\>

- All Known Subinterfaces:
`[EventStorage](../EventStorage.html "interface in akka.persistence.testkit")`, `[SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit")`, `[TestKitStorage](TestKitStorage.html "interface in akka.persistence.testkit.internal")<P,​R>`

---

```
public interface PolicyOps<U>
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[U](PolicyOps.html "type parameter in PolicyOps")>` | `[currentPolicy](#currentPolicy())()` |  |
	| `[ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[U](PolicyOps.html "type parameter in PolicyOps")>` | `[DefaultPolicy](#DefaultPolicy())()` |  |
	| `void` | `[resetPolicy](#resetPolicy())()` |  |
	| `void` | `[setPolicy](#setPolicy(akka.persistence.testkit.ProcessingPolicy))​([ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[U](PolicyOps.html "type parameter in PolicyOps")> policy)` |  |

- - ### Method Detail
	
	
	
		- #### DefaultPolicy
		
		
		
		```
		[ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[U](PolicyOps.html "type parameter in PolicyOps")> DefaultPolicy()
		```
		- #### currentPolicy
		
		
		
		```
		[ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[U](PolicyOps.html "type parameter in PolicyOps")> currentPolicy()
		```
		- #### resetPolicy
		
		
		
		```
		void resetPolicy()
		```
		- #### setPolicy
		
		
		
		```
		void setPolicy​([ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[U](PolicyOps.html "type parameter in PolicyOps")> policy)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/EventStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/PolicyOps.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/TestKitStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/PolicyOps.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/PolicyOps.html)*
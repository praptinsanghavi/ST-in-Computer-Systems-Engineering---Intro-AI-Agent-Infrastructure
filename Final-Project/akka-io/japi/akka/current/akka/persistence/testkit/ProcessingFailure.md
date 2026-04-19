---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingFailure.html
title: ProcessingFailure
---

# ProcessingFailure

## Content

Package [akka.persistence.testkit](package-summary.html)
## Interface ProcessingFailure

- All Superinterfaces:
`[ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit")`

All Known Implementing Classes:
`[Reject](Reject.html "class in akka.persistence.testkit")`, `[StorageFailure](StorageFailure.html "class in akka.persistence.testkit")`

---

```
public interface ProcessingFailure
extends [ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Throwable` | `[error](#error())()` |  |

- - ### Method Detail
	
	
	
		- #### error
		
		
		
		```
		java.lang.Throwable error()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingResult.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/Reject.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/StorageFailure.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingFailure.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingFailure.html)*
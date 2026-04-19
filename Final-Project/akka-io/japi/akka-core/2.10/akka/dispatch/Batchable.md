---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Batchable.html
title: Batchable
---

# Batchable

## Content

Package [akka.dispatch](package-summary.html)
## Interface Batchable

- All Superinterfaces:
`java.lang.Runnable`

All Known Implementing Classes:
`[TaskInvocation](TaskInvocation.html "class in akka.dispatch")`

---

```
public interface Batchable
extends java.lang.Runnable
```

INTERNAL API
 
 All Batchables are automatically batched when submitted to a BatchingExecutor

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isBatchable](#isBatchable())()` |  |
	
	
		- ### Methods inherited from interface java.lang.Runnable
		
		
		`run`

- - ### Method Detail
	
	
	
		- #### isBatchable
		
		
		
		```
		boolean isBatchable()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/TaskInvocation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Batchable.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Batchable.html)*
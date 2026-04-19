---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceFactory.html
title: ExecutorServiceFactory
---

# ExecutorServiceFactory

## Content

Package [akka.dispatch](package-summary.html)
## Interface ExecutorServiceFactory

- All Known Implementing Classes:
`[ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory](ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory.html "class in akka.dispatch")`, `[ThreadPoolConfig.ThreadPoolExecutorServiceFactory](ThreadPoolConfig.ThreadPoolExecutorServiceFactory.html "class in akka.dispatch")`

---

```
public interface ExecutorServiceFactory
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.ExecutorService` | `[createExecutorService](#createExecutorService())()` |  |

- - ### Method Detail
	
	
	
		- #### createExecutorService
		
		
		
		```
		java.util.concurrent.ExecutorService createExecutorService()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ThreadPoolConfig.ThreadPoolExecutorServiceFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceFactory.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceFactory.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceFactoryProvider.html
title: ExecutorServiceFactoryProvider
---

# ExecutorServiceFactoryProvider

## Content

Package [akka.dispatch](package-summary.html)
## Interface ExecutorServiceFactoryProvider

- All Known Implementing Classes:
`[DefaultExecutorServiceConfigurator](DefaultExecutorServiceConfigurator.html "class in akka.dispatch")`, `[ExecutorServiceConfigurator](ExecutorServiceConfigurator.html "class in akka.dispatch")`, `[ForkJoinExecutorConfigurator](ForkJoinExecutorConfigurator.html "class in akka.dispatch")`, `[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch")`, `[ThreadPoolExecutorConfigurator](ThreadPoolExecutorConfigurator.html "class in akka.dispatch")`

---

```
public interface ExecutorServiceFactoryProvider
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch")` | `[createExecutorServiceFactory](#createExecutorServiceFactory(java.lang.String,java.util.concurrent.ThreadFactory))​(java.lang.String id,  java.util.concurrent.ThreadFactory threadFactory)` |  |

- - ### Method Detail
	
	
	
		- #### createExecutorServiceFactory
		
		
		
		```
		[ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch") createExecutorServiceFactory​(java.lang.String id,
		                                                    java.util.concurrent.ThreadFactory threadFactory)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DefaultExecutorServiceConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ForkJoinExecutorConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ThreadPoolConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ThreadPoolExecutorConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceFactoryProvider.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceFactoryProvider.html)*
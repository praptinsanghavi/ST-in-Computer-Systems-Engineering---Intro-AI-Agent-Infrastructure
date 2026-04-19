---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceFactoryProvider.html
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

- https://doc.akka.io/japi/akka/current/akka/dispatch/DefaultExecutorServiceConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceFactory.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ForkJoinExecutorConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ThreadPoolConfig.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ThreadPoolExecutorConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceFactoryProvider.html](https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceFactoryProvider.html)*
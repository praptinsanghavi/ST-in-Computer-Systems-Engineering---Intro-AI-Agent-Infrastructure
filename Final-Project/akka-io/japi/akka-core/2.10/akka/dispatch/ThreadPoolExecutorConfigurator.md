---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:21:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ThreadPoolExecutorConfigurator.html
title: ThreadPoolExecutorConfigurator
---

# ThreadPoolExecutorConfigurator

## Content

Package [akka.dispatch](package-summary.html)
## Class ThreadPoolExecutorConfigurator

- java.lang.Object
- - [akka.dispatch.ExecutorServiceConfigurator](ExecutorServiceConfigurator.html "class in akka.dispatch")
	- - akka.dispatch.ThreadPoolExecutorConfigurator

- All Implemented Interfaces:
`[ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "interface in akka.dispatch")`

---

```
public class ThreadPoolExecutorConfigurator
extends [ExecutorServiceConfigurator](ExecutorServiceConfigurator.html "class in akka.dispatch")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThreadPoolExecutorConfigurator](#%3Cinit%3E(com.typesafe.config.Config,akka.dispatch.DispatcherPrerequisites))​(com.typesafe.config.Config config,  [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch")` | `[createExecutorServiceFactory](#createExecutorServiceFactory(java.lang.String,java.util.concurrent.ThreadFactory))​(java.lang.String id,  java.util.concurrent.ThreadFactory threadFactory)` |  |
	| `protected [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[createThreadPoolConfigBuilder](#createThreadPoolConfigBuilder(com.typesafe.config.Config,akka.dispatch.DispatcherPrerequisites))​(com.typesafe.config.Config config,  [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites)` |  |
	| `[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch")` | `[threadPoolConfig](#threadPoolConfig())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ThreadPoolExecutorConfigurator
		
		
		
		```
		public ThreadPoolExecutorConfigurator​(com.typesafe.config.Config config,
		                                      [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites)
		```

	- ### Method Detail
	
	
	
		- #### createExecutorServiceFactory
		
		
		
		```
		public [ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch") createExecutorServiceFactory​(java.lang.String id,
		                                                           java.util.concurrent.ThreadFactory threadFactory)
		```
		- #### createThreadPoolConfigBuilder
		
		
		
		```
		protected [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") createThreadPoolConfigBuilder​(com.typesafe.config.Config config,
		                                                                [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites)
		```
		- #### threadPoolConfig
		
		
		
		```
		public [ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") threadPoolConfig()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DispatcherPrerequisites.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceFactoryProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ThreadPoolConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ThreadPoolConfigBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ThreadPoolExecutorConfigurator.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ThreadPoolExecutorConfigurator.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceConfigurator.html
title: ExecutorServiceConfigurator
---

# ExecutorServiceConfigurator

## Content

Package [akka.dispatch](package-summary.html)
## Class ExecutorServiceConfigurator

- java.lang.Object
- - akka.dispatch.ExecutorServiceConfigurator

- All Implemented Interfaces:
`[ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "interface in akka.dispatch")`

Direct Known Subclasses:
`[DefaultExecutorServiceConfigurator](DefaultExecutorServiceConfigurator.html "class in akka.dispatch")`, `[ForkJoinExecutorConfigurator](ForkJoinExecutorConfigurator.html "class in akka.dispatch")`, `[ThreadPoolExecutorConfigurator](ThreadPoolExecutorConfigurator.html "class in akka.dispatch")`

---

```
public abstract class ExecutorServiceConfigurator
extends java.lang.Object
implements [ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "interface in akka.dispatch")
```

An ExecutorServiceConfigurator is a class that given some prerequisites and a configuration can create instances of ExecutorService

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExecutorServiceConfigurator](#%3Cinit%3E(com.typesafe.config.Config,akka.dispatch.DispatcherPrerequisites))​(com.typesafe.config.Config config,  [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.dispatch.[ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "interface in akka.dispatch")
		
		
		`[createExecutorServiceFactory](ExecutorServiceFactoryProvider.html#createExecutorServiceFactory(java.lang.String,java.util.concurrent.ThreadFactory))`

- - ### Constructor Detail
	
	
	
		- #### ExecutorServiceConfigurator
		
		
		
		```
		public ExecutorServiceConfigurator​(com.typesafe.config.Config config,
		                                   [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/DefaultExecutorServiceConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/DispatcherPrerequisites.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceFactoryProvider.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ForkJoinExecutorConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ThreadPoolExecutorConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceConfigurator.html](https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceConfigurator.html)*
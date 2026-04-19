---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/DefaultExecutorServiceConfigurator.html
title: DefaultExecutorServiceConfigurator
---

# DefaultExecutorServiceConfigurator

## Content

Package [akka.dispatch](package-summary.html)
## Class DefaultExecutorServiceConfigurator

- java.lang.Object
- - [akka.dispatch.ExecutorServiceConfigurator](ExecutorServiceConfigurator.html "class in akka.dispatch")
	- - akka.dispatch.DefaultExecutorServiceConfigurator

- All Implemented Interfaces:
`[ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "interface in akka.dispatch")`

---

```
public class DefaultExecutorServiceConfigurator
extends [ExecutorServiceConfigurator](ExecutorServiceConfigurator.html "class in akka.dispatch")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultExecutorServiceConfigurator](#%3Cinit%3E(com.typesafe.config.Config,akka.dispatch.DispatcherPrerequisites,akka.dispatch.ExecutorServiceConfigurator))​(com.typesafe.config.Config config,  [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites,  [ExecutorServiceConfigurator](ExecutorServiceConfigurator.html "class in akka.dispatch") fallback)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch")` | `[createExecutorServiceFactory](#createExecutorServiceFactory(java.lang.String,java.util.concurrent.ThreadFactory))​(java.lang.String id,  java.util.concurrent.ThreadFactory threadFactory)` |  |
	| `[ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "interface in akka.dispatch")` | `[provider](#provider())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DefaultExecutorServiceConfigurator
		
		
		
		```
		public DefaultExecutorServiceConfigurator​(com.typesafe.config.Config config,
		                                          [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites,
		                                          [ExecutorServiceConfigurator](ExecutorServiceConfigurator.html "class in akka.dispatch") fallback)
		```

	- ### Method Detail
	
	
	
		- #### createExecutorServiceFactory
		
		
		
		```
		public [ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch") createExecutorServiceFactory​(java.lang.String id,
		                                                           java.util.concurrent.ThreadFactory threadFactory)
		```
		- #### provider
		
		
		
		```
		public [ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "interface in akka.dispatch") provider()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/DispatcherPrerequisites.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceFactory.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceFactoryProvider.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/DefaultExecutorServiceConfigurator.html](https://doc.akka.io/japi/akka/current/akka/dispatch/DefaultExecutorServiceConfigurator.html)*
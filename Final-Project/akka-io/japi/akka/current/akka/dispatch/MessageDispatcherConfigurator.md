---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcherConfigurator.html
title: MessageDispatcherConfigurator
---

# MessageDispatcherConfigurator

## Content

Package [akka.dispatch](package-summary.html)
## Class MessageDispatcherConfigurator

- java.lang.Object
- - akka.dispatch.MessageDispatcherConfigurator

- Direct Known Subclasses:
`[BalancingDispatcherConfigurator](BalancingDispatcherConfigurator.html "class in akka.dispatch")`, `[CallingThreadDispatcherConfigurator](../testkit/CallingThreadDispatcherConfigurator.html "class in akka.testkit")`, `[DispatcherConfigurator](DispatcherConfigurator.html "class in akka.dispatch")`, `[PinnedDispatcherConfigurator](PinnedDispatcherConfigurator.html "class in akka.dispatch")`

---

```
public abstract class MessageDispatcherConfigurator
extends java.lang.Object
```

Base class to be used for hooking in new dispatchers into Dispatchers.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageDispatcherConfigurator](#%3Cinit%3E(com.typesafe.config.Config,akka.dispatch.DispatcherPrerequisites))​(com.typesafe.config.Config _config,  [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `com.typesafe.config.Config` | `[config](#config())()` |  |
	| `[ExecutorServiceConfigurator](ExecutorServiceConfigurator.html "class in akka.dispatch")` | `[configureExecutor](#configureExecutor())()` |  |
	| `abstract [MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")` | `[dispatcher](#dispatcher())()` | Returns an instance of MessageDispatcher given the configuration. |
	| `[DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch")` | `[prerequisites](#prerequisites())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MessageDispatcherConfigurator
		
		
		
		```
		public MessageDispatcherConfigurator​(com.typesafe.config.Config _config,
		                                     [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites)
		```

	- ### Method Detail
	
	
	
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```
		- #### configureExecutor
		
		
		
		```
		public [ExecutorServiceConfigurator](ExecutorServiceConfigurator.html "class in akka.dispatch") configureExecutor()
		```
		- #### dispatcher
		
		
		
		```
		public abstract [MessageDispatcher](MessageDispatcher.html "class in akka.dispatch") dispatcher()
		```
		
		Returns an instance of MessageDispatcher given the configuration.
		 Depending on the needs the implementation may return a new instance for
		 each invocation or return the same instance every time.
		- #### prerequisites
		
		
		
		```
		public [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/BalancingDispatcherConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/DispatcherConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/DispatcherPrerequisites.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/PinnedDispatcherConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadDispatcherConfigurator.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcherConfigurator.html](https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcherConfigurator.html)*
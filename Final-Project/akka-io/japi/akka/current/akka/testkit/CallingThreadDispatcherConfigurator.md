---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadDispatcherConfigurator.html
title: CallingThreadDispatcherConfigurator
---

# CallingThreadDispatcherConfigurator

## Content

Package [akka.testkit](package-summary.html)
## Class CallingThreadDispatcherConfigurator

- java.lang.Object
- - [akka.dispatch.MessageDispatcherConfigurator](../dispatch/MessageDispatcherConfigurator.html "class in akka.dispatch")
	- - akka.testkit.CallingThreadDispatcherConfigurator

- ---

```
public class CallingThreadDispatcherConfigurator
extends [MessageDispatcherConfigurator](../dispatch/MessageDispatcherConfigurator.html "class in akka.dispatch")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CallingThreadDispatcherConfigurator](#%3Cinit%3E(com.typesafe.config.Config,akka.dispatch.DispatcherPrerequisites))​(com.typesafe.config.Config config,  [DispatcherPrerequisites](../dispatch/DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")` | `[dispatcher](#dispatcher())()` | Returns an instance of MessageDispatcher given the configuration. |
	
	
		- ### Methods inherited from class akka.dispatch.[MessageDispatcherConfigurator](../dispatch/MessageDispatcherConfigurator.html "class in akka.dispatch")
		
		
		`[config](../dispatch/MessageDispatcherConfigurator.html#config()), [configureExecutor](../dispatch/MessageDispatcherConfigurator.html#configureExecutor()), [prerequisites](../dispatch/MessageDispatcherConfigurator.html#prerequisites())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CallingThreadDispatcherConfigurator
		
		
		
		```
		public CallingThreadDispatcherConfigurator​(com.typesafe.config.Config config,
		                                           [DispatcherPrerequisites](../dispatch/DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites)
		```

	- ### Method Detail
	
	
	
		- #### dispatcher
		
		
		
		```
		public [MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch") dispatcher()
		```
		
		Description copied from class: `[MessageDispatcherConfigurator](../dispatch/MessageDispatcherConfigurator.html#dispatcher())`
		Returns an instance of MessageDispatcher given the configuration.
		 Depending on the needs the implementation may return a new instance for
		 each invocation or return the same instance every time.
		
		Specified by:
		`[dispatcher](../dispatch/MessageDispatcherConfigurator.html#dispatcher())` in class `[MessageDispatcherConfigurator](../dispatch/MessageDispatcherConfigurator.html "class in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/DispatcherPrerequisites.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcherConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadDispatcherConfigurator.html](https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadDispatcherConfigurator.html)*
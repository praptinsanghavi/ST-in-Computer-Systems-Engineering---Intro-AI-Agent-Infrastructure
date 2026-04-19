---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/PinnedDispatcherConfigurator.html
title: PinnedDispatcherConfigurator
---

# PinnedDispatcherConfigurator

## Content

Package [akka.dispatch](package-summary.html)
## Class PinnedDispatcherConfigurator

- java.lang.Object
- - [akka.dispatch.MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch")
	- - akka.dispatch.PinnedDispatcherConfigurator

- ---

```
public class PinnedDispatcherConfigurator
extends [MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch")
```

Configurator for creating [`PinnedDispatcher`](PinnedDispatcher.html "class in akka.dispatch").
 Returns new dispatcher instance for each invocation
 of the `dispatcher()` method.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PinnedDispatcherConfigurator](#%3Cinit%3E(com.typesafe.config.Config,akka.dispatch.DispatcherPrerequisites))​(com.typesafe.config.Config config,  [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")` | `[dispatcher](#dispatcher())()` | Creates new dispatcher for each invocation. |
	
	
		- ### Methods inherited from class akka.dispatch.[MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch")
		
		
		`[config](MessageDispatcherConfigurator.html#config()), [configureExecutor](MessageDispatcherConfigurator.html#configureExecutor()), [prerequisites](MessageDispatcherConfigurator.html#prerequisites())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PinnedDispatcherConfigurator
		
		
		
		```
		public PinnedDispatcherConfigurator​(com.typesafe.config.Config config,
		                                    [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites)
		```

	- ### Method Detail
	
	
	
		- #### dispatcher
		
		
		
		```
		public [MessageDispatcher](MessageDispatcher.html "class in akka.dispatch") dispatcher()
		```
		
		Creates new dispatcher for each invocation.
		
		Specified by:
		`[dispatcher](MessageDispatcherConfigurator.html#dispatcher())` in class `[MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/DispatcherPrerequisites.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcherConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/PinnedDispatcher.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/PinnedDispatcherConfigurator.html](https://doc.akka.io/japi/akka/current/akka/dispatch/PinnedDispatcherConfigurator.html)*
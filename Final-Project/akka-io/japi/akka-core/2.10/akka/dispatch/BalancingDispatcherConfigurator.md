---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:19:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BalancingDispatcherConfigurator.html
title: BalancingDispatcherConfigurator
---

# BalancingDispatcherConfigurator

## Content

Package [akka.dispatch](package-summary.html)
## Class BalancingDispatcherConfigurator

- java.lang.Object
- - [akka.dispatch.MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch")
	- - akka.dispatch.BalancingDispatcherConfigurator

- ---

```
public class BalancingDispatcherConfigurator
extends [MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch")
```

Configurator for creating `BalancingDispatcher`.
 Returns the same dispatcher instance for each invocation
 of the `dispatcher()` method.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BalancingDispatcherConfigurator](#%3Cinit%3E(com.typesafe.config.Config,akka.dispatch.DispatcherPrerequisites))​(com.typesafe.config.Config _config,  [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") _prerequisites)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static com.typesafe.config.Config` | `[amendConfig](#amendConfig(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `protected akka.dispatch.BalancingDispatcher` | `[create](#create(akka.dispatch.MailboxType))​([MailboxType](MailboxType.html "interface in akka.dispatch") mailboxType)` |  |
	| `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")` | `[dispatcher](#dispatcher())()` | Returns the same dispatcher instance for each invocation |
	
	
		- ### Methods inherited from class akka.dispatch.[MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch")
		
		
		`[config](MessageDispatcherConfigurator.html#config()), [configureExecutor](MessageDispatcherConfigurator.html#configureExecutor()), [prerequisites](MessageDispatcherConfigurator.html#prerequisites())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BalancingDispatcherConfigurator
		
		
		
		```
		public BalancingDispatcherConfigurator​(com.typesafe.config.Config _config,
		                                       [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") _prerequisites)
		```

	- ### Method Detail
	
	
	
		- #### amendConfig
		
		
		
		```
		public static com.typesafe.config.Config amendConfig​(com.typesafe.config.Config config)
		```
		- #### create
		
		
		
		```
		protected akka.dispatch.BalancingDispatcher create​([MailboxType](MailboxType.html "interface in akka.dispatch") mailboxType)
		```
		- #### dispatcher
		
		
		
		```
		public [MessageDispatcher](MessageDispatcher.html "class in akka.dispatch") dispatcher()
		```
		
		Returns the same dispatcher instance for each invocation
		
		Specified by:
		`[dispatcher](MessageDispatcherConfigurator.html#dispatcher())` in class `[MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DispatcherPrerequisites.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MailboxType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcherConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BalancingDispatcherConfigurator.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BalancingDispatcherConfigurator.html)*
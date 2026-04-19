---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DispatcherPrerequisites.html
title: DispatcherPrerequisites
---

# DispatcherPrerequisites

## Content

Package [akka.dispatch](package-summary.html)
## Interface DispatcherPrerequisites

- ---

```
public interface DispatcherPrerequisites
```

DispatcherPrerequisites represents useful contextual pieces when constructing a MessageDispatcher

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<scala.concurrent.ExecutionContext>` | `[defaultExecutionContext](#defaultExecutionContext())()` |  |
	| `[DynamicAccess](../actor/DynamicAccess.html "class in akka.actor")` | `[dynamicAccess](#dynamicAccess())()` |  |
	| `[EventStream](../event/EventStream.html "class in akka.event")` | `[eventStream](#eventStream())()` |  |
	| `akka.dispatch.Mailboxes` | `[mailboxes](#mailboxes())()` |  |
	| `[Scheduler](../actor/Scheduler.html "interface in akka.actor")` | `[scheduler](#scheduler())()` |  |
	| `[ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor")` | `[settings](#settings())()` |  |
	| `java.util.concurrent.ThreadFactory` | `[threadFactory](#threadFactory())()` |  |

- - ### Method Detail
	
	
	
		- #### defaultExecutionContext
		
		
		
		```
		scala.Option<scala.concurrent.ExecutionContext> defaultExecutionContext()
		```
		- #### dynamicAccess
		
		
		
		```
		[DynamicAccess](../actor/DynamicAccess.html "class in akka.actor") dynamicAccess()
		```
		- #### eventStream
		
		
		
		```
		[EventStream](../event/EventStream.html "class in akka.event") eventStream()
		```
		- #### mailboxes
		
		
		
		```
		akka.dispatch.Mailboxes mailboxes()
		```
		- #### scheduler
		
		
		
		```
		[Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler()
		```
		- #### settings
		
		
		
		```
		[ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") settings()
		```
		- #### threadFactory
		
		
		
		```
		java.util.concurrent.ThreadFactory threadFactory()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DynamicAccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/EventStream.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DispatcherPrerequisites.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DispatcherPrerequisites.html)*
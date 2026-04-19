---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/PinnedDispatcher.html
title: PinnedDispatcher
---

# PinnedDispatcher

## Content

Package [akka.dispatch](package-summary.html)
## Class PinnedDispatcher

- java.lang.Object
- - [akka.dispatch.MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")
	- - [akka.dispatch.Dispatcher](Dispatcher.html "class in akka.dispatch")
		- - akka.dispatch.PinnedDispatcher

- All Implemented Interfaces:
`[BatchingExecutor](BatchingExecutor.html "interface in akka.dispatch")`, `java.util.concurrent.Executor`, `scala.concurrent.ExecutionContext`, `scala.concurrent.ExecutionContextExecutor`

---

```
public class PinnedDispatcher
extends [Dispatcher](Dispatcher.html "class in akka.dispatch")
```

Dedicates a unique thread for each actor passed in as reference. Served through its messageQueue.
 
 The preferred way of creating dispatchers is to define configuration of it and use the
 the `lookup` method in [`Dispatchers`](Dispatchers.html "class in akka.dispatch").

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.concurrent.ExecutionContext
		
		
		`scala.concurrent.ExecutionContext.Implicits$, scala.concurrent.ExecutionContext.parasitic$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PinnedDispatcher](#%3Cinit%3E(akka.dispatch.MessageDispatcherConfigurator,akka.actor.ActorCell,java.lang.String,scala.concurrent.duration.FiniteDuration,akka.dispatch.ThreadPoolConfig))​([MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch") _configurator,  akka.actor.ActorCell _actor,  java.lang.String _id,  scala.concurrent.duration.FiniteDuration _shutdownTimeout,  [ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") _threadPoolConfig)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[register](#register(akka.actor.ActorCell))​(akka.actor.ActorCell actorCell)` | If you override it, you must call it. |
	| `protected void` | `[unregister](#unregister(akka.actor.ActorCell))​(akka.actor.ActorCell actor)` | If you override it, you must call it. |
	
	
		- ### Methods inherited from class akka.dispatch.[Dispatcher](Dispatcher.html "class in akka.dispatch")
		
		
		`[batchable](Dispatcher.html#batchable(java.lang.Runnable)), [createMailbox](Dispatcher.html#createMailbox(akka.actor.Cell,akka.dispatch.MailboxType)), [dispatch](Dispatcher.html#dispatch(akka.actor.ActorCell,akka.dispatch.Envelope)), [executeTask](Dispatcher.html#executeTask(akka.dispatch.TaskInvocation)), [executorService](Dispatcher.html#executorService()), [id](Dispatcher.html#id()), [registerForExecution](Dispatcher.html#registerForExecution(akka.dispatch.Mailbox,boolean,boolean)), [shutdown](Dispatcher.html#shutdown()), [shutdownTimeout](Dispatcher.html#shutdownTimeout()), [systemDispatch](Dispatcher.html#systemDispatch(akka.actor.ActorCell,akka.dispatch.sysmsg.SystemMessage)), [throughput](Dispatcher.html#throughput()), [throughputDeadlineTime](Dispatcher.html#throughputDeadlineTime()), [toString](Dispatcher.html#toString())`
		- ### Methods inherited from class akka.dispatch.[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")
		
		
		`[actors](MessageDispatcher.html#actors()), [attach](MessageDispatcher.html#attach(akka.actor.ActorCell)), [configurator](MessageDispatcher.html#configurator()), [debug](MessageDispatcher.html#debug()), [detach](MessageDispatcher.html#detach(akka.actor.ActorCell)), [eventStream](MessageDispatcher.html#eventStream()), [inhabitants](MessageDispatcher.html#inhabitants()), [isThroughputDeadlineTimeDefined](MessageDispatcher.html#isThroughputDeadlineTimeDefined()), [mailboxes](MessageDispatcher.html#mailboxes()), [printActors](MessageDispatcher.html#printActors()), [reportFailure](MessageDispatcher.html#reportFailure(java.lang.Throwable)), [RESCHEDULED](MessageDispatcher.html#RESCHEDULED()), [resubmitOnBlock](MessageDispatcher.html#resubmitOnBlock()), [resume](MessageDispatcher.html#resume(akka.actor.ActorCell)), [SCHEDULED](MessageDispatcher.html#SCHEDULED()), [suspend](MessageDispatcher.html#suspend(akka.actor.ActorCell)), [unbatchedExecute](MessageDispatcher.html#unbatchedExecute(java.lang.Runnable)), [UNSCHEDULED](MessageDispatcher.html#UNSCHEDULED())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.dispatch.[BatchingExecutor](BatchingExecutor.html "interface in akka.dispatch")
		
		
		`[execute](BatchingExecutor.html#execute(java.lang.Runnable))`
		- ### Methods inherited from interface scala.concurrent.ExecutionContext
		
		
		`execute, prepare`

- - ### Constructor Detail
	
	
	
		- #### PinnedDispatcher
		
		
		
		```
		public PinnedDispatcher​([MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch") _configurator,
		                        akka.actor.ActorCell _actor,
		                        java.lang.String _id,
		                        scala.concurrent.duration.FiniteDuration _shutdownTimeout,
		                        [ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") _threadPoolConfig)
		```

	- ### Method Detail
	
	
	
		- #### register
		
		
		
		```
		protected void register​(akka.actor.ActorCell actorCell)
		```
		
		Description copied from class: `[MessageDispatcher](MessageDispatcher.html#register(akka.actor.ActorCell))`
		If you override it, you must call it. But only ever once. See "attach" for only invocation.
		 
		 INTERNAL API
		
		
		
		Overrides:
		`[register](MessageDispatcher.html#register(akka.actor.ActorCell))` in class `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")`
		- #### unregister
		
		
		
		```
		protected void unregister​(akka.actor.ActorCell actor)
		```
		
		Description copied from class: `[MessageDispatcher](MessageDispatcher.html#unregister(akka.actor.ActorCell))`
		If you override it, you must call it. But only ever once. See "detach" for the only invocation
		 
		 INTERNAL API
		
		
		
		Overrides:
		`[unregister](MessageDispatcher.html#unregister(akka.actor.ActorCell))` in class `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/BatchingExecutor.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Dispatcher.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Dispatchers.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcherConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ThreadPoolConfig.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/PinnedDispatcher.html](https://doc.akka.io/japi/akka/current/akka/dispatch/PinnedDispatcher.html)*
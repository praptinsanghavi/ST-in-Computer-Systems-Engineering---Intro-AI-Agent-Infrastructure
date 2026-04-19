---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/Dispatcher.html
title: Dispatcher
---

# Dispatcher

## Content

Package [akka.dispatch](package-summary.html)
## Class Dispatcher

- java.lang.Object
- - [akka.dispatch.MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")
	- - akka.dispatch.Dispatcher

- All Implemented Interfaces:
`[BatchingExecutor](BatchingExecutor.html "interface in akka.dispatch")`, `java.util.concurrent.Executor`, `scala.concurrent.ExecutionContext`, `scala.concurrent.ExecutionContextExecutor`

Direct Known Subclasses:
`[PinnedDispatcher](PinnedDispatcher.html "class in akka.dispatch")`

---

```
public class Dispatcher
extends [MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")
```

The event\-based Dispatcher binds a set of Actors to a thread pool backed up by a
 `BlockingQueue`.
 
 The preferred way of creating dispatchers is to define configuration of it and use the
 the `lookup` method in [`Dispatchers`](Dispatchers.html "class in akka.dispatch").
 

 param: throughput positive integer indicates the dispatcher will only process so much messages at a time from the
 mailbox, without checking the mailboxes of other actors. Zero or negative means the dispatcher
 always continues until the mailbox is empty.
 Larger values (or zero or negative) increase throughput, smaller values increase fairness

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.concurrent.ExecutionContext
		
		
		`scala.concurrent.ExecutionContext.Implicits$, scala.concurrent.ExecutionContext.parasitic$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Dispatcher](#%3Cinit%3E(akka.dispatch.MessageDispatcherConfigurator,java.lang.String,int,scala.concurrent.duration.Duration,akka.dispatch.ExecutorServiceFactoryProvider,scala.concurrent.duration.FiniteDuration))​([MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch") _configurator,  java.lang.String id,  int throughput,  scala.concurrent.duration.Duration throughputDeadlineTime,  [ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "interface in akka.dispatch") executorServiceFactoryProvider,  scala.concurrent.duration.FiniteDuration shutdownTimeout)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[batchable](#batchable(java.lang.Runnable))​(java.lang.Runnable runnable)` | Override this to define which runnables will be batched. |
	| `protected akka.dispatch.Mailbox` | `[createMailbox](#createMailbox(akka.actor.Cell,akka.dispatch.MailboxType))​([Cell](../actor/Cell.html "interface in akka.actor") actor,  [MailboxType](MailboxType.html "interface in akka.dispatch") mailboxType)` | INTERNAL API |
	| `protected void` | `[dispatch](#dispatch(akka.actor.ActorCell,akka.dispatch.Envelope))​(akka.actor.ActorCell receiver,  [Envelope](Envelope.html "class in akka.dispatch") invocation)` | INTERNAL API |
	| `protected void` | `[executeTask](#executeTask(akka.dispatch.TaskInvocation))​([TaskInvocation](TaskInvocation.html "class in akka.dispatch") invocation)` | INTERNAL API |
	| `protected [ExecutorServiceDelegate](ExecutorServiceDelegate.html "interface in akka.dispatch")` | `[executorService](#executorService())()` |  |
	| `java.lang.String` | `[id](#id())()` | Identifier of this dispatcher, corresponds to the full key  of the dispatcher configuration. |
	| `protected boolean` | `[registerForExecution](#registerForExecution(akka.dispatch.Mailbox,boolean,boolean))​(akka.dispatch.Mailbox mbox,  boolean hasMessageHint,  boolean hasSystemMessageHint)` | Returns if it was registered |
	| `protected void` | `[shutdown](#shutdown())()` | INTERNAL API |
	| `scala.concurrent.duration.FiniteDuration` | `[shutdownTimeout](#shutdownTimeout())()` | When the dispatcher no longer has any actors registered, how long will it wait until it shuts itself down,  defaulting to your akka configs "akka.actor.default\-dispatcher.shutdown\-timeout" or default specified in  reference.conf |
	| `protected void` | `[systemDispatch](#systemDispatch(akka.actor.ActorCell,akka.dispatch.sysmsg.SystemMessage))​(akka.actor.ActorCell receiver,  [SystemMessage](sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") invocation)` | INTERNAL API |
	| `int` | `[throughput](#throughput())()` | INTERNAL API |
	| `scala.concurrent.duration.Duration` | `[throughputDeadlineTime](#throughputDeadlineTime())()` | INTERNAL API |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.dispatch.[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")
		
		
		`[actors](MessageDispatcher.html#actors()), [attach](MessageDispatcher.html#attach(akka.actor.ActorCell)), [configurator](MessageDispatcher.html#configurator()), [debug](MessageDispatcher.html#debug()), [detach](MessageDispatcher.html#detach(akka.actor.ActorCell)), [eventStream](MessageDispatcher.html#eventStream()), [inhabitants](MessageDispatcher.html#inhabitants()), [isThroughputDeadlineTimeDefined](MessageDispatcher.html#isThroughputDeadlineTimeDefined()), [mailboxes](MessageDispatcher.html#mailboxes()), [printActors](MessageDispatcher.html#printActors()), [register](MessageDispatcher.html#register(akka.actor.ActorCell)), [reportFailure](MessageDispatcher.html#reportFailure(java.lang.Throwable)), [RESCHEDULED](MessageDispatcher.html#RESCHEDULED()), [resubmitOnBlock](MessageDispatcher.html#resubmitOnBlock()), [resume](MessageDispatcher.html#resume(akka.actor.ActorCell)), [SCHEDULED](MessageDispatcher.html#SCHEDULED()), [suspend](MessageDispatcher.html#suspend(akka.actor.ActorCell)), [unbatchedExecute](MessageDispatcher.html#unbatchedExecute(java.lang.Runnable)), [unregister](MessageDispatcher.html#unregister(akka.actor.ActorCell)), [UNSCHEDULED](MessageDispatcher.html#UNSCHEDULED())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.dispatch.[BatchingExecutor](BatchingExecutor.html "interface in akka.dispatch")
		
		
		`[execute](BatchingExecutor.html#execute(java.lang.Runnable))`
		- ### Methods inherited from interface scala.concurrent.ExecutionContext
		
		
		`execute, prepare`

- - ### Constructor Detail
	
	
	
		- #### Dispatcher
		
		
		
		```
		public Dispatcher​([MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch") _configurator,
		                  java.lang.String id,
		                  int throughput,
		                  scala.concurrent.duration.Duration throughputDeadlineTime,
		                  [ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "interface in akka.dispatch") executorServiceFactoryProvider,
		                  scala.concurrent.duration.FiniteDuration shutdownTimeout)
		```

	- ### Method Detail
	
	
	
		- #### batchable
		
		
		
		```
		public boolean batchable​(java.lang.Runnable runnable)
		```
		
		Description copied from interface: `[BatchingExecutor](BatchingExecutor.html#batchable(java.lang.Runnable))`
		Override this to define which runnables will be batched.
		- #### createMailbox
		
		
		
		```
		protected akka.dispatch.Mailbox createMailbox​([Cell](../actor/Cell.html "interface in akka.actor") actor,
		                                              [MailboxType](MailboxType.html "interface in akka.dispatch") mailboxType)
		```
		
		INTERNAL API
		
		Specified by:
		`[createMailbox](MessageDispatcher.html#createMailbox(akka.actor.Cell,akka.dispatch.MailboxType))` in class `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")`
		- #### dispatch
		
		
		
		```
		protected void dispatch​(akka.actor.ActorCell receiver,
		                        [Envelope](Envelope.html "class in akka.dispatch") invocation)
		```
		
		INTERNAL API
		
		Specified by:
		`[dispatch](MessageDispatcher.html#dispatch(akka.actor.ActorCell,akka.dispatch.Envelope))` in class `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")`
		- #### executeTask
		
		
		
		```
		protected void executeTask​([TaskInvocation](TaskInvocation.html "class in akka.dispatch") invocation)
		```
		
		INTERNAL API
		
		Specified by:
		`[executeTask](MessageDispatcher.html#executeTask(akka.dispatch.TaskInvocation))` in class `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")`
		- #### executorService
		
		
		
		```
		protected final [ExecutorServiceDelegate](ExecutorServiceDelegate.html "interface in akka.dispatch") executorService()
		```
		- #### id
		
		
		
		```
		public java.lang.String id()
		```
		
		Description copied from class: `[MessageDispatcher](MessageDispatcher.html#id())`
		Identifier of this dispatcher, corresponds to the full key
		 of the dispatcher configuration.
		
		Specified by:
		`[id](MessageDispatcher.html#id())` in class `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")`
		- #### registerForExecution
		
		
		
		```
		protected boolean registerForExecution​(akka.dispatch.Mailbox mbox,
		                                       boolean hasMessageHint,
		                                       boolean hasSystemMessageHint)
		```
		
		Returns if it was registered
		 
		 INTERNAL API
		
		
		
		Specified by:
		`[registerForExecution](MessageDispatcher.html#registerForExecution(akka.dispatch.Mailbox,boolean,boolean))` in class `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")`
		- #### shutdown
		
		
		
		```
		protected void shutdown()
		```
		
		INTERNAL API
		
		Specified by:
		`[shutdown](MessageDispatcher.html#shutdown())` in class `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")`
		- #### shutdownTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration shutdownTimeout()
		```
		
		Description copied from class: `[MessageDispatcher](MessageDispatcher.html#shutdownTimeout())`
		When the dispatcher no longer has any actors registered, how long will it wait until it shuts itself down,
		 defaulting to your akka configs "akka.actor.default\-dispatcher.shutdown\-timeout" or default specified in
		 reference.conf
		 
		 INTERNAL API
		
		
		
		Specified by:
		`[shutdownTimeout](MessageDispatcher.html#shutdownTimeout())` in class `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")`
		- #### systemDispatch
		
		
		
		```
		protected void systemDispatch​(akka.actor.ActorCell receiver,
		                              [SystemMessage](sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") invocation)
		```
		
		INTERNAL API
		
		Specified by:
		`[systemDispatch](MessageDispatcher.html#systemDispatch(akka.actor.ActorCell,akka.dispatch.sysmsg.SystemMessage))` in class `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")`
		- #### throughput
		
		
		
		```
		public int throughput()
		```
		
		Description copied from class: `[MessageDispatcher](MessageDispatcher.html#throughput())`
		INTERNAL API
		
		Specified by:
		`[throughput](MessageDispatcher.html#throughput())` in class `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")`
		- #### throughputDeadlineTime
		
		
		
		```
		public scala.concurrent.duration.Duration throughputDeadlineTime()
		```
		
		Description copied from class: `[MessageDispatcher](MessageDispatcher.html#throughputDeadlineTime())`
		INTERNAL API
		
		Specified by:
		`[throughputDeadlineTime](MessageDispatcher.html#throughputDeadlineTime())` in class `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Cell.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BatchingExecutor.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Dispatchers.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceDelegate.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceFactoryProvider.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MailboxType.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcherConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/PinnedDispatcher.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/TaskInvocation.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/SystemMessage.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/Dispatcher.html](https://doc.akka.io/japi/akka/current/akka/dispatch/Dispatcher.html)*
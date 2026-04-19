---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadDispatcher.html
title: CallingThreadDispatcher
---

# CallingThreadDispatcher

## Content

Package [akka.testkit](package-summary.html)
## Class CallingThreadDispatcher

- java.lang.Object
- - [akka.dispatch.MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")
	- - akka.testkit.CallingThreadDispatcher

- All Implemented Interfaces:
`[BatchingExecutor](../dispatch/BatchingExecutor.html "interface in akka.dispatch")`, `java.util.concurrent.Executor`, `scala.concurrent.ExecutionContext`, `scala.concurrent.ExecutionContextExecutor`

---

```
public class CallingThreadDispatcher
extends [MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")
```

Dispatcher which runs invocations on the current thread only. This
 dispatcher does not create any new threads, but it can be used from
 different threads concurrently for the same actor. The dispatch strategy is
 to run on the current thread unless the target actor is either suspendSwitch or
 already running on the current thread (if it is running on a different
 thread, then this thread will block until that other invocation is
 finished); if the invocation is not run, it is queued in a thread\-local
 queue to be executed once the active invocation further up the call stack
 finishes. This leads to completely deterministic execution order if only one
 thread is used.
 
 Suspending and resuming are global actions for one actor, meaning they can
 affect different threads, which leads to complications. If messages are
 queued (thread\-locally) during the suspendSwitch period, the only thread to run
 them upon resume is the thread actually calling the resume method. Hence,
 all thread\-local queues which are not currently being drained (possible,
 since suspend\-queue\-resume might happen entirely during an invocation on a
 different thread) are scooped up into the current thread\-local queue which
 is then executed. It is possible to suspend an actor from within its call
 stack.
 

Since:
1\.1

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.concurrent.ExecutionContext
		
		
		`scala.concurrent.ExecutionContext.Implicits$, scala.concurrent.ExecutionContext.parasitic$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CallingThreadDispatcher](#%3Cinit%3E(akka.dispatch.MessageDispatcherConfigurator))​([MessageDispatcherConfigurator](../dispatch/MessageDispatcherConfigurator.html "class in akka.dispatch") _configurator)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [CallingThreadMailbox](CallingThreadMailbox.html "class in akka.testkit")` | `[createMailbox](#createMailbox(akka.actor.Cell,akka.dispatch.MailboxType))​([Cell](../actor/Cell.html "interface in akka.actor") actor,  [MailboxType](../dispatch/MailboxType.html "interface in akka.dispatch") mailboxType)` |  |
	| `protected void` | `[dispatch](#dispatch(akka.actor.ActorCell,akka.dispatch.Envelope))​(akka.actor.ActorCell receiver,  [Envelope](../dispatch/Envelope.html "class in akka.dispatch") handle)` | Will be called when the dispatcher is to queue an invocation for execution |
	| `protected void` | `[executeTask](#executeTask(akka.dispatch.TaskInvocation))​([TaskInvocation](../dispatch/TaskInvocation.html "class in akka.dispatch") invocation)` | INTERNAL API |
	| `java.lang.String` | `[id](#id())()` | Identifier of this dispatcher, corresponds to the full key  of the dispatcher configuration. |
	| `static java.lang.String` | `[Id](#Id())()` |  |
	| `[LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event")` | `[log](#log())()` |  |
	| `protected void` | `[register](#register(akka.actor.ActorCell))​(akka.actor.ActorCell actor)` | If you override it, you must call it. |
	| `protected boolean` | `[registerForExecution](#registerForExecution(akka.dispatch.Mailbox,boolean,boolean))​(akka.dispatch.Mailbox mbox,  boolean hasMessageHint,  boolean hasSystemMessageHint)` | Suggest to register the provided mailbox for execution |
	| `protected void` | `[resume](#resume(akka.actor.ActorCell))​(akka.actor.ActorCell actor)` |  |
	| `protected void` | `[shutdown](#shutdown())()` | Called one time every time an actor is detached from this dispatcher and this dispatcher has no actors left attached  Must be idempotent |
	| `protected scala.concurrent.duration.FiniteDuration` | `[shutdownTimeout](#shutdownTimeout())()` | When the dispatcher no longer has any actors registered, how long will it wait until it shuts itself down,  defaulting to your akka configs "akka.actor.default\-dispatcher.shutdown\-timeout" or default specified in  reference.conf |
	| `protected void` | `[suspend](#suspend(akka.actor.ActorCell))​(akka.actor.ActorCell actor)` | After the call to this method, the dispatcher mustn't begin any new message processing for the specified reference |
	| `protected void` | `[systemDispatch](#systemDispatch(akka.actor.ActorCell,akka.dispatch.sysmsg.SystemMessage))​(akka.actor.ActorCell receiver,  [SystemMessage](../dispatch/sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") message)` | Will be called when the dispatcher is to queue an invocation for execution |
	| `protected int` | `[throughput](#throughput())()` | INTERNAL API |
	| `protected scala.concurrent.duration.FiniteDuration` | `[throughputDeadlineTime](#throughputDeadlineTime())()` | INTERNAL API |
	| `protected void` | `[unregister](#unregister(akka.actor.ActorCell))​(akka.actor.ActorCell actor)` | If you override it, you must call it. |
	
	
		- ### Methods inherited from class akka.dispatch.[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")
		
		
		`[actors](../dispatch/MessageDispatcher.html#actors()), [attach](../dispatch/MessageDispatcher.html#attach(akka.actor.ActorCell)), [configurator](../dispatch/MessageDispatcher.html#configurator()), [debug](../dispatch/MessageDispatcher.html#debug()), [detach](../dispatch/MessageDispatcher.html#detach(akka.actor.ActorCell)), [eventStream](../dispatch/MessageDispatcher.html#eventStream()), [inhabitants](../dispatch/MessageDispatcher.html#inhabitants()), [isThroughputDeadlineTimeDefined](../dispatch/MessageDispatcher.html#isThroughputDeadlineTimeDefined()), [mailboxes](../dispatch/MessageDispatcher.html#mailboxes()), [printActors](../dispatch/MessageDispatcher.html#printActors()), [reportFailure](../dispatch/MessageDispatcher.html#reportFailure(java.lang.Throwable)), [RESCHEDULED](../dispatch/MessageDispatcher.html#RESCHEDULED()), [resubmitOnBlock](../dispatch/MessageDispatcher.html#resubmitOnBlock()), [SCHEDULED](../dispatch/MessageDispatcher.html#SCHEDULED()), [unbatchedExecute](../dispatch/MessageDispatcher.html#unbatchedExecute(java.lang.Runnable)), [UNSCHEDULED](../dispatch/MessageDispatcher.html#UNSCHEDULED())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.dispatch.[BatchingExecutor](../dispatch/BatchingExecutor.html "interface in akka.dispatch")
		
		
		`[batchable](../dispatch/BatchingExecutor.html#batchable(java.lang.Runnable)), [execute](../dispatch/BatchingExecutor.html#execute(java.lang.Runnable))`
		- ### Methods inherited from interface scala.concurrent.ExecutionContext
		
		
		`execute, prepare`

- - ### Constructor Detail
	
	
	
		- #### CallingThreadDispatcher
		
		
		
		```
		public CallingThreadDispatcher​([MessageDispatcherConfigurator](../dispatch/MessageDispatcherConfigurator.html "class in akka.dispatch") _configurator)
		```

	- ### Method Detail
	
	
	
		- #### Id
		
		
		
		```
		public static java.lang.String Id()
		```
		- #### log
		
		
		
		```
		public [LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event") log()
		```
		- #### id
		
		
		
		```
		public java.lang.String id()
		```
		
		Description copied from class: `[MessageDispatcher](../dispatch/MessageDispatcher.html#id())`
		Identifier of this dispatcher, corresponds to the full key
		 of the dispatcher configuration.
		
		Specified by:
		`[id](../dispatch/MessageDispatcher.html#id())` in class `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")`
		- #### createMailbox
		
		
		
		```
		protected [CallingThreadMailbox](CallingThreadMailbox.html "class in akka.testkit") createMailbox​([Cell](../actor/Cell.html "interface in akka.actor") actor,
		                                             [MailboxType](../dispatch/MailboxType.html "interface in akka.dispatch") mailboxType)
		```
		- #### shutdown
		
		
		
		```
		protected void shutdown()
		```
		
		Description copied from class: `[MessageDispatcher](../dispatch/MessageDispatcher.html#shutdown())`
		Called one time every time an actor is detached from this dispatcher and this dispatcher has no actors left attached
		 Must be idempotent
		 
		 INTERNAL API
		
		
		
		Specified by:
		`[shutdown](../dispatch/MessageDispatcher.html#shutdown())` in class `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")`
		- #### throughput
		
		
		
		```
		protected int throughput()
		```
		
		Description copied from class: `[MessageDispatcher](../dispatch/MessageDispatcher.html#throughput())`
		INTERNAL API
		
		Specified by:
		`[throughput](../dispatch/MessageDispatcher.html#throughput())` in class `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")`
		- #### throughputDeadlineTime
		
		
		
		```
		protected scala.concurrent.duration.FiniteDuration throughputDeadlineTime()
		```
		
		Description copied from class: `[MessageDispatcher](../dispatch/MessageDispatcher.html#throughputDeadlineTime())`
		INTERNAL API
		
		Specified by:
		`[throughputDeadlineTime](../dispatch/MessageDispatcher.html#throughputDeadlineTime())` in class `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")`
		- #### registerForExecution
		
		
		
		```
		protected boolean registerForExecution​(akka.dispatch.Mailbox mbox,
		                                       boolean hasMessageHint,
		                                       boolean hasSystemMessageHint)
		```
		
		Description copied from class: `[MessageDispatcher](../dispatch/MessageDispatcher.html#registerForExecution(akka.dispatch.Mailbox,boolean,boolean))`
		Suggest to register the provided mailbox for execution
		 
		 INTERNAL API
		
		
		
		Specified by:
		`[registerForExecution](../dispatch/MessageDispatcher.html#registerForExecution(akka.dispatch.Mailbox,boolean,boolean))` in class `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")`
		- #### shutdownTimeout
		
		
		
		```
		protected scala.concurrent.duration.FiniteDuration shutdownTimeout()
		```
		
		Description copied from class: `[MessageDispatcher](../dispatch/MessageDispatcher.html#shutdownTimeout())`
		When the dispatcher no longer has any actors registered, how long will it wait until it shuts itself down,
		 defaulting to your akka configs "akka.actor.default\-dispatcher.shutdown\-timeout" or default specified in
		 reference.conf
		 
		 INTERNAL API
		
		
		
		Specified by:
		`[shutdownTimeout](../dispatch/MessageDispatcher.html#shutdownTimeout())` in class `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")`
		- #### register
		
		
		
		```
		protected void register​(akka.actor.ActorCell actor)
		```
		
		Description copied from class: `[MessageDispatcher](../dispatch/MessageDispatcher.html#register(akka.actor.ActorCell))`
		If you override it, you must call it. But only ever once. See "attach" for only invocation.
		 
		 INTERNAL API
		
		
		
		Overrides:
		`[register](../dispatch/MessageDispatcher.html#register(akka.actor.ActorCell))` in class `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")`
		- #### unregister
		
		
		
		```
		protected void unregister​(akka.actor.ActorCell actor)
		```
		
		Description copied from class: `[MessageDispatcher](../dispatch/MessageDispatcher.html#unregister(akka.actor.ActorCell))`
		If you override it, you must call it. But only ever once. See "detach" for the only invocation
		 
		 INTERNAL API
		
		
		
		Overrides:
		`[unregister](../dispatch/MessageDispatcher.html#unregister(akka.actor.ActorCell))` in class `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")`
		- #### suspend
		
		
		
		```
		protected void suspend​(akka.actor.ActorCell actor)
		```
		
		Description copied from class: `[MessageDispatcher](../dispatch/MessageDispatcher.html#suspend(akka.actor.ActorCell))`
		After the call to this method, the dispatcher mustn't begin any new message processing for the specified reference
		
		Overrides:
		`[suspend](../dispatch/MessageDispatcher.html#suspend(akka.actor.ActorCell))` in class `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")`
		- #### resume
		
		
		
		```
		protected void resume​(akka.actor.ActorCell actor)
		```
		
		
		Overrides:
		`[resume](../dispatch/MessageDispatcher.html#resume(akka.actor.ActorCell))` in class `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")`
		- #### systemDispatch
		
		
		
		```
		protected void systemDispatch​(akka.actor.ActorCell receiver,
		                              [SystemMessage](../dispatch/sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") message)
		```
		
		Description copied from class: `[MessageDispatcher](../dispatch/MessageDispatcher.html#systemDispatch(akka.actor.ActorCell,akka.dispatch.sysmsg.SystemMessage))`
		Will be called when the dispatcher is to queue an invocation for execution
		 
		 INTERNAL API
		
		
		
		Specified by:
		`[systemDispatch](../dispatch/MessageDispatcher.html#systemDispatch(akka.actor.ActorCell,akka.dispatch.sysmsg.SystemMessage))` in class `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")`
		- #### dispatch
		
		
		
		```
		protected void dispatch​(akka.actor.ActorCell receiver,
		                        [Envelope](../dispatch/Envelope.html "class in akka.dispatch") handle)
		```
		
		Description copied from class: `[MessageDispatcher](../dispatch/MessageDispatcher.html#dispatch(akka.actor.ActorCell,akka.dispatch.Envelope))`
		Will be called when the dispatcher is to queue an invocation for execution
		 
		 INTERNAL API
		
		
		
		Specified by:
		`[dispatch](../dispatch/MessageDispatcher.html#dispatch(akka.actor.ActorCell,akka.dispatch.Envelope))` in class `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")`
		- #### executeTask
		
		
		
		```
		protected void executeTask​([TaskInvocation](../dispatch/TaskInvocation.html "class in akka.dispatch") invocation)
		```
		
		Description copied from class: `[MessageDispatcher](../dispatch/MessageDispatcher.html#executeTask(akka.dispatch.TaskInvocation))`
		INTERNAL API
		
		Specified by:
		`[executeTask](../dispatch/MessageDispatcher.html#executeTask(akka.dispatch.TaskInvocation))` in class `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Cell.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BatchingExecutor.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MailboxType.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageDispatcherConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/TaskInvocation.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/SystemMessage.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadMailbox.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadDispatcher.html](https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadDispatcher.html)*
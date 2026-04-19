---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:45:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcher.html
title: MessageDispatcher
---

# MessageDispatcher

## Content

Package [akka.dispatch](package-summary.html)
## Class MessageDispatcher

- java.lang.Object
- - akka.dispatch.MessageDispatcher

- All Implemented Interfaces:
`[BatchingExecutor](BatchingExecutor.html "interface in akka.dispatch")`, `java.util.concurrent.Executor`, `scala.concurrent.ExecutionContext`, `scala.concurrent.ExecutionContextExecutor`

Direct Known Subclasses:
`[CallingThreadDispatcher](../testkit/CallingThreadDispatcher.html "class in akka.testkit")`, `[Dispatcher](Dispatcher.html "class in akka.dispatch")`

---

```
public abstract class MessageDispatcher
extends java.lang.Object
implements [BatchingExecutor](BatchingExecutor.html "interface in akka.dispatch"), scala.concurrent.ExecutionContextExecutor
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.concurrent.ExecutionContext
		
		
		`scala.concurrent.ExecutionContext.Implicits$, scala.concurrent.ExecutionContext.parasitic$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageDispatcher](#%3Cinit%3E(akka.dispatch.MessageDispatcherConfigurator))​([MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch") configurator)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Index](../util/Index.html "class in akka.util")<[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch"),​[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[actors](#actors())()` |  |
	| `void` | `[attach](#attach(akka.actor.ActorCell))​(akka.actor.ActorCell actor)` | Attaches the specified actor instance to this dispatcher, which includes  scheduling it to run for the first time (Create() is expected to have  been enqueued by the ActorCell upon mailbox creation). |
	| `[MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch")` | `[configurator](#configurator())()` |  |
	| `protected abstract akka.dispatch.Mailbox` | `[createMailbox](#createMailbox(akka.actor.Cell,akka.dispatch.MailboxType))​([Cell](../actor/Cell.html "interface in akka.actor") actor,  [MailboxType](MailboxType.html "interface in akka.dispatch") mailboxType)` | Creates and returns a mailbox for the given actor. |
	| `static boolean` | `[debug](#debug())()` |  |
	| `void` | `[detach](#detach(akka.actor.ActorCell))​(akka.actor.ActorCell actor)` | Detaches the specified actor instance from this dispatcher |
	| `protected abstract void` | `[dispatch](#dispatch(akka.actor.ActorCell,akka.dispatch.Envelope))​(akka.actor.ActorCell receiver,  [Envelope](Envelope.html "class in akka.dispatch") invocation)` | Will be called when the dispatcher is to queue an invocation for execution |
	| `[EventStream](../event/EventStream.html "class in akka.event")` | `[eventStream](#eventStream())()` |  |
	| `protected abstract void` | `[executeTask](#executeTask(akka.dispatch.TaskInvocation))​([TaskInvocation](TaskInvocation.html "class in akka.dispatch") invocation)` | INTERNAL API |
	| `abstract java.lang.String` | `[id](#id())()` | Identifier of this dispatcher, corresponds to the full key  of the dispatcher configuration. |
	| `long` | `[inhabitants](#inhabitants())()` |  |
	| `protected boolean` | `[isThroughputDeadlineTimeDefined](#isThroughputDeadlineTimeDefined())()` | INTERNAL API |
	| `akka.dispatch.Mailboxes` | `[mailboxes](#mailboxes())()` |  |
	| `static void` | `[printActors](#printActors())()` |  |
	| `protected void` | `[register](#register(akka.actor.ActorCell))​(akka.actor.ActorCell actor)` | If you override it, you must call it. |
	| `protected abstract boolean` | `[registerForExecution](#registerForExecution(akka.dispatch.Mailbox,boolean,boolean))​(akka.dispatch.Mailbox mbox,  boolean hasMessageHint,  boolean hasSystemMessageHint)` | Suggest to register the provided mailbox for execution |
	| `void` | `[reportFailure](#reportFailure(java.lang.Throwable))​(java.lang.Throwable t)` |  |
	| `static int` | `[RESCHEDULED](#RESCHEDULED())()` |  |
	| `protected boolean` | `[resubmitOnBlock](#resubmitOnBlock())()` |  |
	| `protected void` | `[resume](#resume(akka.actor.ActorCell))​(akka.actor.ActorCell actor)` |  |
	| `static int` | `[SCHEDULED](#SCHEDULED())()` |  |
	| `protected abstract void` | `[shutdown](#shutdown())()` | Called one time every time an actor is detached from this dispatcher and this dispatcher has no actors left attached  Must be idempotent |
	| `protected abstract scala.concurrent.duration.FiniteDuration` | `[shutdownTimeout](#shutdownTimeout())()` | When the dispatcher no longer has any actors registered, how long will it wait until it shuts itself down,  defaulting to your akka configs "akka.actor.default\-dispatcher.shutdown\-timeout" or default specified in  reference.conf |
	| `protected void` | `[suspend](#suspend(akka.actor.ActorCell))​(akka.actor.ActorCell actor)` | After the call to this method, the dispatcher mustn't begin any new message processing for the specified reference |
	| `protected abstract void` | `[systemDispatch](#systemDispatch(akka.actor.ActorCell,akka.dispatch.sysmsg.SystemMessage))​(akka.actor.ActorCell receiver,  [SystemMessage](sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") invocation)` | Will be called when the dispatcher is to queue an invocation for execution |
	| `protected abstract int` | `[throughput](#throughput())()` | INTERNAL API |
	| `protected abstract scala.concurrent.duration.Duration` | `[throughputDeadlineTime](#throughputDeadlineTime())()` | INTERNAL API |
	| `protected void` | `[unbatchedExecute](#unbatchedExecute(java.lang.Runnable))​(java.lang.Runnable r)` |  |
	| `protected void` | `[unregister](#unregister(akka.actor.ActorCell))​(akka.actor.ActorCell actor)` | If you override it, you must call it. |
	| `static int` | `[UNSCHEDULED](#UNSCHEDULED())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.dispatch.[BatchingExecutor](BatchingExecutor.html "interface in akka.dispatch")
		
		
		`[batchable](BatchingExecutor.html#batchable(java.lang.Runnable)), [execute](BatchingExecutor.html#execute(java.lang.Runnable))`
		- ### Methods inherited from interface scala.concurrent.ExecutionContext
		
		
		`execute, prepare`

- - ### Constructor Detail
	
	
	
		- #### MessageDispatcher
		
		
		
		```
		public MessageDispatcher​([MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch") configurator)
		```

	- ### Method Detail
	
	
	
		- #### UNSCHEDULED
		
		
		
		```
		public static int UNSCHEDULED()
		```
		- #### SCHEDULED
		
		
		
		```
		public static int SCHEDULED()
		```
		- #### RESCHEDULED
		
		
		
		```
		public static int RESCHEDULED()
		```
		- #### debug
		
		
		
		```
		public static final boolean debug()
		```
		- #### actors
		
		
		
		```
		public static [Index](../util/Index.html "class in akka.util")<[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch"),​[ActorRef](../actor/ActorRef.html "class in akka.actor")> actors()
		```
		- #### printActors
		
		
		
		```
		public static void printActors()
		```
		- #### configurator
		
		
		
		```
		public [MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch") configurator()
		```
		- #### mailboxes
		
		
		
		```
		public akka.dispatch.Mailboxes mailboxes()
		```
		- #### eventStream
		
		
		
		```
		public [EventStream](../event/EventStream.html "class in akka.event") eventStream()
		```
		- #### inhabitants
		
		
		
		```
		public final long inhabitants()
		```
		- #### createMailbox
		
		
		
		```
		protected abstract akka.dispatch.Mailbox createMailbox​([Cell](../actor/Cell.html "interface in akka.actor") actor,
		                                                       [MailboxType](MailboxType.html "interface in akka.dispatch") mailboxType)
		```
		
		Creates and returns a mailbox for the given actor.
		- #### id
		
		
		
		```
		public abstract java.lang.String id()
		```
		
		Identifier of this dispatcher, corresponds to the full key
		 of the dispatcher configuration.
		- #### attach
		
		
		
		```
		public final void attach​(akka.actor.ActorCell actor)
		```
		
		Attaches the specified actor instance to this dispatcher, which includes
		 scheduling it to run for the first time (Create() is expected to have
		 been enqueued by the ActorCell upon mailbox creation).
		- #### detach
		
		
		
		```
		public final void detach​(akka.actor.ActorCell actor)
		```
		
		Detaches the specified actor instance from this dispatcher
		- #### resubmitOnBlock
		
		
		
		```
		protected final boolean resubmitOnBlock()
		```
		
		
		Specified by:
		`[resubmitOnBlock](BatchingExecutor.html#resubmitOnBlock())` in interface `[BatchingExecutor](BatchingExecutor.html "interface in akka.dispatch")`
		- #### unbatchedExecute
		
		
		
		```
		protected final void unbatchedExecute​(java.lang.Runnable r)
		```
		
		
		Specified by:
		`[unbatchedExecute](BatchingExecutor.html#unbatchedExecute(java.lang.Runnable))` in interface `[BatchingExecutor](BatchingExecutor.html "interface in akka.dispatch")`
		- #### reportFailure
		
		
		
		```
		public void reportFailure​(java.lang.Throwable t)
		```
		
		
		Specified by:
		`reportFailure` in interface `scala.concurrent.ExecutionContext`
		- #### register
		
		
		
		```
		protected void register​(akka.actor.ActorCell actor)
		```
		
		If you override it, you must call it. But only ever once. See "attach" for only invocation.
		 
		 INTERNAL API
		- #### unregister
		
		
		
		```
		protected void unregister​(akka.actor.ActorCell actor)
		```
		
		If you override it, you must call it. But only ever once. See "detach" for the only invocation
		 
		 INTERNAL API
		- #### shutdownTimeout
		
		
		
		```
		protected abstract scala.concurrent.duration.FiniteDuration shutdownTimeout()
		```
		
		When the dispatcher no longer has any actors registered, how long will it wait until it shuts itself down,
		 defaulting to your akka configs "akka.actor.default\-dispatcher.shutdown\-timeout" or default specified in
		 reference.conf
		 
		 INTERNAL API
		- #### suspend
		
		
		
		```
		protected void suspend​(akka.actor.ActorCell actor)
		```
		
		After the call to this method, the dispatcher mustn't begin any new message processing for the specified reference
		- #### resume
		
		
		
		```
		protected void resume​(akka.actor.ActorCell actor)
		```
		- #### systemDispatch
		
		
		
		```
		protected abstract void systemDispatch​(akka.actor.ActorCell receiver,
		                                       [SystemMessage](sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") invocation)
		```
		
		Will be called when the dispatcher is to queue an invocation for execution
		 
		 INTERNAL API
		- #### dispatch
		
		
		
		```
		protected abstract void dispatch​(akka.actor.ActorCell receiver,
		                                 [Envelope](Envelope.html "class in akka.dispatch") invocation)
		```
		
		Will be called when the dispatcher is to queue an invocation for execution
		 
		 INTERNAL API
		- #### registerForExecution
		
		
		
		```
		protected abstract boolean registerForExecution​(akka.dispatch.Mailbox mbox,
		                                                boolean hasMessageHint,
		                                                boolean hasSystemMessageHint)
		```
		
		Suggest to register the provided mailbox for execution
		 
		 INTERNAL API
		- #### throughput
		
		
		
		```
		protected abstract int throughput()
		```
		
		INTERNAL API
		- #### throughputDeadlineTime
		
		
		
		```
		protected abstract scala.concurrent.duration.Duration throughputDeadlineTime()
		```
		
		INTERNAL API
		- #### isThroughputDeadlineTimeDefined
		
		
		
		```
		protected final boolean isThroughputDeadlineTimeDefined()
		```
		
		INTERNAL API
		- #### executeTask
		
		
		
		```
		protected abstract void executeTask​([TaskInvocation](TaskInvocation.html "class in akka.dispatch") invocation)
		```
		
		INTERNAL API
		- #### shutdown
		
		
		
		```
		protected abstract void shutdown()
		```
		
		Called one time every time an actor is detached from this dispatcher and this dispatcher has no actors left attached
		 Must be idempotent
		 
		 INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Cell.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BatchingExecutor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Dispatcher.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MailboxType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcherConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/TaskInvocation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/sysmsg/SystemMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/CallingThreadDispatcher.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Index.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcher.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcher.html)*
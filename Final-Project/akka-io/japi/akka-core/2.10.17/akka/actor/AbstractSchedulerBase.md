---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractSchedulerBase.html
title: AbstractSchedulerBase
---

# AbstractSchedulerBase

## Content

Package [akka.actor](package-summary.html)
## Class AbstractSchedulerBase

- java.lang.Object
- - akka.actor.AbstractSchedulerBase

- All Implemented Interfaces:
`[Scheduler](Scheduler.html "interface in akka.actor")`

Direct Known Subclasses:
`[AbstractScheduler](AbstractScheduler.html "class in akka.actor")`

---

```
public abstract class AbstractSchedulerBase
extends java.lang.Object
implements [Scheduler](Scheduler.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Scheduler](Scheduler.html "interface in akka.actor")
		
		
		`[Scheduler.TaskRunOnClose](Scheduler.TaskRunOnClose.html "interface in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractSchedulerBase](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Scheduler](Scheduler.html "interface in akka.actor")
		
		
		`[maxFrequency](Scheduler.html#maxFrequency()), [schedule](Scheduler.html#schedule(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [schedule](Scheduler.html#schedule(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [schedule](Scheduler.html#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [schedule](Scheduler.html#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [schedule](Scheduler.html#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Function0,scala.concurrent.ExecutionContext)), [schedule$default$6](Scheduler.html#schedule$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object)), [scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleAtFixedRate$default$6](Scheduler.html#scheduleAtFixedRate$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object)), [scheduleOnce](Scheduler.html#scheduleOnce(java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleOnce](Scheduler.html#scheduleOnce(java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleOnce](Scheduler.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleOnce](Scheduler.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleOnce](Scheduler.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,scala.Function0,scala.concurrent.ExecutionContext)), [scheduleOnce$default$5](Scheduler.html#scheduleOnce$default$5(scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object)), [scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleWithFixedDelay$default$6](Scheduler.html#scheduleWithFixedDelay$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### AbstractSchedulerBase
		
		
		
		```
		public AbstractSchedulerBase()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractScheduler.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Scheduler.TaskRunOnClose.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractSchedulerBase.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractSchedulerBase.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/ClusterMetricsStrategy.html
title: ClusterMetricsStrategy
---

# ClusterMetricsStrategy

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class ClusterMetricsStrategy

- java.lang.Object
- - [akka.actor.SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor")
	- - [akka.actor.OneForOneStrategy](../../actor/OneForOneStrategy.html "class in akka.actor")
		- - akka.cluster.metrics.ClusterMetricsStrategy

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class ClusterMetricsStrategy
extends [OneForOneStrategy](../../actor/OneForOneStrategy.html "class in akka.actor")
```

Default `ClusterMetricsSupervisor` strategy:
 A configurable [`OneForOneStrategy`](../../actor/OneForOneStrategy.html "class in akka.actor") with restart\-on\-throwable decider.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.ClusterMetricsStrategy)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor")
		
		
		`[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor"), [SupervisorStrategy.Escalate$](../../actor/SupervisorStrategy.Escalate$.html "class in akka.actor"), [SupervisorStrategy.Restart$](../../actor/SupervisorStrategy.Restart$.html "class in akka.actor"), [SupervisorStrategy.Resume$](../../actor/SupervisorStrategy.Resume$.html "class in akka.actor"), [SupervisorStrategy.Stop$](../../actor/SupervisorStrategy.Stop$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterMetricsStrategy](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[metricsDecider](#metricsDecider())()` | [`SupervisorStrategy`](../../actor/SupervisorStrategy.html "class in akka.actor") `Decider` which allows to survive intermittent Sigar native method calls failures. |
	
	
		- ### Methods inherited from class akka.actor.[OneForOneStrategy](../../actor/OneForOneStrategy.html "class in akka.actor")
		
		
		`[$lessinit$greater$default$1](../../actor/OneForOneStrategy.html#$lessinit$greater$default$1()), [$lessinit$greater$default$2](../../actor/OneForOneStrategy.html#$lessinit$greater$default$2()), [$lessinit$greater$default$3](../../actor/OneForOneStrategy.html#$lessinit$greater$default$3()), [apply](../../actor/OneForOneStrategy.html#apply(int,scala.concurrent.duration.Duration,boolean,scala.PartialFunction)), [apply$default$1](../../actor/OneForOneStrategy.html#apply$default$1()), [apply$default$2](../../actor/OneForOneStrategy.html#apply$default$2()), [apply$default$3](../../actor/OneForOneStrategy.html#apply$default$3()), [canEqual](../../actor/OneForOneStrategy.html#canEqual(java.lang.Object)), [copy](../../actor/OneForOneStrategy.html#copy(int,scala.concurrent.duration.Duration,boolean,scala.PartialFunction)), [copy$default$1](../../actor/OneForOneStrategy.html#copy$default$1()), [copy$default$2](../../actor/OneForOneStrategy.html#copy$default$2()), [copy$default$3](../../actor/OneForOneStrategy.html#copy$default$3()), [decider](../../actor/OneForOneStrategy.html#decider()), [equals](../../actor/OneForOneStrategy.html#equals(java.lang.Object)), [handleChildTerminated](../../actor/OneForOneStrategy.html#handleChildTerminated(akka.actor.ActorContext,akka.actor.ActorRef,scala.collection.Iterable)), [hashCode](../../actor/OneForOneStrategy.html#hashCode()), [loggingEnabled](../../actor/OneForOneStrategy.html#loggingEnabled()), [maxNrOfRetries](../../actor/OneForOneStrategy.html#maxNrOfRetries()), [processFailure](../../actor/OneForOneStrategy.html#processFailure(akka.actor.ActorContext,boolean,akka.actor.ActorRef,java.lang.Throwable,akka.actor.ChildRestartStats,scala.collection.Iterable)), [productArity](../../actor/OneForOneStrategy.html#productArity()), [productElement](../../actor/OneForOneStrategy.html#productElement(int)), [productElementName](../../actor/OneForOneStrategy.html#productElementName(int)), [productIterator](../../actor/OneForOneStrategy.html#productIterator()), [productPrefix](../../actor/OneForOneStrategy.html#productPrefix()), [toString](../../actor/OneForOneStrategy.html#toString()), [unapply](../../actor/OneForOneStrategy.html#unapply(akka.actor.OneForOneStrategy)), [withinTimeRange](../../actor/OneForOneStrategy.html#withinTimeRange()), [withMaxNrOfRetries](../../actor/OneForOneStrategy.html#withMaxNrOfRetries(int))`
		- ### Methods inherited from class akka.actor.[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor")
		
		
		`[defaultDecider](../../actor/SupervisorStrategy.html#defaultDecider()), [defaultStrategy](../../actor/SupervisorStrategy.html#defaultStrategy()), [escalate](../../actor/SupervisorStrategy.html#escalate()), [handleFailure](../../actor/SupervisorStrategy.html#handleFailure(akka.actor.ActorContext,akka.actor.ActorRef,java.lang.Throwable,akka.actor.ChildRestartStats,scala.collection.Iterable)), [logFailure](../../actor/SupervisorStrategy.html#logFailure(akka.actor.ActorContext,akka.actor.ActorRef,java.lang.Throwable,akka.actor.SupervisorStrategy.Directive)), [makeDecider](../../actor/SupervisorStrategy.html#makeDecider(akka.japi.Function)), [makeDecider](../../actor/SupervisorStrategy.html#makeDecider(java.lang.Iterable)), [makeDecider](../../actor/SupervisorStrategy.html#makeDecider(scala.collection.immutable.Seq)), [makeDecider](../../actor/SupervisorStrategy.html#makeDecider(scala.collection.Iterable)), [restart](../../actor/SupervisorStrategy.html#restart()), [restart](../../actor/SupervisorStrategy.html#restart(akka.event.Logging.LogLevel)), [restartChild](../../actor/SupervisorStrategy.html#restartChild(akka.actor.ActorRef,java.lang.Throwable,boolean)), [resume](../../actor/SupervisorStrategy.html#resume()), [resume](../../actor/SupervisorStrategy.html#resume(akka.event.Logging.LogLevel)), [resumeChild](../../actor/SupervisorStrategy.html#resumeChild(akka.actor.ActorRef,java.lang.Throwable)), [seqCauseDirective2Decider](../../actor/SupervisorStrategy.html#seqCauseDirective2Decider(scala.collection.Iterable)), [seqThrowable2Decider](../../actor/SupervisorStrategy.html#seqThrowable2Decider(scala.collection.immutable.Seq)), [stop](../../actor/SupervisorStrategy.html#stop()), [stop](../../actor/SupervisorStrategy.html#stop(akka.event.Logging.LogLevel)), [stoppingStrategy](../../actor/SupervisorStrategy.html#stoppingStrategy())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ClusterMetricsStrategy
		
		
		
		```
		public ClusterMetricsStrategy​(com.typesafe.config.Config config)
		```

	- ### Method Detail
	
	
	
		- #### metricsDecider
		
		
		
		```
		public static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")> metricsDecider()
		```
		
		[`SupervisorStrategy`](../../actor/SupervisorStrategy.html "class in akka.actor") `Decider` which allows to survive intermittent Sigar native method calls failures.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/OneForOneStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.Directive.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.Escalate$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.Restart$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.Resume$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.Stop$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/ClusterMetricsStrategy.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/ClusterMetricsStrategy.html)*
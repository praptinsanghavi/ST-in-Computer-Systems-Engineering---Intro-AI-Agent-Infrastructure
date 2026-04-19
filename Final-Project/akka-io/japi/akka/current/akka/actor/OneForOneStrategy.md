---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:50:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/OneForOneStrategy.html
title: OneForOneStrategy
---

# OneForOneStrategy

## Content

Package [akka.actor](package-summary.html)
## Class OneForOneStrategy

- java.lang.Object
- - [akka.actor.SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")
	- - akka.actor.OneForOneStrategy

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Direct Known Subclasses:
`[ClusterMetricsStrategy](../cluster/metrics/ClusterMetricsStrategy.html "class in akka.cluster.metrics")`

---

```
public class OneForOneStrategy
extends [SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")
implements scala.Product, java.io.Serializable
```

Applies the fault handling `Directive` (Resume, Restart, Stop) specified in the `Decider`
 to the child actor that failed, as opposed to [`AllForOneStrategy`](AllForOneStrategy.html "class in akka.actor") that applies
 it to all children.
 
 param: maxNrOfRetries the number of times a child actor is allowed to be restarted, negative value means no limit
 if the duration is infinite. If the limit is exceeded the child actor is stopped
 param: withinTimeRange duration of the time window for maxNrOfRetries, Duration.Inf means no window
 param: decider mapping from Throwable to [`SupervisorStrategy.Directive`](SupervisorStrategy.Directive.html "interface in akka.actor"), you can also use a
 `Seq` of Throwables which maps the given Throwables to restarts, otherwise escalates.
 param: loggingEnabled the strategy logs the failure if this is enabled (true), by default it is enabled

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.OneForOneStrategy)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")
		
		
		`[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor"), [SupervisorStrategy.Escalate$](SupervisorStrategy.Escalate$.html "class in akka.actor"), [SupervisorStrategy.Restart$](SupervisorStrategy.Restart$.html "class in akka.actor"), [SupervisorStrategy.Resume$](SupervisorStrategy.Resume$.html "class in akka.actor"), [SupervisorStrategy.Stop$](SupervisorStrategy.Stop$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OneForOneStrategy](#%3Cinit%3E(boolean,scala.PartialFunction))​(boolean loggingEnabled,  scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)` |  |
	| `[OneForOneStrategy](#%3Cinit%3E(int,java.time.Duration,akka.japi.Function))​(int maxNrOfRetries,  java.time.Duration withinTimeRange,  [Function](../japi/Function.html "interface in akka.japi")<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)` | Java API |
	| `[OneForOneStrategy](#%3Cinit%3E(int,java.time.Duration,akka.japi.Function,boolean))​(int maxNrOfRetries,  java.time.Duration withinTimeRange,  [Function](../japi/Function.html "interface in akka.japi")<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider,  boolean loggingEnabled)` | Java API |
	| `[OneForOneStrategy](#%3Cinit%3E(int,java.time.Duration,java.lang.Iterable))​(int maxNrOfRetries,  java.time.Duration withinTimeRange,  java.lang.Iterable<java.lang.Class<? extends java.lang.Throwable>> trapExit)` | Java API |
	| `[OneForOneStrategy](#%3Cinit%3E(int,java.time.Duration,scala.PartialFunction))​(int maxNrOfRetries,  java.time.Duration withinTimeRange,  scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)` | Java API: compatible with lambda expressions |
	| `[OneForOneStrategy](#%3Cinit%3E(int,scala.concurrent.duration.Duration,boolean,scala.PartialFunction))​(int maxNrOfRetries,  scala.concurrent.duration.Duration withinTimeRange,  boolean loggingEnabled,  scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)` |  |
	| `[OneForOneStrategy](#%3Cinit%3E(int,scala.concurrent.duration.Duration,akka.japi.Function))​(int maxNrOfRetries,  scala.concurrent.duration.Duration withinTimeRange,  [Function](../japi/Function.html "interface in akka.japi")<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)` | Java API |
	| `[OneForOneStrategy](#%3Cinit%3E(int,scala.concurrent.duration.Duration,akka.japi.Function,boolean))​(int maxNrOfRetries,  scala.concurrent.duration.Duration withinTimeRange,  [Function](../japi/Function.html "interface in akka.japi")<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider,  boolean loggingEnabled)` | Java API |
	| `[OneForOneStrategy](#%3Cinit%3E(int,scala.concurrent.duration.Duration,java.lang.Iterable))​(int maxNrOfRetries,  scala.concurrent.duration.Duration withinTimeRange,  java.lang.Iterable<java.lang.Class<? extends java.lang.Throwable>> trapExit)` | Java API |
	| `[OneForOneStrategy](#%3Cinit%3E(int,scala.concurrent.duration.Duration,scala.PartialFunction))​(int maxNrOfRetries,  scala.concurrent.duration.Duration withinTimeRange,  scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)` | Java API: compatible with lambda expressions |
	| `[OneForOneStrategy](#%3Cinit%3E(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)` | Java API: Restart an infinite number of times. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static int` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `static scala.concurrent.duration.Duration` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static boolean` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static [OneForOneStrategy](OneForOneStrategy.html "class in akka.actor")` | `[apply](#apply(int,scala.concurrent.duration.Duration,boolean,scala.PartialFunction))​(int maxNrOfRetries,  scala.concurrent.duration.Duration withinTimeRange,  boolean loggingEnabled,  scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)` |  |
	| `static int` | `[apply$default$1](#apply$default$1())()` |  |
	| `static scala.concurrent.duration.Duration` | `[apply$default$2](#apply$default$2())()` |  |
	| `static boolean` | `[apply$default$3](#apply$default$3())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[OneForOneStrategy](OneForOneStrategy.html "class in akka.actor")` | `[copy](#copy(int,scala.concurrent.duration.Duration,boolean,scala.PartialFunction))​(int maxNrOfRetries,  scala.concurrent.duration.Duration withinTimeRange,  boolean loggingEnabled,  scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)` |  |
	| `int` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.concurrent.duration.Duration` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[copy$default$3](#copy$default$3())()` |  |
	| `scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[decider](#decider())()` | Returns the Decider that is associated with this SupervisorStrategy. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `void` | `[handleChildTerminated](#handleChildTerminated(akka.actor.ActorContext,akka.actor.ActorRef,scala.collection.Iterable))​([ActorContext](ActorContext.html "interface in akka.actor") context,  [ActorRef](ActorRef.html "class in akka.actor") child,  scala.collection.Iterable<[ActorRef](ActorRef.html "class in akka.actor")> children)` | This method is called after the child has been removed from the set of children. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[loggingEnabled](#loggingEnabled())()` | Logging of actor failures is done when this is `true`. |
	| `int` | `[maxNrOfRetries](#maxNrOfRetries())()` |  |
	| `void` | `[processFailure](#processFailure(akka.actor.ActorContext,boolean,akka.actor.ActorRef,java.lang.Throwable,akka.actor.ChildRestartStats,scala.collection.Iterable))​([ActorContext](ActorContext.html "interface in akka.actor") context,  boolean restart,  [ActorRef](ActorRef.html "class in akka.actor") child,  java.lang.Throwable cause,  [ChildRestartStats](ChildRestartStats.html "class in akka.actor") stats,  scala.collection.Iterable<[ChildRestartStats](ChildRestartStats.html "class in akka.actor")> children)` | This method is called to act on the failure of a child: restart if the flag is true, stop otherwise. |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object>>` | `[unapply](#unapply(akka.actor.OneForOneStrategy))​([OneForOneStrategy](OneForOneStrategy.html "class in akka.actor") x$0)` |  |
	| `scala.concurrent.duration.Duration` | `[withinTimeRange](#withinTimeRange())()` |  |
	| `[OneForOneStrategy](OneForOneStrategy.html "class in akka.actor")` | `[withMaxNrOfRetries](#withMaxNrOfRetries(int))​(int maxNrOfRetries)` |  |
	
	
		- ### Methods inherited from class akka.actor.[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")
		
		
		`[defaultDecider](SupervisorStrategy.html#defaultDecider()), [defaultStrategy](SupervisorStrategy.html#defaultStrategy()), [escalate](SupervisorStrategy.html#escalate()), [handleFailure](SupervisorStrategy.html#handleFailure(akka.actor.ActorContext,akka.actor.ActorRef,java.lang.Throwable,akka.actor.ChildRestartStats,scala.collection.Iterable)), [logFailure](SupervisorStrategy.html#logFailure(akka.actor.ActorContext,akka.actor.ActorRef,java.lang.Throwable,akka.actor.SupervisorStrategy.Directive)), [makeDecider](SupervisorStrategy.html#makeDecider(akka.japi.Function)), [makeDecider](SupervisorStrategy.html#makeDecider(java.lang.Iterable)), [makeDecider](SupervisorStrategy.html#makeDecider(scala.collection.immutable.Seq)), [makeDecider](SupervisorStrategy.html#makeDecider(scala.collection.Iterable)), [restart](SupervisorStrategy.html#restart()), [restart](SupervisorStrategy.html#restart(akka.event.Logging.LogLevel)), [restartChild](SupervisorStrategy.html#restartChild(akka.actor.ActorRef,java.lang.Throwable,boolean)), [resume](SupervisorStrategy.html#resume()), [resume](SupervisorStrategy.html#resume(akka.event.Logging.LogLevel)), [resumeChild](SupervisorStrategy.html#resumeChild(akka.actor.ActorRef,java.lang.Throwable)), [seqCauseDirective2Decider](SupervisorStrategy.html#seqCauseDirective2Decider(scala.collection.Iterable)), [seqThrowable2Decider](SupervisorStrategy.html#seqThrowable2Decider(scala.collection.immutable.Seq)), [stop](SupervisorStrategy.html#stop()), [stop](SupervisorStrategy.html#stop(akka.event.Logging.LogLevel)), [stoppingStrategy](SupervisorStrategy.html#stoppingStrategy())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### OneForOneStrategy
		
		
		
		```
		public OneForOneStrategy​(int maxNrOfRetries,
		                         scala.concurrent.duration.Duration withinTimeRange,
		                         boolean loggingEnabled,
		                         scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)
		```
		- #### OneForOneStrategy
		
		
		
		```
		public OneForOneStrategy​(int maxNrOfRetries,
		                         scala.concurrent.duration.Duration withinTimeRange,
		                         [Function](../japi/Function.html "interface in akka.japi")<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider,
		                         boolean loggingEnabled)
		```
		
		Java API
		- #### OneForOneStrategy
		
		
		
		```
		public OneForOneStrategy​(int maxNrOfRetries,
		                         java.time.Duration withinTimeRange,
		                         [Function](../japi/Function.html "interface in akka.japi")<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider,
		                         boolean loggingEnabled)
		```
		
		Java API
		- #### OneForOneStrategy
		
		
		
		```
		public OneForOneStrategy​(int maxNrOfRetries,
		                         scala.concurrent.duration.Duration withinTimeRange,
		                         [Function](../japi/Function.html "interface in akka.japi")<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)
		```
		
		Java API
		- #### OneForOneStrategy
		
		
		
		```
		public OneForOneStrategy​(int maxNrOfRetries,
		                         java.time.Duration withinTimeRange,
		                         [Function](../japi/Function.html "interface in akka.japi")<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)
		```
		
		Java API
		- #### OneForOneStrategy
		
		
		
		```
		public OneForOneStrategy​(int maxNrOfRetries,
		                         scala.concurrent.duration.Duration withinTimeRange,
		                         java.lang.Iterable<java.lang.Class<? extends java.lang.Throwable>> trapExit)
		```
		
		Java API
		- #### OneForOneStrategy
		
		
		
		```
		public OneForOneStrategy​(int maxNrOfRetries,
		                         java.time.Duration withinTimeRange,
		                         java.lang.Iterable<java.lang.Class<? extends java.lang.Throwable>> trapExit)
		```
		
		Java API
		- #### OneForOneStrategy
		
		
		
		```
		public OneForOneStrategy​(int maxNrOfRetries,
		                         scala.concurrent.duration.Duration withinTimeRange,
		                         scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)
		```
		
		Java API: compatible with lambda expressions
		- #### OneForOneStrategy
		
		
		
		```
		public OneForOneStrategy​(int maxNrOfRetries,
		                         java.time.Duration withinTimeRange,
		                         scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)
		```
		
		Java API: compatible with lambda expressions
		- #### OneForOneStrategy
		
		
		
		```
		public OneForOneStrategy​(boolean loggingEnabled,
		                         scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)
		```
		- #### OneForOneStrategy
		
		
		
		```
		public OneForOneStrategy​(scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)
		```
		
		Java API: Restart an infinite number of times. Compatible with lambda expressions.

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public static int $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static scala.concurrent.duration.Duration $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static boolean $lessinit$greater$default$3()
		```
		- #### apply
		
		
		
		```
		public static [OneForOneStrategy](OneForOneStrategy.html "class in akka.actor") apply​(int maxNrOfRetries,
		                                      scala.concurrent.duration.Duration withinTimeRange,
		                                      boolean loggingEnabled,
		                                      scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)
		```
		- #### apply$default$1
		
		
		
		```
		public static int apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public static scala.concurrent.duration.Duration apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static boolean apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object>> unapply​([OneForOneStrategy](OneForOneStrategy.html "class in akka.actor") x$0)
		```
		- #### maxNrOfRetries
		
		
		
		```
		public int maxNrOfRetries()
		```
		- #### withinTimeRange
		
		
		
		```
		public scala.concurrent.duration.Duration withinTimeRange()
		```
		- #### loggingEnabled
		
		
		
		```
		public boolean loggingEnabled()
		```
		
		Description copied from class: `[SupervisorStrategy](SupervisorStrategy.html#loggingEnabled())`
		Logging of actor failures is done when this is `true`.
		
		Overrides:
		`[loggingEnabled](SupervisorStrategy.html#loggingEnabled())` in class `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")`
		- #### decider
		
		
		
		```
		public scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider()
		```
		
		Description copied from class: `[SupervisorStrategy](SupervisorStrategy.html#decider())`
		Returns the Decider that is associated with this SupervisorStrategy.
		 The Decider is invoked by the default implementation of `handleFailure`
		 to obtain the Directive to be applied.
		
		Specified by:
		`[decider](SupervisorStrategy.html#decider())` in class `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")`
		- #### withMaxNrOfRetries
		
		
		
		```
		public [OneForOneStrategy](OneForOneStrategy.html "class in akka.actor") withMaxNrOfRetries​(int maxNrOfRetries)
		```
		- #### handleChildTerminated
		
		
		
		```
		public void handleChildTerminated​([ActorContext](ActorContext.html "interface in akka.actor") context,
		                                  [ActorRef](ActorRef.html "class in akka.actor") child,
		                                  scala.collection.Iterable<[ActorRef](ActorRef.html "class in akka.actor")> children)
		```
		
		Description copied from class: `[SupervisorStrategy](SupervisorStrategy.html#handleChildTerminated(akka.actor.ActorContext,akka.actor.ActorRef,scala.collection.Iterable))`
		This method is called after the child has been removed from the set of children.
		 It does not need to do anything special. Exceptions thrown from this method
		 do NOT make the actor fail if this happens during termination.
		
		Specified by:
		`[handleChildTerminated](SupervisorStrategy.html#handleChildTerminated(akka.actor.ActorContext,akka.actor.ActorRef,scala.collection.Iterable))` in class `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")`
		- #### processFailure
		
		
		
		```
		public void processFailure​([ActorContext](ActorContext.html "interface in akka.actor") context,
		                           boolean restart,
		                           [ActorRef](ActorRef.html "class in akka.actor") child,
		                           java.lang.Throwable cause,
		                           [ChildRestartStats](ChildRestartStats.html "class in akka.actor") stats,
		                           scala.collection.Iterable<[ChildRestartStats](ChildRestartStats.html "class in akka.actor")> children)
		```
		
		Description copied from class: `[SupervisorStrategy](SupervisorStrategy.html#processFailure(akka.actor.ActorContext,boolean,akka.actor.ActorRef,java.lang.Throwable,akka.actor.ChildRestartStats,scala.collection.Iterable))`
		This method is called to act on the failure of a child: restart if the flag is true, stop otherwise.
		
		Specified by:
		`[processFailure](SupervisorStrategy.html#processFailure(akka.actor.ActorContext,boolean,akka.actor.ActorRef,java.lang.Throwable,akka.actor.ChildRestartStats,scala.collection.Iterable))` in class `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")`
		- #### copy
		
		
		
		```
		public [OneForOneStrategy](OneForOneStrategy.html "class in akka.actor") copy​(int maxNrOfRetries,
		                              scala.concurrent.duration.Duration withinTimeRange,
		                              boolean loggingEnabled,
		                              scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)
		```
		- #### copy$default$1
		
		
		
		```
		public int copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.concurrent.duration.Duration copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public boolean copy$default$3()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/AllForOneStrategy.html
- https://doc.akka.io/japi/akka/current/akka/actor/ChildRestartStats.html
- https://doc.akka.io/japi/akka/current/akka/actor/OneForOneStrategy.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.Directive.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.Escalate$.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.Restart$.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.Resume$.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.Stop$.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsStrategy.html
- https://doc.akka.io/japi/akka/current/akka/japi/Function.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/OneForOneStrategy.html](https://doc.akka.io/japi/akka/current/akka/actor/OneForOneStrategy.html)*
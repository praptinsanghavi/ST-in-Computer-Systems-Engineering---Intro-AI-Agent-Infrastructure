---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:51:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy$.html
title: SupervisorStrategy$
---

# SupervisorStrategy$

## Content

Package [akka.actor](package-summary.html)
## Class SupervisorStrategy$

- java.lang.Object
- - akka.actor.SupervisorStrategy$

- All Implemented Interfaces:
`[SupervisorStrategyLowPriorityImplicits](SupervisorStrategyLowPriorityImplicits.html "interface in akka.actor")`

---

```
public class SupervisorStrategy$
extends java.lang.Object
implements [SupervisorStrategyLowPriorityImplicits](SupervisorStrategyLowPriorityImplicits.html "interface in akka.actor")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SupervisorStrategy$](SupervisorStrategy$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SupervisorStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[defaultDecider](#defaultDecider())()` | When supervisorStrategy is not specified for an actor this  `Decider` is used by default in the supervisor strategy. |
	| `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")` | `[defaultStrategy](#defaultStrategy())()` | When supervisorStrategy is not specified for an actor this  is used by default. |
	| `[SupervisorStrategy.Escalate$](SupervisorStrategy.Escalate$.html "class in akka.actor")` | `[escalate](#escalate())()` | Java API: Returning this directive escalates the failure to the supervisor of the supervisor,  by rethrowing the cause of the failure, i.e. |
	| `scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[makeDecider](#makeDecider(akka.japi.Function))​([Function](../japi/Function.html "interface in akka.japi")<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> func)` | Converts a Java Decider into a Scala Decider |
	| `scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[makeDecider](#makeDecider(java.lang.Iterable))​(java.lang.Iterable<java.lang.Class<? extends java.lang.Throwable>> trapExit)` | Decider builder which just checks whether one of  the given Throwables matches the cause and restarts, otherwise escalates. |
	| `scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[makeDecider](#makeDecider(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Class<? extends java.lang.Throwable>> trapExit)` | Decider builder which just checks whether one of  the given Throwables matches the cause and restarts, otherwise escalates. |
	| `scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[makeDecider](#makeDecider(scala.collection.Iterable))​(scala.collection.Iterable<scala.Tuple2<java.lang.Class<? extends java.lang.Throwable>,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>> flat)` | Decider builder for Iterables of cause\-directive pairs, e.g. |
	| `[SupervisorStrategy.Restart$](SupervisorStrategy.Restart$.html "class in akka.actor")` | `[restart](#restart())()` | Java API: Returning this directive discards the old Actor instance and replaces it with a new,  then resumes message processing. |
	| `[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")` | `[restart](#restart(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)` | Returning this directive discards the old Actor instance and replaces it with a new,  then resumes message processing. |
	| `[SupervisorStrategy.Resume$](SupervisorStrategy.Resume$.html "class in akka.actor")` | `[resume](#resume())()` | Java API: Returning this directive resumes message processing for the failed Actor |
	| `[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")` | `[resume](#resume(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)` | Returning this directive resumes message processing for the failed Actor. |
	| `scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[seqThrowable2Decider](#seqThrowable2Decider(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Class<? extends java.lang.Throwable>> trapExit)` | Implicit conversion from `Seq` of Throwables to a `Decider`. |
	| `[SupervisorStrategy.Stop$](SupervisorStrategy.Stop$.html "class in akka.actor")` | `[stop](#stop())()` | Java API: Returning this directive stops the Actor |
	| `[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")` | `[stop](#stop(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)` | Returning this directive stops the Actor |
	| `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")` | `[stoppingStrategy](#stoppingStrategy())()` | This strategy resembles Erlang in that failing children are always  terminated (one\-for\-one). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[SupervisorStrategyLowPriorityImplicits](SupervisorStrategyLowPriorityImplicits.html "interface in akka.actor")
		
		
		`[seqCauseDirective2Decider](SupervisorStrategyLowPriorityImplicits.html#seqCauseDirective2Decider(scala.collection.Iterable))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SupervisorStrategy$](SupervisorStrategy$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SupervisorStrategy$
		
		
		
		```
		public SupervisorStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### resume
		
		
		
		```
		public [SupervisorStrategy.Resume$](SupervisorStrategy.Resume$.html "class in akka.actor") resume()
		```
		
		Java API: Returning this directive resumes message processing for the failed Actor
		- #### resume
		
		
		
		```
		public [SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor") resume​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)
		```
		
		Returning this directive resumes message processing for the failed Actor.
		 
		
		Parameters:
		`logLevel` \- Log level which will be used to log the failure
		- #### restart
		
		
		
		```
		public [SupervisorStrategy.Restart$](SupervisorStrategy.Restart$.html "class in akka.actor") restart()
		```
		
		Java API: Returning this directive discards the old Actor instance and replaces it with a new,
		 then resumes message processing.
		- #### restart
		
		
		
		```
		public [SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor") restart​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)
		```
		
		Returning this directive discards the old Actor instance and replaces it with a new,
		 then resumes message processing.
		 
		
		Parameters:
		`logLevel` \- Log level which will be used to log the failure
		- #### stop
		
		
		
		```
		public [SupervisorStrategy.Stop$](SupervisorStrategy.Stop$.html "class in akka.actor") stop()
		```
		
		Java API: Returning this directive stops the Actor
		- #### stop
		
		
		
		```
		public [SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor") stop​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)
		```
		
		Returning this directive stops the Actor
		 
		
		Parameters:
		`logLevel` \- Log level which will be used to log the failure
		- #### escalate
		
		
		
		```
		public [SupervisorStrategy.Escalate$](SupervisorStrategy.Escalate$.html "class in akka.actor") escalate()
		```
		
		Java API: Returning this directive escalates the failure to the supervisor of the supervisor,
		 by rethrowing the cause of the failure, i.e. the supervisor fails with
		 the same exception as the child.
		- #### defaultDecider
		
		
		
		```
		public final scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> defaultDecider()
		```
		
		When supervisorStrategy is not specified for an actor this
		 `Decider` is used by default in the supervisor strategy.
		 The child will be stopped when [`ActorInitializationException`](ActorInitializationException.html "class in akka.actor"),
		 [`ActorKilledException`](ActorKilledException.html "class in akka.actor"), or [`DeathPactException`](DeathPactException.html "class in akka.actor") is
		 thrown. It will be restarted for other `Exception` types.
		 The error is escalated if it's a `Throwable`, i.e. `Error`.
		- #### defaultStrategy
		
		
		
		```
		public final [SupervisorStrategy](SupervisorStrategy.html "class in akka.actor") defaultStrategy()
		```
		
		When supervisorStrategy is not specified for an actor this
		 is used by default. OneForOneStrategy with decider defined in
		 [`defaultDecider()`](#defaultDecider()).
		- #### stoppingStrategy
		
		
		
		```
		public final [SupervisorStrategy](SupervisorStrategy.html "class in akka.actor") stoppingStrategy()
		```
		
		This strategy resembles Erlang in that failing children are always
		 terminated (one\-for\-one).
		- #### seqThrowable2Decider
		
		
		
		```
		public scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> seqThrowable2Decider​(scala.collection.immutable.Seq<java.lang.Class<? extends java.lang.Throwable>> trapExit)
		```
		
		Implicit conversion from `Seq` of Throwables to a `Decider`.
		 This maps the given Throwables to restarts, otherwise escalates.
		- #### makeDecider
		
		
		
		```
		public scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> makeDecider​(scala.collection.immutable.Seq<java.lang.Class<? extends java.lang.Throwable>> trapExit)
		```
		
		Decider builder which just checks whether one of
		 the given Throwables matches the cause and restarts, otherwise escalates.
		- #### makeDecider
		
		
		
		```
		public scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> makeDecider​(java.lang.Iterable<java.lang.Class<? extends java.lang.Throwable>> trapExit)
		```
		
		Decider builder which just checks whether one of
		 the given Throwables matches the cause and restarts, otherwise escalates.
		- #### makeDecider
		
		
		
		```
		public scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> makeDecider​(scala.collection.Iterable<scala.Tuple2<java.lang.Class<? extends java.lang.Throwable>,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>> flat)
		```
		
		Decider builder for Iterables of cause\-directive pairs, e.g. a map obtained
		 from configuration; will sort the pairs so that the most specific type is
		 checked before all its subtypes, allowing carving out subtrees of the
		 Throwable hierarchy.
		- #### makeDecider
		
		
		
		```
		public scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> makeDecider​([Function](../japi/Function.html "interface in akka.japi")<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> func)
		```
		
		Converts a Java Decider into a Scala Decider

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorInitializationException.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorKilledException.html
- https://doc.akka.io/japi/akka/current/akka/actor/DeathPactException.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.Directive.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.Escalate$.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.Restart$.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.Resume$.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.Stop$.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategyLowPriorityImplicits.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka/current/akka/japi/Function.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy$.html](https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy$.html)*
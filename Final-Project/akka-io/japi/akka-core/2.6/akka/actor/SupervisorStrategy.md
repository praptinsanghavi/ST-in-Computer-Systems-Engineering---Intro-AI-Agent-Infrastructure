---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:17:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/actor/SupervisorStrategy.html
title: SupervisorStrategy
---

# SupervisorStrategy

## Content

Package [akka.actor](package-summary.html)
## Class SupervisorStrategy

- java.lang.Object
- - akka.actor.SupervisorStrategy

- Direct Known Subclasses:
`[AllForOneStrategy](AllForOneStrategy.html "class in akka.actor")`, `[OneForOneStrategy](OneForOneStrategy.html "class in akka.actor")`

---

```
public abstract class SupervisorStrategy
extends java.lang.Object
```

An Akka SupervisorStrategy is the policy to apply for crashing children.
 
**IMPORTANT:**

 You should not normally need to create new subclasses, instead use the
 existing [`OneForOneStrategy`](OneForOneStrategy.html "class in akka.actor") or [`AllForOneStrategy`](AllForOneStrategy.html "class in akka.actor"),
 but if you do, please read the docs of the methods below carefully, as
 incorrect implementations may lead to \&ldquo;blocked\&rdquo; actor systems (i.e.
 permanently suspended actors).

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")` |  |
	| `static class` | `[SupervisorStrategy.Escalate$](SupervisorStrategy.Escalate$.html "class in akka.actor")` | Escalates the failure to the supervisor of the supervisor,  by rethrowing the cause of the failure, i.e. |
	| `static class` | `[SupervisorStrategy.Restart$](SupervisorStrategy.Restart$.html "class in akka.actor")` | Discards the old Actor instance and replaces it with a new,  then resumes message processing. |
	| `static class` | `[SupervisorStrategy.Resume$](SupervisorStrategy.Resume$.html "class in akka.actor")` | Resumes message processing for the failed Actor |
	| `static class` | `[SupervisorStrategy.Stop$](SupervisorStrategy.Stop$.html "class in akka.actor")` | Stops the Actor |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SupervisorStrategy](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[decider](#decider())()` | Returns the Decider that is associated with this SupervisorStrategy. |
	| `static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[defaultDecider](#defaultDecider())()` | When supervisorStrategy is not specified for an actor this  `Decider` is used by default in the supervisor strategy. |
	| `static [SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")` | `[defaultStrategy](#defaultStrategy())()` | When supervisorStrategy is not specified for an actor this  is used by default. |
	| `static [SupervisorStrategy.Escalate$](SupervisorStrategy.Escalate$.html "class in akka.actor")` | `[escalate](#escalate())()` | Java API: Returning this directive escalates the failure to the supervisor of the supervisor,  by rethrowing the cause of the failure, i.e. |
	| `abstract void` | `[handleChildTerminated](#handleChildTerminated(akka.actor.ActorContext,akka.actor.ActorRef,scala.collection.Iterable))​([ActorContext](ActorContext.html "interface in akka.actor") context,  [ActorRef](ActorRef.html "class in akka.actor") child,  scala.collection.Iterable<[ActorRef](ActorRef.html "class in akka.actor")> children)` | This method is called after the child has been removed from the set of children. |
	| `boolean` | `[handleFailure](#handleFailure(akka.actor.ActorContext,akka.actor.ActorRef,java.lang.Throwable,akka.actor.ChildRestartStats,scala.collection.Iterable))​([ActorContext](ActorContext.html "interface in akka.actor") context,  [ActorRef](ActorRef.html "class in akka.actor") child,  java.lang.Throwable cause,  [ChildRestartStats](ChildRestartStats.html "class in akka.actor") stats,  scala.collection.Iterable<[ChildRestartStats](ChildRestartStats.html "class in akka.actor")> children)` | This is the main entry point: in case of a child\&rsquo;s failure, this method  must try to handle the failure by resuming, restarting or stopping the  child (and returning `true`), or it returns `false` to escalate the  failure, which will lead to this actor re\-throwing the exception which  caused the failure. |
	| `void` | `[logFailure](#logFailure(akka.actor.ActorContext,akka.actor.ActorRef,java.lang.Throwable,akka.actor.SupervisorStrategy.Directive))​([ActorContext](ActorContext.html "interface in akka.actor") context,  [ActorRef](ActorRef.html "class in akka.actor") child,  java.lang.Throwable cause,  [SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor") decision)` | Default logging of actor failures when  [`loggingEnabled()`](#loggingEnabled()) is `true`. |
	| `protected boolean` | `[loggingEnabled](#loggingEnabled())()` | Logging of actor failures is done when this is `true`. |
	| `static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[makeDecider](#makeDecider(akka.japi.Function))​([Function](../japi/Function.html "interface in akka.japi")<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> func)` | Converts a Java Decider into a Scala Decider |
	| `static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[makeDecider](#makeDecider(java.lang.Iterable))​(java.lang.Iterable<java.lang.Class<? extends java.lang.Throwable>> trapExit)` | Decider builder which just checks whether one of  the given Throwables matches the cause and restarts, otherwise escalates. |
	| `static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[makeDecider](#makeDecider(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Class<? extends java.lang.Throwable>> trapExit)` | Decider builder which just checks whether one of  the given Throwables matches the cause and restarts, otherwise escalates. |
	| `static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[makeDecider](#makeDecider(scala.collection.Iterable))​(scala.collection.Iterable<scala.Tuple2<java.lang.Class<? extends java.lang.Throwable>,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>> flat)` | Decider builder for Iterables of cause\-directive pairs, e.g. |
	| `abstract void` | `[processFailure](#processFailure(akka.actor.ActorContext,boolean,akka.actor.ActorRef,java.lang.Throwable,akka.actor.ChildRestartStats,scala.collection.Iterable))​([ActorContext](ActorContext.html "interface in akka.actor") context,  boolean restart,  [ActorRef](ActorRef.html "class in akka.actor") child,  java.lang.Throwable cause,  [ChildRestartStats](ChildRestartStats.html "class in akka.actor") stats,  scala.collection.Iterable<[ChildRestartStats](ChildRestartStats.html "class in akka.actor")> children)` | This method is called to act on the failure of a child: restart if the flag is true, stop otherwise. |
	| `static [SupervisorStrategy.Restart$](SupervisorStrategy.Restart$.html "class in akka.actor")` | `[restart](#restart())()` | Java API: Returning this directive discards the old Actor instance and replaces it with a new,  then resumes message processing. |
	| `static [SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")` | `[restart](#restart(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)` | Returning this directive discards the old Actor instance and replaces it with a new,  then resumes message processing. |
	| `void` | `[restartChild](#restartChild(akka.actor.ActorRef,java.lang.Throwable,boolean))​([ActorRef](ActorRef.html "class in akka.actor") child,  java.lang.Throwable cause,  boolean suspendFirst)` | Restart the given child, possibly suspending it first. |
	| `static [SupervisorStrategy.Resume$](SupervisorStrategy.Resume$.html "class in akka.actor")` | `[resume](#resume())()` | Java API: Returning this directive resumes message processing for the failed Actor |
	| `static [SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")` | `[resume](#resume(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)` | Returning this directive resumes message processing for the failed Actor. |
	| `void` | `[resumeChild](#resumeChild(akka.actor.ActorRef,java.lang.Throwable))​([ActorRef](ActorRef.html "class in akka.actor") child,  java.lang.Throwable cause)` | Resume the previously failed child: **do never apply this to a child which  is not the currently failing child**. |
	| `static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[seqCauseDirective2Decider](#seqCauseDirective2Decider(scala.collection.Iterable))​(scala.collection.Iterable<scala.Tuple2<java.lang.Class<? extends java.lang.Throwable>,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>> trapExit)` |  |
	| `static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[seqThrowable2Decider](#seqThrowable2Decider(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Class<? extends java.lang.Throwable>> trapExit)` | Implicit conversion from `Seq` of Throwables to a `Decider`. |
	| `static [SupervisorStrategy.Stop$](SupervisorStrategy.Stop$.html "class in akka.actor")` | `[stop](#stop())()` | Java API: Returning this directive stops the Actor |
	| `static [SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")` | `[stop](#stop(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)` | Returning this directive stops the Actor |
	| `static [SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")` | `[stoppingStrategy](#stoppingStrategy())()` | This strategy resembles Erlang in that failing children are always  terminated (one\-for\-one). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SupervisorStrategy
		
		
		
		```
		public SupervisorStrategy()
		```

	- ### Method Detail
	
	
	
		- #### resume
		
		
		
		```
		public static [SupervisorStrategy.Resume$](SupervisorStrategy.Resume$.html "class in akka.actor") resume()
		```
		
		Java API: Returning this directive resumes message processing for the failed Actor
		- #### resume
		
		
		
		```
		public static [SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor") resume​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)
		```
		
		Returning this directive resumes message processing for the failed Actor.
		 
		
		Parameters:
		`logLevel` \- Log level which will be used to log the failure
		- #### restart
		
		
		
		```
		public static [SupervisorStrategy.Restart$](SupervisorStrategy.Restart$.html "class in akka.actor") restart()
		```
		
		Java API: Returning this directive discards the old Actor instance and replaces it with a new,
		 then resumes message processing.
		- #### restart
		
		
		
		```
		public static [SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor") restart​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)
		```
		
		Returning this directive discards the old Actor instance and replaces it with a new,
		 then resumes message processing.
		 
		
		Parameters:
		`logLevel` \- Log level which will be used to log the failure
		- #### stop
		
		
		
		```
		public static [SupervisorStrategy.Stop$](SupervisorStrategy.Stop$.html "class in akka.actor") stop()
		```
		
		Java API: Returning this directive stops the Actor
		- #### stop
		
		
		
		```
		public static [SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor") stop​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)
		```
		
		Returning this directive stops the Actor
		 
		
		Parameters:
		`logLevel` \- Log level which will be used to log the failure
		- #### escalate
		
		
		
		```
		public static [SupervisorStrategy.Escalate$](SupervisorStrategy.Escalate$.html "class in akka.actor") escalate()
		```
		
		Java API: Returning this directive escalates the failure to the supervisor of the supervisor,
		 by rethrowing the cause of the failure, i.e. the supervisor fails with
		 the same exception as the child.
		- #### defaultDecider
		
		
		
		```
		public static final scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> defaultDecider()
		```
		
		When supervisorStrategy is not specified for an actor this
		 `Decider` is used by default in the supervisor strategy.
		 The child will be stopped when [`ActorInitializationException`](ActorInitializationException.html "class in akka.actor"),
		 [`ActorKilledException`](ActorKilledException.html "class in akka.actor"), or [`DeathPactException`](DeathPactException.html "class in akka.actor") is
		 thrown. It will be restarted for other `Exception` types.
		 The error is escalated if it's a `Throwable`, i.e. `Error`.
		- #### defaultStrategy
		
		
		
		```
		public static final [SupervisorStrategy](SupervisorStrategy.html "class in akka.actor") defaultStrategy()
		```
		
		When supervisorStrategy is not specified for an actor this
		 is used by default. OneForOneStrategy with decider defined in
		 [`defaultDecider()`](#defaultDecider()).
		- #### stoppingStrategy
		
		
		
		```
		public static final [SupervisorStrategy](SupervisorStrategy.html "class in akka.actor") stoppingStrategy()
		```
		
		This strategy resembles Erlang in that failing children are always
		 terminated (one\-for\-one).
		- #### seqThrowable2Decider
		
		
		
		```
		public static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> seqThrowable2Decider​(scala.collection.immutable.Seq<java.lang.Class<? extends java.lang.Throwable>> trapExit)
		```
		
		Implicit conversion from `Seq` of Throwables to a `Decider`.
		 This maps the given Throwables to restarts, otherwise escalates.
		- #### makeDecider
		
		
		
		```
		public static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> makeDecider​(scala.collection.immutable.Seq<java.lang.Class<? extends java.lang.Throwable>> trapExit)
		```
		
		Decider builder which just checks whether one of
		 the given Throwables matches the cause and restarts, otherwise escalates.
		- #### makeDecider
		
		
		
		```
		public static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> makeDecider​(java.lang.Iterable<java.lang.Class<? extends java.lang.Throwable>> trapExit)
		```
		
		Decider builder which just checks whether one of
		 the given Throwables matches the cause and restarts, otherwise escalates.
		- #### makeDecider
		
		
		
		```
		public static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> makeDecider​(scala.collection.Iterable<scala.Tuple2<java.lang.Class<? extends java.lang.Throwable>,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>> flat)
		```
		
		Decider builder for Iterables of cause\-directive pairs, e.g. a map obtained
		 from configuration; will sort the pairs so that the most specific type is
		 checked before all its subtypes, allowing carving out subtrees of the
		 Throwable hierarchy.
		- #### makeDecider
		
		
		
		```
		public static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> makeDecider​([Function](../japi/Function.html "interface in akka.japi")<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> func)
		```
		
		Converts a Java Decider into a Scala Decider
		- #### seqCauseDirective2Decider
		
		
		
		```
		public static scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> seqCauseDirective2Decider​(scala.collection.Iterable<scala.Tuple2<java.lang.Class<? extends java.lang.Throwable>,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>> trapExit)
		```
		- #### decider
		
		
		
		```
		public abstract scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider()
		```
		
		Returns the Decider that is associated with this SupervisorStrategy.
		 The Decider is invoked by the default implementation of `handleFailure`
		 to obtain the Directive to be applied.
		- #### handleChildTerminated
		
		
		
		```
		public abstract void handleChildTerminated​([ActorContext](ActorContext.html "interface in akka.actor") context,
		                                           [ActorRef](ActorRef.html "class in akka.actor") child,
		                                           scala.collection.Iterable<[ActorRef](ActorRef.html "class in akka.actor")> children)
		```
		
		This method is called after the child has been removed from the set of children.
		 It does not need to do anything special. Exceptions thrown from this method
		 do NOT make the actor fail if this happens during termination.
		- #### processFailure
		
		
		
		```
		public abstract void processFailure​([ActorContext](ActorContext.html "interface in akka.actor") context,
		                                    boolean restart,
		                                    [ActorRef](ActorRef.html "class in akka.actor") child,
		                                    java.lang.Throwable cause,
		                                    [ChildRestartStats](ChildRestartStats.html "class in akka.actor") stats,
		                                    scala.collection.Iterable<[ChildRestartStats](ChildRestartStats.html "class in akka.actor")> children)
		```
		
		This method is called to act on the failure of a child: restart if the flag is true, stop otherwise.
		- #### handleFailure
		
		
		
		```
		public boolean handleFailure​([ActorContext](ActorContext.html "interface in akka.actor") context,
		                             [ActorRef](ActorRef.html "class in akka.actor") child,
		                             java.lang.Throwable cause,
		                             [ChildRestartStats](ChildRestartStats.html "class in akka.actor") stats,
		                             scala.collection.Iterable<[ChildRestartStats](ChildRestartStats.html "class in akka.actor")> children)
		```
		
		This is the main entry point: in case of a child\&rsquo;s failure, this method
		 must try to handle the failure by resuming, restarting or stopping the
		 child (and returning `true`), or it returns `false` to escalate the
		 failure, which will lead to this actor re\-throwing the exception which
		 caused the failure. The exception will not be wrapped.
		 
		 This method calls [`logFailure(akka.actor.ActorContext, akka.actor.ActorRef, java.lang.Throwable, akka.actor.SupervisorStrategy.Directive)`](#logFailure(akka.actor.ActorContext,akka.actor.ActorRef,java.lang.Throwable,akka.actor.SupervisorStrategy.Directive)), which will
		 log the failure unless it is escalated. You can customize the logging by
		 setting [`loggingEnabled()`](#loggingEnabled()) to `false` and
		 do the logging inside the `decider` or override the `logFailure` method.
		 
		
		
		
		Parameters:
		`children` \- is a lazy collection (a view)
		- #### loggingEnabled
		
		
		
		```
		protected boolean loggingEnabled()
		```
		
		Logging of actor failures is done when this is `true`.
		- #### logFailure
		
		
		
		```
		public void logFailure​([ActorContext](ActorContext.html "interface in akka.actor") context,
		                       [ActorRef](ActorRef.html "class in akka.actor") child,
		                       java.lang.Throwable cause,
		                       [SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor") decision)
		```
		
		Default logging of actor failures when
		 [`loggingEnabled()`](#loggingEnabled()) is `true`.
		 `Escalate` failures are not logged here, since they are supposed
		 to be handled at a level higher up in the hierarchy.
		 `Resume` failures are logged at `Warning` level.
		 `Stop` and `Restart` failures are logged at `Error` level.
		- #### resumeChild
		
		
		
		```
		public final void resumeChild​([ActorRef](ActorRef.html "class in akka.actor") child,
		                              java.lang.Throwable cause)
		```
		
		Resume the previously failed child: **do never apply this to a child which
		 is not the currently failing child**. Suspend/resume needs to be done in
		 matching pairs, otherwise actors will wake up too soon or never at all.
		- #### restartChild
		
		
		
		```
		public final void restartChild​([ActorRef](ActorRef.html "class in akka.actor") child,
		                               java.lang.Throwable cause,
		                               boolean suspendFirst)
		```
		
		Restart the given child, possibly suspending it first.
		 
		**IMPORTANT:**
		
		
		
		 If the child is the currently failing one, it will already have been
		 suspended, hence `suspendFirst` must be false. If the child is not the
		 currently failing one, then it did not request this treatment and is
		 therefore not prepared to be resumed without prior suspend.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorInitializationException.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorKilledException.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AllForOneStrategy.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ChildRestartStats.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/OneForOneStrategy.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/SupervisorStrategy.Directive.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/SupervisorStrategy.Escalate$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/SupervisorStrategy.Restart$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/SupervisorStrategy.Resume$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/SupervisorStrategy.Stop$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/Function.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/actor/SupervisorStrategy.html](https://doc.akka.io/japi/akka-core/2.6/akka/actor/SupervisorStrategy.html)*
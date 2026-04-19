---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptionsImpl.html
title: BackoffOnStopOptionsImpl
---

# BackoffOnStopOptionsImpl

## Content

Package [akka.pattern](package-summary.html)
## Class BackoffOnStopOptionsImpl\<T\>

- java.lang.Object
- - akka.pattern.BackoffOnStopOptionsImpl\<T\>

- All Implemented Interfaces:
`[BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern")`, `[ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")<[BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern")>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class BackoffOnStopOptionsImpl<T>
extends java.lang.Object
implements [BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.pattern.BackoffOnStopOptionsImpl)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BackoffOnStopOptionsImpl](#%3Cinit%3E(akka.actor.Props,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,scala.Option,akka.actor.OneForOneStrategy,akka.pattern.HandlingWhileStopped,scala.Option))​([Props](../actor/Props.html "class in akka.actor") childProps,  java.lang.String childName,  scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> reset,  [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy,  [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") handlingWhileStopped,  scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> finalStopMessage)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `static <T> [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor")` | `[$lessinit$greater$default$7](#$lessinit$greater$default$7())()` |  |
	| `static <T> [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern")` | `[$lessinit$greater$default$8](#$lessinit$greater$default$8())()` |  |
	| `static <T> scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>>` | `[$lessinit$greater$default$9](#$lessinit$greater$default$9())()` |  |
	| `static <T> [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<T>` | `[apply](#apply(akka.actor.Props,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,scala.Option,akka.actor.OneForOneStrategy,akka.pattern.HandlingWhileStopped,scala.Option))​([Props](../actor/Props.html "class in akka.actor") childProps,  java.lang.String childName,  scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> reset,  [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy,  [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") handlingWhileStopped,  scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> finalStopMessage)` |  |
	| `static <T> scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>` | `[apply$default$6](#apply$default$6())()` |  |
	| `static <T> [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor")` | `[apply$default$7](#apply$default$7())()` |  |
	| `static <T> [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern")` | `[apply$default$8](#apply$default$8())()` |  |
	| `static <T> scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>>` | `[apply$default$9](#apply$default$9())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.String` | `[childName](#childName())()` |  |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[childProps](#childProps())()` |  |
	| `<T> [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<T>` | `[copy](#copy(akka.actor.Props,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,scala.Option,akka.actor.OneForOneStrategy,akka.pattern.HandlingWhileStopped,scala.Option))​([Props](../actor/Props.html "class in akka.actor") childProps,  java.lang.String childName,  scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> reset,  [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy,  [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") handlingWhileStopped,  scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> finalStopMessage)` |  |
	| `<T> [Props](../actor/Props.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `<T> java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `<T> scala.concurrent.duration.FiniteDuration` | `[copy$default$3](#copy$default$3())()` |  |
	| `<T> scala.concurrent.duration.FiniteDuration` | `[copy$default$4](#copy$default$4())()` |  |
	| `<T> double` | `[copy$default$5](#copy$default$5())()` |  |
	| `<T> scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>` | `[copy$default$6](#copy$default$6())()` |  |
	| `<T> [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor")` | `[copy$default$7](#copy$default$7())()` |  |
	| `<T> [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern")` | `[copy$default$8](#copy$default$8())()` |  |
	| `<T> scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>>` | `[copy$default$9](#copy$default$9())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>>` | `[finalStopMessage](#finalStopMessage())()` |  |
	| `[HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern")` | `[handlingWhileStopped](#handlingWhileStopped())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[maxBackoff](#maxBackoff())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[minBackoff](#minBackoff())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[props](#props())()` | Returns the props to create the back\-off supervisor. |
	| `double` | `[randomFactor](#randomFactor())()` |  |
	| `scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>` | `[reset](#reset())()` |  |
	| `[OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor")` | `[supervisorStrategy](#supervisorStrategy())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <T> scala.Option<scala.Tuple9<[Props](../actor/Props.html "class in akka.actor"),​java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.Object,​scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>,​[OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor"),​[HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern"),​scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>>>>` | `[unapply](#unapply(akka.pattern.BackoffOnStopOptionsImpl))​([BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<T> x$0)` |  |
	| `[BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$>` | `[withAutoReset](#withAutoReset(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration resetBackoff)` | Returns a new BackoffOptions with automatic back\-off reset. |
	| `[BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$>` | `[withDefaultStoppingStrategy](#withDefaultStoppingStrategy())()` | Returns a new BackoffOptions with a default `SupervisorStrategy.stoppingStrategy`. |
	| `[BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$>` | `[withFinalStopMessage](#withFinalStopMessage(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> action)` | Predicate evaluated for each message, if it returns true and the supervised actor is  stopped then the supervisor will stop its self. |
	| `[BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$>` | `[withHandlerWhileStopped](#withHandlerWhileStopped(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") handlerWhileStopped)` | Returns a new BackoffOptions with a custom handler for messages that the supervisor receives while its child is stopped. |
	| `[BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$>` | `[withManualReset](#withManualReset())()` | Returns a new BackoffOptions with manual back\-off reset. |
	| `[BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$>` | `[withMaxNrOfRetries](#withMaxNrOfRetries(int))​(int maxNrOfRetries)` | Returns a new BackoffOptions with a maximum number of retries to restart the child actor. |
	| `[BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$>` | `[withReplyWhileStopped](#withReplyWhileStopped(java.lang.Object))​(java.lang.Object replyWhileStopped)` | Returns a new BackoffOptions with a constant reply to messages that the supervisor receives while its  child is stopped. |
	| `[BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$>` | `[withSupervisorStrategy](#withSupervisorStrategy(akka.actor.OneForOneStrategy))​([OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy)` | Returns a new BackoffOptions with the supervisorStrategy. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### BackoffOnStopOptionsImpl
		
		
		
		```
		public BackoffOnStopOptionsImpl​([Props](../actor/Props.html "class in akka.actor") childProps,
		                                java.lang.String childName,
		                                scala.concurrent.duration.FiniteDuration minBackoff,
		                                scala.concurrent.duration.FiniteDuration maxBackoff,
		                                double randomFactor,
		                                scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> reset,
		                                [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy,
		                                [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") handlingWhileStopped,
		                                scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> finalStopMessage)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$6
		
		
		
		```
		public static <T> scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> $lessinit$greater$default$6()
		```
		- #### $lessinit$greater$default$7
		
		
		
		```
		public static <T> [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") $lessinit$greater$default$7()
		```
		- #### $lessinit$greater$default$8
		
		
		
		```
		public static <T> [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") $lessinit$greater$default$8()
		```
		- #### $lessinit$greater$default$9
		
		
		
		```
		public static <T> scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> $lessinit$greater$default$9()
		```
		- #### apply
		
		
		
		```
		public static <T> [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<T> apply​([Props](../actor/Props.html "class in akka.actor") childProps,
		                                                    java.lang.String childName,
		                                                    scala.concurrent.duration.FiniteDuration minBackoff,
		                                                    scala.concurrent.duration.FiniteDuration maxBackoff,
		                                                    double randomFactor,
		                                                    scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> reset,
		                                                    [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy,
		                                                    [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") handlingWhileStopped,
		                                                    scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> finalStopMessage)
		```
		- #### apply$default$6
		
		
		
		```
		public static <T> scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> apply$default$6()
		```
		- #### apply$default$7
		
		
		
		```
		public static <T> [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") apply$default$7()
		```
		- #### apply$default$8
		
		
		
		```
		public static <T> [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") apply$default$8()
		```
		- #### apply$default$9
		
		
		
		```
		public static <T> scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> apply$default$9()
		```
		- #### unapply
		
		
		
		```
		public static <T> scala.Option<scala.Tuple9<[Props](../actor/Props.html "class in akka.actor"),​java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.Object,​scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>,​[OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor"),​[HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern"),​scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>>>> unapply​([BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<T> x$0)
		```
		- #### childProps
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") childProps()
		```
		- #### childName
		
		
		
		```
		public java.lang.String childName()
		```
		- #### minBackoff
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration minBackoff()
		```
		- #### maxBackoff
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration maxBackoff()
		```
		- #### randomFactor
		
		
		
		```
		public double randomFactor()
		```
		- #### reset
		
		
		
		```
		public scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> reset()
		```
		- #### supervisorStrategy
		
		
		
		```
		public [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy()
		```
		- #### handlingWhileStopped
		
		
		
		```
		public [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") handlingWhileStopped()
		```
		- #### finalStopMessage
		
		
		
		```
		public scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> finalStopMessage()
		```
		- #### withAutoReset
		
		
		
		```
		public [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$> withAutoReset​(scala.concurrent.duration.FiniteDuration resetBackoff)
		```
		
		Description copied from interface: `[ExtendedBackoffOptions](ExtendedBackoffOptions.html#withAutoReset(scala.concurrent.duration.FiniteDuration))`
		Returns a new BackoffOptions with automatic back\-off reset.
		 The back\-off algorithm is reset if the child does not crash within the specified `resetBackoff`.
		 
		
		Specified by:
		`[withAutoReset](ExtendedBackoffOptions.html#withAutoReset(scala.concurrent.duration.FiniteDuration))` in interface `[ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")<[T](BackoffOnStopOptionsImpl.html "type parameter in BackoffOnStopOptionsImpl")>`
		Parameters:
		`resetBackoff` \- The back\-off is reset if the child does not crash within this duration.
		- #### withManualReset
		
		
		
		```
		public [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$> withManualReset()
		```
		
		Description copied from interface: `[ExtendedBackoffOptions](ExtendedBackoffOptions.html#withManualReset())`
		Returns a new BackoffOptions with manual back\-off reset. The back\-off is only reset
		 if the child sends a `BackoffSupervisor.Reset` to its parent (the backoff\-supervisor actor).
		
		Specified by:
		`[withManualReset](ExtendedBackoffOptions.html#withManualReset())` in interface `[ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")<[T](BackoffOnStopOptionsImpl.html "type parameter in BackoffOnStopOptionsImpl")>`
		- #### withSupervisorStrategy
		
		
		
		```
		public [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$> withSupervisorStrategy​([OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy)
		```
		
		Description copied from interface: `[ExtendedBackoffOptions](ExtendedBackoffOptions.html#withSupervisorStrategy(akka.actor.OneForOneStrategy))`
		Returns a new BackoffOptions with the supervisorStrategy.
		 
		
		Specified by:
		`[withSupervisorStrategy](ExtendedBackoffOptions.html#withSupervisorStrategy(akka.actor.OneForOneStrategy))` in interface `[ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")<[T](BackoffOnStopOptionsImpl.html "type parameter in BackoffOnStopOptionsImpl")>`
		Parameters:
		`supervisorStrategy` \- the supervisorStrategy that the back\-off supervisor will use.
		 The default supervisor strategy is used as fallback if the specified supervisorStrategy (its decider)
		 does not explicitly handle an exception. As the BackoffSupervisor creates a separate actor to handle the
		 backoff process, only a `OneForOneStrategy` makes sense here.
		 Note that changing the strategy will replace the previously defined maxNrOfRetries.
		- #### withReplyWhileStopped
		
		
		
		```
		public [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$> withReplyWhileStopped​(java.lang.Object replyWhileStopped)
		```
		
		Description copied from interface: `[ExtendedBackoffOptions](ExtendedBackoffOptions.html#withReplyWhileStopped(java.lang.Object))`
		Returns a new BackoffOptions with a constant reply to messages that the supervisor receives while its
		 child is stopped. By default, a message received while the child is stopped is forwarded to `deadLetters`.
		 With this option, the supervisor will reply to the sender instead.
		 
		
		Specified by:
		`[withReplyWhileStopped](ExtendedBackoffOptions.html#withReplyWhileStopped(java.lang.Object))` in interface `[ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")<[T](BackoffOnStopOptionsImpl.html "type parameter in BackoffOnStopOptionsImpl")>`
		Parameters:
		`replyWhileStopped` \- The message that the supervisor will send in response to all messages while
		 its child is stopped.
		- #### withHandlerWhileStopped
		
		
		
		```
		public [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$> withHandlerWhileStopped​([ActorRef](../actor/ActorRef.html "class in akka.actor") handlerWhileStopped)
		```
		
		Description copied from interface: `[ExtendedBackoffOptions](ExtendedBackoffOptions.html#withHandlerWhileStopped(akka.actor.ActorRef))`
		Returns a new BackoffOptions with a custom handler for messages that the supervisor receives while its child is stopped.
		 By default, a message received while the child is stopped is forwarded to `deadLetters`.
		 Essentially, this handler replaces `deadLetters` allowing to implement custom handling instead of a static reply.
		 
		
		Specified by:
		`[withHandlerWhileStopped](ExtendedBackoffOptions.html#withHandlerWhileStopped(akka.actor.ActorRef))` in interface `[ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")<[T](BackoffOnStopOptionsImpl.html "type parameter in BackoffOnStopOptionsImpl")>`
		Parameters:
		`handlerWhileStopped` \- PartialFunction of the received message and sender
		- #### withMaxNrOfRetries
		
		
		
		```
		public [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$> withMaxNrOfRetries​(int maxNrOfRetries)
		```
		
		Description copied from interface: `[ExtendedBackoffOptions](ExtendedBackoffOptions.html#withMaxNrOfRetries(int))`
		Returns a new BackoffOptions with a maximum number of retries to restart the child actor.
		 By default, the supervisor will retry infinitely.
		 With this option, the supervisor will terminate itself after the maxNoOfRetries is reached.
		 
		
		Specified by:
		`[withMaxNrOfRetries](ExtendedBackoffOptions.html#withMaxNrOfRetries(int))` in interface `[ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")<[T](BackoffOnStopOptionsImpl.html "type parameter in BackoffOnStopOptionsImpl")>`
		Parameters:
		`maxNrOfRetries` \- the number of times a child actor is allowed to be restarted.
		 If negative, the value is unbounded, otherwise the provided
		 limit is used. If the limit is exceeded the child actor will be stopped.
		- #### withDefaultStoppingStrategy
		
		
		
		```
		public [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$> withDefaultStoppingStrategy()
		```
		
		Description copied from interface: `[BackoffOnStopOptions](BackoffOnStopOptions.html#withDefaultStoppingStrategy())`
		Returns a new BackoffOptions with a default `SupervisorStrategy.stoppingStrategy`.
		 The default supervisor strategy is used as fallback for throwables not handled by `SupervisorStrategy.stoppingStrategy`.
		
		Specified by:
		`[withDefaultStoppingStrategy](BackoffOnStopOptions.html#withDefaultStoppingStrategy())` in interface `[BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern")`
		- #### withFinalStopMessage
		
		
		
		```
		public [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<scala.runtime.Nothing$> withFinalStopMessage​(scala.Function1<java.lang.Object,​java.lang.Object> action)
		```
		
		Description copied from interface: `[BackoffOnStopOptions](BackoffOnStopOptions.html#withFinalStopMessage(scala.Function1))`
		Predicate evaluated for each message, if it returns true and the supervised actor is
		 stopped then the supervisor will stop its self. If it returns true while
		 the supervised actor is running then it will be forwarded to the supervised actor and
		 when the supervised actor stops its self the supervisor will stop its self.
		
		Specified by:
		`[withFinalStopMessage](BackoffOnStopOptions.html#withFinalStopMessage(scala.Function1))` in interface `[BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern")`
		- #### props
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") props()
		```
		
		Description copied from interface: `[ExtendedBackoffOptions](ExtendedBackoffOptions.html#props())`
		Returns the props to create the back\-off supervisor.
		
		Specified by:
		`[props](ExtendedBackoffOptions.html#props())` in interface `[ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")<[T](BackoffOnStopOptionsImpl.html "type parameter in BackoffOnStopOptionsImpl")>`
		- #### copy
		
		
		
		```
		public <T> [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<T> copy​([Props](../actor/Props.html "class in akka.actor") childProps,
		                                            java.lang.String childName,
		                                            scala.concurrent.duration.FiniteDuration minBackoff,
		                                            scala.concurrent.duration.FiniteDuration maxBackoff,
		                                            double randomFactor,
		                                            scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> reset,
		                                            [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy,
		                                            [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") handlingWhileStopped,
		                                            scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> finalStopMessage)
		```
		- #### copy$default$1
		
		
		
		```
		public <T> [Props](../actor/Props.html "class in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <T> java.lang.String copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public <T> scala.concurrent.duration.FiniteDuration copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public <T> scala.concurrent.duration.FiniteDuration copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public <T> double copy$default$5()
		```
		- #### copy$default$6
		
		
		
		```
		public <T> scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> copy$default$6()
		```
		- #### copy$default$7
		
		
		
		```
		public <T> [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") copy$default$7()
		```
		- #### copy$default$8
		
		
		
		```
		public <T> [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") copy$default$8()
		```
		- #### copy$default$9
		
		
		
		```
		public <T> scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> copy$default$9()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/OneForOneStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptionsImpl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffReset.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/ExtendedBackoffOptions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/HandlingWhileStopped.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptionsImpl.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptionsImpl.html)*
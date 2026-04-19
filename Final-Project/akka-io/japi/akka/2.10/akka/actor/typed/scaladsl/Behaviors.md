---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:41:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/actor/typed/scaladsl/Behaviors.html
title: Behaviors
---

# Behaviors

## Content

Package [akka.actor.typed.scaladsl](package-summary.html)
## Class Behaviors

- java.lang.Object
- - akka.actor.typed.scaladsl.Behaviors

- ---

```
public class Behaviors
extends java.lang.Object
```

Factories for [`Behavior`](../Behavior.html "class in akka.actor.typed").

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[Behaviors.Receive](Behaviors.Receive.html "interface in akka.actor.typed.scaladsl")<[T](Behaviors.Receive.html "type parameter in Behaviors.Receive")>` | `Behavior` that exposes additional fluent DSL methods to further change the message or  signal reception behavior. |
	| `static class` | `[Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.scaladsl")<[T](Behaviors.Supervise.html "type parameter in Behaviors.Supervise")>` |  |
	| `static class` | `[Behaviors.Supervise$](Behaviors.Supervise$.html "class in akka.actor.typed.scaladsl")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Behaviors](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[empty](#empty())()` | A behavior that treats every incoming message as unhandled. |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[ignore](#ignore())()` | A behavior that ignores every incoming message and returns \&ldquo;same\&rdquo;. |
	| `static <O,​I>[Behavior](../Behavior.html "class in akka.actor.typed")<O>` | `[intercept](#intercept(scala.Function0,akka.actor.typed.Behavior))​(scala.Function0<[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<O,​I>> behaviorInterceptor,  [Behavior](../Behavior.html "class in akka.actor.typed")<I> behavior)` | Intercept messages and signals for a `behavior` by first passing them to a [`BehaviorInterceptor`](../BehaviorInterceptor.html "class in akka.actor.typed") |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[logMessages](#logMessages(akka.actor.typed.Behavior))​([Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)` | Behavior decorator that logs all messages to the [`Behavior`](../Behavior.html "class in akka.actor.typed") using the provided  [`LogOptions`](../LogOptions.html "class in akka.actor.typed") default configuration before invoking the wrapped behavior. |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[logMessages](#logMessages(akka.actor.typed.LogOptions,akka.actor.typed.Behavior))​([LogOptions](../LogOptions.html "class in akka.actor.typed") logOptions,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)` | Behavior decorator that logs all messages to the [`Behavior`](../Behavior.html "class in akka.actor.typed") using the provided  [`LogOptions`](../LogOptions.html "class in akka.actor.typed") configuration before invoking the wrapped behavior. |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[monitor](#monitor(akka.actor.typed.ActorRef,akka.actor.typed.Behavior,scala.reflect.ClassTag))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> monitor,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,  scala.reflect.ClassTag<T> evidence$1)` | Behavior decorator that copies all received message to the designated  monitor [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") before invoking the wrapped behavior. |
	| `static <T> [Behaviors.Receive](Behaviors.Receive.html "interface in akka.actor.typed.scaladsl")<T>` | `[receive](#receive(scala.Function2))​(scala.Function2<[ActorContext](ActorContext.html "interface in akka.actor.typed.scaladsl")<T>,​T,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage)` | Construct an actor behavior that can react to both incoming messages and  lifecycle signals. |
	| `static <T> [Behaviors.Receive](Behaviors.Receive.html "interface in akka.actor.typed.scaladsl")<T>` | `[receiveMessage](#receiveMessage(scala.Function1))​(scala.Function1<T,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage)` | Simplified version of [`Behaviors.Receive`](Behaviors.Receive.html "interface in akka.actor.typed.scaladsl") with only a single argument \- the message  to be handled. |
	| `static <T> [Behaviors.Receive](Behaviors.Receive.html "interface in akka.actor.typed.scaladsl")<T>` | `[receiveMessagePartial](#receiveMessagePartial(scala.PartialFunction))​(scala.PartialFunction<T,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage)` | Construct an actor `Behavior` from a partial message handler which treats undefined messages as unhandled. |
	| `static <T> [Behaviors.Receive](Behaviors.Receive.html "interface in akka.actor.typed.scaladsl")<T>` | `[receivePartial](#receivePartial(scala.PartialFunction))​(scala.PartialFunction<scala.Tuple2<[ActorContext](ActorContext.html "interface in akka.actor.typed.scaladsl")<T>,​T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage)` | Construct an actor `Behavior` from a partial message handler which treats undefined messages as unhandled. |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[receiveSignal](#receiveSignal(scala.PartialFunction))​(scala.PartialFunction<scala.Tuple2<[ActorContext](ActorContext.html "interface in akka.actor.typed.scaladsl")<T>,​[Signal](../Signal.html "interface in akka.actor.typed")>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> handler)` | Construct an actor `Behavior` that can react to lifecycle signals only. |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[same](#same())()` | Return this behavior from message processing in order to advise the  system to reuse the previous behavior. |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[setup](#setup(scala.Function1))​(scala.Function1<[ActorContext](ActorContext.html "interface in akka.actor.typed.scaladsl")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)` | `setup` is a factory for a behavior. |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[stopped](#stopped())()` | Return this behavior from message processing to signal that this actor  shall terminate voluntarily. |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[stopped](#stopped(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> postStop)` | Return this behavior from message processing to signal that this actor  shall terminate voluntarily. |
	| `static <T> [Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.scaladsl")<T>` | `[supervise](#supervise(akka.actor.typed.Behavior))​([Behavior](../Behavior.html "class in akka.actor.typed")<T> wrapped)` | Wrap the given behavior with the given `SupervisorStrategy` for  the given exception. |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[unhandled](#unhandled())()` | Return this behavior from message processing in order to advise the  system to reuse the previous behavior, including the hint that the  message has not been handled. |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[withMdc](#withMdc(scala.collection.immutable.Map,akka.actor.typed.Behavior,scala.reflect.ClassTag))​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> staticMdc,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,  scala.reflect.ClassTag<T> evidence$3)` | Static MDC (Mapped Diagnostic Context) |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[withMdc](#withMdc(scala.collection.immutable.Map,scala.Function1,akka.actor.typed.Behavior,scala.reflect.ClassTag))​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> staticMdc,  scala.Function1<T,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>> mdcForMessage,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,  scala.reflect.ClassTag<T> evidence$4)` | Combination of static and per message MDC (Mapped Diagnostic Context). |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[withMdc](#withMdc(scala.Function1,akka.actor.typed.Behavior,scala.reflect.ClassTag))​(scala.Function1<T,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>> mdcForMessage,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,  scala.reflect.ClassTag<T> evidence$2)` | Per message MDC (Mapped Diagnostic Context) logging. |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[withStash](#withStash(int,scala.Function1))​(int capacity,  scala.Function1<[StashBuffer](StashBuffer.html "interface in akka.actor.typed.scaladsl")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)` | Support for stashing messages to unstash at a later time. |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[withTimers](#withTimers(scala.Function1))​(scala.Function1<[TimerScheduler](TimerScheduler.html "interface in akka.actor.typed.scaladsl")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)` | Support for scheduled `self` messages in an actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Behaviors
		
		
		
		```
		public Behaviors()
		```

	- ### Method Detail
	
	
	
		- #### setup
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> setup​(scala.Function1<[ActorContext](ActorContext.html "interface in akka.actor.typed.scaladsl")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)
		```
		
		`setup` is a factory for a behavior. Creation of the behavior instance is deferred until
		 the actor is started, as opposed to `Behaviors.receive` that creates the behavior instance
		 immediately before the actor is running. The `factory` function pass the `ActorContext`
		 as parameter and that can for example be used for spawning child actors.
		 
		`setup` is typically used as the outer most behavior when spawning an actor, but it
		 can also be returned as the next behavior when processing a message or signal. In that
		 case it will be started immediately after it is returned, i.e. next message will be
		 processed by the started behavior.
		- #### withStash
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> withStash​(int capacity,
		                                        scala.Function1<[StashBuffer](StashBuffer.html "interface in akka.actor.typed.scaladsl")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)
		```
		
		Support for stashing messages to unstash at a later time.
		- #### same
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> same()
		```
		
		Return this behavior from message processing in order to advise the
		 system to reuse the previous behavior. This is provided in order to
		 avoid the allocation overhead of recreating the current behavior where
		 that is not necessary.
		- #### unhandled
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> unhandled()
		```
		
		Return this behavior from message processing in order to advise the
		 system to reuse the previous behavior, including the hint that the
		 message has not been handled. This hint may be used by composite
		 behaviors that delegate (partial) handling to other behaviors.
		- #### stopped
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> stopped()
		```
		
		Return this behavior from message processing to signal that this actor
		 shall terminate voluntarily. If this actor has created child actors then
		 these will be stopped as part of the shutdown procedure.
		 
		 The `PostStop` signal that results from stopping this actor will be passed to the
		 current behavior. All other messages and signals will effectively be
		 ignored.
		- #### stopped
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> stopped​(scala.Function0<scala.runtime.BoxedUnit> postStop)
		```
		
		Return this behavior from message processing to signal that this actor
		 shall terminate voluntarily. If this actor has created child actors then
		 these will be stopped as part of the shutdown procedure.
		 
		 The `PostStop` signal that results from stopping this actor will first be passed to the
		 current behavior and then the provided `postStop` callback will be invoked.
		 All other messages and signals will effectively be ignored.
		 
		
		
		 An example of when the callback can be useful compared to the `PostStop` signal
		 if you want to send a reply to the message that initiated a graceful stop.
		- #### empty
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> empty()
		```
		
		A behavior that treats every incoming message as unhandled.
		- #### ignore
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> ignore()
		```
		
		A behavior that ignores every incoming message and returns \&ldquo;same\&rdquo;.
		- #### receive
		
		
		
		```
		public static <T> [Behaviors.Receive](Behaviors.Receive.html "interface in akka.actor.typed.scaladsl")<T> receive​(scala.Function2<[ActorContext](ActorContext.html "interface in akka.actor.typed.scaladsl")<T>,​T,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage)
		```
		
		Construct an actor behavior that can react to both incoming messages and
		 lifecycle signals. After spawning this actor from another actor (or as the
		 guardian of an [`ActorSystem`](../ActorSystem.html "class in akka.actor.typed")) it will be executed within an
		 [`ActorContext`](ActorContext.html "interface in akka.actor.typed.scaladsl") that allows access to the system, spawning and watching
		 other actors, etc.
		 
		 Compared to using [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.scaladsl") this factory is a more functional style
		 of defining the `Behavior`. Processing the next message results in a new behavior
		 that can potentially be different from this one. State is maintained by returning
		 a new behavior that holds the new immutable state.
		- #### receiveMessage
		
		
		
		```
		public static <T> [Behaviors.Receive](Behaviors.Receive.html "interface in akka.actor.typed.scaladsl")<T> receiveMessage​(scala.Function1<T,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage)
		```
		
		Simplified version of [`Behaviors.Receive`](Behaviors.Receive.html "interface in akka.actor.typed.scaladsl") with only a single argument \- the message
		 to be handled. Useful for when the context is already accessible by other means,
		 like being wrapped in an [`<T>setup(scala.Function1<akka.actor.typed.scaladsl.ActorContext<T>,akka.actor.typed.Behavior<T>>)`](#setup(scala.Function1)) or similar.
		 
		 Construct an actor behavior that can react to both incoming messages and
		 lifecycle signals. After spawning this actor from another actor (or as the
		 guardian of an [`ActorSystem`](../ActorSystem.html "class in akka.actor.typed")) it will be executed within an
		 [`ActorContext`](ActorContext.html "interface in akka.actor.typed.scaladsl") that allows access to the system, spawning and watching
		 other actors, etc.
		 
		
		
		 Compared to using [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.scaladsl") this factory is a more functional style
		 of defining the `Behavior`. Processing the next message results in a new behavior
		 that can potentially be different from this one. State is maintained by returning
		 a new behavior that holds the new immutable state.
		- #### receivePartial
		
		
		
		```
		public static <T> [Behaviors.Receive](Behaviors.Receive.html "interface in akka.actor.typed.scaladsl")<T> receivePartial​(scala.PartialFunction<scala.Tuple2<[ActorContext](ActorContext.html "interface in akka.actor.typed.scaladsl")<T>,​T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage)
		```
		
		Construct an actor `Behavior` from a partial message handler which treats undefined messages as unhandled.
		- #### receiveMessagePartial
		
		
		
		```
		public static <T> [Behaviors.Receive](Behaviors.Receive.html "interface in akka.actor.typed.scaladsl")<T> receiveMessagePartial​(scala.PartialFunction<T,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage)
		```
		
		Construct an actor `Behavior` from a partial message handler which treats undefined messages as unhandled.
		- #### receiveSignal
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> receiveSignal​(scala.PartialFunction<scala.Tuple2<[ActorContext](ActorContext.html "interface in akka.actor.typed.scaladsl")<T>,​[Signal](../Signal.html "interface in akka.actor.typed")>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> handler)
		```
		
		Construct an actor `Behavior` that can react to lifecycle signals only.
		- #### intercept
		
		
		
		```
		public static <O,​I> [Behavior](../Behavior.html "class in akka.actor.typed")<O> intercept​(scala.Function0<[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<O,​I>> behaviorInterceptor,
		                                                [Behavior](../Behavior.html "class in akka.actor.typed")<I> behavior)
		```
		
		Intercept messages and signals for a `behavior` by first passing them to a [`BehaviorInterceptor`](../BehaviorInterceptor.html "class in akka.actor.typed")
		
		 When a behavior returns a new behavior as a result of processing a signal or message and that behavior already contains
		 the same interceptor (defined by the `isSame` method on the `BehaviorInterceptor`) only the innermost interceptor
		 is kept. This is to protect against stack overflow when recursively defining behaviors.
		 
		
		
		 The interceptor is created with a factory function in case it has state and should not be shared.
		 If the interceptor has no state the same instance can be returned from the factory to avoid unnecessary object
		 creation.
		- #### monitor
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> monitor​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> monitor,
		                                      [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,
		                                      scala.reflect.ClassTag<T> evidence$1)
		```
		
		Behavior decorator that copies all received message to the designated
		 monitor [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") before invoking the wrapped behavior. The
		 wrapped behavior can evolve (i.e. return different behavior) without needing to be
		 wrapped in a `monitor` call again.
		 
		 The `ClassTag` for `T` ensures that the messages of this class or a subclass thereof will be
		 sent to the `monitor`. Other message types (e.g. a private protocol) will bypass the interceptor
		 and be continue to the inner behavior.
		 
		
		
		
		Parameters:
		`monitor` \- The messages will also be sent to this `ActorRef`
		`behavior` \- The inner behavior that is decorated
		- #### logMessages
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> logMessages​([Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Behavior decorator that logs all messages to the [`Behavior`](../Behavior.html "class in akka.actor.typed") using the provided
		 [`LogOptions`](../LogOptions.html "class in akka.actor.typed") default configuration before invoking the wrapped behavior.
		 To include an MDC context then first wrap `logMessages` with `withMDC`.
		- #### logMessages
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> logMessages​([LogOptions](../LogOptions.html "class in akka.actor.typed") logOptions,
		                                          [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Behavior decorator that logs all messages to the [`Behavior`](../Behavior.html "class in akka.actor.typed") using the provided
		 [`LogOptions`](../LogOptions.html "class in akka.actor.typed") configuration before invoking the wrapped behavior.
		 To include an MDC context then first wrap `logMessages` with `withMDC`.
		- #### supervise
		
		
		
		```
		public static <T> [Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.scaladsl")<T> supervise​([Behavior](../Behavior.html "class in akka.actor.typed")<T> wrapped)
		```
		
		Wrap the given behavior with the given `SupervisorStrategy` for
		 the given exception.
		 Exceptions that are not subtypes of `Thr` will not be
		 caught and thus lead to the termination of the actor.
		 
		 It is possible to specify different supervisor strategies, such as restart,
		 resume, backoff.
		 
		
		
		 Note that only `NonFatal` throwables will trigger the supervision strategy.
		 
		
		
		 Example:
		 
		
		
		```
		
		 val dbConnector: Behavior[DbCommand] = ...
		
		 val dbRestarts =
		    Behaviors.supervise(dbConnector)
		      .onFailure(SupervisorStrategy.restart) // handle all NonFatal exceptions
		
		 val dbSpecificResumes =
		    Behaviors.supervise(dbConnector)
		      .onFailure[IndexOutOfBoundsException](SupervisorStrategy.resume) // resume for IndexOutOfBoundsException exceptions
		 
		```
		- #### withTimers
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> withTimers​(scala.Function1<[TimerScheduler](TimerScheduler.html "interface in akka.actor.typed.scaladsl")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)
		```
		
		Support for scheduled `self` messages in an actor.
		 It takes care of the lifecycle of the timers such as cancelling them when the actor
		 is restarted or stopped.
		 
		
		See Also:
		[`TimerScheduler`](TimerScheduler.html "interface in akka.actor.typed.scaladsl")
		- #### withMdc
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> withMdc​(scala.Function1<T,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>> mdcForMessage,
		                                      [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,
		                                      scala.reflect.ClassTag<T> evidence$2)
		```
		
		Per message MDC (Mapped Diagnostic Context) logging.
		 
		 The `ClassTag` for `T` ensures that only messages of this class or a subclass thereof will be
		 intercepted. Other message types (e.g. a private protocol) will bypass the interceptor and be
		 continue to the inner behavior untouched.
		 
		
		
		
		Parameters:
		`mdcForMessage` \- Is invoked before each message is handled, allowing to setup MDC, MDC is cleared after
		 each message processing by the inner behavior is done.
		`behavior` \- The actual behavior handling the messages, the MDC is used for the log entries logged through
		 `ActorContext.log`
		- #### withMdc
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> withMdc​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> staticMdc,
		                                      [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,
		                                      scala.reflect.ClassTag<T> evidence$3)
		```
		
		Static MDC (Mapped Diagnostic Context)
		 
		 The `ClassTag` for `T` ensures that only messages of this class or a subclass thereof will be
		 intercepted. Other message types (e.g. a private protocol) will bypass the interceptor and be
		 continue to the inner behavior untouched.
		 
		
		
		
		Parameters:
		`staticMdc` \- This MDC is setup in the logging context for every message
		`behavior` \- The actual behavior handling the messages, the MDC is used for the log entries logged through
		 `ActorContext.log`
		- #### withMdc
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> withMdc​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> staticMdc,
		                                      scala.Function1<T,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>> mdcForMessage,
		                                      [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,
		                                      scala.reflect.ClassTag<T> evidence$4)
		```
		
		Combination of static and per message MDC (Mapped Diagnostic Context).
		 
		 Each message will get the static MDC plus the MDC returned for the message. If the same key
		 are in both the static and the per message MDC the per message one overwrites the static one
		 in the resulting log entries.
		 
		
		
		 The `staticMdc` or `mdcForMessage` may be empty.
		 
		
		
		 The `ClassTag` for `T` ensures that only messages of this class or a subclass thereof will be
		 intercepted. Other message types (e.g. a private protocol) will bypass the interceptor and be
		 continue to the inner behavior untouched.
		 
		
		
		
		Parameters:
		`staticMdc` \- A static MDC applied for each message
		`mdcForMessage` \- Is invoked before each message is handled, allowing to setup MDC, MDC is cleared after
		 each message processing by the inner behavior is done.
		`behavior` \- The actual behavior handling the messages, the MDC is used for the log entries logged through
		 `ActorContext.log`

## Code Examples

### Example 1: supervise

```text
val dbConnector: Behavior[DbCommand] = ...

 val dbRestarts =
    Behaviors.supervise(dbConnector)
      .onFailure(SupervisorStrategy.restart) // handle all NonFatal exceptions

 val dbSpecificResumes =
    Behaviors.supervise(dbConnector)
      .onFailure[IndexOutOfBoundsException](SupervisorStrategy.resume) // resume for IndexOutOfBoundsException exceptions
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/LogOptions.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/scaladsl/Behaviors.Receive.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/scaladsl/Behaviors.Supervise$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/scaladsl/Behaviors.Supervise.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/scaladsl/StashBuffer.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/scaladsl/TimerScheduler.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/actor/typed/scaladsl/Behaviors.html](https://doc.akka.io/japi/akka/2.10/akka/actor/typed/scaladsl/Behaviors.html)*
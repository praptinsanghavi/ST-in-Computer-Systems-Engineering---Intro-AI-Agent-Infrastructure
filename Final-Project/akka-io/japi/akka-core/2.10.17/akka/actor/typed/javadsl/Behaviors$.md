---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:57:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Behaviors$.html
title: Behaviors$
---

# Behaviors$

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class Behaviors$

- java.lang.Object
- - akka.actor.typed.javadsl.Behaviors$

- ---

```
public class Behaviors$
extends java.lang.Object
```

Factories for [`Behavior`](../Behavior.html "class in akka.actor.typed").

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Behaviors$](Behaviors$.html "class in akka.actor.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Behaviors$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[empty](#empty())()` | A behavior that treats every incoming message as unhandled. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[ignore](#ignore())()` | A behavior that ignores every incoming message and returns \&ldquo;same\&rdquo;. |
	| `<O,​I>[Behavior](../Behavior.html "class in akka.actor.typed")<O>` | `[intercept](#intercept(java.util.function.Supplier,akka.actor.typed.Behavior))​(java.util.function.Supplier<[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<O,​I>> behaviorInterceptor,  [Behavior](../Behavior.html "class in akka.actor.typed")<I> behavior)` | Intercept messages and signals for a `behavior` by first passing them to a [`BehaviorInterceptor`](../BehaviorInterceptor.html "class in akka.actor.typed") |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[logMessages](#logMessages(akka.actor.typed.Behavior))​([Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)` | Behavior decorator that logs all messages to the [`Behavior`](../Behavior.html "class in akka.actor.typed") using the provided  [`LogOptions`](../LogOptions.html "class in akka.actor.typed") default configuration before invoking the wrapped behavior. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[logMessages](#logMessages(akka.actor.typed.LogOptions,akka.actor.typed.Behavior))​([LogOptions](../LogOptions.html "class in akka.actor.typed") logOptions,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)` | Behavior decorator that logs all messages to the [`Behavior`](../Behavior.html "class in akka.actor.typed") using the provided  [`LogOptions`](../LogOptions.html "class in akka.actor.typed") configuration before invoking the wrapped behavior. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[monitor](#monitor(java.lang.Class,akka.actor.typed.ActorRef,akka.actor.typed.Behavior))​(java.lang.Class<T> interceptMessageClass,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> monitor,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)` | Behavior decorator that copies all received message to the designated  monitor [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") before invoking the wrapped behavior. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[receive](#receive(akka.japi.function.Function2))​([Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<T>,​T,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage)` | Construct an actor behavior that can react to incoming messages but not to  lifecycle signals. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[receive](#receive(akka.japi.function.Function2,akka.japi.function.Function2))​([Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<T>,​T,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage,  [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<T>,​[Signal](../Signal.html "interface in akka.actor.typed"),​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onSignal)` | Construct an actor behavior that can react to both incoming messages and  lifecycle signals. |
	| `<T> [BehaviorBuilder](BehaviorBuilder.html "class in akka.actor.typed.javadsl")<T>` | `[receive](#receive(java.lang.Class))​(java.lang.Class<T> type)` | Constructs an actor behavior builder that can build a behavior that can react to both  incoming messages and lifecycle signals. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[receiveMessage](#receiveMessage(akka.japi.Function))​([Function](../../../japi/Function.html "interface in akka.japi")<T,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage)` | Simplified version of [`<T>receive(akka.japi.function.Function2<akka.actor.typed.javadsl.ActorContext<T>,T,akka.actor.typed.Behavior<T>>)`](#receive(akka.japi.function.Function2)) with only a single argument \- the message  to be handled. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[receiveSignal](#receiveSignal(akka.japi.function.Function2))​([Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<T>,​[Signal](../Signal.html "interface in akka.actor.typed"),​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> handler)` | Construct an actor behavior that can react to lifecycle signals only. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[same](#same())()` | Return this behavior from message processing in order to advise the  system to reuse the previous behavior. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[setup](#setup(akka.japi.function.Function))​([Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)` | `setup` is a factory for a behavior. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[stopped](#stopped())()` | Return this behavior from message processing to signal that this actor  shall terminate voluntarily. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[stopped](#stopped(akka.japi.function.Effect))​([Effect](../../../japi/function/Effect.html "interface in akka.japi.function") postStop)` | Return this behavior from message processing to signal that this actor  shall terminate voluntarily. |
	| `<T> [Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.javadsl")<T>` | `[supervise](#supervise(akka.actor.typed.Behavior))​([Behavior](../Behavior.html "class in akka.actor.typed")<T> wrapped)` | Wrap the given behavior such that it is restarted (i.e. |
	| `<Outer,​Inner>[Behavior](../Behavior.html "class in akka.actor.typed")<Outer>` | `[transformMessages](#transformMessages(java.lang.Class,akka.actor.typed.Behavior,java.util.function.Function))​(java.lang.Class<Outer> interceptMessageClass,  [Behavior](../Behavior.html "class in akka.actor.typed")<Inner> behavior,  java.util.function.Function<[PFBuilder](../../../japi/pf/PFBuilder.html "class in akka.japi.pf")<Outer,​Inner>,​[PFBuilder](../../../japi/pf/PFBuilder.html "class in akka.japi.pf")<Outer,​Inner>> selector)` | Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied  PartialFunction decides which message to pull in (those that it is defined  at) and may transform the incoming message to place them into the wrapped  Behavior\&rsquo;s type hierarchy. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[unhandled](#unhandled())()` | Return this behavior from message processing in order to advise the  system to reuse the previous behavior, including the hint that the  message has not been handled. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[withMdc](#withMdc(java.lang.Class,akka.japi.function.Function,akka.actor.typed.Behavior))​(java.lang.Class<T> interceptMessageClass,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Map<java.lang.String,​java.lang.String>> mdcForMessage,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)` | Per message MDC (Mapped Diagnostic Context) logging. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[withMdc](#withMdc(java.lang.Class,java.util.Map,akka.actor.typed.Behavior))​(java.lang.Class<T> interceptMessageClass,  java.util.Map<java.lang.String,​java.lang.String> staticMdc,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)` | Static MDC (Mapped Diagnostic Context) |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[withMdc](#withMdc(java.lang.Class,java.util.Map,akka.japi.function.Function,akka.actor.typed.Behavior))​(java.lang.Class<T> interceptMessageClass,  java.util.Map<java.lang.String,​java.lang.String> staticMdc,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Map<java.lang.String,​java.lang.String>> mdcForMessage,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)` | Combination of static and per message MDC (Mapped Diagnostic Context). |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[withStash](#withStash(int,java.util.function.Function))​(int capacity,  java.util.function.Function<[StashBuffer](StashBuffer.html "interface in akka.actor.typed.javadsl")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)` | Support for stashing messages to unstash at a later time. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[withTimers](#withTimers(akka.japi.function.Function))​([Function](../../../japi/function/Function.html "interface in akka.japi.function")<[TimerScheduler](TimerScheduler.html "interface in akka.actor.typed.javadsl")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)` | Support for scheduled `self` messages in an actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Behaviors$](Behaviors$.html "class in akka.actor.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Behaviors$
		
		
		
		```
		public Behaviors$()
		```

	- ### Method Detail
	
	
	
		- #### setup
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> setup​([Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)
		```
		
		`setup` is a factory for a behavior. Creation of the behavior instance is deferred until
		 the actor is started, as opposed to [`Behaviors.receive(akka.japi.function.Function2<akka.actor.typed.javadsl.ActorContext<T>, T, akka.actor.typed.Behavior<T>>)`](Behaviors.html#receive(akka.japi.function.Function2)) that creates the behavior instance
		 immediately before the actor is running. The `factory` function pass the `ActorContext`
		 as parameter and that can for example be used for spawning child actors.
		 
		`setup` is typically used as the outer most behavior when spawning an actor, but it
		 can also be returned as the next behavior when processing a message or signal. In that
		 case it will be started immediately after it is returned, i.e. next message will be
		 processed by the started behavior.
		- #### withStash
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> withStash​(int capacity,
		                                 java.util.function.Function<[StashBuffer](StashBuffer.html "interface in akka.actor.typed.javadsl")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)
		```
		
		Support for stashing messages to unstash at a later time.
		- #### same
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> same()
		```
		
		Return this behavior from message processing in order to advise the
		 system to reuse the previous behavior. This is provided in order to
		 avoid the allocation overhead of recreating the current behavior where
		 that is not necessary.
		- #### unhandled
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> unhandled()
		```
		
		Return this behavior from message processing in order to advise the
		 system to reuse the previous behavior, including the hint that the
		 message has not been handled. This hint may be used by composite
		 behaviors that delegate (partial) handling to other behaviors.
		- #### stopped
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> stopped()
		```
		
		Return this behavior from message processing to signal that this actor
		 shall terminate voluntarily. If this actor has created child actors then
		 these will be stopped as part of the shutdown procedure.
		 
		 The `PostStop` signal that results from stopping this actor will be passed to the
		 current behavior. All other messages and signals will effectively be
		 ignored.
		- #### stopped
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> stopped​([Effect](../../../japi/function/Effect.html "interface in akka.japi.function") postStop)
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
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> empty()
		```
		
		A behavior that treats every incoming message as unhandled.
		- #### ignore
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> ignore()
		```
		
		A behavior that ignores every incoming message and returns \&ldquo;same\&rdquo;.
		- #### receive
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> receive​([Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<T>,​T,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage)
		```
		
		Construct an actor behavior that can react to incoming messages but not to
		 lifecycle signals. After spawning this actor from another actor (or as the
		 guardian of an [`ActorSystem`](../ActorSystem.html "class in akka.actor.typed")) it will be executed within an
		 [`ActorContext`](ActorContext.html "interface in akka.actor.typed.javadsl") that allows access to the system, spawning and watching
		 other actors, etc.
		 
		 Compared to using [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.javadsl") this factory is a more functional style
		 of defining the `Behavior`. Processing the next message results in a new behavior
		 that can potentially be different from this one. State is maintained by returning
		 a new behavior that holds the new immutable state.
		- #### receiveMessage
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> receiveMessage​([Function](../../../japi/Function.html "interface in akka.japi")<T,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage)
		```
		
		Simplified version of [`<T>receive(akka.japi.function.Function2<akka.actor.typed.javadsl.ActorContext<T>,T,akka.actor.typed.Behavior<T>>)`](#receive(akka.japi.function.Function2)) with only a single argument \- the message
		 to be handled. Useful for when the context is already accessible by other means,
		 like being wrapped in an [`<T>setup(akka.japi.function.Function<akka.actor.typed.javadsl.ActorContext<T>,akka.actor.typed.Behavior<T>>)`](#setup(akka.japi.function.Function)) or similar.
		 
		 Construct an actor behavior that can react to incoming messages but not to
		 lifecycle signals. After spawning this actor from another actor (or as the
		 guardian of an [`ActorSystem`](../ActorSystem.html "class in akka.actor.typed")) it will be executed within an
		 [`ActorContext`](ActorContext.html "interface in akka.actor.typed.javadsl") that allows access to the system, spawning and watching
		 other actors, etc.
		 
		
		
		 Compared to using [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.javadsl") this factory is a more functional style
		 of defining the `Behavior`. Processing the next message results in a new behavior
		 that can potentially be different from this one. State is maintained by returning
		 a new behavior that holds the new immutable state.
		- #### receive
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> receive​([Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<T>,​T,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onMessage,
		                               [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<T>,​[Signal](../Signal.html "interface in akka.actor.typed"),​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> onSignal)
		```
		
		Construct an actor behavior that can react to both incoming messages and
		 lifecycle signals. After spawning this actor from another actor (or as the
		 guardian of an [`ActorSystem`](../ActorSystem.html "class in akka.actor.typed")) it will be executed within an
		 [`ActorContext`](ActorContext.html "interface in akka.actor.typed.javadsl") that allows access to the system, spawning and watching
		 other actors, etc.
		 
		 Compared to using [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.javadsl") this factory is a more functional style
		 of defining the `Behavior`. Processing the next message results in a new behavior
		 that can potentially be different from this one. State is maintained by returning
		 a new behavior that holds the new immutable state.
		- #### receive
		
		
		
		```
		public <T> [BehaviorBuilder](BehaviorBuilder.html "class in akka.actor.typed.javadsl")<T> receive​(java.lang.Class<T> type)
		```
		
		Constructs an actor behavior builder that can build a behavior that can react to both
		 incoming messages and lifecycle signals.
		 
		 Compared to using [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.javadsl") this factory is a more functional style
		 of defining the `Behavior`. Processing the next message results in a new behavior
		 that can potentially be different from this one. State is maintained by returning
		 a new behavior that holds the new immutable state.
		 
		
		
		
		Parameters:
		`type` \- the supertype of all messages accepted by this behavior
		Returns:
		the behavior builder
		- #### receiveSignal
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> receiveSignal​([Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<T>,​[Signal](../Signal.html "interface in akka.actor.typed"),​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> handler)
		```
		
		Construct an actor behavior that can react to lifecycle signals only.
		- #### intercept
		
		
		
		```
		public <O,​I> [Behavior](../Behavior.html "class in akka.actor.typed")<O> intercept​(java.util.function.Supplier<[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<O,​I>> behaviorInterceptor,
		                                         [Behavior](../Behavior.html "class in akka.actor.typed")<I> behavior)
		```
		
		Intercept messages and signals for a `behavior` by first passing them to a [`BehaviorInterceptor`](../BehaviorInterceptor.html "class in akka.actor.typed")
		
		 When a behavior returns a new behavior as a result of processing a signal or message and that behavior already contains
		 the same interceptor (defined by the [`BehaviorInterceptor.isSame(akka.actor.typed.BehaviorInterceptor<java.lang.Object, java.lang.Object>)`](../BehaviorInterceptor.html#isSame(akka.actor.typed.BehaviorInterceptor)) method) only the innermost interceptor
		 is kept. This is to protect against stack overflow when recursively defining behaviors.
		 
		
		
		 The interceptor is created with a factory function in case it has state and should not be shared.
		 If the interceptor has no state the same instance can be returned from the factory to avoid unnecessary object
		 creation.
		- #### monitor
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> monitor​(java.lang.Class<T> interceptMessageClass,
		                               [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> monitor,
		                               [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Behavior decorator that copies all received message to the designated
		 monitor [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") before invoking the wrapped behavior. The
		 wrapped behavior can evolve (i.e. return different behavior) without needing to be
		 wrapped in a `monitor` call again.
		 
		
		Parameters:
		`interceptMessageClass` \- Ensures that the messages of this class or a subclass thereof will be
		 sent to the `monitor`. Other message types (e.g. a private protocol)
		 will bypass the interceptor and be continue to the inner behavior.
		`monitor` \- The messages will also be sent to this `ActorRef`
		`behavior` \- The inner behavior that is decorated
		- #### logMessages
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> logMessages​([Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Behavior decorator that logs all messages to the [`Behavior`](../Behavior.html "class in akka.actor.typed") using the provided
		 [`LogOptions`](../LogOptions.html "class in akka.actor.typed") default configuration before invoking the wrapped behavior.
		 To include an MDC context then first wrap `logMessages` with `withMDC`.
		- #### logMessages
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> logMessages​([LogOptions](../LogOptions.html "class in akka.actor.typed") logOptions,
		                                   [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Behavior decorator that logs all messages to the [`Behavior`](../Behavior.html "class in akka.actor.typed") using the provided
		 [`LogOptions`](../LogOptions.html "class in akka.actor.typed") configuration before invoking the wrapped behavior.
		 To include an MDC context then first wrap `logMessages` with `withMDC`.
		- #### supervise
		
		
		
		```
		public <T> [Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.javadsl")<T> supervise​([Behavior](../Behavior.html "class in akka.actor.typed")<T> wrapped)
		```
		
		Wrap the given behavior such that it is restarted (i.e. reset to its
		 initial state) whenever it throws an exception of the given class or a
		 subclass thereof. Exceptions that are not subtypes of `Thr` will not be
		 caught and thus lead to the termination of the actor.
		 
		 It is possible to specify different supervisor strategies, such as restart,
		 resume, backoff.
		 
		
		
		 The `SupervisorStrategy` is only invoked for "non fatal" (see `NonFatal`)
		 exceptions.
		 
		
		
		 Example:
		 
		
		
		```
		
		 final Behavior[DbCommand] dbConnector = ...
		
		 final Behavior[DbCommand] dbRestarts =
		    Behaviors.supervise(dbConnector)
		      .onFailure(SupervisorStrategy.restart) // handle all NonFatal exceptions
		
		 final Behavior[DbCommand] dbSpecificResumes =
		    Behaviors.supervise(dbConnector)
		      .onFailure[IndexOutOfBoundsException](SupervisorStrategy.resume) // resume for IndexOutOfBoundsException exceptions
		 
		```
		- #### transformMessages
		
		
		
		```
		public <Outer,​Inner> [Behavior](../Behavior.html "class in akka.actor.typed")<Outer> transformMessages​(java.lang.Class<Outer> interceptMessageClass,
		                                                             [Behavior](../Behavior.html "class in akka.actor.typed")<Inner> behavior,
		                                                             java.util.function.Function<[PFBuilder](../../../japi/pf/PFBuilder.html "class in akka.japi.pf")<Outer,​Inner>,​[PFBuilder](../../../japi/pf/PFBuilder.html "class in akka.japi.pf")<Outer,​Inner>> selector)
		```
		
		Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
		 PartialFunction decides which message to pull in (those that it is defined
		 at) and may transform the incoming message to place them into the wrapped
		 Behavior\&rsquo;s type hierarchy. Signals are not transformed.
		 
		 Example:
		 
		
		
		```
		
		   Behavior<String> s = Behaviors.receive((ctx, msg) -> {
		      return Behaviors.same();
		    });
		   Behavior<Number> n = Behaviors.transformMessages(Number.class, s, pf ->
		     pf
		         .match(BigInteger.class, i -> "BigInteger(" + i + ")")
		         .match(BigDecimal.class, d -> "BigDecimal(" + d + ")")
		         // drop all other kinds of Number
		       );
		 
		```
		
		
		
		Parameters:
		`interceptMessageClass` \- Ensures that only messages of this class or a subclass thereof will be
		 intercepted. Other message types (e.g. a private protocol) will bypass
		 the interceptor and be continue to the inner behavior untouched.
		`behavior` \- the behavior that will receive the selected messages
		`selector` \- a partial function builder for describing the selection and
		 transformation
		Returns:
		a behavior of the `Outer` type
		- #### withTimers
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> withTimers​([Function](../../../japi/function/Function.html "interface in akka.japi.function")<[TimerScheduler](TimerScheduler.html "interface in akka.actor.typed.javadsl")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)
		```
		
		Support for scheduled `self` messages in an actor.
		 It takes care of the lifecycle of the timers such as cancelling them when the actor
		 is restarted or stopped.
		 
		
		See Also:
		[`TimerScheduler`](TimerScheduler.html "interface in akka.actor.typed.javadsl")
		- #### withMdc
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> withMdc​(java.lang.Class<T> interceptMessageClass,
		                               [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Map<java.lang.String,​java.lang.String>> mdcForMessage,
		                               [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Per message MDC (Mapped Diagnostic Context) logging.
		 
		
		Parameters:
		`interceptMessageClass` \- Ensures that only messages of this class or a subclass thereof will be
		 intercepted. Other message types (e.g. a private protocol) will bypass
		 the interceptor and be continue to the inner behavior untouched.
		`mdcForMessage` \- Is invoked before each message is handled, allowing to setup MDC, MDC is cleared after
		 each message processing by the inner behavior is done.
		`behavior` \- The actual behavior handling the messages, the MDC is used for the log entries logged through
		 `ActorContext.log`
		- #### withMdc
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> withMdc​(java.lang.Class<T> interceptMessageClass,
		                               java.util.Map<java.lang.String,​java.lang.String> staticMdc,
		                               [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Static MDC (Mapped Diagnostic Context)
		 
		
		Parameters:
		`interceptMessageClass` \- Ensures that only messages of this class or a subclass thereof will be
		 intercepted. Other message types (e.g. a private protocol) will bypass
		 the interceptor and be continue to the inner behavior untouched.
		`staticMdc` \- This MDC is setup in the logging context for every message
		`behavior` \- The actual behavior handling the messages, the MDC is used for the log entries logged through
		 `ActorContext.log`
		- #### withMdc
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> withMdc​(java.lang.Class<T> interceptMessageClass,
		                               java.util.Map<java.lang.String,​java.lang.String> staticMdc,
		                               [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Map<java.lang.String,​java.lang.String>> mdcForMessage,
		                               [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Combination of static and per message MDC (Mapped Diagnostic Context).
		 
		 Each message will get the static MDC plus the MDC returned for the message. If the same key
		 are in both the static and the per message MDC the per message one overwrites the static one
		 in the resulting log entries.
		 
		
		
		 \* The `staticMdc` or `mdcForMessage` may be empty.
		 
		
		
		
		Parameters:
		`interceptMessageClass` \- Ensures that only messages of this class or a subclass thereof will be
		 intercepted. Other message types (e.g. a private protocol) will bypass
		 the interceptor and be continue to the inner behavior untouched.
		`staticMdc` \- A static MDC applied for each message
		`mdcForMessage` \- Is invoked before each message is handled, allowing to setup MDC, MDC is cleared after
		 each message processing by the inner behavior is done.
		`behavior` \- The actual behavior handling the messages, the MDC is used for the log entries logged through
		 `ActorContext.log`

## Code Examples

### Example 1: supervise

```text
final Behavior[DbCommand] dbConnector = ...

 final Behavior[DbCommand] dbRestarts =
    Behaviors.supervise(dbConnector)
      .onFailure(SupervisorStrategy.restart) // handle all NonFatal exceptions

 final Behavior[DbCommand] dbSpecificResumes =
    Behaviors.supervise(dbConnector)
      .onFailure[IndexOutOfBoundsException](SupervisorStrategy.resume) // resume for IndexOutOfBoundsException exceptions
```

### Example 2: transformMessages

```text
Behavior<String> s = Behaviors.receive((ctx, msg) -> {
      return Behaviors.same();
    });
   Behavior<Number> n = Behaviors.transformMessages(Number.class, s, pf ->
     pf
         .match(BigInteger.class, i -> "BigInteger(" + i + ")")
         .match(BigDecimal.class, d -> "BigDecimal(" + d + ")")
         // drop all other kinds of Number
       );
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/LogOptions.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/BehaviorBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Behaviors$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Behaviors.Supervise.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/StashBuffer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/TimerScheduler.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Function.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Effect.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/PFBuilder.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Behaviors$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Behaviors$.html)*
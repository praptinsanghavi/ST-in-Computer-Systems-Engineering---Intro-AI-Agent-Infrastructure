---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:05:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/ActorContext.html
title: ActorContext
---

# ActorContext

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Interface ActorContext\<T\>

- All Superinterfaces:
`[ClassicActorContextProvider](../../ClassicActorContextProvider.html "interface in akka.actor")`, `[TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<T>`

All Known Subinterfaces:
`[ActorContextImpl](../internal/ActorContextImpl.html "interface in akka.actor.typed.internal")<T>`

---

```
public interface ActorContext<T>
extends [TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<T>, [ClassicActorContextProvider](../../ClassicActorContextProvider.html "interface in akka.actor")
```

An Actor is given by the combination of a `Behavior` and a context in
 which this behavior is executed. As per the Actor Model an Actor can perform
 the following actions when processing a message:
 
 \- send a finite number of messages to other Actors it knows
 \- create a finite number of Actors
 \- designate the behavior for the next message
 

 In Akka the first capability is accessed by using the `tell` method
 on an `ActorRef`, the second is provided by [`spawn(akka.actor.typed.Behavior<U>, java.lang.String)`](#spawn(akka.actor.typed.Behavior,java.lang.String))
 and the third is implicit in the signature of `Behavior` in that the next
 behavior is always returned from the message processing logic.
 

 An `ActorContext` in addition provides access to the Actor\&rsquo;s own identity (\&ldquo;`getSelf`\&rdquo;),
 the `ActorSystem` it is part of, methods for querying the list of child Actors it
 created, access to `Terminated` and timed message scheduling.
 

 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Req,​Res>void` | `[ask](#ask(java.lang.Class,akka.actor.typed.RecipientRef,java.time.Duration,akka.japi.function.Function,akka.japi.function.Function2))​(java.lang.Class<Res> resClass,  [RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,  java.time.Duration responseTimeout,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> createRequest,  [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<Res,​java.lang.Throwable,​[T](ActorContext.html "type parameter in ActorContext")> applyToResponse)` | Perform a single request\-response message interaction with another actor, and transform the messages back to  the protocol of this actor. |
	| `<Req,​Res>void` | `[askWithStatus](#askWithStatus(java.lang.Class,akka.actor.typed.RecipientRef,java.time.Duration,akka.japi.function.Function,akka.japi.function.Function2))​(java.lang.Class<Res> resClass,  [RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,  java.time.Duration responseTimeout,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​Req> createRequest,  [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<Res,​java.lang.Throwable,​[T](ActorContext.html "type parameter in ActorContext")> applyToResponse)` | The same as [`<Req,Res>ask(java.lang.Class<Res>,akka.actor.typed.RecipientRef<Req>,java.time.Duration,akka.japi.function.Function<akka.actor.typed.ActorRef<Res>,Req>,akka.japi.function.Function2<Res,java.lang.Throwable,T>)`](#ask(java.lang.Class,akka.actor.typed.RecipientRef,java.time.Duration,akka.japi.function.Function,akka.japi.function.Function2)) but only for requests that result in a response of type [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContext.html "type parameter in ActorContext")>` | `[asScala](#asScala())()` | Get the `scaladsl` of this `ActorContext`. |
	| `void` | `[cancelReceiveTimeout](#cancelReceiveTimeout())()` | Cancel the sending of receive timeout notifications. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")>` | `[delegate](#delegate(akka.actor.typed.Behavior,T))​([Behavior](../Behavior.html "class in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")> delegator,  [T](ActorContext.html "type parameter in ActorContext") msg)` | Delegate message and signal's execution by given [`Behavior`](../Behavior.html "class in akka.actor.typed")  using `Behavior.interpretMessage` or `Behavior.interpretSignal` |
	| `java.util.Optional<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<java.lang.Void>>` | `[getChild](#getChild(java.lang.String))​(java.lang.String name)` | The named child Actor if it is alive. |
	| `java.util.List<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<java.lang.Void>>` | `[getChildren](#getChildren())()` | The list of child Actors created by this Actor during its lifetime that  are still alive, in no particular order. |
	| `scala.concurrent.ExecutionContextExecutor` | `[getExecutionContext](#getExecutionContext())()` | This Actor\&rsquo;s execution context. |
	| `org.slf4j.Logger` | `[getLog](#getLog())()` | An actor specific logger. |
	| `[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")>` | `[getSelf](#getSelf())()` | The identity of this Actor, bound to the lifecycle of this Actor instance. |
	| `[ActorSystem](../ActorSystem.html "class in akka.actor.typed")<java.lang.Void>` | `[getSystem](#getSystem())()` | The `ActorSystem` to which this Actor belongs. |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[messageAdapter](#messageAdapter(java.lang.Class,akka.japi.function.Function))​(java.lang.Class<U> messageClass,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<U,​[T](ActorContext.html "type parameter in ActorContext")> f)` | Create a message adapter that will convert or wrap messages such that other Actor\&rsquo;s  protocols can be ingested by this Actor. |
	| `<Value> void` | `[pipeToSelf](#pipeToSelf(java.util.concurrent.CompletionStage,akka.japi.function.Function2))​(java.util.concurrent.CompletionStage<Value> future,  [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<Value,​java.lang.Throwable,​[T](ActorContext.html "type parameter in ActorContext")> applyToResult)` | Sends the result of the given `CompletionStage` to this Actor (\&ldquo;`self`\&rdquo;), after adapted it with  the given function. |
	| `<U> [Cancellable](../../Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(java.time.Duration,akka.actor.typed.ActorRef,U))​(java.time.Duration delay,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> target,  U msg)` | Schedule the sending of the given message to the given target Actor after  the given time period has elapsed. |
	| `void` | `[setLoggerName](#setLoggerName(java.lang.Class))​(java.lang.Class<?> clazz)` | Replace the current logger (or initialize a new logger if the logger was not touched before) with one that  has ghe given class name as logger name. |
	| `void` | `[setLoggerName](#setLoggerName(java.lang.String))​(java.lang.String name)` | Replace the current logger (or initialize a new logger if the logger was not touched before) with one that  has ghe given name as logger name. |
	| `void` | `[setReceiveTimeout](#setReceiveTimeout(java.time.Duration,T))​(java.time.Duration timeout,  [T](ActorContext.html "type parameter in ActorContext") msg)` | Schedule the sending of a notification in case no other  message is received during the given period of time. |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[spawn](#spawn(akka.actor.typed.Behavior,java.lang.String))​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior,  java.lang.String name)` | Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") and with the given name. |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[spawn](#spawn(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props))​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior,  java.lang.String name,  [Props](../Props.html "class in akka.actor.typed") props)` | Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") and with the given name. |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[spawnAnonymous](#spawnAnonymous(akka.actor.typed.Behavior))​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior)` | Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") under a randomly chosen name. |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[spawnAnonymous](#spawnAnonymous(akka.actor.typed.Behavior,akka.actor.typed.Props))​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior,  [Props](../Props.html "class in akka.actor.typed") props)` | Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") under a randomly chosen name. |
	| `<U> void` | `[stop](#stop(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> child)` | Force the child Actor under the given name to terminate after it finishes  processing its current message. |
	| `<U> void` | `[unwatch](#unwatch(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other)` | Revoke the registration established by `watch`. |
	| `<U> void` | `[watch](#watch(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other)` | Register for `Terminated` notification once the Actor identified by the  given `ActorRef` terminates. |
	| `<U> void` | `[watchWith](#watchWith(akka.actor.typed.ActorRef,T))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other,  [T](ActorContext.html "type parameter in ActorContext") msg)` | Register for termination notification with a custom message once the Actor identified by the  given `ActorRef` terminates. |
	
	
		- ### Methods inherited from interface akka.actor.[ClassicActorContextProvider](../../ClassicActorContextProvider.html "interface in akka.actor")
		
		
		`[classicActorContext](../../ClassicActorContextProvider.html#classicActorContext())`
		- ### Methods inherited from interface akka.actor.typed.[TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")
		
		
		`[asJava](../TypedActorContext.html#asJava())`

- - ### Method Detail
	
	
	
		- #### asScala
		
		
		
		```
		[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContext.html "type parameter in ActorContext")> asScala()
		```
		
		Get the `scaladsl` of this `ActorContext`.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[asScala](../TypedActorContext.html#asScala())` in interface `[TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")>`
		- #### ask
		
		
		
		```
		<Req,​Res> void ask​(java.lang.Class<Res> resClass,
		                         [RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,
		                         java.time.Duration responseTimeout,
		                         [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> createRequest,
		                         [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<Res,​java.lang.Throwable,​[T](ActorContext.html "type parameter in ActorContext")> applyToResponse)
		```
		
		Perform a single request\-response message interaction with another actor, and transform the messages back to
		 the protocol of this actor.
		 
		 The interaction has a timeout (to avoid a resource leak). If the timeout hits without any response it
		 will be passed as an `TimeoutException` to the `applyToResponse` function.
		 
		
		
		 For other messaging patterns with other actors, see [`messageAdapter(java.lang.Class<U>, akka.japi.function.Function<U, T>)`](#messageAdapter(java.lang.Class,akka.japi.function.Function)).
		 
		
		
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		 
		
		
		
		Parameters:
		`createRequest` \- A function that creates a message for the other actor, containing the provided `ActorRef[Res]` that
		 the other actor can send a message back through.
		`applyToResponse` \- Transforms the response from the `target` into a message this actor understands.
		 Will be invoked with either the response message or an AskTimeoutException failed or
		 potentially another exception if the remote actor is classic and sent a
		 [`Status.Failure`](../../Status.Failure.html "class in akka.actor") as response. The returned message of type `T` is then
		 fed into this actor as a message. Should be a pure function but is executed inside
		 the actor when the response arrives so can safely touch the actor internals. If this
		 function throws an exception it is just as if the normal message receiving logic would
		 throw.
		- #### askWithStatus
		
		
		
		```
		<Req,​Res> void askWithStatus​(java.lang.Class<Res> resClass,
		                                   [RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,
		                                   java.time.Duration responseTimeout,
		                                   [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​Req> createRequest,
		                                   [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<Res,​java.lang.Throwable,​[T](ActorContext.html "type parameter in ActorContext")> applyToResponse)
		```
		
		The same as [`<Req,Res>ask(java.lang.Class<Res>,akka.actor.typed.RecipientRef<Req>,java.time.Duration,akka.japi.function.Function<akka.actor.typed.ActorRef<Res>,Req>,akka.japi.function.Function2<Res,java.lang.Throwable,T>)`](#ask(java.lang.Class,akka.actor.typed.RecipientRef,java.time.Duration,akka.japi.function.Function,akka.japi.function.Function2)) but only for requests that result in a response of type [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern").
		 If the response is a [`StatusReply.success(T)`](../../../pattern/StatusReply.html#success(T)) the returned future is completed successfully with the wrapped response.
		 If the status response is a [`StatusReply.error(java.lang.String)`](../../../pattern/StatusReply.html#error(java.lang.String)) the returned future will be failed with the
		 exception in the error (normally a [`StatusReply.ErrorMessage`](../../../pattern/StatusReply.ErrorMessage.html "class in akka.pattern")).
		- #### cancelReceiveTimeout
		
		
		
		```
		void cancelReceiveTimeout()
		```
		
		Cancel the sending of receive timeout notifications.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### delegate
		
		
		
		```
		[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")> delegate​([Behavior](../Behavior.html "class in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")> delegator,
		                     [T](ActorContext.html "type parameter in ActorContext") msg)
		```
		
		Delegate message and signal's execution by given [`Behavior`](../Behavior.html "class in akka.actor.typed")
		 using `Behavior.interpretMessage` or `Behavior.interpretSignal`
		
		 note: if given [`Behavior`](../Behavior.html "class in akka.actor.typed") resulting `Behaviors.same` that will cause context switching to the given behavior
		 and if result is `Behaviors.unhandled` that will trigger the `akka.actor.typed.scaladsl.ActorContext.onUnhandled`
		 then switching to the given behavior.
		- #### getChild
		
		
		
		```
		java.util.Optional<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<java.lang.Void>> getChild​(java.lang.String name)
		```
		
		The named child Actor if it is alive.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### getChildren
		
		
		
		```
		java.util.List<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<java.lang.Void>> getChildren()
		```
		
		The list of child Actors created by this Actor during its lifetime that
		 are still alive, in no particular order.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### getExecutionContext
		
		
		
		```
		scala.concurrent.ExecutionContextExecutor getExecutionContext()
		```
		
		This Actor\&rsquo;s execution context. It can be used to run asynchronous tasks
		 like `Future` combinators.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		- #### getLog
		
		
		
		```
		org.slf4j.Logger getLog()
		```
		
		An actor specific logger.
		 
		 The logger name will be an estimated source class for the actor which is calculated when the
		 logger is first used (the logger is lazily created upon first use). If this yields the wrong
		 class or another class is preferred this can be changed with `setLoggerName`.
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### getSelf
		
		
		
		```
		[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")> getSelf()
		```
		
		The identity of this Actor, bound to the lifecycle of this Actor instance.
		 An Actor with the same name that lives before or after this instance will
		 have a different `ActorRef`.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		- #### getSystem
		
		
		
		```
		[ActorSystem](../ActorSystem.html "class in akka.actor.typed")<java.lang.Void> getSystem()
		```
		
		The `ActorSystem` to which this Actor belongs.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		- #### messageAdapter
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> messageAdapter​(java.lang.Class<U> messageClass,
		                               [Function](../../../japi/function/Function.html "interface in akka.japi.function")<U,​[T](ActorContext.html "type parameter in ActorContext")> f)
		```
		
		Create a message adapter that will convert or wrap messages such that other Actor\&rsquo;s
		 protocols can be ingested by this Actor.
		 
		 You can register several message adapters for different message classes.
		 It's only possible to have one message adapter per message class to make sure
		 that the number of adapters are not growing unbounded if registered repeatedly.
		 That also means that a registered adapter will replace an existing adapter for
		 the same message class.
		 
		
		
		 A message adapter will be used if the message class matches the given class or
		 is a subclass thereof. The registered adapters are tried in reverse order of
		 their registration order, i.e. the last registered first.
		 
		
		
		 A message adapter (and the returned `ActorRef`) has the same lifecycle as
		 this actor. It's recommended to register the adapters in a top level
		 `Behaviors.setup` or constructor of `AbstractBehavior` but it's possible to
		 register them later also if needed. Message adapters don't have to be stopped since
		 they consume no resources other than an entry in an internal `Map` and the number
		 of adapters are bounded since it's only possible to have one per message class.
		 
		
		
		 The function is running in this actor and can safely access state of it.
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### pipeToSelf
		
		
		
		```
		<Value> void pipeToSelf​(java.util.concurrent.CompletionStage<Value> future,
		                        [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<Value,​java.lang.Throwable,​[T](ActorContext.html "type parameter in ActorContext")> applyToResult)
		```
		
		Sends the result of the given `CompletionStage` to this Actor (\&ldquo;`self`\&rdquo;), after adapted it with
		 the given function.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		- #### scheduleOnce
		
		
		
		```
		<U> [Cancellable](../../Cancellable.html "interface in akka.actor") scheduleOnce​(java.time.Duration delay,
		                             [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> target,
		                             U msg)
		```
		
		Schedule the sending of the given message to the given target Actor after
		 the given time period has elapsed. The scheduled action can be cancelled
		 by invoking [`Cancellable.cancel()`](../../Cancellable.html#cancel()) on the returned
		 handle.
		 
		 For scheduling messages to the actor itself, use `Behaviors.withTimers`
		
		
		
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		- #### setLoggerName
		
		
		
		```
		void setLoggerName​(java.lang.String name)
		```
		
		Replace the current logger (or initialize a new logger if the logger was not touched before) with one that
		 has ghe given name as logger name. Logger source MDC entry "akkaSource" will be the actor path.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### setLoggerName
		
		
		
		```
		void setLoggerName​(java.lang.Class<?> clazz)
		```
		
		Replace the current logger (or initialize a new logger if the logger was not touched before) with one that
		 has ghe given class name as logger name. Logger source MDC entry "akkaSource" will be the actor path.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### setReceiveTimeout
		
		
		
		```
		void setReceiveTimeout​(java.time.Duration timeout,
		                       [T](ActorContext.html "type parameter in ActorContext") msg)
		```
		
		Schedule the sending of a notification in case no other
		 message is received during the given period of time. The timeout starts anew
		 with each received message. Use `cancelReceiveTimeout` to switch off this
		 mechanism.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### spawn
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> spawn​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior,
		                      java.lang.String name)
		```
		
		Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") and with the given name.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### spawn
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> spawn​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior,
		                      java.lang.String name,
		                      [Props](../Props.html "class in akka.actor.typed") props)
		```
		
		Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") and with the given name.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### spawnAnonymous
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> spawnAnonymous​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior)
		```
		
		Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") under a randomly chosen name.
		 It is good practice to name Actors wherever practical.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### spawnAnonymous
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> spawnAnonymous​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior,
		                               [Props](../Props.html "class in akka.actor.typed") props)
		```
		
		Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") under a randomly chosen name.
		 It is good practice to name Actors wherever practical.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### stop
		
		
		
		```
		<U> void stop​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> child)
		```
		
		Force the child Actor under the given name to terminate after it finishes
		 processing its current message. Nothing happens if the ActorRef is a child that is already stopped.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		 
		
		
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the given actor ref is not a direct child of this actor
		- #### unwatch
		
		
		
		```
		<U> void unwatch​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other)
		```
		
		Revoke the registration established by `watch`. A `Terminated`
		 notification will not subsequently be received for the referenced Actor.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### watch
		
		
		
		```
		<U> void watch​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other)
		```
		
		Register for `Terminated` notification once the Actor identified by the
		 given `ActorRef` terminates. This message is also sent when the watched actor
		 is on a node that has been removed from the cluster when using Akka Cluster.
		 
		`watch` is idempotent if it is not mixed with `watchWith`.
		 
		
		
		 It will fail with an `IllegalStateException` if the same subject was watched before using `watchWith`.
		 To clear the termination message, unwatch first.
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### watchWith
		
		
		
		```
		<U> void watchWith​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other,
		                   [T](ActorContext.html "type parameter in ActorContext") msg)
		```
		
		Register for termination notification with a custom message once the Actor identified by the
		 given `ActorRef` terminates. This message is also sent when the watched actor
		 is on a node that has been removed from the cluster when using Akka Cluster.
		 
		`watchWith` is idempotent if it is called with the same `msg` and not mixed with `watch`.
		 
		
		
		 It will fail with an `IllegalStateException` if the same subject was watched before using `watch` or `watchWith` with
		 another termination message. To change the termination message, unwatch first.
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/internal/ActorContextImpl.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka-core/2.6/akka/pattern/StatusReply.ErrorMessage.html
- https://doc.akka.io/japi/akka-core/2.6/akka/pattern/StatusReply.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/ActorContext.html](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/ActorContext.html)*
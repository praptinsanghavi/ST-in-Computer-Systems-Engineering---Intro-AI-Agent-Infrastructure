---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html
title: ActorContext
---

# ActorContext

## Content

Package [akka.actor.typed.scaladsl](package-summary.html)
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
 

 In Akka the first capability is accessed by using the `!` or `tell` method
 on an `ActorRef`, the second is provided by [`spawn(akka.actor.typed.Behavior<U>, java.lang.String, akka.actor.typed.Props)`](#spawn(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props))
 and the third is implicit in the signature of `Behavior` in that the next
 behavior is always returned from the message processing logic.
 

 An `ActorContext` in addition provides access to the Actor\&rsquo;s own identity (\&ldquo;`self`\&rdquo;),
 the `ActorSystem` it is part of, methods for querying the list of child Actors it
 created, access to `Terminated` and timed message scheduling.
 

 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContext.html "type parameter in ActorContext")>` | `[asJava](#asJava())()` | Get the `javadsl` of this `ActorContext`. |
	| `<Req,​Res>void` | `[ask](#ask(akka.actor.typed.RecipientRef,scala.Function1,scala.Function1,akka.util.Timeout,scala.reflect.ClassTag))​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,  scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> createRequest,  scala.Function1<scala.util.Try<Res>,​[T](ActorContext.html "type parameter in ActorContext")> mapResponse,  [Timeout](../../../util/Timeout.html "class in akka.util") responseTimeout,  scala.reflect.ClassTag<Res> classTag)` | Perform a single request\-response message interaction with another actor, and transform the messages back to  the protocol of this actor. |
	| `<Req,​Res>void` | `[askWithStatus](#askWithStatus(akka.actor.typed.RecipientRef,scala.Function1,scala.Function1,akka.util.Timeout,scala.reflect.ClassTag))​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,  scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​Req> createRequest,  scala.Function1<scala.util.Try<Res>,​[T](ActorContext.html "type parameter in ActorContext")> mapResponse,  [Timeout](../../../util/Timeout.html "class in akka.util") responseTimeout,  scala.reflect.ClassTag<Res> classTag)` | The same as [`<Req,Res>ask(akka.actor.typed.RecipientRef<Req>,scala.Function1<akka.actor.typed.ActorRef<Res>,Req>,scala.Function1<scala.util.Try<Res>,T>,akka.util.Timeout,scala.reflect.ClassTag<Res>)`](#ask(akka.actor.typed.RecipientRef,scala.Function1,scala.Function1,akka.util.Timeout,scala.reflect.ClassTag)) but only for requests that result in a response of type [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `void` | `[cancelAllTimers](#cancelAllTimers())()` | INTERNAL API |
	| `void` | `[cancelReceiveTimeout](#cancelReceiveTimeout())()` | Cancel the sending of receive timeout notifications. |
	| `void` | `[checkCurrentActorThread](#checkCurrentActorThread())()` | INTERNAL API |
	| `scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>>` | `[child](#child(java.lang.String))​(java.lang.String name)` | The named child Actor if it is alive. |
	| `scala.collection.Iterable<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>>` | `[children](#children())()` | The list of child Actors created by this Actor during its lifetime that  are still alive, in no particular order. |
	| `void` | `[clearCurrentActorThread](#clearCurrentActorThread())()` | INTERNAL API |
	| `void` | `[clearMdc](#clearMdc())()` | INTERNAL API |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")>` | `[currentBehavior](#currentBehavior())()` | INTERNAL API |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")>` | `[delegate](#delegate(akka.actor.typed.Behavior,T))​([Behavior](../Behavior.html "class in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")> delegator,  [T](ActorContext.html "type parameter in ActorContext") msg)` | Delegate message and signal's execution by given [`Behavior`](../Behavior.html "class in akka.actor.typed")  using `Behavior.interpretMessage` or `Behavior.interpretSignal` |
	| `scala.concurrent.ExecutionContextExecutor` | `[executionContext](#executionContext())()` | This Actor\&rsquo;s execution context. |
	| `boolean` | `[hasTimer](#hasTimer())()` | INTERNAL API |
	| `org.slf4j.Logger` | `[log](#log())()` | An actor specific logger. |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[messageAdapter](#messageAdapter(scala.Function1,scala.reflect.ClassTag))​(scala.Function1<U,​[T](ActorContext.html "type parameter in ActorContext")> f,  scala.reflect.ClassTag<U> evidence$1)` | Create a message adapter that will convert or wrap messages such that other Actor\&rsquo;s  protocols can be ingested by this Actor. |
	| `void` | `[onUnhandled](#onUnhandled(T))​([T](ActorContext.html "type parameter in ActorContext") msg)` | INTERNAL API |
	| `<Value> void` | `[pipeToSelf](#pipeToSelf(scala.concurrent.Future,scala.Function1))​(scala.concurrent.Future<Value> future,  scala.Function1<scala.util.Try<Value>,​[T](ActorContext.html "type parameter in ActorContext")> mapResult)` | Sends the result of the given `Future` to this Actor (\&ldquo;`self`\&rdquo;), after adapted it with  the given function. |
	| `<U> [Cancellable](../../Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(scala.concurrent.duration.FiniteDuration,akka.actor.typed.ActorRef,U))​(scala.concurrent.duration.FiniteDuration delay,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> target,  U msg)` | Schedule the sending of the given message to the given target Actor after  the given time period has elapsed. |
	| `[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")>` | `[self](#self())()` | The identity of this Actor, bound to the lifecycle of this Actor instance. |
	| `void` | `[setCurrentActorThread](#setCurrentActorThread())()` | INTERNAL API |
	| `void` | `[setLoggerName](#setLoggerName(java.lang.Class))​(java.lang.Class<?> clazz)` | Replace the current logger (or initialize a new logger if the logger was not touched before) with one that  has the given class name as logger name. |
	| `void` | `[setLoggerName](#setLoggerName(java.lang.String))​(java.lang.String name)` | Replace the current logger (or initialize a new logger if the logger was not touched before) with one that  has the given name as logger name. |
	| `void` | `[setReceiveTimeout](#setReceiveTimeout(scala.concurrent.duration.FiniteDuration,T))​(scala.concurrent.duration.FiniteDuration timeout,  [T](ActorContext.html "type parameter in ActorContext") msg)` | Schedule the sending of a notification in case no other  message is received during the given period of time. |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[spawn](#spawn(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props))​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior,  java.lang.String name,  [Props](../Props.html "class in akka.actor.typed") props)` | Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") and with the given name. |
	| `<U> [Props](../Props.html "class in akka.actor.typed")` | `[spawn$default$3](#spawn$default$3())()` | Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") and with the given name. |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[spawnAnonymous](#spawnAnonymous(akka.actor.typed.Behavior,akka.actor.typed.Props))​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior,  [Props](../Props.html "class in akka.actor.typed") props)` | Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") under a randomly chosen name. |
	| `<U> [Props](../Props.html "class in akka.actor.typed")` | `[spawnAnonymous$default$2](#spawnAnonymous$default$2())()` |  |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[spawnMessageAdapter](#spawnMessageAdapter(scala.Function1))​(scala.Function1<U,​[T](ActorContext.html "type parameter in ActorContext")> f)` | INTERNAL API: See `spawnMessageAdapter` with name parameter |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[spawnMessageAdapter](#spawnMessageAdapter(scala.Function1,java.lang.String))​(scala.Function1<U,​[T](ActorContext.html "type parameter in ActorContext")> f,  java.lang.String name)` | INTERNAL API: It is currently internal because it's too easy to create  resource leaks by spawning adapters without stopping them. |
	| `<U> void` | `[stop](#stop(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> child)` | Force the child Actor under the given name to terminate after it finishes  processing its current message. |
	| `[ActorSystem](../ActorSystem.html "class in akka.actor.typed")<scala.runtime.Nothing$>` | `[system](#system())()` | The `ActorSystem` to which this Actor belongs. |
	| `<U> void` | `[unwatch](#unwatch(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other)` | Revoke the registration established by `watch`. |
	| `<U> void` | `[watch](#watch(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other)` | Register for [`Terminated`](../Terminated.html "class in akka.actor.typed") notification once the Actor identified by the  given `ActorRef` terminates. |
	| `<U> void` | `[watchWith](#watchWith(akka.actor.typed.ActorRef,T))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other,  [T](ActorContext.html "type parameter in ActorContext") msg)` | Register for termination notification with a custom message once the Actor identified by the  given `ActorRef` terminates. |
	
	
		- ### Methods inherited from interface akka.actor.[ClassicActorContextProvider](../../ClassicActorContextProvider.html "interface in akka.actor")
		
		
		`[classicActorContext](../../ClassicActorContextProvider.html#classicActorContext())`
		- ### Methods inherited from interface akka.actor.typed.[TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")
		
		
		`[asScala](../TypedActorContext.html#asScala())`

- - ### Method Detail
	
	
	
		- #### asJava
		
		
		
		```
		[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContext.html "type parameter in ActorContext")> asJava()
		```
		
		Get the `javadsl` of this `ActorContext`.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `Future` callbacks.
		
		
		
		Specified by:
		`[asJava](../TypedActorContext.html#asJava())` in interface `[TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")>`
		- #### ask
		
		
		
		```
		<Req,​Res> void ask​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,
		                         scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> createRequest,
		                         scala.Function1<scala.util.Try<Res>,​[T](ActorContext.html "type parameter in ActorContext")> mapResponse,
		                         [Timeout](../../../util/Timeout.html "class in akka.util") responseTimeout,
		                         scala.reflect.ClassTag<Res> classTag)
		```
		
		Perform a single request\-response message interaction with another actor, and transform the messages back to
		 the protocol of this actor.
		 
		 The interaction has a timeout (to avoid a resource leak). If the timeout hits without any response it
		 will be passed as a `Failure(``TimeoutException``)` to the `mapResponse` function
		 (this is the only "normal" way a `Failure` is passed to the function).
		 
		
		
		 For other messaging patterns with other actors, see [`messageAdapter(scala.Function1<U, T>, scala.reflect.ClassTag<U>)`](#messageAdapter(scala.Function1,scala.reflect.ClassTag)).
		 
		
		
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `Future` callbacks.
		 
		
		
		
		Parameters:
		`createRequest` \- A function that creates a message for the other actor, containing the provided `ActorRef[Res]` that
		 the other actor can send a message back through.
		`mapResponse` \- Transforms the response from the `target` into a message this actor understands.
		 Should be a pure function but is executed inside the actor when the response arrives
		 so can safely touch the actor internals. If this function throws an exception it is
		 just as if the normal message receiving logic would throw.
		- #### askWithStatus
		
		
		
		```
		<Req,​Res> void askWithStatus​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,
		                                   scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​Req> createRequest,
		                                   scala.Function1<scala.util.Try<Res>,​[T](ActorContext.html "type parameter in ActorContext")> mapResponse,
		                                   [Timeout](../../../util/Timeout.html "class in akka.util") responseTimeout,
		                                   scala.reflect.ClassTag<Res> classTag)
		```
		
		The same as [`<Req,Res>ask(akka.actor.typed.RecipientRef<Req>,scala.Function1<akka.actor.typed.ActorRef<Res>,Req>,scala.Function1<scala.util.Try<Res>,T>,akka.util.Timeout,scala.reflect.ClassTag<Res>)`](#ask(akka.actor.typed.RecipientRef,scala.Function1,scala.Function1,akka.util.Timeout,scala.reflect.ClassTag)) but only for requests that result in a response of type [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern").
		 If the response is a `akka.pattern.StatusReply.Success` the returned future is completed successfully with the wrapped response.
		 If the status response is a `akka.pattern.StatusReply.Error` the returned future will be failed with the
		 exception in the error (normally a [`StatusReply.ErrorMessage`](../../../pattern/StatusReply.ErrorMessage.html "class in akka.pattern")).
		- #### cancelAllTimers
		
		
		
		```
		void cancelAllTimers()
		```
		
		INTERNAL API
		- #### cancelReceiveTimeout
		
		
		
		```
		void cancelReceiveTimeout()
		```
		
		Cancel the sending of receive timeout notifications.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		- #### checkCurrentActorThread
		
		
		
		```
		void checkCurrentActorThread()
		```
		
		INTERNAL API
		- #### child
		
		
		
		```
		scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>> child​(java.lang.String name)
		```
		
		The named child Actor if it is alive.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		- #### children
		
		
		
		```
		scala.collection.Iterable<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>> children()
		```
		
		The list of child Actors created by this Actor during its lifetime that
		 are still alive, in no particular order.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		- #### clearCurrentActorThread
		
		
		
		```
		void clearCurrentActorThread()
		```
		
		INTERNAL API
		- #### clearMdc
		
		
		
		```
		void clearMdc()
		```
		
		INTERNAL API
		- #### currentBehavior
		
		
		
		```
		[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")> currentBehavior()
		```
		
		INTERNAL API
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
		- #### executionContext
		
		
		
		```
		scala.concurrent.ExecutionContextExecutor executionContext()
		```
		
		This Actor\&rsquo;s execution context. It can be used to run asynchronous tasks
		 like `Future` operators.
		 
		 This field is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `Future` callbacks.
		- #### hasTimer
		
		
		
		```
		boolean hasTimer()
		```
		
		INTERNAL API
		- #### log
		
		
		
		```
		org.slf4j.Logger log()
		```
		
		An actor specific logger.
		 
		 The logger name will be an estimated source class for the actor which is calculated when the
		 logger is first used (the logger is lazily created upon first use). If this yields the wrong
		 class or another class is preferred this can be changed with `setLoggerName`.
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		- #### messageAdapter
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> messageAdapter​(scala.Function1<U,​[T](ActorContext.html "type parameter in ActorContext")> f,
		                               scala.reflect.ClassTag<U> evidence$1)
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
		 \*
		 The function is running in this actor and can safely access state of it.
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		- #### onUnhandled
		
		
		
		```
		void onUnhandled​([T](ActorContext.html "type parameter in ActorContext") msg)
		```
		
		INTERNAL API
		- #### pipeToSelf
		
		
		
		```
		<Value> void pipeToSelf​(scala.concurrent.Future<Value> future,
		                        scala.Function1<scala.util.Try<Value>,​[T](ActorContext.html "type parameter in ActorContext")> mapResult)
		```
		
		Sends the result of the given `Future` to this Actor (\&ldquo;`self`\&rdquo;), after adapted it with
		 the given function.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `Future` callbacks.
		- #### scheduleOnce
		
		
		
		```
		<U> [Cancellable](../../Cancellable.html "interface in akka.actor") scheduleOnce​(scala.concurrent.duration.FiniteDuration delay,
		                             [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> target,
		                             U msg)
		```
		
		Schedule the sending of the given message to the given target Actor after
		 the given time period has elapsed. The scheduled action can be cancelled
		 by invoking [`Cancellable.cancel()`](../../Cancellable.html#cancel()) on the returned
		 handle.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `Future` callbacks.
		- #### self
		
		
		
		```
		[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[T](ActorContext.html "type parameter in ActorContext")> self()
		```
		
		The identity of this Actor, bound to the lifecycle of this Actor instance.
		 An Actor with the same name that lives before or after this instance will
		 have a different `ActorRef`.
		 
		 This field is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `Future` callbacks.
		- #### setCurrentActorThread
		
		
		
		```
		void setCurrentActorThread()
		```
		
		INTERNAL API
		- #### setLoggerName
		
		
		
		```
		void setLoggerName​(java.lang.String name)
		```
		
		Replace the current logger (or initialize a new logger if the logger was not touched before) with one that
		 has the given name as logger name. Logger source MDC entry "akkaSource" will be the actor path.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		- #### setLoggerName
		
		
		
		```
		void setLoggerName​(java.lang.Class<?> clazz)
		```
		
		Replace the current logger (or initialize a new logger if the logger was not touched before) with one that
		 has the given class name as logger name. Logger source MDC entry "akkaSource" will be the actor path.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		- #### setReceiveTimeout
		
		
		
		```
		void setReceiveTimeout​(scala.concurrent.duration.FiniteDuration timeout,
		                       [T](ActorContext.html "type parameter in ActorContext") msg)
		```
		
		Schedule the sending of a notification in case no other
		 message is received during the given period of time. The timeout starts anew
		 with each received message. Use `cancelReceiveTimeout` to switch off this
		 mechanism.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		- #### spawn
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> spawn​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior,
		                      java.lang.String name,
		                      [Props](../Props.html "class in akka.actor.typed") props)
		```
		
		Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") and with the given name.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		- #### spawn$default$3
		
		
		
		```
		<U> [Props](../Props.html "class in akka.actor.typed") spawn$default$3()
		```
		
		Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") and with the given name.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		- #### spawnAnonymous
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> spawnAnonymous​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior,
		                               [Props](../Props.html "class in akka.actor.typed") props)
		```
		
		Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") under a randomly chosen name.
		 It is good practice to name Actors wherever practical.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		- #### spawnAnonymous$default$2
		
		
		
		```
		<U> [Props](../Props.html "class in akka.actor.typed") spawnAnonymous$default$2()
		```
		- #### spawnMessageAdapter
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> spawnMessageAdapter​(scala.Function1<U,​[T](ActorContext.html "type parameter in ActorContext")> f,
		                                    java.lang.String name)
		```
		
		INTERNAL API: It is currently internal because it's too easy to create
		 resource leaks by spawning adapters without stopping them. `messageAdapter`
		 is the public API.
		 
		 Create a "lightweight" child actor that will convert or wrap messages such that
		 other Actor\&rsquo;s protocols can be ingested by this Actor. You are strongly advised
		 to cache these ActorRefs or to stop them when no longer needed.
		 
		
		
		 The name of the child actor will be composed of a unique identifier
		 starting with a dollar sign to which the given `name` argument is
		 appended, with an inserted hyphen between these two parts. Therefore
		 the given `name` argument does not need to be unique within the scope
		 of the parent actor.
		 
		
		
		 The function is applied inside the "parent" actor and can safely access
		 state of the "parent".
		- #### spawnMessageAdapter
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> spawnMessageAdapter​(scala.Function1<U,​[T](ActorContext.html "type parameter in ActorContext")> f)
		```
		
		INTERNAL API: See `spawnMessageAdapter` with name parameter
		- #### stop
		
		
		
		```
		<U> void stop​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> child)
		```
		
		Force the child Actor under the given name to terminate after it finishes
		 processing its current message. Nothing happens if the ActorRef is a child that is already stopped.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		 
		
		
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the given actor ref is not a direct child of this actor
		- #### system
		
		
		
		```
		[ActorSystem](../ActorSystem.html "class in akka.actor.typed")<scala.runtime.Nothing$> system()
		```
		
		The `ActorSystem` to which this Actor belongs.
		 
		 This field is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `Future` callbacks.
		- #### unwatch
		
		
		
		```
		<U> void unwatch​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other)
		```
		
		Revoke the registration established by `watch`. A `Terminated`
		 notification will not subsequently be received for the referenced Actor.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		- #### watch
		
		
		
		```
		<U> void watch​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other)
		```
		
		Register for [`Terminated`](../Terminated.html "class in akka.actor.typed") notification once the Actor identified by the
		 given `ActorRef` terminates. This message is also sent when the watched actor
		 is on a node that has been removed from the cluster when using Akka Cluster.
		 
		`watch` is idempotent if it is not mixed with `watchWith`.
		 
		
		
		 It will fail with an `IllegalStateException` if the same subject was watched before using `watchWith`.
		 To clear the termination message, unwatch first.
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		- #### watchWith
		
		
		
		```
		<U> void watchWith​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other,
		                   [T](ActorContext.html "type parameter in ActorContext") msg)
		```
		
		Register for termination notification with a custom message once the Actor identified by the
		 given `ActorRef` terminates. This message is also sent when the watched actor
		 is on a node that has been removed from the cluster when using using Akka Cluster.
		 
		`watchWith` is idempotent if it is called with the same `msg` and not mixed with `watch`.
		 
		
		
		 It will fail with an `IllegalStateException` if the same subject was watched before using `watch` or `watchWith` with
		 another termination message. To change the termination message, unwatch first.
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Terminated.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorContextImpl.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply.ErrorMessage.html
- https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html)*
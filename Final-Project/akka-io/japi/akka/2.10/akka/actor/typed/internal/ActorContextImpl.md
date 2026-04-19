---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:01:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/actor/typed/internal/ActorContextImpl.html
title: ActorContextImpl
---

# ActorContextImpl

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Interface ActorContextImpl\<T\>

- All Superinterfaces:
`[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<T>`, `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<T>`, `[ClassicActorContextProvider](../../ClassicActorContextProvider.html "interface in akka.actor")`, `[TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<T>`

---

```
public interface ActorContextImpl<T>
extends [TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<T>, [ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<T>, [ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<T>
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal")` |  |
	| `static class` | `[ActorContextImpl.LoggingContext$](ActorContextImpl.LoggingContext$.html "class in akka.actor.typed.internal")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[_currentActorThread_$eq](#_currentActorThread_$eq(%3Cany%3E))​(<any> x$1)` |  |
	| `void` | `[_logging_$eq](#_logging_$eq(%3Cany%3E))​(<any> x$1)` |  |
	| `void` | `[_messageAdapters_$eq](#_messageAdapters_$eq(scala.collection.immutable.List))​(scala.collection.immutable.List<scala.Tuple2<java.lang.Class<?>,​scala.Function1<java.lang.Object,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")>>> x$1)` |  |
	| `void` | `[_timer_$eq](#_timer_$eq(%3Cany%3E))​(<any> x$1)` |  |
	| `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>` | `[asJava](#asJava())()` | Get the `javadsl` of this `ActorContext`. |
	| `<Req,​Res>void` | `[ask](#ask(akka.actor.typed.RecipientRef,scala.Function1,scala.Function1,akka.util.Timeout,scala.reflect.ClassTag))​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,  scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> createRequest,  scala.Function1<scala.util.Try<Res>,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> mapResponse,  [Timeout](../../../util/Timeout.html "class in akka.util") responseTimeout,  scala.reflect.ClassTag<Res> classTag)` | Perform a single request\-response message interaction with another actor, and transform the messages back to  the protocol of this actor. |
	| `<Req,​Res>void` | `[ask](#ask(java.lang.Class,akka.actor.typed.RecipientRef,java.time.Duration,akka.japi.function.Function,akka.japi.function.Function2))​(java.lang.Class<Res> resClass,  [RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,  java.time.Duration responseTimeout,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> createRequest,  [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<Res,​java.lang.Throwable,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> applyToResponse)` | Perform a single request\-response message interaction with another actor, and transform the messages back to  the protocol of this actor. |
	| `<Req,​Res>void` | `[askWithStatus](#askWithStatus(akka.actor.typed.RecipientRef,scala.Function1,scala.Function1,akka.util.Timeout,scala.reflect.ClassTag))​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,  scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​Req> createRequest,  scala.Function1<scala.util.Try<Res>,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> mapResponse,  [Timeout](../../../util/Timeout.html "class in akka.util") responseTimeout,  scala.reflect.ClassTag<Res> classTag)` | The same as [`ActorContext.<Req,Res>ask(akka.actor.typed.RecipientRef<Req>,scala.Function1<akka.actor.typed.ActorRef<Res>,Req>,scala.Function1<scala.util.Try<Res>,T>,akka.util.Timeout,scala.reflect.ClassTag<Res>)`](../scaladsl/ActorContext.html#ask(akka.actor.typed.RecipientRef,scala.Function1,scala.Function1,akka.util.Timeout,scala.reflect.ClassTag)) but only for requests that result in a response of type [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `<Req,​Res>void` | `[askWithStatus](#askWithStatus(java.lang.Class,akka.actor.typed.RecipientRef,java.time.Duration,akka.japi.function.Function,akka.japi.function.Function2))​(java.lang.Class<Res> resClass,  [RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,  java.time.Duration responseTimeout,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​Req> createRequest,  [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<Res,​java.lang.Throwable,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> applyToResponse)` | The same as [`ActorContext.<Req,Res>ask(java.lang.Class<Res>,akka.actor.typed.RecipientRef<Req>,java.time.Duration,akka.japi.function.Function<akka.actor.typed.ActorRef<Res>,Req>,akka.japi.function.Function2<Res,java.lang.Throwable,T>)`](../javadsl/ActorContext.html#ask(java.lang.Class,akka.actor.typed.RecipientRef,java.time.Duration,akka.japi.function.Function,akka.japi.function.Function2)) but only for requests that result in a response of type [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>` | `[asScala](#asScala())()` | Get the `scaladsl` of this `ActorContext`. |
	| `void` | `[cancelAllTimers](#cancelAllTimers())()` | INTERNAL API |
	| `void` | `[checkCurrentActorThread](#checkCurrentActorThread())()` | INTERNAL API |
	| `void` | `[clearCurrentActorThread](#clearCurrentActorThread())()` | INTERNAL API |
	| `void` | `[clearMdc](#clearMdc())()` | INTERNAL API |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>` | `[delegate](#delegate(akka.actor.typed.Behavior,T))​([Behavior](../Behavior.html "class in akka.actor.typed")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")> delegator,  [T](ActorContextImpl.html "type parameter in ActorContextImpl") msg)` | Delegate message and signal's execution by given [`Behavior`](../Behavior.html "class in akka.actor.typed")  using `Behavior.interpretMessage` or `Behavior.interpretSignal` |
	| `java.util.Optional<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<java.lang.Void>>` | `[getChild](#getChild(java.lang.String))​(java.lang.String name)` | The named child Actor if it is alive. |
	| `java.util.List<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<java.lang.Void>>` | `[getChildren](#getChildren())()` | The list of child Actors created by this Actor during its lifetime that  are still alive, in no particular order. |
	| `scala.concurrent.ExecutionContextExecutor` | `[getExecutionContext](#getExecutionContext())()` | This Actor\&rsquo;s execution context. |
	| `org.slf4j.Logger` | `[getLog](#getLog())()` | An actor specific logger. |
	| `[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>` | `[getSelf](#getSelf())()` | The identity of this Actor, bound to the lifecycle of this Actor instance. |
	| `[ActorSystem](../ActorSystem.html "class in akka.actor.typed")<java.lang.Void>` | `[getSystem](#getSystem())()` | The `ActorSystem` to which this Actor belongs. |
	| `boolean` | `[hasCustomLoggerName](#hasCustomLoggerName())()` |  |
	| `boolean` | `[hasTimer](#hasTimer())()` | INTERNAL API |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[internalMessageAdapter](#internalMessageAdapter(java.lang.Class,scala.Function1))​(java.lang.Class<U> messageClass,  scala.Function1<U,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> f)` |  |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[internalSpawnMessageAdapter](#internalSpawnMessageAdapter(scala.Function1,java.lang.String))​(scala.Function1<U,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> f,  java.lang.String name)` | INTERNAL API: Needed to make Scala 2\.12 compiler happy if spawnMessageAdapter is overloaded for scaladsl/javadsl. |
	| `org.slf4j.Logger` | `[log](#log())()` | An actor specific logger. |
	| `[ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal")` | `[loggingContext](#loggingContext())()` |  |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[messageAdapter](#messageAdapter(java.lang.Class,akka.japi.function.Function))​(java.lang.Class<U> messageClass,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<U,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> f)` | Create a message adapter that will convert or wrap messages such that other Actor\&rsquo;s  protocols can be ingested by this Actor. |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[messageAdapter](#messageAdapter(scala.Function1,scala.reflect.ClassTag))​(scala.Function1<U,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> f,  scala.reflect.ClassTag<U> evidence$1)` | Create a message adapter that will convert or wrap messages such that other Actor\&rsquo;s  protocols can be ingested by this Actor. |
	| `void` | `[messageAdapterRef_$eq](#messageAdapterRef_$eq(%3Cany%3E))​(<any> x$1)` |  |
	| `scala.collection.immutable.List<scala.Tuple2<java.lang.Class<?>,​scala.Function1<java.lang.Object,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")>>>` | `[messageAdapters](#messageAdapters())()` | INTERNAL API |
	| `[TimerSchedulerCrossDslSupport](TimerSchedulerCrossDslSupport.html "interface in akka.actor.typed.internal")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>` | `[mkTimer](#mkTimer())()` |  |
	| `<Value> void` | `[pipeToSelf](#pipeToSelf(java.util.concurrent.CompletionStage,akka.japi.function.Function2))​(java.util.concurrent.CompletionStage<Value> future,  [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<Value,​java.lang.Throwable,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> applyToResult)` | Sends the result of the given `CompletionStage` to this Actor (\&ldquo;`self`\&rdquo;), after adapted it with  the given function. |
	| `<Value> void` | `[pipeToSelf](#pipeToSelf(scala.concurrent.Future,scala.Function1))​(scala.concurrent.Future<Value> future,  scala.Function1<scala.util.Try<Value>,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> mapResult)` | Sends the result of the given `Future` to this Actor (\&ldquo;`self`\&rdquo;), after adapted it with  the given function. |
	| `<U> [Cancellable](../../Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(java.time.Duration,akka.actor.typed.ActorRef,U))​(java.time.Duration delay,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> target,  U msg)` | Schedule the sending of the given message to the given target Actor after  the given time period has elapsed. |
	| `void` | `[setCurrentActorThread](#setCurrentActorThread())()` | INTERNAL API |
	| `void` | `[setLoggerName](#setLoggerName(java.lang.Class))​(java.lang.Class<?> clazz)` | Replace the current logger (or initialize a new logger if the logger was not touched before) with one that  has ghe given class name as logger name. |
	| `void` | `[setLoggerName](#setLoggerName(java.lang.String))​(java.lang.String name)` | Replace the current logger (or initialize a new logger if the logger was not touched before) with one that  has ghe given name as logger name. |
	| `void` | `[setReceiveTimeout](#setReceiveTimeout(java.time.Duration,T))​(java.time.Duration duration,  [T](ActorContextImpl.html "type parameter in ActorContextImpl") msg)` | Schedule the sending of a notification in case no other  message is received during the given period of time. |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[spawn](#spawn(akka.actor.typed.Behavior,java.lang.String))​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior,  java.lang.String name)` | Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") and with the given name. |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[spawnAnonymous](#spawnAnonymous(akka.actor.typed.Behavior))​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior)` | Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") under a randomly chosen name. |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[spawnMessageAdapter](#spawnMessageAdapter(scala.Function1))​(scala.Function1<U,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> f)` | INTERNAL API: See `spawnMessageAdapter` with name parameter |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[spawnMessageAdapter](#spawnMessageAdapter(scala.Function1,java.lang.String))​(scala.Function1<U,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> f,  java.lang.String name)` | INTERNAL API: It is currently internal because it's too easy to create  resource leaks by spawning adapters without stopping them. |
	| `[TimerSchedulerCrossDslSupport](TimerSchedulerCrossDslSupport.html "interface in akka.actor.typed.internal")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>` | `[timer](#timer())()` |  |
	
	
		- ### Methods inherited from interface akka.actor.typed.javadsl.[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")
		
		
		`[cancelReceiveTimeout](../javadsl/ActorContext.html#cancelReceiveTimeout()), [spawn](../javadsl/ActorContext.html#spawn(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props)), [spawnAnonymous](../javadsl/ActorContext.html#spawnAnonymous(akka.actor.typed.Behavior,akka.actor.typed.Props)), [stop](../javadsl/ActorContext.html#stop(akka.actor.typed.ActorRef)), [unwatch](../javadsl/ActorContext.html#unwatch(akka.actor.typed.ActorRef)), [watch](../javadsl/ActorContext.html#watch(akka.actor.typed.ActorRef)), [watchWith](../javadsl/ActorContext.html#watchWith(akka.actor.typed.ActorRef,T))`
		- ### Methods inherited from interface akka.actor.typed.scaladsl.[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")
		
		
		`[cancelReceiveTimeout](../scaladsl/ActorContext.html#cancelReceiveTimeout()), [child](../scaladsl/ActorContext.html#child(java.lang.String)), [children](../scaladsl/ActorContext.html#children()), [currentBehavior](../scaladsl/ActorContext.html#currentBehavior()), [executionContext](../scaladsl/ActorContext.html#executionContext()), [onUnhandled](../scaladsl/ActorContext.html#onUnhandled(T)), [scheduleOnce](../scaladsl/ActorContext.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,akka.actor.typed.ActorRef,U)), [self](../scaladsl/ActorContext.html#self()), [setReceiveTimeout](../scaladsl/ActorContext.html#setReceiveTimeout(scala.concurrent.duration.FiniteDuration,T)), [spawn](../scaladsl/ActorContext.html#spawn(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props)), [spawn$default$3](../scaladsl/ActorContext.html#spawn$default$3()), [spawnAnonymous](../scaladsl/ActorContext.html#spawnAnonymous(akka.actor.typed.Behavior,akka.actor.typed.Props)), [spawnAnonymous$default$2](../scaladsl/ActorContext.html#spawnAnonymous$default$2()), [stop](../scaladsl/ActorContext.html#stop(akka.actor.typed.ActorRef)), [system](../scaladsl/ActorContext.html#system()), [unwatch](../scaladsl/ActorContext.html#unwatch(akka.actor.typed.ActorRef)), [watch](../scaladsl/ActorContext.html#watch(akka.actor.typed.ActorRef)), [watchWith](../scaladsl/ActorContext.html#watchWith(akka.actor.typed.ActorRef,T))`
		- ### Methods inherited from interface akka.actor.[ClassicActorContextProvider](../../ClassicActorContextProvider.html "interface in akka.actor")
		
		
		`[classicActorContext](../../ClassicActorContextProvider.html#classicActorContext())`

- - ### Method Detail
	
	
	
		- #### \_logging\_$eq
		
		
		
		```
		void _logging_$eq​(<any> x$1)
		```
		- #### messageAdapterRef\_$eq
		
		
		
		```
		void messageAdapterRef_$eq​(<any> x$1)
		```
		- #### \_messageAdapters\_$eq
		
		
		
		```
		void _messageAdapters_$eq​(scala.collection.immutable.List<scala.Tuple2<java.lang.Class<?>,​scala.Function1<java.lang.Object,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")>>> x$1)
		```
		- #### \_timer\_$eq
		
		
		
		```
		void _timer_$eq​(<any> x$1)
		```
		- #### \_currentActorThread\_$eq
		
		
		
		```
		void _currentActorThread_$eq​(<any> x$1)
		```
		- #### timer
		
		
		
		```
		[TimerSchedulerCrossDslSupport](TimerSchedulerCrossDslSupport.html "interface in akka.actor.typed.internal")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")> timer()
		```
		- #### mkTimer
		
		
		
		```
		[TimerSchedulerCrossDslSupport](TimerSchedulerCrossDslSupport.html "interface in akka.actor.typed.internal")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")> mkTimer()
		```
		- #### hasTimer
		
		
		
		```
		boolean hasTimer()
		```
		
		Description copied from interface: `[ActorContext](../scaladsl/ActorContext.html#hasTimer())`
		INTERNAL API
		
		Specified by:
		`[hasTimer](../scaladsl/ActorContext.html#hasTimer())` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### cancelAllTimers
		
		
		
		```
		void cancelAllTimers()
		```
		
		Description copied from interface: `[ActorContext](../scaladsl/ActorContext.html#cancelAllTimers())`
		INTERNAL API
		
		Specified by:
		`[cancelAllTimers](../scaladsl/ActorContext.html#cancelAllTimers())` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### asJava
		
		
		
		```
		[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")> asJava()
		```
		
		Description copied from interface: `[TypedActorContext](../TypedActorContext.html#asJava())`
		Get the `javadsl` of this `ActorContext`.
		
		Specified by:
		`[asJava](../scaladsl/ActorContext.html#asJava())` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		Specified by:
		`[asJava](../TypedActorContext.html#asJava())` in interface `[TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### asScala
		
		
		
		```
		[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")> asScala()
		```
		
		Description copied from interface: `[TypedActorContext](../TypedActorContext.html#asScala())`
		Get the `scaladsl` of this `ActorContext`.
		
		Specified by:
		`[asScala](../javadsl/ActorContext.html#asScala())` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		Specified by:
		`[asScala](../TypedActorContext.html#asScala())` in interface `[TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### getChild
		
		
		
		```
		java.util.Optional<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<java.lang.Void>> getChild​(java.lang.String name)
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#getChild(java.lang.String))`
		The named child Actor if it is alive.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[getChild](../javadsl/ActorContext.html#getChild(java.lang.String))` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### getChildren
		
		
		
		```
		java.util.List<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<java.lang.Void>> getChildren()
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#getChildren())`
		The list of child Actors created by this Actor during its lifetime that
		 are still alive, in no particular order.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[getChildren](../javadsl/ActorContext.html#getChildren())` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### getExecutionContext
		
		
		
		```
		scala.concurrent.ExecutionContextExecutor getExecutionContext()
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#getExecutionContext())`
		This Actor\&rsquo;s execution context. It can be used to run asynchronous tasks
		 like `Future` combinators.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[getExecutionContext](../javadsl/ActorContext.html#getExecutionContext())` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### getSelf
		
		
		
		```
		[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")> getSelf()
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#getSelf())`
		The identity of this Actor, bound to the lifecycle of this Actor instance.
		 An Actor with the same name that lives before or after this instance will
		 have a different `ActorRef`.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[getSelf](../javadsl/ActorContext.html#getSelf())` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### getSystem
		
		
		
		```
		[ActorSystem](../ActorSystem.html "class in akka.actor.typed")<java.lang.Void> getSystem()
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#getSystem())`
		The `ActorSystem` to which this Actor belongs.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[getSystem](../javadsl/ActorContext.html#getSystem())` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### loggingContext
		
		
		
		```
		[ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal") loggingContext()
		```
		- #### log
		
		
		
		```
		org.slf4j.Logger log()
		```
		
		Description copied from interface: `[ActorContext](../scaladsl/ActorContext.html#log())`
		An actor specific logger.
		 
		 The logger name will be an estimated source class for the actor which is calculated when the
		 logger is first used (the logger is lazily created upon first use). If this yields the wrong
		 class or another class is preferred this can be changed with `setLoggerName`.
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `Future` callbacks.
		
		
		
		Specified by:
		`[log](../scaladsl/ActorContext.html#log())` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### getLog
		
		
		
		```
		org.slf4j.Logger getLog()
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#getLog())`
		An actor specific logger.
		 
		 The logger name will be an estimated source class for the actor which is calculated when the
		 logger is first used (the logger is lazily created upon first use). If this yields the wrong
		 class or another class is preferred this can be changed with `setLoggerName`.
		 
		
		
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[getLog](../javadsl/ActorContext.html#getLog())` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### setLoggerName
		
		
		
		```
		void setLoggerName​(java.lang.String name)
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#setLoggerName(java.lang.String))`
		Replace the current logger (or initialize a new logger if the logger was not touched before) with one that
		 has ghe given name as logger name. Logger source MDC entry "akkaSource" will be the actor path.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[setLoggerName](../javadsl/ActorContext.html#setLoggerName(java.lang.String))` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		Specified by:
		`[setLoggerName](../scaladsl/ActorContext.html#setLoggerName(java.lang.String))` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### setLoggerName
		
		
		
		```
		void setLoggerName​(java.lang.Class<?> clazz)
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#setLoggerName(java.lang.Class))`
		Replace the current logger (or initialize a new logger if the logger was not touched before) with one that
		 has ghe given class name as logger name. Logger source MDC entry "akkaSource" will be the actor path.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[setLoggerName](../javadsl/ActorContext.html#setLoggerName(java.lang.Class))` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		Specified by:
		`[setLoggerName](../scaladsl/ActorContext.html#setLoggerName(java.lang.Class))` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### hasCustomLoggerName
		
		
		
		```
		boolean hasCustomLoggerName()
		```
		- #### clearMdc
		
		
		
		```
		void clearMdc()
		```
		
		Description copied from interface: `[ActorContext](../scaladsl/ActorContext.html#clearMdc())`
		INTERNAL API
		
		Specified by:
		`[clearMdc](../scaladsl/ActorContext.html#clearMdc())` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### setReceiveTimeout
		
		
		
		```
		void setReceiveTimeout​(java.time.Duration duration,
		                       [T](ActorContextImpl.html "type parameter in ActorContextImpl") msg)
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#setReceiveTimeout(java.time.Duration,T))`
		Schedule the sending of a notification in case no other
		 message is received during the given period of time. The timeout starts anew
		 with each received message. Use `cancelReceiveTimeout` to switch off this
		 mechanism.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[setReceiveTimeout](../javadsl/ActorContext.html#setReceiveTimeout(java.time.Duration,T))` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### scheduleOnce
		
		
		
		```
		<U> [Cancellable](../../Cancellable.html "interface in akka.actor") scheduleOnce​(java.time.Duration delay,
		                             [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> target,
		                             U msg)
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#scheduleOnce(java.time.Duration,akka.actor.typed.ActorRef,U))`
		Schedule the sending of the given message to the given target Actor after
		 the given time period has elapsed. The scheduled action can be cancelled
		 by invoking [`Cancellable.cancel()`](../../Cancellable.html#cancel()) on the returned
		 handle.
		 
		 For scheduling messages to the actor itself, use `Behaviors.withTimers`
		
		
		
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[scheduleOnce](../javadsl/ActorContext.html#scheduleOnce(java.time.Duration,akka.actor.typed.ActorRef,U))` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### spawn
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> spawn​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior,
		                      java.lang.String name)
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#spawn(akka.actor.typed.Behavior,java.lang.String))`
		Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") and with the given name.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[spawn](../javadsl/ActorContext.html#spawn(akka.actor.typed.Behavior,java.lang.String))` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### spawnAnonymous
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> spawnAnonymous​([Behavior](../Behavior.html "class in akka.actor.typed")<U> behavior)
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#spawnAnonymous(akka.actor.typed.Behavior))`
		Create a child Actor from the given [`Behavior`](../Behavior.html "class in akka.actor.typed") under a randomly chosen name.
		 It is good practice to name Actors wherever practical.
		 
		 \*Warning\*: This method is not thread\-safe and must not be accessed from threads other
		 than the ordinary actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[spawnAnonymous](../javadsl/ActorContext.html#spawnAnonymous(akka.actor.typed.Behavior))` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### delegate
		
		
		
		```
		[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")> delegate​([Behavior](../Behavior.html "class in akka.actor.typed")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")> delegator,
		                     [T](ActorContextImpl.html "type parameter in ActorContextImpl") msg)
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#delegate(akka.actor.typed.Behavior,T))`
		Delegate message and signal's execution by given [`Behavior`](../Behavior.html "class in akka.actor.typed")
		 using `Behavior.interpretMessage` or `Behavior.interpretSignal`
		
		 note: if given [`Behavior`](../Behavior.html "class in akka.actor.typed") resulting `Behaviors.same` that will cause context switching to the given behavior
		 and if result is `Behaviors.unhandled` that will trigger the `akka.actor.typed.scaladsl.ActorContext.onUnhandled`
		 then switching to the given behavior.
		
		
		
		Specified by:
		`[delegate](../javadsl/ActorContext.html#delegate(akka.actor.typed.Behavior,T))` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		Specified by:
		`[delegate](../scaladsl/ActorContext.html#delegate(akka.actor.typed.Behavior,T))` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### ask
		
		
		
		```
		<Req,​Res> void ask​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,
		                         scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> createRequest,
		                         scala.Function1<scala.util.Try<Res>,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> mapResponse,
		                         [Timeout](../../../util/Timeout.html "class in akka.util") responseTimeout,
		                         scala.reflect.ClassTag<Res> classTag)
		```
		
		Description copied from interface: `[ActorContext](../scaladsl/ActorContext.html#ask(akka.actor.typed.RecipientRef,scala.Function1,scala.Function1,akka.util.Timeout,scala.reflect.ClassTag))`
		Perform a single request\-response message interaction with another actor, and transform the messages back to
		 the protocol of this actor.
		 
		 The interaction has a timeout (to avoid a resource leak). If the timeout hits without any response it
		 will be passed as a `Failure(``TimeoutException``)` to the `mapResponse` function
		 (this is the only "normal" way a `Failure` is passed to the function).
		 
		
		
		 For other messaging patterns with other actors, see [`ActorContext.messageAdapter(scala.Function1<U, T>, scala.reflect.ClassTag<U>)`](../scaladsl/ActorContext.html#messageAdapter(scala.Function1,scala.reflect.ClassTag)).
		 
		
		
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `Future` callbacks.
		 
		
		
		
		Specified by:
		`[ask](../scaladsl/ActorContext.html#ask(akka.actor.typed.RecipientRef,scala.Function1,scala.Function1,akka.util.Timeout,scala.reflect.ClassTag))` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
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
		                                   scala.Function1<scala.util.Try<Res>,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> mapResponse,
		                                   [Timeout](../../../util/Timeout.html "class in akka.util") responseTimeout,
		                                   scala.reflect.ClassTag<Res> classTag)
		```
		
		Description copied from interface: `[ActorContext](../scaladsl/ActorContext.html#askWithStatus(akka.actor.typed.RecipientRef,scala.Function1,scala.Function1,akka.util.Timeout,scala.reflect.ClassTag))`
		The same as [`ActorContext.<Req,Res>ask(akka.actor.typed.RecipientRef<Req>,scala.Function1<akka.actor.typed.ActorRef<Res>,Req>,scala.Function1<scala.util.Try<Res>,T>,akka.util.Timeout,scala.reflect.ClassTag<Res>)`](../scaladsl/ActorContext.html#ask(akka.actor.typed.RecipientRef,scala.Function1,scala.Function1,akka.util.Timeout,scala.reflect.ClassTag)) but only for requests that result in a response of type [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern").
		 If the response is a `akka.pattern.StatusReply.Success` the returned future is completed successfully with the wrapped response.
		 If the status response is a `akka.pattern.StatusReply.Error` the returned future will be failed with the
		 exception in the error (normally a [`StatusReply.ErrorMessage`](../../../pattern/StatusReply.ErrorMessage.html "class in akka.pattern")).
		
		Specified by:
		`[askWithStatus](../scaladsl/ActorContext.html#askWithStatus(akka.actor.typed.RecipientRef,scala.Function1,scala.Function1,akka.util.Timeout,scala.reflect.ClassTag))` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### ask
		
		
		
		```
		<Req,​Res> void ask​(java.lang.Class<Res> resClass,
		                         [RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> target,
		                         java.time.Duration responseTimeout,
		                         [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> createRequest,
		                         [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<Res,​java.lang.Throwable,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> applyToResponse)
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#ask(java.lang.Class,akka.actor.typed.RecipientRef,java.time.Duration,akka.japi.function.Function,akka.japi.function.Function2))`
		Perform a single request\-response message interaction with another actor, and transform the messages back to
		 the protocol of this actor.
		 
		 The interaction has a timeout (to avoid a resource leak). If the timeout hits without any response it
		 will be passed as an `TimeoutException` to the `applyToResponse` function.
		 
		
		
		 For other messaging patterns with other actors, see [`ActorContext.messageAdapter(java.lang.Class<U>, akka.japi.function.Function<U, T>)`](../javadsl/ActorContext.html#messageAdapter(java.lang.Class,akka.japi.function.Function)).
		 
		
		
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		 
		
		
		
		Specified by:
		`[ask](../javadsl/ActorContext.html#ask(java.lang.Class,akka.actor.typed.RecipientRef,java.time.Duration,akka.japi.function.Function,akka.japi.function.Function2))` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
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
		                                   [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<Res,​java.lang.Throwable,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> applyToResponse)
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#askWithStatus(java.lang.Class,akka.actor.typed.RecipientRef,java.time.Duration,akka.japi.function.Function,akka.japi.function.Function2))`
		The same as [`ActorContext.<Req,Res>ask(java.lang.Class<Res>,akka.actor.typed.RecipientRef<Req>,java.time.Duration,akka.japi.function.Function<akka.actor.typed.ActorRef<Res>,Req>,akka.japi.function.Function2<Res,java.lang.Throwable,T>)`](../javadsl/ActorContext.html#ask(java.lang.Class,akka.actor.typed.RecipientRef,java.time.Duration,akka.japi.function.Function,akka.japi.function.Function2)) but only for requests that result in a response of type [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern").
		 If the response is a [`StatusReply.success(T)`](../../../pattern/StatusReply.html#success(T)) the returned future is completed successfully with the wrapped response.
		 If the status response is a [`StatusReply.error(java.lang.String)`](../../../pattern/StatusReply.html#error(java.lang.String)) the returned future will be failed with the
		 exception in the error (normally a [`StatusReply.ErrorMessage`](../../../pattern/StatusReply.ErrorMessage.html "class in akka.pattern")).
		
		Specified by:
		`[askWithStatus](../javadsl/ActorContext.html#askWithStatus(java.lang.Class,akka.actor.typed.RecipientRef,java.time.Duration,akka.japi.function.Function,akka.japi.function.Function2))` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### pipeToSelf
		
		
		
		```
		<Value> void pipeToSelf​(scala.concurrent.Future<Value> future,
		                        scala.Function1<scala.util.Try<Value>,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> mapResult)
		```
		
		Description copied from interface: `[ActorContext](../scaladsl/ActorContext.html#pipeToSelf(scala.concurrent.Future,scala.Function1))`
		Sends the result of the given `Future` to this Actor (\&ldquo;`self`\&rdquo;), after adapted it with
		 the given function.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `Future` callbacks.
		
		
		
		Specified by:
		`[pipeToSelf](../scaladsl/ActorContext.html#pipeToSelf(scala.concurrent.Future,scala.Function1))` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### pipeToSelf
		
		
		
		```
		<Value> void pipeToSelf​(java.util.concurrent.CompletionStage<Value> future,
		                        [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<Value,​java.lang.Throwable,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> applyToResult)
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#pipeToSelf(java.util.concurrent.CompletionStage,akka.japi.function.Function2))`
		Sends the result of the given `CompletionStage` to this Actor (\&ldquo;`self`\&rdquo;), after adapted it with
		 the given function.
		 
		 This method is thread\-safe and can be called from other threads than the ordinary
		 actor message processing thread, such as `CompletionStage` callbacks.
		
		
		
		Specified by:
		`[pipeToSelf](../javadsl/ActorContext.html#pipeToSelf(java.util.concurrent.CompletionStage,akka.japi.function.Function2))` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### spawnMessageAdapter
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> spawnMessageAdapter​(scala.Function1<U,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> f,
		                                    java.lang.String name)
		```
		
		Description copied from interface: `[ActorContext](../scaladsl/ActorContext.html#spawnMessageAdapter(scala.Function1,java.lang.String))`
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
		
		
		
		Specified by:
		`[spawnMessageAdapter](../scaladsl/ActorContext.html#spawnMessageAdapter(scala.Function1,java.lang.String))` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### spawnMessageAdapter
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> spawnMessageAdapter​(scala.Function1<U,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> f)
		```
		
		Description copied from interface: `[ActorContext](../scaladsl/ActorContext.html#spawnMessageAdapter(scala.Function1))`
		INTERNAL API: See `spawnMessageAdapter` with name parameter
		
		Specified by:
		`[spawnMessageAdapter](../scaladsl/ActorContext.html#spawnMessageAdapter(scala.Function1))` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### internalSpawnMessageAdapter
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> internalSpawnMessageAdapter​(scala.Function1<U,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> f,
		                                            java.lang.String name)
		```
		
		INTERNAL API: Needed to make Scala 2\.12 compiler happy if spawnMessageAdapter is overloaded for scaladsl/javadsl.
		 Otherwise "ambiguous reference to overloaded definition" because Function is lambda.
		- #### messageAdapter
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> messageAdapter​(scala.Function1<U,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> f,
		                               scala.reflect.ClassTag<U> evidence$1)
		```
		
		Description copied from interface: `[ActorContext](../scaladsl/ActorContext.html#messageAdapter(scala.Function1,scala.reflect.ClassTag))`
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
		
		
		
		Specified by:
		`[messageAdapter](../scaladsl/ActorContext.html#messageAdapter(scala.Function1,scala.reflect.ClassTag))` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### messageAdapter
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> messageAdapter​(java.lang.Class<U> messageClass,
		                               [Function](../../../japi/function/Function.html "interface in akka.japi.function")<U,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> f)
		```
		
		Description copied from interface: `[ActorContext](../javadsl/ActorContext.html#messageAdapter(java.lang.Class,akka.japi.function.Function))`
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
		
		
		
		Specified by:
		`[messageAdapter](../javadsl/ActorContext.html#messageAdapter(java.lang.Class,akka.japi.function.Function))` in interface `[ActorContext](../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### internalMessageAdapter
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> internalMessageAdapter​(java.lang.Class<U> messageClass,
		                                       scala.Function1<U,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")> f)
		```
		- #### messageAdapters
		
		
		
		```
		scala.collection.immutable.List<scala.Tuple2<java.lang.Class<?>,​scala.Function1<java.lang.Object,​[T](ActorContextImpl.html "type parameter in ActorContextImpl")>>> messageAdapters()
		```
		
		INTERNAL API
		- #### setCurrentActorThread
		
		
		
		```
		void setCurrentActorThread()
		```
		
		INTERNAL API
		
		Specified by:
		`[setCurrentActorThread](../scaladsl/ActorContext.html#setCurrentActorThread())` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### clearCurrentActorThread
		
		
		
		```
		void clearCurrentActorThread()
		```
		
		INTERNAL API
		
		Specified by:
		`[clearCurrentActorThread](../scaladsl/ActorContext.html#clearCurrentActorThread())` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`
		- #### checkCurrentActorThread
		
		
		
		```
		void checkCurrentActorThread()
		```
		
		INTERNAL API
		
		Specified by:
		`[checkCurrentActorThread](../scaladsl/ActorContext.html#checkCurrentActorThread())` in interface `[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](ActorContextImpl.html "type parameter in ActorContextImpl")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/internal/ActorContextImpl.LoggingContext$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/internal/ActorContextImpl.LoggingContext.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/internal/ActorContextImpl.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/internal/TimerSchedulerCrossDslSupport.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/2.10/akka/pattern/StatusReply.ErrorMessage.html
- https://doc.akka.io/japi/akka/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/actor/typed/internal/ActorContextImpl.html](https://doc.akka.io/japi/akka/2.10/akka/actor/typed/internal/ActorContextImpl.html)*
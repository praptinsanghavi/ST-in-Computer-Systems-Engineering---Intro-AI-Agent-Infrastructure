---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:56:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.html
title: BehaviorImpl
---

# BehaviorImpl

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class BehaviorImpl

- java.lang.Object
- - akka.actor.typed.internal.BehaviorImpl

- ---

```
public class BehaviorImpl
extends java.lang.Object
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[BehaviorImpl.ContextAs](BehaviorImpl.ContextAs.html "class in akka.actor.typed.internal")<[T](BehaviorImpl.ContextAs.html "type parameter in BehaviorImpl.ContextAs")>` |  |
	| `static class` | `[BehaviorImpl.ContextAs$](BehaviorImpl.ContextAs$.html "class in akka.actor.typed.internal")` |  |
	| `static class` | `[BehaviorImpl.DeferredBehavior](BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")<[T](BehaviorImpl.DeferredBehavior.html "type parameter in BehaviorImpl.DeferredBehavior")>` |  |
	| `static class` | `[BehaviorImpl.DeferredBehavior$](BehaviorImpl.DeferredBehavior$.html "class in akka.actor.typed.internal")` |  |
	| `static class` | `[BehaviorImpl.FailedBehavior](BehaviorImpl.FailedBehavior.html "class in akka.actor.typed.internal")` |  |
	| `static class` | `[BehaviorImpl.ReceiveBehavior](BehaviorImpl.ReceiveBehavior.html "class in akka.actor.typed.internal")<[T](BehaviorImpl.ReceiveBehavior.html "type parameter in BehaviorImpl.ReceiveBehavior")>` |  |
	| `static class` | `[BehaviorImpl.ReceiveBehavior$](BehaviorImpl.ReceiveBehavior$.html "class in akka.actor.typed.internal")` |  |
	| `static class` | `[BehaviorImpl.ReceiveMessageBehavior](BehaviorImpl.ReceiveMessageBehavior.html "class in akka.actor.typed.internal")<[T](BehaviorImpl.ReceiveMessageBehavior.html "type parameter in BehaviorImpl.ReceiveMessageBehavior")>` | Similar to [`BehaviorImpl.ReceiveBehavior`](BehaviorImpl.ReceiveBehavior.html "class in akka.actor.typed.internal") however `onMessage` does not accept context. |
	| `static class` | `[BehaviorImpl.ReceiveMessageBehavior$](BehaviorImpl.ReceiveMessageBehavior$.html "class in akka.actor.typed.internal")` |  |
	| `static class` | `[BehaviorImpl.SameBehavior$](BehaviorImpl.SameBehavior$.html "class in akka.actor.typed.internal")` |  |
	| `static class` | `[BehaviorImpl.UnhandledBehavior$](BehaviorImpl.UnhandledBehavior$.html "class in akka.actor.typed.internal")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BehaviorImpl](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [BehaviorImpl.ContextAs](BehaviorImpl.ContextAs.html "class in akka.actor.typed.internal")<T>` | `[ContextAs](#ContextAs(akka.actor.typed.TypedActorContext))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<T> ctx)` |  |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[empty](#empty())()` |  |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[failed](#failed(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[ignore](#ignore())()` |  |
	| `static <O,​I>[Behavior](../Behavior.html "class in akka.actor.typed")<O>` | `[intercept](#intercept(scala.Function0,akka.actor.typed.Behavior))​(scala.Function0<[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<O,​I>> interceptor,  [Behavior](../Behavior.html "class in akka.actor.typed")<I> behavior)` | Intercept messages and signals for a `behavior` by first passing them to a [`BehaviorInterceptor`](../BehaviorInterceptor.html "class in akka.actor.typed") |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[same](#same())()` |  |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[stopped](#stopped())()` |  |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[stopped](#stopped(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> postStop)` |  |
	| `static akka.actor.typed.internal.BehaviorImpl.StoppedBehavior<scala.runtime.Nothing$>` | `[StoppedBehavior](#StoppedBehavior())()` |  |
	| `static <O,​I>[Behavior](../Behavior.html "class in akka.actor.typed")<O>` | `[transformMessages](#transformMessages(akka.actor.typed.Behavior,scala.PartialFunction,scala.reflect.ClassTag))​([Behavior](../Behavior.html "class in akka.actor.typed")<I> behavior,  scala.PartialFunction<O,​I> matcher,  scala.reflect.ClassTag<O> evidence$1)` |  |
	| `static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[unhandled](#unhandled())()` |  |
	| `static scala.PartialFunction<scala.Tuple2<[TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​[Signal](../Signal.html "interface in akka.actor.typed")>,​[Behavior](../Behavior.html "class in akka.actor.typed")<scala.runtime.Nothing$>>` | `[unhandledSignal](#unhandledSignal())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BehaviorImpl
		
		
		
		```
		public BehaviorImpl()
		```

	- ### Method Detail
	
	
	
		- #### ContextAs
		
		
		
		```
		public static <T> [BehaviorImpl.ContextAs](BehaviorImpl.ContextAs.html "class in akka.actor.typed.internal")<T> ContextAs​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<T> ctx)
		```
		- #### transformMessages
		
		
		
		```
		public static <O,​I> [Behavior](../Behavior.html "class in akka.actor.typed")<O> transformMessages​([Behavior](../Behavior.html "class in akka.actor.typed")<I> behavior,
		                                                        scala.PartialFunction<O,​I> matcher,
		                                                        scala.reflect.ClassTag<O> evidence$1)
		```
		- #### same
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> same()
		```
		- #### unhandled
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> unhandled()
		```
		- #### stopped
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> stopped()
		```
		- #### stopped
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> stopped​(scala.Function0<scala.runtime.BoxedUnit> postStop)
		```
		- #### empty
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> empty()
		```
		- #### ignore
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> ignore()
		```
		- #### failed
		
		
		
		```
		public static <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> failed​(java.lang.Throwable cause)
		```
		- #### unhandledSignal
		
		
		
		```
		public static scala.PartialFunction<scala.Tuple2<[TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​[Signal](../Signal.html "interface in akka.actor.typed")>,​[Behavior](../Behavior.html "class in akka.actor.typed")<scala.runtime.Nothing$>> unhandledSignal()
		```
		- #### StoppedBehavior
		
		
		
		```
		public static akka.actor.typed.internal.BehaviorImpl.StoppedBehavior<scala.runtime.Nothing$> StoppedBehavior()
		```
		- #### intercept
		
		
		
		```
		public static <O,​I> [Behavior](../Behavior.html "class in akka.actor.typed")<O> intercept​(scala.Function0<[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<O,​I>> interceptor,
		                                                [Behavior](../Behavior.html "class in akka.actor.typed")<I> behavior)
		```
		
		Intercept messages and signals for a `behavior` by first passing them to a [`BehaviorInterceptor`](../BehaviorInterceptor.html "class in akka.actor.typed")
		
		 When a behavior returns a new behavior as a result of processing a signal or message and that behavior already contains
		 the same interceptor (defined by the `isSame` method on the `BehaviorInterceptor`) only the innermost interceptor
		 is kept. This is to protect against stack overflow when recursively defining behaviors.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.ContextAs$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.ContextAs.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.FailedBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.ReceiveBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.ReceiveBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.ReceiveMessageBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.ReceiveMessageBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.SameBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.UnhandledBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.html)*
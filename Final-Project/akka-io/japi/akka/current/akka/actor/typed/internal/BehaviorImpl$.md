---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl$.html
title: BehaviorImpl$
---

# BehaviorImpl$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class BehaviorImpl$

- java.lang.Object
- - akka.actor.typed.internal.BehaviorImpl$

- ---

```
public class BehaviorImpl$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BehaviorImpl$](BehaviorImpl$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BehaviorImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [BehaviorImpl.ContextAs](BehaviorImpl.ContextAs.html "class in akka.actor.typed.internal")<T>` | `[ContextAs](#ContextAs(akka.actor.typed.TypedActorContext))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<T> ctx)` |  |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[empty](#empty())()` |  |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[failed](#failed(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[ignore](#ignore())()` |  |
	| `<O,​I>[Behavior](../Behavior.html "class in akka.actor.typed")<O>` | `[intercept](#intercept(scala.Function0,akka.actor.typed.Behavior))​(scala.Function0<[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<O,​I>> interceptor,  [Behavior](../Behavior.html "class in akka.actor.typed")<I> behavior)` | Intercept messages and signals for a `behavior` by first passing them to a [`BehaviorInterceptor`](../BehaviorInterceptor.html "class in akka.actor.typed") |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[same](#same())()` |  |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[stopped](#stopped())()` |  |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[stopped](#stopped(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> postStop)` |  |
	| `akka.actor.typed.internal.BehaviorImpl.StoppedBehavior<scala.runtime.Nothing$>` | `[StoppedBehavior](#StoppedBehavior())()` |  |
	| `<O,​I>[Behavior](../Behavior.html "class in akka.actor.typed")<O>` | `[transformMessages](#transformMessages(akka.actor.typed.Behavior,scala.PartialFunction,scala.reflect.ClassTag))​([Behavior](../Behavior.html "class in akka.actor.typed")<I> behavior,  scala.PartialFunction<O,​I> matcher,  scala.reflect.ClassTag<O> evidence$1)` |  |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[unhandled](#unhandled())()` |  |
	| `scala.PartialFunction<scala.Tuple2<[TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​[Signal](../Signal.html "interface in akka.actor.typed")>,​[Behavior](../Behavior.html "class in akka.actor.typed")<scala.runtime.Nothing$>>` | `[unhandledSignal](#unhandledSignal())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BehaviorImpl$](BehaviorImpl$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BehaviorImpl$
		
		
		
		```
		public BehaviorImpl$()
		```

	- ### Method Detail
	
	
	
		- #### ContextAs
		
		
		
		```
		public <T> [BehaviorImpl.ContextAs](BehaviorImpl.ContextAs.html "class in akka.actor.typed.internal")<T> ContextAs​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<T> ctx)
		```
		- #### transformMessages
		
		
		
		```
		public <O,​I> [Behavior](../Behavior.html "class in akka.actor.typed")<O> transformMessages​([Behavior](../Behavior.html "class in akka.actor.typed")<I> behavior,
		                                                 scala.PartialFunction<O,​I> matcher,
		                                                 scala.reflect.ClassTag<O> evidence$1)
		```
		- #### same
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> same()
		```
		- #### unhandled
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> unhandled()
		```
		- #### stopped
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> stopped()
		```
		- #### stopped
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> stopped​(scala.Function0<scala.runtime.BoxedUnit> postStop)
		```
		- #### empty
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> empty()
		```
		- #### ignore
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> ignore()
		```
		- #### failed
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> failed​(java.lang.Throwable cause)
		```
		- #### unhandledSignal
		
		
		
		```
		public scala.PartialFunction<scala.Tuple2<[TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​[Signal](../Signal.html "interface in akka.actor.typed")>,​[Behavior](../Behavior.html "class in akka.actor.typed")<scala.runtime.Nothing$>> unhandledSignal()
		```
		- #### StoppedBehavior
		
		
		
		```
		public akka.actor.typed.internal.BehaviorImpl.StoppedBehavior<scala.runtime.Nothing$> StoppedBehavior()
		```
		- #### intercept
		
		
		
		```
		public <O,​I> [Behavior](../Behavior.html "class in akka.actor.typed")<O> intercept​(scala.Function0<[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<O,​I>> interceptor,
		                                         [Behavior](../Behavior.html "class in akka.actor.typed")<I> behavior)
		```
		
		Intercept messages and signals for a `behavior` by first passing them to a [`BehaviorInterceptor`](../BehaviorInterceptor.html "class in akka.actor.typed")
		
		 When a behavior returns a new behavior as a result of processing a signal or message and that behavior already contains
		 the same interceptor (defined by the `isSame` method on the `BehaviorInterceptor`) only the innermost interceptor
		 is kept. This is to protect against stack overflow when recursively defining behaviors.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.ContextAs.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl$.html)*
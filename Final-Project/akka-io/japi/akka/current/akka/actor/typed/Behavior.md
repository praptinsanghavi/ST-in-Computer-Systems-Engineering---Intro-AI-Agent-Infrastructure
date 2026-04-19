---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:39:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
title: Behavior
---

# Behavior

## Content

Package [akka.actor.typed](package-summary.html)
## Class Behavior\<T\>

- java.lang.Object
- - akka.actor.typed.Behavior\<T\>

- Direct Known Subclasses:
`[BehaviorImpl.DeferredBehavior](internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")`, `[BehaviorImpl.FailedBehavior](internal/BehaviorImpl.FailedBehavior.html "class in akka.actor.typed.internal")`, `[BehaviorImpl.SameBehavior$](internal/BehaviorImpl.SameBehavior$.html "class in akka.actor.typed.internal")`, `[BehaviorImpl.UnhandledBehavior$](internal/BehaviorImpl.UnhandledBehavior$.html "class in akka.actor.typed.internal")`, `[ExtensibleBehavior](ExtensibleBehavior.html "class in akka.actor.typed")`

---

```
public abstract class Behavior<T>
extends java.lang.Object
```

The behavior of an actor defines how it reacts to the messages that it
 receives. The message may either be of the type that the Actor declares
 and which is part of the [`ActorRef`](ActorRef.html "interface in akka.actor.typed") signature, or it may be a system
 [`Signal`](Signal.html "interface in akka.actor.typed") that expresses a lifecycle event of either this actor or one of
 its child actors.
 
 Behaviors can be formulated in a number of different ways, either by
 using the DSLs in [`Behaviors`](scaladsl/Behaviors.html "class in akka.actor.typed.scaladsl") and [`Behaviors`](javadsl/Behaviors.html "class in akka.actor.typed.javadsl")
 or extending the abstract [`ExtensibleBehavior`](ExtensibleBehavior.html "class in akka.actor.typed") class.
 

 Closing over ActorContext makes a Behavior immobile: it cannot be moved to
 another context and executed there, and therefore it cannot be replicated or
 forked either.
 

 This base class is not meant to be extended by user code. If you do so, you may
 lose binary compatibility.
 

 Not for user extension.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Behavior.BehaviorDecorators](Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>` |  |
	| `static class` | `[Behavior.BehaviorDecorators$](Behavior.BehaviorDecorators$.html "class in akka.actor.typed")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Behavior](#%3Cinit%3E(int))​(int _tag)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <Inner> [Behavior.BehaviorDecorators](Behavior.BehaviorDecorators.html "class in akka.actor.typed")<Inner>` | `[BehaviorDecorators](#BehaviorDecorators(akka.actor.typed.Behavior))​([Behavior](Behavior.html "class in akka.actor.typed")<Inner> behavior)` |  |
	| `static <T> [Behavior](Behavior.html "class in akka.actor.typed")<T>` | `[canonicalize](#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext))​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,  [Behavior](Behavior.html "class in akka.actor.typed")<T> current,  [TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<T> ctx)` | Given a possibly special behavior (same or unhandled) and a  \&ldquo;current\&rdquo; behavior (which defines the meaning of encountering a `same`  behavior) this method computes the next behavior, suitable for passing a  message or signal. |
	| `static <T> boolean` | `[existsInStack](#existsInStack(akka.actor.typed.Behavior,scala.Function1))​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,  scala.Function1<[Behavior](Behavior.html "class in akka.actor.typed")<T>,​java.lang.Object> p)` | Go through the behavior stack and apply a predicate to see if any nested behavior  satisfies it. |
	| `static <T> [Behavior](Behavior.html "class in akka.actor.typed")<T>` | `[interpretMessage](#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T))​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,  [TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<T> ctx,  T msg)` | Execute the behavior with the given message. |
	| `static <T> [Behavior](Behavior.html "class in akka.actor.typed")<T>` | `[interpretSignal](#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,  [TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<T> ctx,  [Signal](Signal.html "interface in akka.actor.typed") signal)` | Execute the behavior with the given signal. |
	| `static <T> boolean` | `[isAlive](#isAlive(akka.actor.typed.Behavior))​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior)` | Returns true if the given behavior is not stopped. |
	| `static <T> boolean` | `[isDeferred](#isDeferred(akka.actor.typed.Behavior))​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior)` | Returns true if the given behavior is deferred. |
	| `static <T> boolean` | `[isUnhandled](#isUnhandled(akka.actor.typed.Behavior))​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior)` | Returns true if the given behavior is the special `unhandled` marker. |
	| `<U extends [T](Behavior.html "type parameter in Behavior")>[Behavior](Behavior.html "class in akka.actor.typed")<U>` | `[narrow](#narrow())()` | Narrow the type of this Behavior, which is always a safe operation. |
	| `static <T> [Behavior](Behavior.html "class in akka.actor.typed")<T>` | `[start](#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext))​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,  [TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<T> ctx)` | Starts deferred behavior and nested deferred behaviors until all deferred behaviors in the stack are started  and then the resulting behavior is returned. |
	| `static <T> [Behavior](Behavior.html "class in akka.actor.typed")<T>` | `[validateAsInitial](#validateAsInitial(akka.actor.typed.Behavior))​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior)` | Validate the given behavior as a suitable initial actor behavior; most  notably the behavior can neither be `same` nor `unhandled`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Behavior
		
		
		
		```
		public Behavior​(int _tag)
		```

	- ### Method Detail
	
	
	
		- #### BehaviorDecorators
		
		
		
		```
		public static final <Inner> [Behavior.BehaviorDecorators](Behavior.BehaviorDecorators.html "class in akka.actor.typed")<Inner> BehaviorDecorators​([Behavior](Behavior.html "class in akka.actor.typed")<Inner> behavior)
		```
		- #### canonicalize
		
		
		
		```
		public static <T> [Behavior](Behavior.html "class in akka.actor.typed")<T> canonicalize​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,
		                                           [Behavior](Behavior.html "class in akka.actor.typed")<T> current,
		                                           [TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<T> ctx)
		```
		
		Given a possibly special behavior (same or unhandled) and a
		 \&ldquo;current\&rdquo; behavior (which defines the meaning of encountering a `same`
		 behavior) this method computes the next behavior, suitable for passing a
		 message or signal.
		- #### start
		
		
		
		```
		public static <T> [Behavior](Behavior.html "class in akka.actor.typed")<T> start​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,
		                                    [TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<T> ctx)
		```
		
		Starts deferred behavior and nested deferred behaviors until all deferred behaviors in the stack are started
		 and then the resulting behavior is returned.
		- #### existsInStack
		
		
		
		```
		public static <T> boolean existsInStack​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,
		                                        scala.Function1<[Behavior](Behavior.html "class in akka.actor.typed")<T>,​java.lang.Object> p)
		```
		
		Go through the behavior stack and apply a predicate to see if any nested behavior
		 satisfies it. The stack must not contain any unstarted deferred behavior or an `IllegalArgumentException`
		 will be thrown.
		- #### validateAsInitial
		
		
		
		```
		public static <T> [Behavior](Behavior.html "class in akka.actor.typed")<T> validateAsInitial​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Validate the given behavior as a suitable initial actor behavior; most
		 notably the behavior can neither be `same` nor `unhandled`. Starting
		 out with a `Stopped` behavior is allowed, though.
		- #### isAlive
		
		
		
		```
		public static <T> boolean isAlive​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Returns true if the given behavior is not stopped.
		- #### isUnhandled
		
		
		
		```
		public static <T> boolean isUnhandled​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Returns true if the given behavior is the special `unhandled` marker.
		- #### isDeferred
		
		
		
		```
		public static <T> boolean isDeferred​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Returns true if the given behavior is deferred.
		- #### interpretMessage
		
		
		
		```
		public static <T> [Behavior](Behavior.html "class in akka.actor.typed")<T> interpretMessage​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,
		                                               [TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<T> ctx,
		                                               T msg)
		```
		
		Execute the behavior with the given message.
		- #### interpretSignal
		
		
		
		```
		public static <T> [Behavior](Behavior.html "class in akka.actor.typed")<T> interpretSignal​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,
		                                              [TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<T> ctx,
		                                              [Signal](Signal.html "interface in akka.actor.typed") signal)
		```
		
		Execute the behavior with the given signal.
		- #### narrow
		
		
		
		```
		public final <U extends [T](Behavior.html "type parameter in Behavior")> [Behavior](Behavior.html "class in akka.actor.typed")<U> narrow()
		```
		
		Narrow the type of this Behavior, which is always a safe operation. This
		 method is necessary to implement the contravariant nature of Behavior
		 (which cannot be expressed directly due to type inference problems).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.FailedBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.SameBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.UnhandledBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/Behaviors.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html)*
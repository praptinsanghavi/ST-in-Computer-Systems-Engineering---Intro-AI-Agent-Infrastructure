---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:38:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html
title: TypedActorContext
---

# TypedActorContext

## Content

Package [akka.actor.typed](package-summary.html)
## Interface TypedActorContext\<T\>

- All Known Subinterfaces:
`[ActorContext](javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<T>`, `[ActorContext](scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<T>`, `[ActorContextImpl](internal/ActorContextImpl.html "interface in akka.actor.typed.internal")<T>`

---

```
public interface TypedActorContext<T>
```

This trait is not meant to be extended by user code. If you do so, you may
 lose binary compatibility.
 
 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ActorContext](javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](TypedActorContext.html "type parameter in TypedActorContext")>` | `[asJava](#asJava())()` | Get the `javadsl` of this `ActorContext`. |
	| `[ActorContext](scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](TypedActorContext.html "type parameter in TypedActorContext")>` | `[asScala](#asScala())()` | Get the `scaladsl` of this `ActorContext`. |

- - ### Method Detail
	
	
	
		- #### asJava
		
		
		
		```
		[ActorContext](javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[T](TypedActorContext.html "type parameter in TypedActorContext")> asJava()
		```
		
		Get the `javadsl` of this `ActorContext`.
		- #### asScala
		
		
		
		```
		[ActorContext](scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](TypedActorContext.html "type parameter in TypedActorContext")> asScala()
		```
		
		Get the `scaladsl` of this `ActorContext`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorContextImpl.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html)*
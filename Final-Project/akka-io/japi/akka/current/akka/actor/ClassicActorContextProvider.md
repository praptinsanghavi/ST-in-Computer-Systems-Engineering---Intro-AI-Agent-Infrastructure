---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorContextProvider.html
title: ClassicActorContextProvider
---

# ClassicActorContextProvider

## Content

Package [akka.actor](package-summary.html)
## Interface ClassicActorContextProvider

- All Known Subinterfaces:
`[AbstractActor.ActorContext](AbstractActor.ActorContext.html "interface in akka.actor")`, `[ActorContext](ActorContext.html "interface in akka.actor")`, `[ActorContext](typed/javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<T>`, `[ActorContext](typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<T>`, `[ActorContextImpl](typed/internal/ActorContextImpl.html "interface in akka.actor.typed.internal")<T>`

---

```
public interface ClassicActorContextProvider
```

Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.
 
 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ActorContext](ActorContext.html "interface in akka.actor")` | `[classicActorContext](#classicActorContext())()` | INTERNAL API |

- - ### Method Detail
	
	
	
		- #### classicActorContext
		
		
		
		```
		[ActorContext](ActorContext.html "interface in akka.actor") classicActorContext()
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorContextImpl.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorContextProvider.html](https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorContextProvider.html)*
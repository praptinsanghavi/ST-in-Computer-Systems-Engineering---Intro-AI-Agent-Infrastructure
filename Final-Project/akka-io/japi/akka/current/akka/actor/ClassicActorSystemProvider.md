---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
title: ClassicActorSystemProvider
---

# ClassicActorSystemProvider

## Content

Package [akka.actor](package-summary.html)
## Interface ClassicActorSystemProvider

- All Known Implementing Classes:
`[ActorSystem](ActorSystem.html "class in akka.actor")`, `[ActorSystem](typed/ActorSystem.html "class in akka.actor.typed")`, `[ExtendedActorSystem](ExtendedActorSystem.html "class in akka.actor")`

---

```
public interface ClassicActorSystemProvider
```

Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.
 
 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[classicSystem](#classicSystem())()` | Allows access to the classic `akka.actor.ActorSystem` even for `akka.actor.typed.ActorSystem[_]`s. |

- - ### Method Detail
	
	
	
		- #### classicSystem
		
		
		
		```
		[ActorSystem](ActorSystem.html "class in akka.actor") classicSystem()
		```
		
		Allows access to the classic `akka.actor.ActorSystem` even for `akka.actor.typed.ActorSystem[_]`s.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html](https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html)*
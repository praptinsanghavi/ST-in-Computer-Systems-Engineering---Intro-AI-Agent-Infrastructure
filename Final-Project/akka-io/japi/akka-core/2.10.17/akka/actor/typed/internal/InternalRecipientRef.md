---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/InternalRecipientRef.html
title: InternalRecipientRef
---

# InternalRecipientRef

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Interface InternalRecipientRef\<T\>

- All Superinterfaces:
`[RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<T>`

---

```
public interface InternalRecipientRef<T>
extends [RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<T>
```

INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.typed.[RecipientRef](../RecipientRef.html "interface in akka.actor.typed")
		
		
		`[RecipientRef.RecipientRefOps](../RecipientRef.RecipientRefOps.html "class in akka.actor.typed")<[T](../RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps")>, [RecipientRef.RecipientRefOps$](../RecipientRef.RecipientRefOps$.html "class in akka.actor.typed")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isTerminated](#isTerminated())()` |  |
	| `[ActorRefProvider](../../ActorRefProvider.html "interface in akka.actor")` | `[provider](#provider())()` | Get a reference to the actor ref provider which created this ref. |
	| `java.lang.String` | `[refPrefix](#refPrefix())()` |  |
	
	
		- ### Methods inherited from interface akka.actor.typed.[RecipientRef](../RecipientRef.html "interface in akka.actor.typed")
		
		
		`[tell](../RecipientRef.html#tell(T))`

- - ### Method Detail
	
	
	
		- #### isTerminated
		
		
		
		```
		boolean isTerminated()
		```
		
		
		Returns:
		`true` if the actor is locally known to be terminated, `false` if alive or uncertain.
		- #### provider
		
		
		
		```
		[ActorRefProvider](../../ActorRefProvider.html "interface in akka.actor") provider()
		```
		
		Get a reference to the actor ref provider which created this ref.
		- #### refPrefix
		
		
		
		```
		java.lang.String refPrefix()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRefProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.RecipientRefOps$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.RecipientRefOps.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/InternalRecipientRef.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/InternalRecipientRef.html)*
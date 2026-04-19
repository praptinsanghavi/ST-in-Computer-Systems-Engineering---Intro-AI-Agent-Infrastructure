---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:45:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/ChangeEventHandler.html
title: ChangeEventHandler
---

# ChangeEventHandler

## Content

Package [akka.persistence.typed.state.javadsl](package-summary.html)
## Interface ChangeEventHandler\<Command,​State,​ChangeEvent\>

- ---

```
public interface ChangeEventHandler<Command,​State,​ChangeEvent>
```

API May Change: Implement this interface and use it in `DurableStateBehavior#withChangeEventHandler`
 to store additional change event when the state is updated. The event can be used in Projections.
 
 The `updateHandler` and `deleteHandler` are invoked after the ordinary command handler. Be aware of that
 if the state is mutable and modified by the command handler the previous state parameter of the `updateHandler`
 will also include the modification, since it's the same instance. If that is a problem you need to use
 immutable state and create a new state instance when modifying it in the command handler.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ChangeEvent](ChangeEventHandler.html "type parameter in ChangeEventHandler")` | `[deleteHandler](#deleteHandler(State,Command))​([State](ChangeEventHandler.html "type parameter in ChangeEventHandler") previousState,  [Command](ChangeEventHandler.html "type parameter in ChangeEventHandler") command)` | Store additional change event when the state is updated. |
	| `[ChangeEvent](ChangeEventHandler.html "type parameter in ChangeEventHandler")` | `[updateHandler](#updateHandler(State,State,Command))​([State](ChangeEventHandler.html "type parameter in ChangeEventHandler") previousState,  [State](ChangeEventHandler.html "type parameter in ChangeEventHandler") newState,  [Command](ChangeEventHandler.html "type parameter in ChangeEventHandler") command)` | Store additional change event when the state is updated. |

- - ### Method Detail
	
	
	
		- #### updateHandler
		
		
		
		```
		[ChangeEvent](ChangeEventHandler.html "type parameter in ChangeEventHandler") updateHandler​([State](ChangeEventHandler.html "type parameter in ChangeEventHandler") previousState,
		                          [State](ChangeEventHandler.html "type parameter in ChangeEventHandler") newState,
		                          [Command](ChangeEventHandler.html "type parameter in ChangeEventHandler") command)
		```
		
		Store additional change event when the state is updated. The event can be used in Projections.
		 
		
		Parameters:
		`previousState` \- Previous state before the update.
		`newState` \- New state after the update.
		Returns:
		The change event to be stored.
		- #### deleteHandler
		
		
		
		```
		[ChangeEvent](ChangeEventHandler.html "type parameter in ChangeEventHandler") deleteHandler​([State](ChangeEventHandler.html "type parameter in ChangeEventHandler") previousState,
		                          [Command](ChangeEventHandler.html "type parameter in ChangeEventHandler") command)
		```
		
		Store additional change event when the state is updated. The event can be used in Projections.
		 
		
		Parameters:
		`previousState` \- Previous state before the delete.
		Returns:
		The change event to be stored.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/ChangeEventHandler.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/ChangeEventHandler.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/ChangeEventHandler.html)*
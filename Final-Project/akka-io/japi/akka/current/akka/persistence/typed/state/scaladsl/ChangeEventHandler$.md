---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ChangeEventHandler$.html
title: ChangeEventHandler$
---

# ChangeEventHandler$

## Content

Package [akka.persistence.typed.state.scaladsl](package-summary.html)
## Class ChangeEventHandler$

- java.lang.Object
- - akka.persistence.typed.state.scaladsl.ChangeEventHandler$

- ---

```
public class ChangeEventHandler$
extends java.lang.Object
```

API May Change

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ChangeEventHandler$](ChangeEventHandler$.html "class in akka.persistence.typed.state.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ChangeEventHandler$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​State,​ChangeEvent>[ChangeEventHandler](ChangeEventHandler.html "class in akka.persistence.typed.state.scaladsl")<Command,​State,​ChangeEvent>` | `[apply](#apply(scala.Function3,scala.Function2))​(scala.Function3<State,​State,​Command,​ChangeEvent> updateHandler,  scala.Function2<State,​Command,​ChangeEvent> deleteHandler)` | Define these handlers in the [`DurableStateBehavior.withChangeEventHandler(akka.persistence.typed.state.scaladsl.ChangeEventHandler<Command, State, ChangeEvent>)`](DurableStateBehavior.html#withChangeEventHandler(akka.persistence.typed.state.scaladsl.ChangeEventHandler)) to store additional change event when  the state is updated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ChangeEventHandler$](ChangeEventHandler$.html "class in akka.persistence.typed.state.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ChangeEventHandler$
		
		
		
		```
		public ChangeEventHandler$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <Command,​State,​ChangeEvent> [ChangeEventHandler](ChangeEventHandler.html "class in akka.persistence.typed.state.scaladsl")<Command,​State,​ChangeEvent> apply​(scala.Function3<State,​State,​Command,​ChangeEvent> updateHandler,
		                                                                                                               scala.Function2<State,​Command,​ChangeEvent> deleteHandler)
		```
		
		Define these handlers in the [`DurableStateBehavior.withChangeEventHandler(akka.persistence.typed.state.scaladsl.ChangeEventHandler<Command, State, ChangeEvent>)`](DurableStateBehavior.html#withChangeEventHandler(akka.persistence.typed.state.scaladsl.ChangeEventHandler)) to store additional change event when
		 the state is updated. The event can be used in Projections.
		 
		 The `updateHandler` and `deleteHandler` are invoked after the ordinary command handler. Be aware of that
		 if the state is mutable and modified by the command handler the previous state parameter of the `updateHandler`
		 will also include the modification, since it's the same instance. If that is a problem you need to use
		 immutable state and create a new state instance when modifying it in the command handler.
		 
		
		
		
		Parameters:
		`updateHandler` \- Function that given the previous and new state creates the change event to be stored
		 when the DurableState is updated.
		`deleteHandler` \- Function that given the previous state creates the change event to be stored
		 when the DurableState is deleted.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ChangeEventHandler$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ChangeEventHandler.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ChangeEventHandler$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ChangeEventHandler$.html)*
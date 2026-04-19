---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior.CommandHandler$.html
title: DurableStateBehavior.CommandHandler$
---

# DurableStateBehavior.CommandHandler$

## Content

Package [akka.persistence.typed.state.scaladsl](package-summary.html)
## Class DurableStateBehavior.CommandHandler$

- java.lang.Object
- - akka.persistence.typed.state.scaladsl.DurableStateBehavior.CommandHandler$

- Enclosing interface:
[DurableStateBehavior](DurableStateBehavior.html "interface in akka.persistence.typed.state.scaladsl")\<[Command](DurableStateBehavior.html "type parameter in DurableStateBehavior"),​[State](DurableStateBehavior.html "type parameter in DurableStateBehavior")\>

---

```
public static class DurableStateBehavior.CommandHandler$
extends java.lang.Object
```

The `CommandHandler` defines how to act on commands. A `CommandHandler` is
 a function:
 

```

   (State, Command) => Effect[State]
 
```

 The `CommandHandler#command` is useful for simple commands that don't need the state
 and context.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DurableStateBehavior.CommandHandler$](DurableStateBehavior.CommandHandler$.html "class in akka.persistence.typed.state.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CommandHandler$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​State>scala.Function2<State,​Command,​[Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>>` | `[command](#command(scala.Function1))​(scala.Function1<Command,​[Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>> commandHandler)` | Convenience for simple commands that don't need the state and context. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DurableStateBehavior.CommandHandler$](DurableStateBehavior.CommandHandler$.html "class in akka.persistence.typed.state.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CommandHandler$
		
		
		
		```
		public CommandHandler$()
		```

	- ### Method Detail
	
	
	
		- #### command
		
		
		
		```
		public <Command,​State> scala.Function2<State,​Command,​[Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>> command​(scala.Function1<Command,​[Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>> commandHandler)
		```
		
		Convenience for simple commands that don't need the state and context.

## Code Examples

### Example 1: Class DurableStateBehavior.CommandHandler$

```text
(State, Command) => Effect[State]
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior.CommandHandler$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior.CommandHandler$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior.CommandHandler$.html)*
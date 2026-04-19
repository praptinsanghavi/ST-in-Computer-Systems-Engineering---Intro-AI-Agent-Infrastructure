---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior.CommandHandler$.html
title: EventSourcedBehavior.CommandHandler$
---

# EventSourcedBehavior.CommandHandler$

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Class EventSourcedBehavior.CommandHandler$

- java.lang.Object
- - akka.persistence.typed.scaladsl.EventSourcedBehavior.CommandHandler$

- Enclosing interface:
[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")\<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")\>

---

```
public static class EventSourcedBehavior.CommandHandler$
extends java.lang.Object
```

The `CommandHandler` defines how to act on commands. A `CommandHandler` is
 a function:
 

```

   (State, Command) => Effect[Event, State]
 
```

 The `CommandHandler#command` is useful for simple commands that don't need the state
 and context.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventSourcedBehavior.CommandHandler$](EventSourcedBehavior.CommandHandler$.html "class in akka.persistence.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CommandHandler$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​Event,​State>scala.Function2<State,​Command,​[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>>` | `[command](#command(scala.Function1))​(scala.Function1<Command,​[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> commandHandler)` | Convenience for simple commands that don't need the state and context. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventSourcedBehavior.CommandHandler$](EventSourcedBehavior.CommandHandler$.html "class in akka.persistence.typed.scaladsl") MODULE$
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
		public <Command,​Event,​State> scala.Function2<State,​Command,​[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> command​(scala.Function1<Command,​[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> commandHandler)
		```
		
		Convenience for simple commands that don't need the state and context.

## Code Examples

### Example 1: Class EventSourcedBehavior.CommandHandler$

```text
(State, Command) => Effect[Event, State]
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior.CommandHandler$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior.CommandHandler$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior.CommandHandler$.html)*
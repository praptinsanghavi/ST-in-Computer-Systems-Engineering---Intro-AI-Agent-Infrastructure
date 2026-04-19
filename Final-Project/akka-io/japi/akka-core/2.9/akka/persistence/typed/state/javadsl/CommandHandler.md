---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:30:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/CommandHandler.html
title: CommandHandler
---

# CommandHandler

## Content

Package [akka.persistence.typed.state.javadsl](package-summary.html)
## Interface CommandHandler\<Command,​State\>

- All Known Subinterfaces:
`[CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.state.javadsl")<Command,​State>`

---

```
public interface CommandHandler<Command,​State>
```

FunctionalInterface for reacting on commands
 
 Used with [`CommandHandlerBuilder`](CommandHandlerBuilder.html "class in akka.persistence.typed.state.javadsl") to setup the behavior of a [`DurableStateBehavior`](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandler.html "type parameter in CommandHandler")>` | `[apply](#apply(State,Command))​([State](CommandHandler.html "type parameter in CommandHandler") state,  [Command](CommandHandler.html "type parameter in CommandHandler") command)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandler.html "type parameter in CommandHandler")> apply​([State](CommandHandler.html "type parameter in CommandHandler") state,
		                    [Command](CommandHandler.html "type parameter in CommandHandler") command)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/CommandHandler.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/DurableStateBehavior.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/Effect.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/CommandHandler.html](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/CommandHandler.html)*
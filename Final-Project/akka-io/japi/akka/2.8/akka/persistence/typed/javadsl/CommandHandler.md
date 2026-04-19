---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:25:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/CommandHandler.html
title: CommandHandler
---

# CommandHandler

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Interface CommandHandler\<Command,​Event,​State\>

- All Known Subinterfaces:
`[CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.javadsl")<Command,​Event,​State>`

---

```
public interface CommandHandler<Command,​Event,​State>
```

FunctionalInterface for reacting on commands
 
 Used with [`CommandHandlerBuilder`](CommandHandlerBuilder.html "class in akka.persistence.typed.javadsl") to setup the behavior of a [`EventSourcedBehavior`](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Effect](Effect.html "interface in akka.persistence.typed.javadsl")<[Event](CommandHandler.html "type parameter in CommandHandler"),​[State](CommandHandler.html "type parameter in CommandHandler")>` | `[apply](#apply(State,Command))​([State](CommandHandler.html "type parameter in CommandHandler") state,  [Command](CommandHandler.html "type parameter in CommandHandler") command)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[Effect](Effect.html "interface in akka.persistence.typed.javadsl")<[Event](CommandHandler.html "type parameter in CommandHandler"),​[State](CommandHandler.html "type parameter in CommandHandler")> apply​([State](CommandHandler.html "type parameter in CommandHandler") state,
		                                [Command](CommandHandler.html "type parameter in CommandHandler") command)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/CommandHandler.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/Effect.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/CommandHandler.html](https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/CommandHandler.html)*
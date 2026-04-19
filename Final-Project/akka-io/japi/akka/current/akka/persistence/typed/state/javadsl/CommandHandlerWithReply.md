---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:45:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReply.html
title: CommandHandlerWithReply
---

# CommandHandlerWithReply

## Content

Package [akka.persistence.typed.state.javadsl](package-summary.html)
## Interface CommandHandlerWithReply\<Command,​State\>

- All Superinterfaces:
`[CommandHandler](CommandHandler.html "interface in akka.persistence.typed.state.javadsl")<Command,​State>`

---

```
public interface CommandHandlerWithReply<Command,​State>
extends [CommandHandler](CommandHandler.html "interface in akka.persistence.typed.state.javadsl")<Command,​State>
```

FunctionalInterface for reacting on commands
 
 Used with [`CommandHandlerWithReplyBuilder`](CommandHandlerWithReplyBuilder.html "class in akka.persistence.typed.state.javadsl") to setup the behavior of a [`DurableStateBehaviorWithEnforcedReplies`](DurableStateBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.state.javadsl")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply")>` | `[apply](#apply(State,Command))​([State](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply") state,  [Command](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply") command)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply")> apply​([State](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply") state,
		                         [Command](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply") command)
		```
		
		
		Specified by:
		`[apply](CommandHandler.html#apply(State,Command))` in interface `[CommandHandler](CommandHandler.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply"),​[State](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/CommandHandler.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReply.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReply.html)*
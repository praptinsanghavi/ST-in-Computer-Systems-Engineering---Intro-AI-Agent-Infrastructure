---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:03:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReply.html
title: CommandHandlerWithReply
---

# CommandHandlerWithReply

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Interface CommandHandlerWithReply\<Command,​Event,​State\>

- All Superinterfaces:
`[CommandHandler](CommandHandler.html "interface in akka.persistence.typed.javadsl")<Command,​Event,​State>`

---

```
public interface CommandHandlerWithReply<Command,​Event,​State>
extends [CommandHandler](CommandHandler.html "interface in akka.persistence.typed.javadsl")<Command,​Event,​State>
```

FunctionalInterface for reacting on commands
 
 Used with [`CommandHandlerWithReplyBuilder`](CommandHandlerWithReplyBuilder.html "class in akka.persistence.typed.javadsl") to setup the behavior of a [`EventSourcedBehaviorWithEnforcedReplies`](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply"),​[State](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply")>` | `[apply](#apply(State,Command))​([State](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply") state,  [Command](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply") command)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply"),​[State](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply")> apply​([State](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply") state,
		                                     [Command](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply") command)
		```
		
		
		Specified by:
		`[apply](CommandHandler.html#apply(State,Command))` in interface `[CommandHandler](CommandHandler.html "interface in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply"),​[Event](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply"),​[State](CommandHandlerWithReply.html "type parameter in CommandHandlerWithReply")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReply.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReply.html)*
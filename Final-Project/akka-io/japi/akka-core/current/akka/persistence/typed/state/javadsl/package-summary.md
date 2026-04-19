---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/package-summary.html
title: akka.persistence.typed.state.javadsl
---

# akka.persistence.typed.state.javadsl

## Content

# Package akka.persistence.typed.state.javadsl

- Interface Summary 
| Interface | Description |
| [ChangeEventHandler](ChangeEventHandler.html "interface in akka.persistence.typed.state.javadsl")\<Command,​State,​ChangeEvent\> | API May Change: Implement this interface and use it in `DurableStateBehavior#withChangeEventHandler`  to store additional change event when the state is updated. |
| --- | --- |
| [CommandHandler](CommandHandler.html "interface in akka.persistence.typed.state.javadsl")\<Command,​State\> | FunctionalInterface for reacting on commands |
| [CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.state.javadsl")\<Command,​State\> | FunctionalInterface for reacting on commands |
| [Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")\<State\> | A command handler returns an `Effect` directive that defines what state to persist. |
| [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")\<State\> | [`DurableStateBehaviorWithEnforcedReplies`](DurableStateBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.state.javadsl") can be used to enforce that replies are not forgotten. |
- Class Summary 
| Class | Description |
| [ChangeEventHandler$](ChangeEventHandler$.html "class in akka.persistence.typed.state.javadsl") | INTERNAL API |
| --- | --- |
| [CommandHandlerBuilder](CommandHandlerBuilder.html "class in akka.persistence.typed.state.javadsl")\<Command,​State\> |  |
| [CommandHandlerBuilder$](CommandHandlerBuilder$.html "class in akka.persistence.typed.state.javadsl") |  |
| [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")\<Command,​S extends State,​State\> |  |
| [CommandHandlerBuilderByState$](CommandHandlerBuilderByState$.html "class in akka.persistence.typed.state.javadsl") |  |
| [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html "class in akka.persistence.typed.state.javadsl")\<Command,​State\> |  |
| [CommandHandlerWithReplyBuilder$](CommandHandlerWithReplyBuilder$.html "class in akka.persistence.typed.state.javadsl") |  |
| [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")\<Command,​S extends State,​State\> |  |
| [CommandHandlerWithReplyBuilderByState$](CommandHandlerWithReplyBuilderByState$.html "class in akka.persistence.typed.state.javadsl") |  |
| [DurableStateBehavior](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl")\<Command,​State\> | A `Behavior` for a persistent actor with durable storage of its state. |
| [DurableStateBehaviorWithEnforcedReplies](DurableStateBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.state.javadsl")\<Command,​State\> | A [`DurableStateBehavior`](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl") that is enforcing that replies to commands are not forgotten. |
| [DurableStateOnCommandBehavior](DurableStateOnCommandBehavior.html "class in akka.persistence.typed.state.javadsl")\<Command,​State\> | A `Behavior` for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done  \* using switch pattern match. |
| [DurableStateOnCommandWithReplyBehavior](DurableStateOnCommandWithReplyBehavior.html "class in akka.persistence.typed.state.javadsl")\<Command,​State\> | A `Behavior` for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done  \* using switch pattern match. |
| [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.state.javadsl")\<State\> | A command handler returns an `Effect` directive that defines what state to persist. |
| [EffectFactories](EffectFactories.html "class in akka.persistence.typed.state.javadsl")\<State\> | Factory methods for creating [`Effect`](Effect.html "interface in akka.persistence.typed.state.javadsl") directives \- how a `DurableStateBehavior` reacts on a command. |
| [EffectFactories$](EffectFactories$.html "class in akka.persistence.typed.state.javadsl") | INTERNAL API: see `class EffectFactories` |
| [SignalHandler](SignalHandler.html "class in akka.persistence.typed.state.javadsl")\<State\> |  |
| [SignalHandler$](SignalHandler$.html "class in akka.persistence.typed.state.javadsl") |  |
| [SignalHandlerBuilder](SignalHandlerBuilder.html "class in akka.persistence.typed.state.javadsl")\<State\> | Mutable builder for handling signals in [`DurableStateBehavior`](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl") |
| [SignalHandlerBuilder$](SignalHandlerBuilder$.html "class in akka.persistence.typed.state.javadsl") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/ChangeEventHandler$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/ChangeEventHandler.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandler.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/DurableStateBehavior.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/DurableStateOnCommandBehavior.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/DurableStateOnCommandWithReplyBehavior.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/Effect.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/EffectBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/EffectFactories$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/EffectFactories.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/SignalHandler$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/SignalHandler.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/SignalHandlerBuilder$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/SignalHandlerBuilder.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/package-summary.html)*
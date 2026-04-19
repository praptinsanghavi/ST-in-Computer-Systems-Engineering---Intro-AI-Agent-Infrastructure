---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:38:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/package-summary.html
title: akka.persistence.typed.state.scaladsl
---

# akka.persistence.typed.state.scaladsl

## Content

# Package akka.persistence.typed.state.scaladsl

- Interface Summary 
| Interface | Description |
| [DurableStateBehavior](DurableStateBehavior.html "interface in akka.persistence.typed.state.scaladsl")\<Command,​State\> | Further customization of the `DurableStateBehavior` can be done with the methods defined here. |
| --- | --- |
| [Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")\<State\> | A command handler returns an `Effect` directive that defines what state to persist. |
| [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")\<State\> | A command handler returns an `Effect` directive that defines what state to persist. |
| [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")\<State\> | `DurableStateBehavior.withEnforcedReplies` can be used to enforce that replies are not forgotten. |
- Class Summary 
| Class | Description |
| [ChangeEventHandler](ChangeEventHandler.html "class in akka.persistence.typed.state.scaladsl")\<Command,​State,​ChangeEvent\> | API May Change: Define these handlers in the [`DurableStateBehavior.withChangeEventHandler(akka.persistence.typed.state.scaladsl.ChangeEventHandler<Command, State, ChangeEvent>)`](DurableStateBehavior.html#withChangeEventHandler(akka.persistence.typed.state.scaladsl.ChangeEventHandler)) to store  additional change event when the state is updated. |
| --- | --- |
| [ChangeEventHandler$](ChangeEventHandler$.html "class in akka.persistence.typed.state.scaladsl") | API May Change |
| [DurableStateBehavior.CommandHandler$](DurableStateBehavior.CommandHandler$.html "class in akka.persistence.typed.state.scaladsl") | The `CommandHandler` defines how to act on commands. |
| [DurableStateBehavior$](DurableStateBehavior$.html "class in akka.persistence.typed.state.scaladsl") | API May Change |
| [Effect$](Effect$.html "class in akka.persistence.typed.state.scaladsl") | Factory methods for creating [`Effect`](Effect.html "interface in akka.persistence.typed.state.scaladsl") directives \- how a `DurableStateBehavior` reacts on a command. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ChangeEventHandler$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ChangeEventHandler.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior.CommandHandler$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/EffectBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ReplyEffect.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/package-summary.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/package-summary.html)*
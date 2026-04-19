---
description: Akka 2.9.8 - akka.persistence.typed.state.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:31:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/index.html
title: Akka 2.9.8 - akka.persistence.typed.state.scaladsl
---

# Akka 2.9.8 - akka.persistence.typed.state.scaladsl

> **Summary:** Akka 2.9.8 - akka.persistence.typed.state.scaladsl

## Content

Akka2\.9\.8 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/persistence/typed/state/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[state](../index.html)
- [**](../../../../../akka/persistence/typed/state/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[state](../index.html)
- [ChangeEventHandler](ChangeEventHandler.html "API May Change: Define these handlers in the DurableStateBehavior#withChangeEventHandler to store additional change event when the state is updated.")
- [DurableStateBehavior](DurableStateBehavior.html "Further customization of the DurableStateBehavior can be done with the methods defined here.")
- [Effect](Effect.html "A command handler returns an Effect directive that defines what state to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what state to persist.")
- [ReplyEffect](ReplyEffect.html "DurableStateBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")
p[akka](../../../../index.html).[persistence](../../../index.html).[typed](../../index.html).[state](../index.html)

# scaladsl[**](../../../../../akka/persistence/typed/state/scaladsl/index.html "Permalink")

#### package scaladsl

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html "Permalink") final  class [ChangeEventHandler](ChangeEventHandler.html "API May Change: Define these handlers in the DurableStateBehavior#withChangeEventHandler to store additional change event when the state is updated.")\[Command, State, ChangeEvent] extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)API May Change: Define these handlers in the [DurableStateBehavior\#withChangeEventHandler](DurableStateBehavior.html#withChangeEventHandler[ChangeEvent](handler:akka.persistence.typed.state.scaladsl.ChangeEventHandler[Command,State,ChangeEvent]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State]) to store
additional change event when the state is updated.

API May Change: Define these handlers in the [DurableStateBehavior\#withChangeEventHandler](DurableStateBehavior.html#withChangeEventHandler[ChangeEvent](handler:akka.persistence.typed.state.scaladsl.ChangeEventHandler[Command,State,ChangeEvent]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State]) to store
additional change event when the state is updated. The event can be used in Projections.

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
2. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html "Permalink")  trait [DurableStateBehavior](DurableStateBehavior.html "Further customization of the DurableStateBehavior can be done with the methods defined here.")\[Command, State] extends DeferredBehavior\[Command]Further customization of the `DurableStateBehavior` can be done with the methods defined here.

Further customization of the `DurableStateBehavior` can be done with the methods defined here.

Not for user extension

API May Change

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)() @[DoNotInherit](../../../../annotation/DoNotInherit.html)()
3. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html "Permalink")  trait [Effect](Effect.html "A command handler returns an Effect directive that defines what state to persist.")\[\+State] extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)A command handler returns an `Effect` directive that defines what state to persist.

A command handler returns an `Effect` directive that defines what state to persist.

Instances are created through the factories in the [Effect](Effect.html) companion object.

Not for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
4. [**](../../../../../akka/persistence/typed/state/scaladsl/EffectBuilder.html "Permalink")  trait [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what state to persist.")\[\+State] extends [Effect](Effect.html)\[State] A command handler returns an `Effect` directive that defines what state to persist.

 A command handler returns an `Effect` directive that defines what state to persist.

Instances are created through the factories in the [Effect](Effect.html) companion object.

Additional side effects can be performed in the callback `thenRun`

Not for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
5. [**](../../../../../akka/persistence/typed/state/scaladsl/ReplyEffect.html "Permalink")  trait [ReplyEffect](ReplyEffect.html "DurableStateBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")\[\+State] extends [Effect](Effect.html)\[State][DurableStateBehavior.withEnforcedReplies](DurableStateBehavior$.html#withEnforcedReplies[Command,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.state.scaladsl.ReplyEffect[State]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State]) can be used to enforce that replies are not forgotten.

[DurableStateBehavior.withEnforcedReplies](DurableStateBehavior$.html#withEnforcedReplies[Command,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.state.scaladsl.ReplyEffect[State]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State]) can be used to enforce that replies are not forgotten.
Then there will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html), which can be
created with [Effect.reply](Effect$.html#reply[ReplyMessage,State](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:ReplyMessage):akka.persistence.typed.state.scaladsl.ReplyEffect[State]), [Effect.noReply](Effect$.html#noReply[State]:akka.persistence.typed.state.scaladsl.ReplyEffect[State]), [EffectBuilder.thenReply](EffectBuilder.html#thenReply[ReplyMessage](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:State=>ReplyMessage):akka.persistence.typed.state.scaladsl.ReplyEffect[State]), or [EffectBuilder.thenNoReply](EffectBuilder.html#thenNoReply():akka.persistence.typed.state.scaladsl.ReplyEffect[State]).

Not intended for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler$.html "Permalink")  object [ChangeEventHandler](ChangeEventHandler$.html "API May Change")API May Change

API May Change

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
2. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html "Permalink")  object [DurableStateBehavior](DurableStateBehavior$.html "API May Change")API May Change

API May Change

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
3. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html "Permalink")  object [Effect](Effect$.html "Factory methods for creating Effect directives - how a DurableStateBehavior reacts on a command.")Factory methods for creating [Effect](Effect.html) directives \- how a `DurableStateBehavior` reacts on a command.

Factory methods for creating [Effect](Effect.html) directives \- how a `DurableStateBehavior` reacts on a command.

API May Change

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.9/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.9/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.9/akka/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/ChangeEventHandler$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/ChangeEventHandler.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/Effect$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/ReplyEffect.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.9/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/index.html](https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/index.html)*
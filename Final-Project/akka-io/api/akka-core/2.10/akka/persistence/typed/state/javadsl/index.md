---
description: Akka 2.10.17 - akka.persistence.typed.state.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:32:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/javadsl/index.html
title: Akka 2.10.17 - akka.persistence.typed.state.javadsl
---

# Akka 2.10.17 - akka.persistence.typed.state.javadsl

> **Summary:** Akka 2.10.17 - akka.persistence.typed.state.javadsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/persistence/typed/state/javadsl/index.html "Permalink")  package javadslDefinition Classes[state](../index.html)
- [ChangeEventHandler](ChangeEventHandler.html "API May Change: Implement this interface and use it in DurableStateBehavior#withChangeEventHandler to store additional change event when the state is updated.")
- [CommandHandler](CommandHandler.html "FunctionalInterface for reacting on commands")
- [CommandHandlerBuilder](CommandHandlerBuilder.html)
- [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html)
- [CommandHandlerWithReply](CommandHandlerWithReply.html "FunctionalInterface for reacting on commands")
- [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html)
- [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html)
- [DurableStateBehavior](DurableStateBehavior.html "A Behavior for a persistent actor with durable storage of its state.")
- [DurableStateBehaviorWithEnforcedReplies](DurableStateBehaviorWithEnforcedReplies.html "A DurableStateBehavior that is enforcing that replies to commands are not forgotten.")
- [DurableStateOnCommandBehavior](DurableStateOnCommandBehavior.html "A Behavior for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done * using switch pattern match.")
- [DurableStateOnCommandWithReplyBehavior](DurableStateOnCommandWithReplyBehavior.html "A Behavior for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done * using switch pattern match.")
- [Effect](Effect.html "A command handler returns an Effect directive that defines what state to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what state to persist.")
- [EffectFactories](EffectFactories.html "Factory methods for creating Effect directives - how a DurableStateBehavior reacts on a command.")
- [ReplyEffect](ReplyEffect.html "DurableStateBehaviorWithEnforcedReplies can be used to enforce that replies are not forgotten.")
- [SignalHandler](SignalHandler.html)
- [SignalHandlerBuilder](SignalHandlerBuilder.html "Mutable builder for handling signals in DurableStateBehavior")
- [**](../../../../../akka/persistence/typed/state/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[state](../index.html)
p[akka](../../../../index.html).[persistence](../../../index.html).[typed](../../index.html).[state](../index.html)

# javadsl[**](../../../../../akka/persistence/typed/state/javadsl/index.html "Permalink")

#### package javadsl

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/persistence/typed/state/javadsl/ChangeEventHandler.html "Permalink")  trait [ChangeEventHandler](ChangeEventHandler.html "API May Change: Implement this interface and use it in DurableStateBehavior#withChangeEventHandler to store additional change event when the state is updated.")\[Command, State, ChangeEvent] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)API May Change: Implement this interface and use it in DurableStateBehavior\#withChangeEventHandler
to store additional change event when the state is updated.

API May Change: Implement this interface and use it in DurableStateBehavior\#withChangeEventHandler
to store additional change event when the state is updated. The event can be used in Projections.

The `updateHandler` and `deleteHandler` are invoked after the ordinary command handler. Be aware of that
if the state is mutable and modified by the command handler the previous state parameter of the `updateHandler`
will also include the modification, since it's the same instance. If that is a problem you need to use
immutable state and create a new state instance when modifying it in the command handler.

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
2. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandler.html "Permalink")  trait [CommandHandler](CommandHandler.html "FunctionalInterface for reacting on commands")\[Command, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)FunctionalInterface for reacting on commands

FunctionalInterface for reacting on commands

Used with [CommandHandlerBuilder](CommandHandlerBuilder.html) to setup the behavior of a [DurableStateBehavior](DurableStateBehavior.html)

Annotations@FunctionalInterface()
3. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder.html "Permalink") final  class [CommandHandlerBuilder](CommandHandlerBuilder.html)\[Command, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html "Permalink") final  class [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html)\[Command, S \<: State, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
5. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerWithReply.html "Permalink")  trait [CommandHandlerWithReply](CommandHandlerWithReply.html "FunctionalInterface for reacting on commands")\[Command, State] extends [CommandHandler](CommandHandler.html)\[Command, State]FunctionalInterface for reacting on commands

FunctionalInterface for reacting on commands

Used with [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html) to setup the behavior of a [DurableStateBehaviorWithEnforcedReplies](DurableStateBehaviorWithEnforcedReplies.html)

Annotations@FunctionalInterface()
6. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder.html "Permalink") final  class [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html)\[Command, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
7. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState.html "Permalink") final  class [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html)\[Command, S \<: State, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
8. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehavior.html "Permalink") abstract  class [DurableStateBehavior](DurableStateBehavior.html "A Behavior for a persistent actor with durable storage of its state.")\[Command, State] extends DeferredBehavior\[Command]A `Behavior` for a persistent actor with durable storage of its state.

A `Behavior` for a persistent actor with durable storage of its state.

For projects using Java 17 and newer, also see [DurableStateOnCommandBehavior](DurableStateOnCommandBehavior.html)

API May Change

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
9. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html "Permalink") abstract  class [DurableStateBehaviorWithEnforcedReplies](DurableStateBehaviorWithEnforcedReplies.html "A DurableStateBehavior that is enforcing that replies to commands are not forgotten.")\[Command, State] extends [DurableStateBehavior](DurableStateBehavior.html)\[Command, State]A [DurableStateBehavior](DurableStateBehavior.html) that is enforcing that replies to commands are not forgotten.

A [DurableStateBehavior](DurableStateBehavior.html) that is enforcing that replies to commands are not forgotten.
There will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html), which can be
created with `Effects().reply`, `Effects().noReply`, [EffectBuilder.thenReply](EffectBuilder.html#thenReply[ReplyMessage](replyTo:akka.actor.typed.ActorRef[ReplyMessage],replyWithMessage:akka.japi.function.Function[State,ReplyMessage]):akka.persistence.typed.state.javadsl.ReplyEffect[State]), or [EffectBuilder.thenNoReply](EffectBuilder.html#thenNoReply():akka.persistence.typed.state.javadsl.ReplyEffect[State]).
10. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateOnCommandBehavior.html "Permalink") abstract  class [DurableStateOnCommandBehavior](DurableStateOnCommandBehavior.html "A Behavior for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done * using switch pattern match.")\[Command, State] extends DeferredBehavior\[Command]A `Behavior` for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done
\* using switch pattern match.

A `Behavior` for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done
\* using switch pattern match.

For building event sourced actors with Java versions before 17, see [DurableStateBehavior](DurableStateBehavior.html)

API May Change

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
11. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateOnCommandWithReplyBehavior.html "Permalink") abstract  class [DurableStateOnCommandWithReplyBehavior](DurableStateOnCommandWithReplyBehavior.html "A Behavior for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done * using switch pattern match.")\[Command, State] extends DeferredBehavior\[Command]A `Behavior` for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done
\* using switch pattern match.

A `Behavior` for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done
\* using switch pattern match.

Enforces replies to every received command.

For building event sourced actors with Java versions before 17, see [DurableStateBehavior](DurableStateBehavior.html)

API May Change

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
12. [**](../../../../../akka/persistence/typed/state/javadsl/Effect.html "Permalink")  trait [Effect](Effect.html "A command handler returns an Effect directive that defines what state to persist.")\[State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A command handler returns an `Effect` directive that defines what state to persist.

A command handler returns an `Effect` directive that defines what state to persist.

Instances of `Effect` are available through factories [DurableStateBehavior.Effect](DurableStateBehavior.html#Effect:akka.persistence.typed.state.javadsl.EffectFactories[State]).

Not intended for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
13. [**](../../../../../akka/persistence/typed/state/javadsl/EffectBuilder.html "Permalink") abstract  class [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what state to persist.")\[State] extends [Effect](Effect.html)\[State]A command handler returns an `Effect` directive that defines what state to persist.

A command handler returns an `Effect` directive that defines what state to persist.

Additional side effects can be performed in the callback `thenRun`

Instances of `Effect` are available through factories [DurableStateBehavior.Effect](DurableStateBehavior.html#Effect:akka.persistence.typed.state.javadsl.EffectFactories[State]).

Not intended for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
14. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html "Permalink") sealed  class [EffectFactories](EffectFactories.html "Factory methods for creating Effect directives - how a DurableStateBehavior reacts on a command.")\[State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Factory methods for creating [Effect](Effect.html) directives \- how a `DurableStateBehavior` reacts on a command.

Factory methods for creating [Effect](Effect.html) directives \- how a `DurableStateBehavior` reacts on a command.
Created via [DurableStateBehavior.Effect](DurableStateBehavior.html#Effect:akka.persistence.typed.state.javadsl.EffectFactories[State]).

Not for user extension

API May Change

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)() @[DoNotInherit](../../../../annotation/DoNotInherit.html)()
15. [**](../../../../../akka/persistence/typed/state/javadsl/ReplyEffect.html "Permalink")  trait [ReplyEffect](ReplyEffect.html "DurableStateBehaviorWithEnforcedReplies can be used to enforce that replies are not forgotten.")\[State] extends [Effect](Effect.html)\[State][DurableStateBehaviorWithEnforcedReplies](DurableStateBehaviorWithEnforcedReplies.html) can be used to enforce that replies are not forgotten.

[DurableStateBehaviorWithEnforcedReplies](DurableStateBehaviorWithEnforcedReplies.html) can be used to enforce that replies are not forgotten.
Then there will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html), which can be
created with `Effects().reply`, `Effects().noReply`, [EffectBuilder.thenReply](EffectBuilder.html#thenReply[ReplyMessage](replyTo:akka.actor.typed.ActorRef[ReplyMessage],replyWithMessage:akka.japi.function.Function[State,ReplyMessage]):akka.persistence.typed.state.javadsl.ReplyEffect[State]), or [EffectBuilder.thenNoReply](EffectBuilder.html#thenNoReply():akka.persistence.typed.state.javadsl.ReplyEffect[State]).

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
16. [**](../../../../../akka/persistence/typed/state/javadsl/SignalHandler.html "Permalink") final  class [SignalHandler](SignalHandler.html)\[State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
17. [**](../../../../../akka/persistence/typed/state/javadsl/SignalHandlerBuilder.html "Permalink") final  class [SignalHandlerBuilder](SignalHandlerBuilder.html "Mutable builder for handling signals in DurableStateBehavior")\[State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Mutable builder for handling signals in [DurableStateBehavior](DurableStateBehavior.html)

Mutable builder for handling signals in [DurableStateBehavior](DurableStateBehavior.html)

Not for user instantiation, use [DurableStateBehavior.newSignalHandlerBuilder](DurableStateBehavior.html#newSignalHandlerBuilder():akka.persistence.typed.state.javadsl.SignalHandlerBuilder[State]) to get an instance.
### Value Members

1. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html "Permalink")  object [CommandHandlerBuilder](CommandHandlerBuilder$.html)
2. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState$.html "Permalink")  object [CommandHandlerBuilderByState](CommandHandlerBuilderByState$.html)
3. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder$.html "Permalink")  object [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder$.html)
4. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState$.html "Permalink")  object [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState$.html)
5. [**](../../../../../akka/persistence/typed/state/javadsl/SignalHandler$.html "Permalink")  object [SignalHandler](SignalHandler$.html)
6. [**](../../../../../akka/persistence/typed/state/javadsl/SignalHandlerBuilder$.html "Permalink")  object [SignalHandlerBuilder](SignalHandlerBuilder$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/ChangeEventHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/DurableStateBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/DurableStateOnCommandBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/DurableStateOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/Effect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/EffectFactories.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/ReplyEffect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/SignalHandler$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/SignalHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/SignalHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/SignalHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/index.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/index.html)*
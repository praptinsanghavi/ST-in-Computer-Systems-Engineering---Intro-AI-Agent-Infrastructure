---
description: Akka 2.10.17 - akka.persistence.typed.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/javadsl/index.html
title: Akka 2.10.17 - akka.persistence.typed.javadsl
---

# Akka 2.10.17 - akka.persistence.typed.javadsl

> **Summary:** Akka 2.10.17 - akka.persistence.typed.javadsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/crdt/index.html "Permalink")  package [crdt](../crdt/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/delivery/index.html "Permalink")  package [delivery](../delivery/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/javadsl/index.html "Permalink")  package javadslDefinition Classes[typed](../index.html)
- [CommandHandler](CommandHandler.html "FunctionalInterface for reacting on commands")
- [CommandHandlerBuilder](CommandHandlerBuilder.html)
- [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html)
- [CommandHandlerWithReply](CommandHandlerWithReply.html "FunctionalInterface for reacting on commands")
- [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html)
- [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html)
- [Effect](Effect.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectFactories](EffectFactories.html "Factory methods for creating Effect directives - how an event sourced actor reacts on a command.")
- [EventHandler](EventHandler.html "FunctionalInterface for reacting on events having been persisted")
- [EventHandlerBuilder](EventHandlerBuilder.html)
- [EventHandlerBuilderByState](EventHandlerBuilderByState.html)
- [EventSourcedBehavior](EventSourcedBehavior.html "For projects using Java 17 and newer, also see EventSourcedOnCommandBehavior")
- [EventSourcedBehaviorWithEnforcedReplies](EventSourcedBehaviorWithEnforcedReplies.html "A EventSourcedBehavior that is enforcing that replies to commands are not forgotten.")
- [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "Event sourced behavior for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [EventSourcedOnCommandWithReplyBehavior](EventSourcedOnCommandWithReplyBehavior.html "Event sourced behavior for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [EventWithMetadata](EventWithMetadata.html)
- [PersistentFSMMigration](PersistentFSMMigration$.html "Helper functions for migration from PersistentFSM to Persistence Typed")
- [Recovery](Recovery.html "Strategy for recovery of snapshots and events.")
- [ReplicatedEventSourcedBehavior](ReplicatedEventSourcedBehavior.html "Base class for replicated event sourced behaviors.")
- [ReplicatedEventSourcedOnCommandBehavior](ReplicatedEventSourcedOnCommandBehavior.html "Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [ReplicatedEventSourcedOnCommandWithReplyBehavior](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [ReplicatedEventSourcing](ReplicatedEventSourcing$.html)
- [ReplicationContext](ReplicationContext.html "Provides access to replication specific state")
- [ReplicationInterceptor](ReplicationInterceptor.html)
- [ReplyEffect](ReplyEffect.html "EventSourcedBehaviorWithEnforcedReplies can be used to enforce that replies are not forgotten.")
- [RetentionCriteria](RetentionCriteria.html "Criteria for retention/deletion of snapshots and events.")
- [SignalHandler](SignalHandler.html)
- [SignalHandlerBuilder](SignalHandlerBuilder.html "Mutable builder for handling signals in EventSourcedBehavior")
- [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)
- [**](../../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/telemetry/index.html "Permalink")  package [telemetry](../telemetry/index.html)Definition Classes[typed](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html)

# javadsl[**](../../../../akka/persistence/typed/javadsl/index.html "Permalink")

#### package javadsl

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/persistence/typed/javadsl/CommandHandler.html "Permalink")  trait [CommandHandler](CommandHandler.html "FunctionalInterface for reacting on commands")\[Command, Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)FunctionalInterface for reacting on commands

FunctionalInterface for reacting on commands

Used with [CommandHandlerBuilder](CommandHandlerBuilder.html) to setup the behavior of a [EventSourcedBehavior](EventSourcedBehavior.html)

Annotations@FunctionalInterface()
2. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilder.html "Permalink") final  class [CommandHandlerBuilder](CommandHandlerBuilder.html)\[Command, Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html "Permalink") final  class [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html)\[Command, Event, S \<: State, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerWithReply.html "Permalink")  trait [CommandHandlerWithReply](CommandHandlerWithReply.html "FunctionalInterface for reacting on commands")\[Command, Event, State] extends [CommandHandler](CommandHandler.html)\[Command, Event, State]FunctionalInterface for reacting on commands

FunctionalInterface for reacting on commands

Used with [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html) to setup the behavior of a [EventSourcedBehaviorWithEnforcedReplies](EventSourcedBehaviorWithEnforcedReplies.html)

Annotations@FunctionalInterface()
5. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder.html "Permalink") final  class [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html)\[Command, Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
6. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState.html "Permalink") final  class [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html)\[Command, Event, S \<: State, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
7. [**](../../../../akka/persistence/typed/javadsl/Effect.html "Permalink")  trait [Effect](Effect.html "A command handler returns an Effect directive that defines what event or events to persist.")\[\+Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A command handler returns an `Effect` directive that defines what event or events to persist.

A command handler returns an `Effect` directive that defines what event or events to persist.

Instances of `Effect` are available through factories [EventSourcedBehavior.Effect](EventSourcedBehavior.html#Effect:akka.persistence.typed.javadsl.EffectFactories[Event,State]).

Not intended for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
8. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html "Permalink") abstract  class [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what event or events to persist.")\[\+Event, State] extends [Effect](Effect.html)\[Event, State]A command handler returns an `Effect` directive that defines what event or events to persist.

A command handler returns an `Effect` directive that defines what event or events to persist.

Additional side effects can be performed in the callback `thenRun`

Instances of `Effect` are available through factories [EventSourcedBehavior.Effect](EventSourcedBehavior.html#Effect:akka.persistence.typed.javadsl.EffectFactories[Event,State]).

Not intended for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
9. [**](../../../../akka/persistence/typed/javadsl/EffectFactories.html "Permalink") sealed  class [EffectFactories](EffectFactories.html "Factory methods for creating Effect directives - how an event sourced actor reacts on a command.")\[Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Factory methods for creating [Effect](Effect.html) directives \- how an event sourced actor reacts on a command.

Factory methods for creating [Effect](Effect.html) directives \- how an event sourced actor reacts on a command.
Created via [EventSourcedBehavior.Effect](EventSourcedBehavior.html#Effect:akka.persistence.typed.javadsl.EffectFactories[Event,State]).

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
10. [**](../../../../akka/persistence/typed/javadsl/EventHandler.html "Permalink")  trait [EventHandler](EventHandler.html "FunctionalInterface for reacting on events having been persisted")\[State, Event] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)FunctionalInterface for reacting on events having been persisted

FunctionalInterface for reacting on events having been persisted

Used with [EventHandlerBuilder](EventHandlerBuilder.html) to setup the behavior of a [EventSourcedBehavior](EventSourcedBehavior.html)

Annotations@FunctionalInterface()
11. [**](../../../../akka/persistence/typed/javadsl/EventHandlerBuilder.html "Permalink") final  class [EventHandlerBuilder](EventHandlerBuilder.html)\[State, Event] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
12. [**](../../../../akka/persistence/typed/javadsl/EventHandlerBuilderByState.html "Permalink") final  class [EventHandlerBuilderByState](EventHandlerBuilderByState.html)\[S \<: State, State, Event] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
13. [**](../../../../akka/persistence/typed/javadsl/EventSourcedBehavior.html "Permalink") abstract  class [EventSourcedBehavior](EventSourcedBehavior.html "For projects using Java 17 and newer, also see EventSourcedOnCommandBehavior")\[Command, Event, State] extends DeferredBehavior\[Command]For projects using Java 17 and newer, also see [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
14. [**](../../../../akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html "Permalink") abstract  class [EventSourcedBehaviorWithEnforcedReplies](EventSourcedBehaviorWithEnforcedReplies.html "A EventSourcedBehavior that is enforcing that replies to commands are not forgotten.")\[Command, Event, State] extends [EventSourcedBehavior](EventSourcedBehavior.html)\[Command, Event, State]A [EventSourcedBehavior](EventSourcedBehavior.html) that is enforcing that replies to commands are not forgotten.

A [EventSourcedBehavior](EventSourcedBehavior.html) that is enforcing that replies to commands are not forgotten.
There will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html), which can be
created with `Effects().reply`, `Effects().noReply`, [EffectBuilder.thenReply](EffectBuilder.html#thenReply[ReplyMessage](replyTo:akka.actor.typed.ActorRef[ReplyMessage],replyWithMessage:akka.japi.function.Function[State,ReplyMessage]):akka.persistence.typed.javadsl.ReplyEffect[Event,State]), or [EffectBuilder.thenNoReply](EffectBuilder.html#thenNoReply():akka.persistence.typed.javadsl.ReplyEffect[Event,State]).
15. [**](../../../../akka/persistence/typed/javadsl/EventSourcedOnCommandBehavior.html "Permalink") abstract  class [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "Event sourced behavior for projects built with Java 17 or newer where message handling can be done using switch pattern match.")\[Command, Event, State] extends DeferredBehavior\[Command]Event sourced behavior for projects built with Java 17 or newer where message handling can be done
using switch pattern match.

Event sourced behavior for projects built with Java 17 or newer where message handling can be done
using switch pattern match.

For building event sourced actors with Java versions before 17, see [EventSourcedBehavior](EventSourcedBehavior.html)
16. [**](../../../../akka/persistence/typed/javadsl/EventSourcedOnCommandWithReplyBehavior.html "Permalink") abstract  class [EventSourcedOnCommandWithReplyBehavior](EventSourcedOnCommandWithReplyBehavior.html "Event sourced behavior for projects built with Java 17 or newer where message handling can be done using switch pattern match.")\[Command, Event, State] extends DeferredBehavior\[Command]Event sourced behavior for projects built with Java 17 or newer where message handling can be done
using switch pattern match.

Event sourced behavior for projects built with Java 17 or newer where message handling can be done
using switch pattern match.

Enforces replies to every received command.

For building event sourced actors with Java versions before 17, see [EventSourcedBehavior](EventSourcedBehavior.html)
17. [**](../../../../akka/persistence/typed/javadsl/EventWithMetadata.html "Permalink") final  class [EventWithMetadata](EventWithMetadata.html)\[E] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
18. [**](../../../../akka/persistence/typed/javadsl/Recovery.html "Permalink") abstract  class [Recovery](Recovery.html "Strategy for recovery of snapshots and events.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Strategy for recovery of snapshots and events.
19. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html "Permalink") abstract  class [ReplicatedEventSourcedBehavior](ReplicatedEventSourcedBehavior.html "Base class for replicated event sourced behaviors.")\[Command, Event, State] extends [EventSourcedBehavior](EventSourcedBehavior.html)\[Command, Event, State]Base class for replicated event sourced behaviors.

Base class for replicated event sourced behaviors.

For projects using Java 17 and newer, also see [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
20. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html "Permalink") abstract  class [ReplicatedEventSourcedOnCommandBehavior](ReplicatedEventSourcedOnCommandBehavior.html "Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling can be done using switch pattern match.")\[Command, Event, State] extends [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)\[Command, Event, State]Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling
can be done using switch pattern match.

Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling
can be done using switch pattern match.

For building replicated event sourced actors with Java versions before 17, see [ReplicatedEventSourcedBehavior](ReplicatedEventSourcedBehavior.html)
21. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandWithReplyBehavior.html "Permalink") abstract  class [ReplicatedEventSourcedOnCommandWithReplyBehavior](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling can be done using switch pattern match.")\[Command, Event, State] extends [EventSourcedOnCommandWithReplyBehavior](EventSourcedOnCommandWithReplyBehavior.html)\[Command, Event, State]Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling
can be done using switch pattern match.

Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling
can be done using switch pattern match.

Enforces replies to every received command.

For building replicated event sourced actors with Java versions before 17, see [ReplicatedEventSourcedBehavior](ReplicatedEventSourcedBehavior.html)
22. [**](../../../../akka/persistence/typed/javadsl/ReplicationContext.html "Permalink")  trait [ReplicationContext](ReplicationContext.html "Provides access to replication specific state") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Provides access to replication specific state

Provides access to replication specific state

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
23. [**](../../../../akka/persistence/typed/javadsl/ReplicationInterceptor.html "Permalink")  trait [ReplicationInterceptor](ReplicationInterceptor.html)\[Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@FunctionalInterface()
24. [**](../../../../akka/persistence/typed/javadsl/ReplyEffect.html "Permalink")  trait [ReplyEffect](ReplyEffect.html "EventSourcedBehaviorWithEnforcedReplies can be used to enforce that replies are not forgotten.")\[\+Event, State] extends [Effect](Effect.html)\[Event, State][EventSourcedBehaviorWithEnforcedReplies](EventSourcedBehaviorWithEnforcedReplies.html) can be used to enforce that replies are not forgotten.

[EventSourcedBehaviorWithEnforcedReplies](EventSourcedBehaviorWithEnforcedReplies.html) can be used to enforce that replies are not forgotten.
Then there will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html), which can be
created with `Effects().reply`, `Effects().noReply`, [EffectBuilder.thenReply](EffectBuilder.html#thenReply[ReplyMessage](replyTo:akka.actor.typed.ActorRef[ReplyMessage],replyWithMessage:akka.japi.function.Function[State,ReplyMessage]):akka.persistence.typed.javadsl.ReplyEffect[Event,State]), or [EffectBuilder.thenNoReply](EffectBuilder.html#thenNoReply():akka.persistence.typed.javadsl.ReplyEffect[Event,State]).

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
25. [**](../../../../akka/persistence/typed/javadsl/RetentionCriteria.html "Permalink") abstract  class [RetentionCriteria](RetentionCriteria.html "Criteria for retention/deletion of snapshots and events.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Criteria for retention/deletion of snapshots and events.
26. [**](../../../../akka/persistence/typed/javadsl/SignalHandler.html "Permalink") final  class [SignalHandler](SignalHandler.html)\[State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
27. [**](../../../../akka/persistence/typed/javadsl/SignalHandlerBuilder.html "Permalink") final  class [SignalHandlerBuilder](SignalHandlerBuilder.html "Mutable builder for handling signals in EventSourcedBehavior")\[State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Mutable builder for handling signals in [EventSourcedBehavior](EventSourcedBehavior.html)

Mutable builder for handling signals in [EventSourcedBehavior](EventSourcedBehavior.html)

Not for user instantiation, use [EventSourcedBehavior.newSignalHandlerBuilder](EventSourcedBehavior.html#newSignalHandlerBuilder():akka.persistence.typed.javadsl.SignalHandlerBuilder[State]) to get an instance.
28. [**](../../../../akka/persistence/typed/javadsl/SnapshotCountRetentionCriteria.html "Permalink") abstract  class [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html) extends [RetentionCriteria](RetentionCriteria.html)Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilder$.html "Permalink")  object [CommandHandlerBuilder](CommandHandlerBuilder$.html)
2. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState$.html "Permalink")  object [CommandHandlerBuilderByState](CommandHandlerBuilderByState$.html)
3. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder$.html "Permalink")  object [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder$.html)
4. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState$.html "Permalink")  object [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState$.html)
5. [**](../../../../akka/persistence/typed/javadsl/EventHandlerBuilder$.html "Permalink")  object [EventHandlerBuilder](EventHandlerBuilder$.html)
6. [**](../../../../akka/persistence/typed/javadsl/EventHandlerBuilderByState$.html "Permalink")  object [EventHandlerBuilderByState](EventHandlerBuilderByState$.html)
7. [**](../../../../akka/persistence/typed/javadsl/EventWithMetadata$.html "Permalink")  object [EventWithMetadata](EventWithMetadata$.html)
8. [**](../../../../akka/persistence/typed/javadsl/PersistentFSMMigration$.html "Permalink")  object [PersistentFSMMigration](PersistentFSMMigration$.html "Helper functions for migration from PersistentFSM to Persistence Typed")Helper functions for migration from PersistentFSM to Persistence Typed
9. [**](../../../../akka/persistence/typed/javadsl/Recovery$.html "Permalink")  object [Recovery](Recovery$.html "Strategy for recovery of snapshots and events.")Strategy for recovery of snapshots and events.
10. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html "Permalink")  object [ReplicatedEventSourcing](ReplicatedEventSourcing$.html)
11. [**](../../../../akka/persistence/typed/javadsl/RetentionCriteria$.html "Permalink")  object [RetentionCriteria](RetentionCriteria$.html "Criteria for retention/deletion of snapshots and events.")Criteria for retention/deletion of snapshots and events.
12. [**](../../../../akka/persistence/typed/javadsl/SignalHandler$.html "Permalink")  object [SignalHandler](SignalHandler$.html)
13. [**](../../../../akka/persistence/typed/javadsl/SignalHandlerBuilder$.html "Permalink")  object [SignalHandlerBuilder](SignalHandlerBuilder$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/Effect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EffectFactories.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedOnCommandBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventWithMetadata$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventWithMetadata.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/PersistentFSMMigration$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/Recovery$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/Recovery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicationContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicationInterceptor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplyEffect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/RetentionCriteria$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/RetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SignalHandler$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SignalHandler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SignalHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SignalHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/index.html)*
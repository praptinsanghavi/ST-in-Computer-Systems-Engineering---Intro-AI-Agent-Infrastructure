---
description: Effects express how the state of an entity is to be updated, and how
  various side-effects can be performed; all in response to an entity’s commands.
  Effects can be chained with other effects and are guaranteed to be applied (run)
  before the next command for an entity id is processed.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/index.html
title: akka_persistence_rs::effect - Rust
---

# akka_persistence_rs::effect - Rust

> **Summary:** Effects express how the state of an entity is to be updated, and how various side-effects can be performed; all in response to an entity’s commands. Effects can be chained with other effects and are guaranteed to be applied (run) before the next command for an entity id is processed.

## Content

# Module [akka\_persistence\_rs](../index.html)::[effect](#)

[source](../../src/akka_persistence_rs/effect.rs.html#1-841) · Expand descriptionEffects express how the state of an entity is to be updated, and how various side\-effects
can be performed; all in response to an entity’s commands. Effects can be chained with other effects and are guaranteed
to be applied (run) before the next command for an entity id is processed.

Effects are applied
on being returned from a command handler. Command handlers are “pure” and deliberately constrained
from performing side effects. Using effects this way helps us reason the code of a command handler, and facilitate testing
outside of running an entity manager.

An example as used within a command handler:

```
use akka_persistence_rs::effect::{EffectExt, persist_event};

// ...

persist_event(SomeEvent)
    .then_reply(move |_s| Some((reply_to, reply_value)))
    .boxed();
```

Convenience methods are provided for commonly chained operations and often provide any state that
has been updated by a previous operation.
These conveniences take the form of `and_then` and `then` as the prefix. By Rust convention, `and_then`
provides the result of the previous operation and expects a result provided
given some closure. Also by convention, `then` is applied only when the previous operation
completed successfully.

The [EffectExt::boxed](trait.EffectExt.html#method.boxed "method akka_persistence_rs::effect::EffectExt::boxed") method is a convenience for “boxing” the chain of effects into a concrete
type that can be returned from a command handler. For more information on boxing, please refer
to [the Rust documentation](https://doc.rust-lang.org/std/boxed/index.html).

Custom effects may also be provided by implementing the [Effect](trait.Effect.html "trait akka_persistence_rs::effect::Effect") and [EffectExt](trait.EffectExt.html "trait akka_persistence_rs::effect::EffectExt")
traits. See the [Reply](struct.Reply.html "struct akka_persistence_rs::effect::Reply") type to illustrate how.

In the case where there is no convenience method, such as with custom ones, a generalized `and`
operation can be used to chain any effect. Using the previous `then_reply` example:

```
use akka_persistence_rs::effect::{EffectExt, reply, persist_event};

// ...

persist_event(SomeEvent)
    .and(reply(reply_to, reply_value))
    .boxed();
```

## [Structs](#structs)

- [And](struct.And.html "struct akka_persistence_rs::effect::And")The return type of [EffectExt::and](trait.EffectExt.html#method.and "method akka_persistence_rs::effect::EffectExt::and").
- [PersistEvent](struct.PersistEvent.html "struct akka_persistence_rs::effect::PersistEvent")The return type of [persist\_event](fn.persist_event.html "fn akka_persistence_rs::effect::persist_event") and [persist\_deletion\_event](fn.persist_deletion_event.html "fn akka_persistence_rs::effect::persist_deletion_event").
- [Reply](struct.Reply.html "struct akka_persistence_rs::effect::Reply")The return type of [reply](fn.reply.html "fn akka_persistence_rs::effect::reply").
- [Then](struct.Then.html "struct akka_persistence_rs::effect::Then")The return type of [then](fn.then.html "fn akka_persistence_rs::effect::then").
- [ThenPersistEvent](struct.ThenPersistEvent.html "struct akka_persistence_rs::effect::ThenPersistEvent")The return type of [EffectExt::then\_persist\_event](trait.EffectExt.html#method.then_persist_event "method akka_persistence_rs::effect::EffectExt::then_persist_event").
- [ThenReply](struct.ThenReply.html "struct akka_persistence_rs::effect::ThenReply")The return type of [EffectExt::then\_reply](trait.EffectExt.html#method.then_reply "method akka_persistence_rs::effect::EffectExt::then_reply").
- [Unhandled](struct.Unhandled.html "struct akka_persistence_rs::effect::Unhandled")The return type of [unhandled](fn.unhandled.html "fn akka_persistence_rs::effect::unhandled").

## [Enums](#enums)

- [Error](enum.Error.html "enum akka_persistence_rs::effect::Error")Errors that can occur when applying effects.

## [Traits](#traits)

- [Effect](trait.Effect.html "trait akka_persistence_rs::effect::Effect")The trait that effect types implement.
- [EffectExt](trait.EffectExt.html "trait akka_persistence_rs::effect::EffectExt")Combinators for use with effects.

## [Functions](#functions)

- [persist\_deletion\_event](fn.persist_deletion_event.html "fn akka_persistence_rs::effect::persist_deletion_event")An effect to persist an event upon having successfully handed it off to
be persisted. The event will be flagged to represent the deletion of
an entity instance.
- [persist\_event](fn.persist_event.html "fn akka_persistence_rs::effect::persist_event")An effect to persist an event.
- [persist\_event\_if](fn.persist_event_if.html "fn akka_persistence_rs::effect::persist_event_if")A side effect to run a function asynchronously and then, if ok,
persist an event. The associated
behavior is available so that communication channels, for
example, can be accessed by the side\-effect. Additionally, the
latest state given any previous effect having persisted an event,
or else the state at the outset of the effects being applied,
is also available.
- [reply](fn.reply.html "fn akka_persistence_rs::effect::reply")An effect to reply an envelope if the previous effect completed
successfully. Note that if state from having persisted an event
via a prior effect is required, then use a [then](fn.then.html "fn akka_persistence_rs::effect::then") effect instead.
- [then](fn.then.html "fn akka_persistence_rs::effect::then")A side effect to run a function asynchronously. The associated
behavior is available so that communication channels, for
example, can be accessed by the side\-effect. Additionally, the
latest state given any previous effect having persisted an event,
or else the state at the outset of the effects being applied,
is also available.
- [unhandled](fn.unhandled.html "fn akka_persistence_rs::effect::unhandled")An unhandled command producing no effect

## [Type Aliases](#types)

- [ReplyResult](type.ReplyResult.html "type akka_persistence_rs::effect::ReplyResult")A result type for [ReplyTo](type.ReplyTo.html "type akka_persistence_rs::effect::ReplyTo") which is used to reply if wrapped with [Some](https://doc.rust-lang.org/1.75.0/core/option/enum.Option.html#variant.Some "variant core::option::Option::Some").
- [ReplyTo](type.ReplyTo.html "type akka_persistence_rs::effect::ReplyTo")The reply\-to \[oneshot::Sender] and the value to send as a result of some
tuple.
- [Result](type.Result.html "type akka_persistence_rs::effect::Result")

## Code Examples

### Example 1: Moduleakka_persistence_rs::effect

```text
use akka_persistence_rs::effect::{EffectExt, persist_event};

// ...

persist_event(SomeEvent)
    .then_reply(move |_s| Some((reply_to, reply_value)))
    .boxed();
```

### Example 2: Moduleakka_persistence_rs::effect

```text
use akka_persistence_rs::effect::{EffectExt, reply, persist_event};

// ...

persist_event(SomeEvent)
    .and(reply(reply_to, reply_value))
    .boxed();
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/enum.Error.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/fn.persist_deletion_event.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/fn.persist_event.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/fn.persist_event_if.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/fn.reply.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/fn.then.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/fn.unhandled.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/struct.And.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/struct.PersistEvent.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/struct.Reply.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/struct.Then.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/struct.ThenPersistEvent.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/struct.ThenReply.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/struct.Unhandled.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/trait.Effect.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/trait.EffectExt.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/type.ReplyResult.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/type.ReplyTo.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/type.Result.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs/effect.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/index.html](https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/index.html)*
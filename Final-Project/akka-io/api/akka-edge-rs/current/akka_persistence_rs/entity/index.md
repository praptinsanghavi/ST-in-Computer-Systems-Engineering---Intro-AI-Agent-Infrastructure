---
description: An event sourced entity (also known as a persistent entity) receives
  a (non-persistent) command which is first validated if it can be applied to the
  current state. Here validation can mean anything, from simple inspection of a command
  message’s fields up to a conversation with several external services, for example.
  If validation succeeds, events are generated from the command, representing the
  effect of the command. These events are then persisted and, after successful persistence,
  used to change the entity’s state. When the event sourced actor needs to be recovered,
  only the persisted events are replayed of which we know that they can be successfully
  applied. In other words, events cannot fail when being replayed to a persistent
  entity, in contrast to commands. Event sourced entities may also process commands
  that do not change application state such as query commands for example.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity/index.html
title: akka_persistence_rs::entity - Rust
---

# akka_persistence_rs::entity - Rust

> **Summary:** An event sourced entity (also known as a persistent entity) receives a (non-persistent) command which is first validated if it can be applied to the current state. Here validation can mean anything, from simple inspection of a command message’s fields up to a conversation with several external services, for example. If validation succeeds, events are generated from the command, representing the effect of the command. These events are then persisted and, after successful persistence, used to change the entity’s state. When the event sourced actor needs to be recovered, only the persisted events are replayed of which we know that they can be successfully applied. In other words, events cannot fail when being replayed to a persistent entity, in contrast to commands. Event sourced entities may also process commands that do not change application state such as query commands for example.

## Content

# Module [akka\_persistence\_rs](../index.html)::[entity](#)

[source](../../src/akka_persistence_rs/entity.rs.html#1-60) · Expand descriptionAn event sourced entity (also known as a persistent entity) receives a (non\-persistent) command which is first validated
if it can be applied to the current state. Here validation can mean anything, from simple inspection of a command message’s
fields up to a conversation with several external services, for example. If validation succeeds, events are generated
from the command, representing the effect of the command. These events are then persisted and, after successful persistence,
used to change the entity’s state. When the event sourced actor needs to be recovered, only the persisted events are replayed
of which we know that they can be successfully applied. In other words, events cannot fail when being replayed to a persistent
entity, in contrast to commands. Event sourced entities may also process commands that do not change application state such
as query commands for example.

## [Structs](#structs)

- [Context](struct.Context.html "struct akka_persistence_rs::entity::Context")A context provides information about the environment that hosts a specific entity.

## [Traits](#traits)

- [EventSourcedBehavior](trait.EventSourcedBehavior.html "trait akka_persistence_rs::entity::EventSourcedBehavior")An entity’s behavior is the basic unit of modelling aspects of an Akka\-Persistence\-based application and
encapsulates how commands can be applied to state, including the emission of events. Events can
also be applied to state in order to produce more state.

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity/struct.Context.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity/trait.EventSourcedBehavior.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs/entity.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity/index.html](https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity/index.html)*
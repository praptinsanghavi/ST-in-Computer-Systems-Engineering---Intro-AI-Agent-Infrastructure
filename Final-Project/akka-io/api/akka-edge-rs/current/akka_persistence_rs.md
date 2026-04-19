---
description: Akka Persistence
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/
title: akka_persistence_rs - Rust
---

# akka_persistence_rs - Rust

> **Summary:** Akka Persistence

## Content

# Crate [akka\_persistence\_rs](#)

[source](../src/akka_persistence_rs/lib.rs.html#1-253) · Expand description## [Akka Persistence](#akka-persistence)

Akka Persistence enables stateful entities to persist their state so that it can be recovered when an entity is either restarted,
such as after a process crash, by a supervisor or a manual stop\-start, and so forth. The key concept behind Akka Persistence is
that only the events that are persisted by the entity are stored, not the actual state of it. The events are persisted by appending
to storage (nothing is ever mutated) which allows for very high transaction rates and efficient replication. A stateful entity is
recovered by replaying the stored events to it, allowing it to rebuild its state.

An `EntityManager` is used to manage entities of a specific type. It is effectively an in\-memory map of entity identifiers to their 
instances. When used at the edge, this map tends to contain all entity instances and so it is reasonble to posit why not just use
a map? The answer to this is that the `EntityManager` will reduce the amount code required to manage that map, and facilitate
dispatching commands along with sourcing their initial state from having been persisted. Events produced by entities can also be 
consumed as a stream and then persisted.

## [Modules](#modules)

- [effect](effect/index.html "mod akka_persistence_rs::effect")Effects express how the state of an entity is to be updated, and how various side\-effects
can be performed; all in response to an entity’s commands. Effects can be chained with other effects and are guaranteed
to be applied (run) before the next command for an entity id is processed.
- [entity](entity/index.html "mod akka_persistence_rs::entity")An event sourced entity (also known as a persistent entity) receives a (non\-persistent) command which is first validated
if it can be applied to the current state. Here validation can mean anything, from simple inspection of a command message’s
fields up to a conversation with several external services, for example. If validation succeeds, events are generated
from the command, representing the effect of the command. These events are then persisted and, after successful persistence,
used to change the entity’s state. When the event sourced actor needs to be recovered, only the persisted events are replayed
of which we know that they can be successfully applied. In other words, events cannot fail when being replayed to a persistent
entity, in contrast to commands. Event sourced entities may also process commands that do not change application state such
as query commands for example.
- [entity\_manager](entity_manager/index.html "mod akka_persistence_rs::entity_manager")An entity manager task handles the lifecycle and routing of messages for
an entity type. One EntityManager per entity type.
The EntityManager will generally instantiate the entities on demand, i.e. when first
message is sent to a specific entity. It will passivate least used
entities to have a bounded number of entities in memory.
The entities will recover their state from a stream of events.
- [jdk](jdk/index.html "mod akka_persistence_rs::jdk")

## [Structs](#structs)

- [CannotSourceError](struct.CannotSourceError.html "struct akka_persistence_rs::CannotSourceError")It is an error if there is a string representation that is not one of:
“” for ordinary events.
“BT” for backtracking events.
“PS” for PubSub events.
- [Message](struct.Message.html "struct akka_persistence_rs::Message")A message encapsulates a command that is addressed to a specific entity.
- [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")A namespaced entity id given an entity type.
- [PersistenceIdParseError](struct.PersistenceIdParseError.html "struct akka_persistence_rs::PersistenceIdParseError")
- [TimestampOffset](struct.TimestampOffset.html "struct akka_persistence_rs::TimestampOffset")

## [Enums](#enums)

- [Offset](enum.Offset.html "enum akka_persistence_rs::Offset")
- [Source](enum.Source.html "enum akka_persistence_rs::Source")An event source descriptor

## [Constants](#constants)

- [NUMBER\_OF\_SLICES](constant.NUMBER_OF_SLICES.html "constant akka_persistence_rs::NUMBER_OF_SLICES")A slice is deterministically defined based on the persistence id.
`NUMBER_OF_SLICES` is not configurable because changing the value would result in
different slice for a persistence id than what was used before, which would
result in invalid events\_by\_slices call on a source provider.

## [Traits](#traits)

- [WithOffset](trait.WithOffset.html "trait akka_persistence_rs::WithOffset")Implemented by structures that can return an offset.
- [WithPersistenceId](trait.WithPersistenceId.html "trait akka_persistence_rs::WithPersistenceId")Implemented by structures that can return a persistence id.
- [WithSeqNr](trait.WithSeqNr.html "trait akka_persistence_rs::WithSeqNr")Implemented by structures that can return a sequence number.
- [WithSource](trait.WithSource.html "trait akka_persistence_rs::WithSource")Implemented by structures that can return a source.
- [WithTags](trait.WithTags.html "trait akka_persistence_rs::WithTags")Implemented by structures that can return tags.
- [WithTimestamp](trait.WithTimestamp.html "trait akka_persistence_rs::WithTimestamp")Implemented by structures that can return a timestamp.

## [Functions](#functions)

- [slice\_ranges](fn.slice_ranges.html "fn akka_persistence_rs::slice_ranges")Split the total number of slices into ranges by the given `number_of_ranges`.
For example, `NUMBER_OF_SLICES` is 1024 and given 4 `number_of_ranges` this method will
return ranges (0 to 255\), (256 to 511\), (512 to 767\) and (768 to 1023\).

## [Type Aliases](#types)

- [EntityId](type.EntityId.html "type akka_persistence_rs::EntityId")Uniquely identifies an entity, or entity instance.
- [EntityType](type.EntityType.html "type akka_persistence_rs::EntityType")Uniquely identifies the type of an Entity.
- [Tag](type.Tag.html "type akka_persistence_rs::Tag")Tags annotate an entity’s events

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/constant.NUMBER_OF_SLICES.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/effect/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity_manager/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/enum.Offset.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/enum.Source.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/fn.slice_ranges.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/jdk/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/struct.CannotSourceError.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/struct.Message.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/struct.PersistenceId.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/struct.PersistenceIdParseError.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/struct.TimestampOffset.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithOffset.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithPersistenceId.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithSeqNr.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithSource.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithTags.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithTimestamp.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/type.EntityId.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/type.EntityType.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/type.Tag.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/](https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/)*
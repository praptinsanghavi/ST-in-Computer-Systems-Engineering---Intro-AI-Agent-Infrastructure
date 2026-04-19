---
description: An entity manager task handles the lifecycle and routing of messages
  for an entity type. One EntityManager per entity type. The EntityManager will generally
  instantiate the entities on demand, i.e. when first message is sent to a specific
  entity. It will passivate least used entities to have a bounded number of entities
  in memory. The entities will recover their state from a stream of events.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity_manager/index.html
title: akka_persistence_rs::entity_manager - Rust
---

# akka_persistence_rs::entity_manager - Rust

> **Summary:** An entity manager task handles the lifecycle and routing of messages for an entity type. One EntityManager per entity type. The EntityManager will generally instantiate the entities on demand, i.e. when first message is sent to a specific entity. It will passivate least used entities to have a bounded number of entities in memory. The entities will recover their state from a stream of events.

## Content

# Module [akka\_persistence\_rs](../index.html)::[entity\_manager](#)

[source](../../src/akka_persistence_rs/entity_manager.rs.html#1-615) · Expand descriptionAn entity manager task handles the lifecycle and routing of messages for
an entity type. One EntityManager per entity type.
The EntityManager will generally instantiate the entities on demand, i.e. when first
message is sent to a specific entity. It will passivate least used
entities to have a bounded number of entities in memory.
The entities will recover their state from a stream of events.

## [Structs](#structs)

- [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs::entity_manager::EventEnvelope")An envelope wraps an event associated with a specific entity.

## [Traits](#traits)

- [EntityOps](trait.EntityOps.html "trait akka_persistence_rs::entity_manager::EntityOps")An internal structure for the purposes of operating on the cache of entities.
- [Handler](trait.Handler.html "trait akka_persistence_rs::entity_manager::Handler")Handles events, in form of event envelopes, to another type of envelope e.g. those
that can be persisted using a storage technology.
- [SourceProvider](trait.SourceProvider.html "trait akka_persistence_rs::entity_manager::SourceProvider")Sources events, in form of event envelopes, to another type of envelope e.g. those
that can be sourced using a storage technology.

## [Functions](#functions)

- [task](fn.task.html "fn akka_persistence_rs::entity_manager::task")Provides an asynchronous task and a command channel that can run and drive an entity manager.
- [task\_with\_hasher](fn.task_with_hasher.html "fn akka_persistence_rs::entity_manager::task_with_hasher")Provides an asynchronous task and a command channel that can run and drive an entity manager.

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity_manager/fn.task.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity_manager/fn.task_with_hasher.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity_manager/struct.EventEnvelope.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity_manager/trait.EntityOps.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity_manager/trait.Handler.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity_manager/trait.SourceProvider.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs/entity_manager.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity_manager/index.html](https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/entity_manager/index.html)*
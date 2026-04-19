---
description: Akka projections
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/
title: akka_projection_rs - Rust
---

# akka_projection_rs - Rust

> **Summary:** Akka projections

## Content

# Crate [akka\_projection\_rs](#)

[source](../src/akka_projection_rs/lib.rs.html#1-219) · Expand description## [Akka projections](#akka-projections)

In Akka Projections you process a stream of event envelopes from a source to a projected model or external system.
Each envelope is associated with an offset representing the position in the stream. This offset is used for resuming
the stream from that position when the projection is restarted.

## [Modules](#modules)

- [consumer](consumer/index.html "mod akka_projection_rs::consumer")Akka projections
- [consumer\_filter](consumer_filter/index.html "mod akka_projection_rs::consumer_filter")The consumer may define declarative filters that are sent to the producer and evaluated on the producer side
before emitting the events.
- [offset\_store](offset_store/index.html "mod akka_projection_rs::offset_store")An offset store keeps track of the last offset used in relation to
an entity, including its entity type. It can be used in various places,
for example, when consuming event envelopes from a remote projection, where
they be emitted by the consumer out of order. This entity can track such situations.
- [volatile\_offset\_store](volatile_offset_store/index.html "mod akka_projection_rs::volatile_offset_store")A volatile offset store is provided for situations where
events are always sourced events from their earliest offset.
An example use case is when events are queried over HTTP from
a web browser that does not retain the offset where it is up to.

## [Structs](#structs)

- [FnHandler](struct.FnHandler.html "struct akka_projection_rs::FnHandler")
- [HandlerError](struct.HandlerError.html "struct akka_projection_rs::HandlerError")Errors for event processing by a handler.
- [SourceProviderError](struct.SourceProviderError.html "struct akka_projection_rs::SourceProviderError")Errors for event processing by a handler.
- [UnusedHandler](struct.UnusedHandler.html "struct akka_projection_rs::UnusedHandler")For the purposes of constructing unused handlers.
- [UnusedPendingHandler](struct.UnusedPendingHandler.html "struct akka_projection_rs::UnusedPendingHandler")For the purposes of constructing unused handlers.

## [Enums](#enums)

- [Handlers](enum.Handlers.html "enum akka_projection_rs::Handlers")Captures the various types of handlers and the way they are performed.

## [Traits](#traits)

- [Handler](trait.Handler.html "trait akka_projection_rs::Handler")Handle event envelopes in any way that an application requires.
- [PendingHandler](trait.PendingHandler.html "trait akka_projection_rs::PendingHandler")Handle event envelopes in any way that an application requires.
- [SourceProvider](trait.SourceProvider.html "trait akka_projection_rs::SourceProvider")Provides a source of envelopes using slices as a query.

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer_filter/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/enum.Handlers.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/offset_store/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/struct.FnHandler.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/struct.HandlerError.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/struct.SourceProviderError.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/struct.UnusedHandler.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/struct.UnusedPendingHandler.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/trait.Handler.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/trait.PendingHandler.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/trait.SourceProvider.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/volatile_offset_store/index.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/](https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/)*
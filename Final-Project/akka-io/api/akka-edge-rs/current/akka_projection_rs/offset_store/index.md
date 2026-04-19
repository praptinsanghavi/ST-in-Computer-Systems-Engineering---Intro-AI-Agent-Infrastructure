---
description: An offset store keeps track of the last offset used in relation to an
  entity, including its entity type. It can be used in various places, for example,
  when consuming event envelopes from a remote projection, where they be emitted by
  the consumer out of order. This entity can track such situations.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/offset_store/index.html
title: akka_projection_rs::offset_store - Rust
---

# akka_projection_rs::offset_store - Rust

> **Summary:** An offset store keeps track of the last offset used in relation to an entity, including its entity type. It can be used in various places, for example, when consuming event envelopes from a remote projection, where they be emitted by the consumer out of order. This entity can track such situations.

## Content

# Module [akka\_projection\_rs](../index.html)::[offset\_store](#)

[source](../../src/akka_projection_rs/offset_store.rs.html#1-25) · Expand descriptionAn offset store keeps track of the last offset used in relation to
an entity, including its entity type. It can be used in various places,
for example, when consuming event envelopes from a remote projection, where
they be emitted by the consumer out of order. This entity can track such situations.

## [Enums](#enums)

- [Command](enum.Command.html "enum akka_projection_rs::offset_store::Command")

## [Type Aliases](#types)

- [LastOffset](type.LastOffset.html "type akka_projection_rs::offset_store::LastOffset")A last offset can comprise of the same offset type value for a number
of persistence identifiers.

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/offset_store/enum.Command.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/offset_store/type.LastOffset.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs/offset_store.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/offset_store/index.html](https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/offset_store/index.html)*
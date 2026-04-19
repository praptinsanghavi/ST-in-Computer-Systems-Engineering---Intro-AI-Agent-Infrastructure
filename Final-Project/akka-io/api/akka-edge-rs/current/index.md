---
description: Akka Edge Rust API docs
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/index.html
title: Akka Edge Rust API docs
---

# Akka Edge Rust API docs

> **Summary:** Akka Edge Rust API docs

## Content

# Akka Edge Rust API documentation

## Akka Persistence (Rust)

Akka Persistence enables stateful entities to persist their state so that it can be recovered when an entity is either restarted, such as after a process crash, by a supervisor or a manual stop\-start, and so forth. The key concept behind Akka Persistence is that only the events that are persisted by the entity are stored, not the actual state of it. The events are persisted by appending to storage (nothing is ever mutated) which allows for very high transaction rates and efficient replication. A stateful entity is recovered by replaying the stored events to it, allowing it to rebuild its state.

[Crate akka\_persistence\_rs](akka_persistence_rs/)

## Akka Projections (Rust)

In Akka Projections you process a stream of event envelopes from a source to a projected model or external system. Each envelope is associated with an offset representing the position in the stream. This offset is used for resuming the stream from that position when the projection is restarted.

[Crate akka\_projection\_rs](akka_projection_rs/)

## Akka Projections (Rust) commit log

Uses streambed’s CommitLog to persist projection offsets.

[Crate akka\_projection\_rs\_commitlog](akka_projection_rs_commitlog/)

## Akka projections with gRPC communication (Rust)

Sources events over a gRPC connection, using the Akka GRPC protocol.

[Crate akka\_projection\_rs\_grpc](akka_projection_rs_grpc/)

## Akka Persistence (Rust) adapter for Streambed commit logs

This crate adapts Streambed’s CommitLog and SecretStore traits for the purposes of it being used with Akka Persistence of akka\-edge\-rs.

[Crate akka\_persistence\_rs\_commitlog](akka_persistence_rs_commitlog/)

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_commitlog/
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/index.html](https://doc.akka.io/api/akka-edge-rs/current/index.html)*
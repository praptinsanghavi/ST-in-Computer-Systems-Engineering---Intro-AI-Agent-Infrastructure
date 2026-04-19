---
description: Akka projections
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:14Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer/index.html
title: akka_projection_rs::consumer - Rust
---

# akka_projection_rs::consumer - Rust

> **Summary:** Akka projections

## Content

# Module [akka\_projection\_rs](../index.html)::[consumer](#)

[source](../../src/akka_projection_rs/consumer.rs.html#1-516) · Expand description## [Akka projections](#akka-projections)

In Akka Projections you process a stream of event envelopes from a source to a projected model or external system.
Each envelope is associated with an offset representing the position in the stream. This offset is used for resuming
the stream from that position when the projection is restarted.

## [Functions](#functions)

- [task](fn.task.html "fn akka_projection_rs::consumer::task")Provides an asynchronous task and a kill switch that can run and stop a projection.

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer/fn.task.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs/consumer.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer/index.html](https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer/index.html)*
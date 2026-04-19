---
description: A volatile offset store is provided for situations where events are always
  sourced events from their earliest offset. An example use case is when events are
  queried over HTTP from a web browser that does not retain the offset where it is
  up to.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/volatile_offset_store/index.html
title: akka_projection_rs::volatile_offset_store - Rust
---

# akka_projection_rs::volatile_offset_store - Rust

> **Summary:** A volatile offset store is provided for situations where events are always sourced events from their earliest offset. An example use case is when events are queried over HTTP from a web browser that does not retain the offset where it is up to.

## Content

# Module [akka\_projection\_rs](../index.html)::[volatile\_offset\_store](#)

[source](../../src/akka_projection_rs/volatile_offset_store.rs.html#1-115) · Expand descriptionA volatile offset store is provided for situations where
events are always sourced events from their earliest offset.
An example use case is when events are queried over HTTP from
a web browser that does not retain the offset where it is up to.

All offset data for a given persistence id is retained in
memory.

## [Functions](#functions)

- [task](fn.task.html "fn akka_projection_rs::volatile_offset_store::task")Provides an asynchronous task and a command channel that can run and drive an in\-memory offset store.

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/volatile_offset_store/fn.task.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs/volatile_offset_store.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/volatile_offset_store/index.html](https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/volatile_offset_store/index.html)*
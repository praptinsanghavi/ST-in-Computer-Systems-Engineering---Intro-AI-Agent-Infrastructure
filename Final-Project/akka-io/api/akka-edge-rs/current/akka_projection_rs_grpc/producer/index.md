---
description: API documentation for the Rust `producer` mod in crate `akka_projection_rs_grpc`.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/producer/index.html
title: akka_projection_rs_grpc::producer - Rust
---

# akka_projection_rs_grpc::producer - Rust

> **Summary:** API documentation for the Rust `producer` mod in crate `akka_projection_rs_grpc`.

## Content

# Module [akka\_projection\_rs\_grpc](../index.html)::[producer](#)

[source](../../src/akka_projection_rs_grpc/producer.rs.html#1-561) · ## [Structs](#structs)

- [GrpcEventFlow](struct.GrpcEventFlow.html "struct akka_projection_rs_grpc::producer::GrpcEventFlow")Transform and forward gRPC events given a user\-supplied transformation function.
- [GrpcEventProcessor](struct.GrpcEventProcessor.html "struct akka_projection_rs_grpc::producer::GrpcEventProcessor")Processes events transformed from some unknown event envelope (EI)
to then pass on to a gRPC event producer.
- [Transformation](struct.Transformation.html "struct akka_projection_rs_grpc::producer::Transformation")The result of a transformation function for the purposes of
passing data on to a gRPC producer.

## [Functions](#functions)

- [task](fn.task.html "fn akka_projection_rs_grpc::producer::task")Provides an asynchronous task and a kill switch that can run and stop
a reliable stream of event envelopes to a consumer. Event envelope transmission
requests are sent over a channel and have a reply that is completed on the
remote consumer’s acknowledgement of receipt.

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/producer/fn.task.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/producer/struct.GrpcEventFlow.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/producer/struct.GrpcEventProcessor.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/producer/struct.Transformation.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs_grpc/producer.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/producer/index.html](https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/producer/index.html)*
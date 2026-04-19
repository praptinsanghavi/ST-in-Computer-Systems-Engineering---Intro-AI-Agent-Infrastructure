---
description: Akka projections with gRPC communication
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/
title: akka_projection_rs_grpc - Rust
---

# akka_projection_rs_grpc - Rust

> **Summary:** Akka projections with gRPC communication

## Content

# Crate [akka\_projection\_rs\_grpc](#)

[source](../src/akka_projection_rs_grpc/lib.rs.html#1-454) · Expand description## [Akka projections with gRPC communication](#akka-projections-with-grpc-communication)

Sources events over a gRPC connection, using [the Akka GRPC protocol](https://github.com/akka/akka-projection/blob/main/akka-projection-grpc/src/main/protobuf/akka/projection/grpc/event_producer.proto).

## [Modules](#modules)

- [consumer](consumer/index.html "mod akka_projection_rs_grpc::consumer")
- [producer](producer/index.html "mod akka_projection_rs_grpc::producer")
- [proto](proto/index.html "mod akka_projection_rs_grpc::proto")

## [Structs](#structs)

- [BadEvent](struct.BadEvent.html "struct akka_projection_rs_grpc::BadEvent")Declares a gRPC event cannot be mapped to an event envelope.
- [Envelope](struct.Envelope.html "struct akka_projection_rs_grpc::Envelope")An envelope for all types of gRPC events.
- [EventEnvelope](struct.EventEnvelope.html "struct akka_projection_rs_grpc::EventEnvelope")An envelope type that wraps a gRPC event associated with a specific entity.
- [NoMessage](struct.NoMessage.html "struct akka_projection_rs_grpc::NoMessage")Declares that a protobuf criteria is unable to be converted
due to there being no message.
- [NotAnEventEnvelope](struct.NotAnEventEnvelope.html "struct akka_projection_rs_grpc::NotAnEventEnvelope")Returned when the envelope cannot be represented as an event envelope.

## [Type Aliases](#types)

- [OriginId](type.OriginId.html "type akka_projection_rs_grpc::OriginId")Identifies an event producer to a consumer
- [StreamId](type.StreamId.html "type akka_projection_rs_grpc::StreamId")The logical stream identifier, mapped to a specific internal entity type by
the producer settings

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/consumer/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/producer/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/struct.BadEvent.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/struct.Envelope.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/struct.EventEnvelope.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/struct.NoMessage.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/struct.NotAnEventEnvelope.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/type.OriginId.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/type.StreamId.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs_grpc/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/](https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/)*
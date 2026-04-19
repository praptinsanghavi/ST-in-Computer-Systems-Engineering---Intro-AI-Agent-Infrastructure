---
description: API documentation for the Rust `proto` mod in crate `akka_projection_rs_grpc`.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/index.html
title: akka_projection_rs_grpc::proto - Rust
---

# akka_projection_rs_grpc::proto - Rust

> **Summary:** API documentation for the Rust `proto` mod in crate `akka_projection_rs_grpc`.

## Content

# Module [akka\_projection\_rs\_grpc](../index.html)::[proto](#)

[source](../../src/akka_projection_rs_grpc/lib.rs.html#131) · ## [Modules](#modules)

- [consume\_event\_in](consume_event_in/index.html "mod akka_projection_rs_grpc::proto::consume_event_in")Nested message and enum types in `ConsumeEventIn`.
- [consume\_event\_out](consume_event_out/index.html "mod akka_projection_rs_grpc::proto::consume_event_out")Nested message and enum types in `ConsumeEventOut`.
- [event\_consumer\_service\_client](event_consumer_service_client/index.html "mod akka_projection_rs_grpc::proto::event_consumer_service_client")Generated client implementations.
- [event\_consumer\_service\_server](event_consumer_service_server/index.html "mod akka_projection_rs_grpc::proto::event_consumer_service_server")Generated server implementations.
- [event\_producer\_service\_client](event_producer_service_client/index.html "mod akka_projection_rs_grpc::proto::event_producer_service_client")Generated client implementations.
- [event\_producer\_service\_server](event_producer_service_server/index.html "mod akka_projection_rs_grpc::proto::event_producer_service_server")Generated server implementations.
- [filter\_criteria](filter_criteria/index.html "mod akka_projection_rs_grpc::proto::filter_criteria")Nested message and enum types in `FilterCriteria`.
- [load\_event\_response](load_event_response/index.html "mod akka_projection_rs_grpc::proto::load_event_response")Nested message and enum types in `LoadEventResponse`.
- [stream\_in](stream_in/index.html "mod akka_projection_rs_grpc::proto::stream_in")Nested message and enum types in `StreamIn`.
- [stream\_out](stream_out/index.html "mod akka_projection_rs_grpc::proto::stream_out")Nested message and enum types in `StreamOut`.

## [Structs](#structs)

- [ConsumeEventIn](struct.ConsumeEventIn.html "struct akka_projection_rs_grpc::proto::ConsumeEventIn")
- [ConsumeEventOut](struct.ConsumeEventOut.html "struct akka_projection_rs_grpc::proto::ConsumeEventOut")
- [ConsumerEventAck](struct.ConsumerEventAck.html "struct akka_projection_rs_grpc::proto::ConsumerEventAck")
- [ConsumerEventInit](struct.ConsumerEventInit.html "struct akka_projection_rs_grpc::proto::ConsumerEventInit")must be the first event from the connecting producer,
the producer must then not start emitting events until
it sees a ConsumerEventStart
- [ConsumerEventStart](struct.ConsumerEventStart.html "struct akka_projection_rs_grpc::proto::ConsumerEventStart")
- [EntityIdOffset](struct.EntityIdOffset.html "struct akka_projection_rs_grpc::proto::EntityIdOffset")
- [Event](struct.Event.html "struct akka_projection_rs_grpc::proto::Event")
- [EventTimestampRequest](struct.EventTimestampRequest.html "struct akka_projection_rs_grpc::proto::EventTimestampRequest")Retrieve the timestamp of a specific event.
- [EventTimestampResponse](struct.EventTimestampResponse.html "struct akka_projection_rs_grpc::proto::EventTimestampResponse")Response to `EventTimestampRequest`.
- [ExcludeEntityIds](struct.ExcludeEntityIds.html "struct akka_projection_rs_grpc::proto::ExcludeEntityIds")Exclude events for entities with the given entity ids,
unless there is a matching include filter that overrides the exclude.
- [ExcludeRegexEntityIds](struct.ExcludeRegexEntityIds.html "struct akka_projection_rs_grpc::proto::ExcludeRegexEntityIds")Exclude events for entities with entity ids matching the given regular expressions,
unless there is a matching include filter that overrides the exclude.
- [ExcludeTags](struct.ExcludeTags.html "struct akka_projection_rs_grpc::proto::ExcludeTags")Exclude events with any of the given tags, unless there is a
matching include filter that overrides the exclude.
- [FilterCriteria](struct.FilterCriteria.html "struct akka_projection_rs_grpc::proto::FilterCriteria")
- [FilterReq](struct.FilterReq.html "struct akka_projection_rs_grpc::proto::FilterReq")Add filter criteria to exclude and include events for matching entities.
- [FilteredEvent](struct.FilteredEvent.html "struct akka_projection_rs_grpc::proto::FilteredEvent")Events that are filtered out are represented by this
placeholder to be able to track sequence numbers without holes.
- [IncludeEntityIds](struct.IncludeEntityIds.html "struct akka_projection_rs_grpc::proto::IncludeEntityIds")Include events for entities with the given entity ids. A matching include overrides
a matching exclude.
- [IncludeRegexEntityIds](struct.IncludeRegexEntityIds.html "struct akka_projection_rs_grpc::proto::IncludeRegexEntityIds")Include events for entities with entity ids matching the given regular expressions.
A matching include overrides a matching exclude.
- [IncludeTags](struct.IncludeTags.html "struct akka_projection_rs_grpc::proto::IncludeTags")Include events with any of the given tags. A matching include overrides
a matching exclude.
- [IncludeTopics](struct.IncludeTopics.html "struct akka_projection_rs_grpc::proto::IncludeTopics")Include events with any of the given matching topics. A matching include overrides
a matching exclude.
- [InitReq](struct.InitReq.html "struct akka_projection_rs_grpc::proto::InitReq")The first message must always be this InitReq to setup the stream.
It can only be used as the first message.
- [KeepAlive](struct.KeepAlive.html "struct akka_projection_rs_grpc::proto::KeepAlive")
- [LoadEventRequest](struct.LoadEventRequest.html "struct akka_projection_rs_grpc::proto::LoadEventRequest")Lazy loading of a specific event. Used when payload for a backtracking event
is needed.
- [LoadEventResponse](struct.LoadEventResponse.html "struct akka_projection_rs_grpc::proto::LoadEventResponse")Response to `LoadEventRequest`.
- [Offset](struct.Offset.html "struct akka_projection_rs_grpc::proto::Offset")
- [PersistenceIdSeqNr](struct.PersistenceIdSeqNr.html "struct akka_projection_rs_grpc::proto::PersistenceIdSeqNr")
- [RemoveExcludeEntityIds](struct.RemoveExcludeEntityIds.html "struct akka_projection_rs_grpc::proto::RemoveExcludeEntityIds")Remove a previously added `ExcludeEntityIds`.
- [RemoveExcludeRegexEntityIds](struct.RemoveExcludeRegexEntityIds.html "struct akka_projection_rs_grpc::proto::RemoveExcludeRegexEntityIds")Remove a previously added `ExcludeRegexEntityIds`.
- [RemoveExcludeTags](struct.RemoveExcludeTags.html "struct akka_projection_rs_grpc::proto::RemoveExcludeTags")Remove a previously added `ExcludeTags`.
- [RemoveIncludeEntityIds](struct.RemoveIncludeEntityIds.html "struct akka_projection_rs_grpc::proto::RemoveIncludeEntityIds")Remove a previously added `IncludeEntityIds`.
- [RemoveIncludeRegexEntityIds](struct.RemoveIncludeRegexEntityIds.html "struct akka_projection_rs_grpc::proto::RemoveIncludeRegexEntityIds")Remove a previously added `IncludeRegexEntityIds`.
- [RemoveIncludeTags](struct.RemoveIncludeTags.html "struct akka_projection_rs_grpc::proto::RemoveIncludeTags")Remove a previously added `IncludeTags`.
- [RemoveIncludeTopics](struct.RemoveIncludeTopics.html "struct akka_projection_rs_grpc::proto::RemoveIncludeTopics")Remove a previously added `IncludeTopics`.
- [ReplayReq](struct.ReplayReq.html "struct akka_projection_rs_grpc::proto::ReplayReq")Replay events for given entities.
- [ReplicaInfo](struct.ReplicaInfo.html "struct akka_projection_rs_grpc::proto::ReplicaInfo")Used for Replicated Event Sourcing to filter events based on origin.
For edge topologies, like star topologies, an edge replica is not connected
to all other replicas, but should be able to receive events indirectly via
the replica that it is consuming from.
- [StreamIn](struct.StreamIn.html "struct akka_projection_rs_grpc::proto::StreamIn")
- [StreamOut](struct.StreamOut.html "struct akka_projection_rs_grpc::proto::StreamOut")

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/consume_event_in/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/consume_event_out/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/event_consumer_service_client/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/event_consumer_service_server/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/event_producer_service_client/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/event_producer_service_server/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/filter_criteria/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/load_event_response/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/stream_in/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/stream_out/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.ConsumeEventIn.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.ConsumeEventOut.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.ConsumerEventAck.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.ConsumerEventInit.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.ConsumerEventStart.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.EntityIdOffset.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.Event.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.EventTimestampRequest.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.EventTimestampResponse.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.ExcludeEntityIds.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.ExcludeRegexEntityIds.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.ExcludeTags.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.FilterCriteria.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.FilterReq.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.FilteredEvent.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.IncludeEntityIds.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.IncludeRegexEntityIds.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.IncludeTags.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.IncludeTopics.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.InitReq.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.KeepAlive.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.LoadEventRequest.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.LoadEventResponse.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.Offset.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.PersistenceIdSeqNr.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.RemoveExcludeEntityIds.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.RemoveExcludeRegexEntityIds.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.RemoveExcludeTags.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.RemoveIncludeEntityIds.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.RemoveIncludeRegexEntityIds.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.RemoveIncludeTags.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.RemoveIncludeTopics.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.ReplayReq.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.ReplicaInfo.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.StreamIn.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/struct.StreamOut.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs_grpc/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/index.html](https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/proto/index.html)*
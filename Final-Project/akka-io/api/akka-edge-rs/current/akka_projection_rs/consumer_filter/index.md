---
description: The consumer may define declarative filters that are sent to the producer
  and evaluated on the producer side before emitting the events.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer_filter/index.html
title: akka_projection_rs::consumer_filter - Rust
---

# akka_projection_rs::consumer_filter - Rust

> **Summary:** The consumer may define declarative filters that are sent to the producer and evaluated on the producer side before emitting the events.

## Content

# Module [akka\_projection\_rs](../index.html)::[consumer\_filter](#)

[source](../../src/akka_projection_rs/consumer_filter.rs.html#1-530) · Expand descriptionThe consumer may define declarative filters that are sent to the producer and evaluated on the producer side
before emitting the events.

Consumer filters consists of exclude and include criteria. In short, the exclude criteria are evaluated first
and may be overridden by an include criteria. More precisely, they are evaluated according to the following rules:

- Exclude criteria are evaluated first.
- If no matching exclude criteria the event is emitted.
- If an exclude criteria is matching the include criteria are evaluated.
- If no matching include criteria the event is discarded.
- If matching include criteria the event is emitted.

The exclude criteria can be a combination of:

- ExcludeTags \- exclude events with any of the given tags
- ExcludeRegexEntityIds \- exclude events for entities with entity ids matching the given regular expressions
- ExcludeEntityIds \- exclude events for entities with the given entity ids

To exclude all events you can use ExcludeRegexEntityIds with .\*.

The include criteria can be a combination of:

- IncludeTopics \- include events with any of the given matching topics
- IncludeTags \- include events with any of the given tags
- IncludeRegexEntityIds \- include events for entities with entity ids matching the given regular expressions
- IncludeEntityIds \- include events for entities with the given entity ids

## [Structs](#structs)

- [BadTopicMatcher](struct.BadTopicMatcher.html "struct akka_projection_rs::consumer_filter::BadTopicMatcher")
- [ComparableRegex](struct.ComparableRegex.html "struct akka_projection_rs::consumer_filter::ComparableRegex")
- [EntityIdOffset](struct.EntityIdOffset.html "struct akka_projection_rs::consumer_filter::EntityIdOffset")
- [Filter](struct.Filter.html "struct akka_projection_rs::consumer_filter::Filter")A collection of criteria
- [TopicMatcher](struct.TopicMatcher.html "struct akka_projection_rs::consumer_filter::TopicMatcher")

## [Enums](#enums)

- [FilterCriteria](enum.FilterCriteria.html "enum akka_projection_rs::consumer_filter::FilterCriteria")Exclude criteria are evaluated first.
If no matching exclude criteria the event is emitted.
If an exclude criteria is matching the include criteria are evaluated.
If no matching include criteria the event is discarded.
If matching include criteria the event is emitted.

## [Functions](#functions)

- [exclude\_all](fn.exclude_all.html "fn akka_projection_rs::consumer_filter::exclude_all")Exclude events from all entity ids, convenience for combining with for example a topic filter
to include only events matching the topic filter.

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer_filter/enum.FilterCriteria.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer_filter/fn.exclude_all.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer_filter/struct.BadTopicMatcher.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer_filter/struct.ComparableRegex.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer_filter/struct.EntityIdOffset.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer_filter/struct.Filter.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer_filter/struct.TopicMatcher.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs/consumer_filter.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer_filter/index.html](https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/consumer_filter/index.html)*
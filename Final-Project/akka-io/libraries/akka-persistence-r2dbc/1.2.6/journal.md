---
description: An Akka Persistence backed by SQL database with R2DBC
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:11Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-r2dbc/current/journal.html
title: Journal plugin • Akka Persistence R2DBC Documentation
---

# Journal plugin • Akka Persistence R2DBC Documentation

> **Summary:** An Akka Persistence backed by SQL database with R2DBC

## Content

# Journal plugin

The journal plugin enables storing and loading events for [event sourced persistent actors](https://doc.akka.io/libraries/akka-core/2.9/typed/persistence.html).

## Schema

The `event_journal` table and `event_journal_slice_idx` index need to be created in the configured database, see schema definition in [Creating the schema](getting-started.html#schema).

The `event_journal_slice_idx` index is only needed if the slice based [queries](query.html) are used.

## Configuration

To enable the journal plugin to be used by default, add the following line to your Akka `application.conf`:

```
akka.persistence.journal.plugin = "akka.persistence.r2dbc.journal"

```

It can also be enabled with the `journalPluginId` for a specific `EventSourcedBehavior` and multiple plugin configurations are supported.

See also [Connection configuration](config.html#connection-configuration).

### Reference configuration

The following can be overridden in your `application.conf` for the journal specific settings:

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/core/src/main/resources/reference.conf#L3-L56 "Go to snippet source")akka.persistence.r2dbc {
  journal {
    class = "akka.persistence.r2dbc.journal.R2dbcJournal"

    # name of the table to use for events
    table = "event_journal"

    # the column type to use for event payloads (BYTEA or JSONB)
    payload-column-type = "BYTEA"

    # Otherwise it would be a pinned dispatcher, see https://github.com/akka/akka/issues/31058
    plugin-dispatcher = "akka.actor.default-dispatcher"

    # event replay is using akka.persistence.r2dbc.query.buffer-size

    # Set this to off to disable publishing of of events as Akka messages to running
    # eventsBySlices queries.
    # Tradeoff is more CPU and network resources that are used. The events
    # must still be retrieved from the database, but at a lower polling frequency,
    # because delivery of published messages are not guaranteed.
    # When this feature is enabled it will measure the throughput and automatically
    # disable/enable if the throughput exceeds the configured threshold. See
    # publish-events-dynamic configuration.
    publish-events = on

    # When publish-events is enabled it will measure the throughput and automatically
    # disable/enable if the throughput exceeds the configured threshold.
    # This configuration cannot be defined per journal, but is global for the ActorSystem.
    publish-events-dynamic {
      # If exponentially weighted moving average of measured throughput exceeds this
      # threshold publishing of events is disabled. It is enabled again when lower than
      # the threshold.
      throughput-threshold = 400
      # The interval of the throughput measurements.
      throughput-collect-interval = 10 seconds
    }

    # Group the slices for an entity type into this number of topics. Most efficient is to use
    # the same number as number of projection instances. If configured to less than the number of
    # of projection instances the overhead is that events will be sent more than once and discarded
    # on the destination side. If configured to more than the number of projection instances
    # the events will only be sent once but there is a risk of exceeding the limits of number
    # of topics that PubSub can handle (e.g. OversizedPayloadException).
    # Must be between 1 and 1024 and a whole number divisor of 1024 (number of slices).
    # This configuration can be changed in a rolling update, but there might be some events
    # that are not delivered via the pub-sub path and instead delivered later by the queries.
    # This configuration cannot be defined per journal, but is global for the ActorSystem.
    publish-events-number-of-topics = 128

    # replay filter not needed for this plugin
    replay-filter.mode = off

  }
}
```

## Event serialization

The events are serialized with [Akka Serialization](https://doc.akka.io/libraries/akka-core/2.9/serialization.html) and the binary representation is stored in the `event_payload` column together with information about what serializer that was used in the `event_ser_id` and `event_ser_manifest` columns.

For PostgreSQL the payload is stored as `BYTEA` type. Alternatively, you can use `JSONB` column type as described in [PostgreSQL JSON](postgres_json.html).

## Deletes

The journal supports deletes through hard deletes, which means the journal entries are actually deleted from the database. There is no materialized view with a copy of the event so make sure to not delete events too early if they are used from projections or queries.

For each persistent id one tombstone record is kept in the event journal when all events of a persistence id have been deleted. The reason for the tombstone record is to keep track of the latest sequence number so that subsequent events don’t reuse the same sequence numbers that have been deleted.

See the [EventSourcedCleanup tool](cleanup.html#event-sourced-cleanup-tool) for more information about how to delete events, snapshots and tombstone records.

## Code Examples

### Example 1: Configuration

```text
akka.persistence.journal.plugin = "akka.persistence.r2dbc.journal"
```

### Example 2: Reference configuration

```conf
akka.persistence.r2dbc {
  journal {
    class = "akka.persistence.r2dbc.journal.R2dbcJournal"

    # name of the table to use for events
    table = "event_journal"

    # the column type to use for event payloads (BYTEA or JSONB)
    payload-column-type = "BYTEA"

    # Otherwise it would be a pinned dispatcher, see https://github.com/akka/akka/issues/31058
    plugin-dispatcher = "akka.actor.default-dispatcher"

    # event replay is using akka.persistence.r2dbc.query.buffer-size

    # Set this to off to disable publishing of of events as Akka messages to running
    # eventsBySlices queries.
    # Tradeoff is more CPU and network resources that are used. The events
    # must still be retrieved from the database, but at a lower polling frequency,
    # because delivery of published messages are not guaranteed.
    # When this feature is enabled it will measure the throughput and automatically
    # disable/enable if the throughput exceeds the configured threshold. See
    # publish-events-dynamic configuration.
    publish-events = on

    # When publish-events is enabled it will measure the throughput and automatically
    # disable/enable if the throughput exceeds the configured threshold.
    # This configuration cannot be defined per journal, but is global for the ActorSystem.
    publish-events-dynamic {
      # If exponentially weighted moving average of measured throughput exceeds this
      # threshold publishing of events is disabled. It is enabled again when lower than
      # the threshold.
      throughput-threshold = 400
      # The interval of the throughput measurements.
      throughput-collect-interval = 10 seconds
    }

    # Group the slices for an entity type into this number of topics. Most efficient is to use
    # the same number as number of projection instances. If configured to less than the number of
    # of projection instances the overhead is that events will be sent more than once and discarded
    # on the destination side. If configured to more than the number of projection instances
    # the events will only be sent once but there is a risk of exceeding the limits of number
    # of topics that PubSub can handle (e.g. OversizedPayloadException).
    # Must be between 1 and 1024 and a whole number divisor of 1024 (number of slices).
    # This configuration can be changed in a rolling update, but there might be some events
    # that are not delivered via the pub-sub path and instead delivered later by the queries.
    # This configuration cannot be defined per journal, but is global for the ActorSystem.
    publish-events-number-of-topics = 128

    # replay filter not needed for this plugin
    replay-filter.mode = off

  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.9/serialization.html
- https://doc.akka.io/libraries/akka-core/2.9/typed/persistence.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/cleanup.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/config.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/getting-started.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/postgres_json.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/query.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/journal.html](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/journal.html)*
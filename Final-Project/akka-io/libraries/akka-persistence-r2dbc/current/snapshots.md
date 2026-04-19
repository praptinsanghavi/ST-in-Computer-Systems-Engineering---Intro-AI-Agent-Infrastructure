---
description: An Akka Persistence backed by SQL database with R2DBC
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:49Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-r2dbc/current/snapshots.html
title: Snapshot store plugin • Akka Persistence R2DBC Documentation
---

# Snapshot store plugin • Akka Persistence R2DBC Documentation

> **Summary:** An Akka Persistence backed by SQL database with R2DBC

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Snapshot store plugin

The snapshot plugin enables storing and loading snapshots for [event sourced persistent actors](https://doc.akka.io/libraries/akka-core/2.10/typed/persistence.html).

## Schema

The `snapshot` table need to be created in the configured database, see schema definition in [Creating the schema](getting-started.html#schema).

## Configuration

To enable the snapshot plugin to be used by default, add the following line to your Akka `application.conf`:

```
akka.persistence.snapshot-store.plugin = "akka.persistence.r2dbc.snapshot"

```

It can also be enabled with the `snapshotPluginId` for a specific `EventSourcedBehavior` and multiple plugin configurations are supported.

Note
Snapshots are optional, and if you know that the application doesn’t store many events for each entity it is more efficient to not enable the snapshot plugin, because then it will not try to read snapshots when recovering the entities.

See also [Connection configuration](config.html#connection-configuration).

### Reference configuration

The following can be overridden in your `application.conf` for the snapshot specific settings:

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/core/src/main/resources/reference.conf#L60-L74 "Go to snippet source")akka.persistence.r2dbc {
  snapshot {
    class = "akka.persistence.r2dbc.snapshot.R2dbcSnapshotStore"
    table = "snapshot"

    # the column type to use for snapshot payloads (bytea or jsonb)
    payload-column-type = "BYTEA"

    # Otherwise it would be a pinned dispatcher, see https://github.com/akka/akka/issues/31058
    plugin-dispatcher = "akka.actor.default-dispatcher"

    # Enables an optimization in Akka for avoiding snapshot deletes in retention.
    only-one-snapshot = true
  }
}
```

## Usage

The snapshot plugin is used whenever a snapshot write is triggered through the [Akka Persistence APIs](https://doc.akka.io/libraries/akka-core/2.10/typed/persistence-snapshot.html).

## Snapshot serialization

The state is serialized with [Akka Serialization](https://doc.akka.io/libraries/akka-core/2.10/serialization.html) and the binary snapshot representation is stored in the `snapshot` column together with information about what serializer that was used in the `ser_id` and `ser_manifest` columns.

For PostgreSQL the payload is stored as `BYTEA` type. Alternatively, you can use `JSONB` column type as described in [PostgreSQL JSON](postgres_json.html).

## Retention

The R2DBC snapshot plugin only ever keeps *one* snapshot per persistence id in the database. If a `keepNSnapshots > 1` is specified for an `EventSourcedBehavior` that setting will be ignored.

The reason for this is that there is no real benefit to keep multiple snapshots around on a relational database with a high consistency.

See also [EventSourcedCleanup tool](cleanup.html#event-sourced-cleanup-tool).

## Code Examples

### Example 1: Configuration

```text
akka.persistence.snapshot-store.plugin = "akka.persistence.r2dbc.snapshot"
```

### Example 2: Reference configuration

```conf
akka.persistence.r2dbc {
  snapshot {
    class = "akka.persistence.r2dbc.snapshot.R2dbcSnapshotStore"
    table = "snapshot"

    # the column type to use for snapshot payloads (bytea or jsonb)
    payload-column-type = "BYTEA"

    # Otherwise it would be a pinned dispatcher, see https://github.com/akka/akka/issues/31058
    plugin-dispatcher = "akka.actor.default-dispatcher"

    # Enables an optimization in Akka for avoiding snapshot deletes in retention.
    only-one-snapshot = true
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/serialization.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/persistence-snapshot.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/persistence.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/cleanup.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/config.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/durable-state-store.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/getting-started.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/journal.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/postgres_json.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-r2dbc/current/snapshots.html](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/snapshots.html)*
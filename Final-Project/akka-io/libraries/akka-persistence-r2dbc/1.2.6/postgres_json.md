---
description: An Akka Persistence backed by SQL database with R2DBC
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:31:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-r2dbc/current/postgres_json.html
title: PostgreSQL JSON • Akka Persistence R2DBC Documentation
---

# PostgreSQL JSON • Akka Persistence R2DBC Documentation

> **Summary:** An Akka Persistence backed by SQL database with R2DBC

## Content

# PostgreSQL JSON

By default, the serialized event, snapshot and durable state payloads, are stored in `BYTEA` columns. Alternatively, you can use `JSONB` column type to take advantage of PostgreSQL support for [JSON Types](https://www.postgresql.org/docs/current/datatype-json.html). For example, then you can add secondary jsonb indexes on the payload content for queries.

To enable `JSONB` payloads you need the following.

1. Create the schema as shown in the Postgres JSONB tab in [Creating the schema](getting-started.html#schema).
2. Define configuration:

```
akka.persistence.r2dbc {
  journal.payload-column-type = JSONB
  snapshot.payload-column-type = JSONB
  state.payload-column-type = JSONB
}

```
3. Serialize the event, snapshot and durable state payloads as JSON bytes.

For the serialization you can use:

- [Akka Serialization with Jackson](https://doc.akka.io/libraries/akka-core/2.9/serialization-jackson.html) with JSON format.
- Make sure to disable [compression](https://doc.akka.io/libraries/akka-core/2.9/serialization-jackson.html#compression) with `akka.serialization.jackson.jackson-json.compression.algorithm = off`
- Plain strings in JSON format.
- A custom Akka serializer that uses a binary format as UTF\-8 encoded JSON string.

Note that you can enable this feature selectively for the event journal, snapshot, and durable state.

## Code Examples

### Example 1: PostgreSQL JSON

```text
akka.persistence.r2dbc {
  journal.payload-column-type = JSONB
  snapshot.payload-column-type = JSONB
  state.payload-column-type = JSONB
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.9/serialization-jackson.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/getting-started.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/projection.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/query.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/postgres_json.html](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/postgres_json.html)*
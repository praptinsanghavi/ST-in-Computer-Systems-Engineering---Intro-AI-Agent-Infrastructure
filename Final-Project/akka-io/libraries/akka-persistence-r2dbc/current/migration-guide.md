---
description: An Akka Persistence backed by SQL database with R2DBC
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-r2dbc/current/migration-guide.html
title: Migration Guide • Akka Persistence R2DBC Documentation
---

# Migration Guide • Akka Persistence R2DBC Documentation

> **Summary:** An Akka Persistence backed by SQL database with R2DBC

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Migration Guide

## 1\.2\.x to 1\.3\.0

### Durable State table schema change (optional)

The existing primary key for the Durable State table was containing an unnecessary column.

Please run the following query to update the table constraint:

Postgres / Yugabyte

```
ALTER TABLE "durable_state"
DROP CONSTRAINT durable_state_pkey,
ADD PRIMARY KEY(persistence_id);

```

Same goes for the (optional) index `durable_state_slice_idx` used for slice base queries. To remove the column from the index, use:

Postgres / Yugabyte

```
DROP INDEX IF EXISTS durable_state_slice_idx;
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp);

```

As mentioned above, this is optional. Changes to the database schema like this one can have an impact on the availability of the database under certain conditions.

Make sure to test them on a copy of your database to learn more about the potential impact.

If you are using [data partitioning](data-partition.html), please make sure to apply the change to all tables.

## 1\.1\.x to 1\.2\.0

### Configuration file changes

The configuration file structure has changed in an incompatible way (to make room for the H2 dialect), an existing project using Postgres or Yugabyte will need the following changes to its config:

Remove `akka.persistence.r2dbc.dialect` from the config if present

Choose dialect by configuring the `connection-factory` block:

Postgres

```
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.postgres}
akka.persistence.r2dbc.connection-factory {
  # only overrides from the default values needs to be defined
  database = "my-postgres-database"
  database = ${?DB_NAME}
}

```

Yugabyte

```
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.yugabyte}
akka.persistence.r2dbc.connection-factory {
  # only overrides from the default values needs to be defined
  database = "my-yugabyte-database"
  database = ${?DB_NAME}
}

```

### API changes

Some accessors on the [`R2dbcSettings`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/R2dbcSettings.html "akka.persistence.r2dbc.R2dbcSettings")[`R2dbcSettings`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/R2dbcSettings.html "akka.persistence.r2dbc.R2dbcSettings") class has been removed, the `ConnectionFactorySettings` and `Dialect` classes has been removed. A public API for looking at what dialect is used is now provided through `R2dbcSettings.dialectName`.

### Optional changes for eventsBySlicesStartingFromSnapshots

These changes are only needed if you use the [new feature of using snapshots as starting points](query.html#eventsbyslicesstartingfromsnapshots) for `eventsBySlices` queries.

The `snapshot` table must be altered to add two new columns:

Postgres

```
ALTER TABLE snapshot ADD COLUMN IF NOT EXISTS db_timestamp timestamp with time zone;
ALTER TABLE snapshot ADD COLUMN IF NOT EXISTS tags TEXT ARRAY;

```

Yugabyte

```
ALTER TABLE snapshot ADD COLUMN IF NOT EXISTS db_timestamp timestamp with time zone;
ALTER TABLE snapshot ADD COLUMN IF NOT EXISTS tags TEXT ARRAY;

```

Populate the two new columns in the `snapshot` table from corresponding events in the `event_journal` table.

Postgres

```
UPDATE snapshot s SET db_timestamp = e.db_timestamp, tags = e.tags FROM event_journal e WHERE s.persistence_id = e.persistence_id and s.seq_nr = e.seq_nr;

```

Yugabyte

```
UPDATE snapshot s SET db_timestamp = e.db_timestamp, tags = e.tags FROM event_journal e WHERE s.persistence_id = e.persistence_id and s.seq_nr = e.seq_nr;

```

The feature must be enabled with configuration:

```
akka.persistence.r2dbc.query.start-from-snapshot.enabled = true

```

These changes can be made in a rolling update process.

1. While running the old version, alter tables to add the two columns.
2. Enable configuration and roll out new version. Don’t use `eventsBySlicesStartingFromSnapshots` yet.
3. Populate the columns with the update statement.
4. Roll out another version where you can use `eventsBySlicesStartingFromSnapshots`.

## Code Examples

### Example 1: Durable State table schema change (optional)

```sql
ALTER TABLE "durable_state"
DROP CONSTRAINT durable_state_pkey,
ADD PRIMARY KEY(persistence_id);
```

### Example 2: Durable State table schema change (optional)

```sql
DROP INDEX IF EXISTS durable_state_slice_idx;
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp);
```

### Example 3: Configuration file changes

```hocon
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.postgres}
akka.persistence.r2dbc.connection-factory {
  # only overrides from the default values needs to be defined
  database = "my-postgres-database"
  database = ${?DB_NAME}
}
```

### Example 4: Configuration file changes

```hocon
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.yugabyte}
akka.persistence.r2dbc.connection-factory {
  # only overrides from the default values needs to be defined
  database = "my-yugabyte-database"
  database = ${?DB_NAME}
}
```

### Example 5: Optional changes for eventsBySlicesStartingFromSnapshots

```sql
ALTER TABLE snapshot ADD COLUMN IF NOT EXISTS db_timestamp timestamp with time zone;
ALTER TABLE snapshot ADD COLUMN IF NOT EXISTS tags TEXT ARRAY;
```

### Example 6: Optional changes for eventsBySlicesStartingFromSnapshots

```sql
ALTER TABLE snapshot ADD COLUMN IF NOT EXISTS db_timestamp timestamp with time zone;
ALTER TABLE snapshot ADD COLUMN IF NOT EXISTS tags TEXT ARRAY;
```

### Example 7: Optional changes for eventsBySlicesStartingFromSnapshots

```sql
UPDATE snapshot s SET db_timestamp = e.db_timestamp, tags = e.tags FROM event_journal e WHERE s.persistence_id = e.persistence_id and s.seq_nr = e.seq_nr;
```

### Example 8: Optional changes for eventsBySlicesStartingFromSnapshots

```sql
UPDATE snapshot s SET db_timestamp = e.db_timestamp, tags = e.tags FROM event_journal e WHERE s.persistence_id = e.persistence_id and s.seq_nr = e.seq_nr;
```

### Example 9: Optional changes for eventsBySlicesStartingFromSnapshots

```hocon
akka.persistence.r2dbc.query.start-from-snapshot.enabled = true
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/R2dbcSettings.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/data-partition.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/migration.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/native-image.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/query.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-r2dbc/current/migration-guide.html](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/migration-guide.html)*
---
description: An Akka Persistence backed by SQL database with R2DBC
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-r2dbc/current/data-partition.html
title: Database sharding • Akka Persistence R2DBC Documentation
---

# Database sharding • Akka Persistence R2DBC Documentation

> **Summary:** An Akka Persistence backed by SQL database with R2DBC

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Database sharding

Using a single non\-distributed database can become a bottleneck for applications that have high throughput requirements. To be able to spread the load over more than one database the event journal, snapshot store and durable state can be split up over multiple tables and physical backend databases.

Without any application\-level concerns or specific sharding features in the databases the R2DBC plugin has support for:

- database partitioning \- vertical database scalability by multiple tables in one physical database
- database sharding \- horizontal database scalability by distributing the data across multiple physical databases

The data is partitioned by the slices that are used for [`eventsBySlices`](query.html#eventsbyslices) and [Projections](https://doc.akka.io/libraries/akka-projection/current/r2dbc.html). Events are grouped into slices based on a deterministic hash of the persistence identifier of the entity that emitted the event. There are 1024 slices, from 0 to 1023\. A projection instance consumes events from a range of slices. For example, running 4 Projection instances the slice ranges would be 0\-255, 256\-511, 512\-767, 768\-1023\. Changing to 8 slice ranges means that the ranges would be 0\-127, 128\-255, 256\-383, …, 768\-895, 896\-1023\.

You can configure how many data partitions that are needed. A data partition corresponds to a separate database table. For example, 4 data partitions means that slice range (0 to 255\) maps to data partition 0, (256 to 511\) to data partition 1, (512 to 767\) to data partition 2, and (768 to 1023\) to data partition 3\.

Number of data partitions must be between 1 and 1024 and a whole number divisor of 1024 (number of slices), e.g. 2, 4, 8, 16\. Each data partition corresponds to a database table. The tables will have the data partition as suffix, e.g. event\_journal\_0, event\_journal\_1\.

Those tables can be located in physically separate databases. Number of databases must be a whole number divisor of number of partitions, and less than or equal to number of partitions. For example, 8 data partitions and 2 databases means that there will be a total of 8 tables in 2 databases, i.e. 4 tables in each database.

## Example

If we configure 8 data partitions and 4 databases it will look like this:

![Diagram of data partitions](images/data-partition.svg)

Based on the persistence id an individual entity will map to a specific slice and the entity will read and write to the table that covers corresponding slice range.

If we have 16 projection instances each projection instance will consume events from 64 slices. The query to retrieve events from these slices always map to one single table that covers the slice range. There can be more projection instances than number of data partitions (tables), but not less. Less projection instances than number of data partitions would result in queries that would span over more than one table, which would be inefficient and therefore not allowed.

Each database may host several of the data partition tables. Each database requires a separate connection factory and connection pool.

## Configuration

The data partitions are configured with:

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/core/src/main/resources/reference.conf#L206-L232 "Go to snippet source")# Number of tables and databases that the data will be split into. The selection of data
# partition is made from the slice of the persistenceId.
# For example, 4 data partitions means that slice range (0 to 255) maps to data partition 0,
# (256 to 511) to data partition 1, (512 to 767) to data partition 3, and (768 to 1023) to
# data partition 3.
# This configuration cannot be changed in a rolling update, since the data must be moved
# between the tables if number of data partitions is changed.
# The number of Projection instances when using eventsBySlices must be greater than or equal
# to the number of data partitions, because a query for a slice range cannot span over more
# than one data partition.
akka.persistence.r2dbc.data-partition {
  # How many tables the data will be partitioned over. The tables will have
  # the data partition as suffix, e.g. event_journal_0, event_journal_1.
  # Must be between 1 and 1024 and a whole number divisor of 1024 (number of slices).
  # When number-of-partitions is 1 the table name is without suffix.
  number-of-partitions = 1
  # How many databases the tables will be partitioned over. A database corresponds to a connection
  # factory with its own connection pool.
  # Must be a whole number divisor of number-of-partitions, and less than or equal to number-of-partitions.
  # For example, number-of-partitions=8 and number-of-databases=2 means that there will be a total of
  # 8 tables in 2 databases, i.e. 4 tables in each database.
  # The connection-factory setting will have the data partition range as suffix, e.g. with 8 data partitions and
  # 2 databases the connection factory settings are connection-factory-0-3, connection-factory-4-7.
  # When number-of-databases is 1 there will only be one connection factory, without suffix.
  # number-of-databases > 1 not supported by H2.
  number-of-databases = 1
}
```

When using more than one database you must define corresponding number of connection factories. The connection\-factory setting will have the data partition range as suffix, e.g. with 8 data partitions and 4 databases the connection factory settings would be:

```
akka.persistence.r2dbc {
  data-partition {
    number-of-partitions = 8
    number-of-databases = 4
  }

  connection-factory = ${akka.persistence.r2dbc.postgres}
  connection-factory-0-1 = ${akka.persistence.r2dbc.connection-factory}
  connection-factory-0-1.host = ${?DB_HOST_0}
  connection-factory-2-3 = ${akka.persistence.r2dbc.connection-factory}
  connection-factory-2-3.host = ${?DB_HOST_1}
  connection-factory-4-5 = ${akka.persistence.r2dbc.connection-factory}
  connection-factory-4-5.host = ${?DB_HOST_2}
  connection-factory-6-7 = ${akka.persistence.r2dbc.connection-factory}
  connection-factory-6-7.host = ${?DB_HOST_3}
}

```

## Schema

Each data partition corresponds to a table. You can copy the DDL statements for the tables and indexes from [Creating the schema](getting-started.html#creating-the-schema) but change the table and index names to include data partition suffix. For example `event_journal_0`, `event_journal_0_slice_idx`, `event_journal_1`, `event_journal_1_slice_idx`. Note that the index must also reference the parent table with same data partition suffix.

## Reducing number of database connections

When using the [default allocation strategy for Akka Cluster Sharding](https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding.html#shard-allocation) the there is no correlation between the slice of the entity and to which node the entity will be allocated. That means that there will be database connections from an Akka node to each of the databases. With a large Akka cluster each database would have to handle many connections, maybe more than its connection limit. That would be an inefficient use of resources on both the Akka side and the databases.

To reduce number of connections you can change the allocation strategy to [`SliceRangeShardAllocationStrategy`](https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html "akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy")[`SliceRangeShardAllocationStrategy`](https://doc.akka.io/japi/akka/2.10/?akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html "akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy"). It will collocate entities with the same slice and contiguous range of slices to the same Akka node. Thereby the connections from one Akka node will go to one or a few databases since the database sharding is based on slice ranges.

Java

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/java/jdocs/home/sharding/ShardingDocExample.java#L8-L42 "Go to snippet source")import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.cluster.sharding.typed.javadsl.Entity;
import akka.cluster.sharding.typed.javadsl.EntityTypeKey;
import akka.persistence.Persistence;

ClusterSharding.get(system)
    .init(
        Entity.of(
                DeviceEntity.ENTITY_TYPE_KEY,
                entityContext -> DeviceEntity.create(entityContext.getEntityId()))
            .withMessageExtractor(
                new SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor<>(
                    DeviceEntity.ENTITY_TYPE_KEY.name(), Persistence.get(system)))
            .withAllocationStrategy(new SliceRangeShardAllocationStrategy(10, 0.1)));
```

Scala

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/scala/docs/home/sharding/ShardingDocExample.scala#L8-L36 "Go to snippet source")import akka.actor.typed.ActorSystem
import akka.actor.typed.Behavior
import akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy
import akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.cluster.sharding.typed.scaladsl.Entity
import akka.cluster.sharding.typed.scaladsl.EntityTypeKey
import akka.persistence.Persistence

ClusterSharding(system).init(
  Entity(DeviceEntity.EntityKey)(entityContext => DeviceEntity(entityContext.entityId))
    .withMessageExtractor(
      new ShardBySliceMessageExtractor[DeviceEntity.Command](DeviceEntity.EntityKey.name, Persistence(system)))
    .withAllocationStrategy(new SliceRangeShardAllocationStrategy(10, 0.1)))
```

Note that `SliceRangeShardAllocationStrategy` also requires change of the message extractor to [`SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor`](https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html "akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor")[`SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor`](https://doc.akka.io/japi/akka/2.10/?akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor").

Do not change shard allocation strategy in a rolling update. The cluster must be fully stopped and then started again when changing to a different allocation strategy.

## Changing data partitions

The configuration of data partitions and databases **must not** be changed in a rolling update, since the data must be moved between the tables and databases if the configuration is changed. The application must be stopped while moving the data.

The data can be copied between tables with SQL such as: 

```
CREATE TABLE event_journal_0 AS (SELECT * FROM event_journal WHERE slice BETWEEN 0 AND 127);
CREATE TABLE event_journal_1 AS (SELECT * FROM event_journal WHERE slice BETWEEN 128 AND 255);

```

Remember to also [create the slice index](data-partition.html#schema).

Alternatively, [create the tables](data-partition.html#schema) first and insert the data with SQL such as:

```
INSERT INTO event_journal_0 SELECT * FROM event_journal WHERE slice BETWEEN 0 AND 127;
INSERT INTO event_journal_1 SELECT * FROM event_journal WHERE slice BETWEEN 128 AND 255;

```

There are many other ways to move in an efficient way depending on what database you use, such as backups, sqldump and other export/import tools.

The number of tables and their names don’t change by the number of configured databases. If you think you will need more than one database in the future it can be good to start with for example 8 data partitions (tables) in a single database. That will make it easier to move the full tables to the additional databases later.

## Code Examples

### Example 1: Configuration

```conf
# Number of tables and databases that the data will be split into. The selection of data
# partition is made from the slice of the persistenceId.
# For example, 4 data partitions means that slice range (0 to 255) maps to data partition 0,
# (256 to 511) to data partition 1, (512 to 767) to data partition 3, and (768 to 1023) to
# data partition 3.
# This configuration cannot be changed in a rolling update, since the data must be moved
# between the tables if number of data partitions is changed.
# The number of Projection instances when using eventsBySlices must be greater than or equal
# to the number of data partitions, because a query for a slice range cannot span over more
# than one data partition.
akka.persistence.r2dbc.data-partition {
  # How many tables the data will be partitioned over. The tables will have
  # the data partition as suffix, e.g. event_journal_0, event_journal_1.
  # Must be between 1 and 1024 and a whole number divisor of 1024 (number of slices).
  # When number-of-partitions is 1 the table name is without suffix.
  number-of-partitions = 1
  # How many databases the tables will be partitioned over. A database corresponds to a connection
  # factory with its own connection pool.
  # Must be a whole number divisor of number-of-partitions, and less than or equal to number-of-partitions.
  # For example, number-of-partitions=8 and number-of-databases=2 means that there will be a total of
  # 8 tables in 2 databases, i.e. 4 tables in each database.
  # The connection-factory setting will have the data partition range as suffix, e.g. with 8 data partitions and
  # 2 databases the connection factory settings are connection-factory-0-3, connection-factory-4-7.
  # When number-of-databases is 1 there will only be one connection factory, without suffix.
  # number-of-databases > 1 not supported by H2.
  number-of-databases = 1
}
```

### Example 2: Configuration

```hcon
akka.persistence.r2dbc {
  data-partition {
    number-of-partitions = 8
    number-of-databases = 4
  }

  connection-factory = ${akka.persistence.r2dbc.postgres}
  connection-factory-0-1 = ${akka.persistence.r2dbc.connection-factory}
  connection-factory-0-1.host = ${?DB_HOST_0}
  connection-factory-2-3 = ${akka.persistence.r2dbc.connection-factory}
  connection-factory-2-3.host = ${?DB_HOST_1}
  connection-factory-4-5 = ${akka.persistence.r2dbc.connection-factory}
  connection-factory-4-5.host = ${?DB_HOST_2}
  connection-factory-6-7 = ${akka.persistence.r2dbc.connection-factory}
  connection-factory-6-7.host = ${?DB_HOST_3}
}
```

### Example 3: Reducing number of database connections

```java
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.cluster.sharding.typed.javadsl.Entity;
import akka.cluster.sharding.typed.javadsl.EntityTypeKey;
import akka.persistence.Persistence;

ClusterSharding.get(system)
    .init(
        Entity.of(
                DeviceEntity.ENTITY_TYPE_KEY,
                entityContext -> DeviceEntity.create(entityContext.getEntityId()))
            .withMessageExtractor(
                new SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor<>(
                    DeviceEntity.ENTITY_TYPE_KEY.name(), Persistence.get(system)))
            .withAllocationStrategy(new SliceRangeShardAllocationStrategy(10, 0.1)));
```

### Example 4: Reducing number of database connections

```scala
import akka.actor.typed.ActorSystem
import akka.actor.typed.Behavior
import akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy
import akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.cluster.sharding.typed.scaladsl.Entity
import akka.cluster.sharding.typed.scaladsl.EntityTypeKey
import akka.persistence.Persistence

ClusterSharding(system).init(
  Entity(DeviceEntity.EntityKey)(entityContext => DeviceEntity(entityContext.entityId))
    .withMessageExtractor(
      new ShardBySliceMessageExtractor[DeviceEntity.Command](DeviceEntity.EntityKey.name, Persistence(system)))
    .withAllocationStrategy(new SliceRangeShardAllocationStrategy(10, 0.1)))
```

### Example 5: Changing data partitions

```sql
CREATE TABLE event_journal_0 AS (SELECT * FROM event_journal WHERE slice BETWEEN 0 AND 127);
CREATE TABLE event_journal_1 AS (SELECT * FROM event_journal WHERE slice BETWEEN 128 AND 255);
```

### Example 6: Changing data partitions

```sql
INSERT INTO event_journal_0 SELECT * FROM event_journal WHERE slice BETWEEN 0 AND 127;
INSERT INTO event_journal_1 SELECT * FROM event_journal WHERE slice BETWEEN 128 AND 255;
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html
- https://doc.akka.io/japi/akka/2.10/?akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html
- https://doc.akka.io/japi/akka/2.10/?akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/cleanup.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/config.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/data-partition.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/getting-started.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/query.html
- https://doc.akka.io/libraries/akka-projection/current/r2dbc.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-r2dbc/current/data-partition.html](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/data-partition.html)*
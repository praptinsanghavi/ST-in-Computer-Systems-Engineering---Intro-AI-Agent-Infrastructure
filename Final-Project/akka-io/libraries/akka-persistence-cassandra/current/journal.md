---
description: A Cassandra plugin for Akka Persistence.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-cassandra/current/journal.html
title: Journal • Akka Persistence Cassandra
---

# Journal • Akka Persistence Cassandra

> **Summary:** A Cassandra plugin for Akka Persistence.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Journal

## Features

- All operations required by the Akka Persistence [journal plugin API](https://doc.akka.io/libraries/akka-core/2.10/persistence-journals.html#journal-plugin-api) are fully supported.
- The plugin uses Cassandra in a pure log\-oriented way i.e. data is only ever inserted but never updated (deletions are made on user request only).
- Writes of messages are batched to optimize throughput for `persistAsync`. See [batch writes](https://doc.akka.io/libraries/akka-core/2.10/persistence.html#batch-writes) for details how to configure batch sizes. The plugin was tested to work properly under high load.
- Messages written by a single persistent actor are partitioned across the cluster to achieve scalability with data volume by adding nodes.
- [Persistence Query](https://doc.akka.io/libraries/akka-core/2.10/persistence-query.html) support by `CassandraReadJournal`

## Schema

The keyspace and tables needs to be created before using the plugin. 

Warning
Auto creation of the keyspace and tables is included as a development convenience and should never be used in production. Cassandra does not handle concurrent schema migrations well and if every Akka node tries to create the schema at the same time you’ll get column id mismatch errors in Cassandra.

The default keyspace used by the plugin is `akka`, it should be created with the NetworkTopology replication strategy with a replication factor of at least 3:

```
CREATE KEYSPACE IF NOT EXISTS akka WITH replication = {'class': 'NetworkTopologyStrategy', '<your_dc_name>' : 3 }; 

```

For local testing, and the default if you enable `akka.persistence.cassandra.journal.keyspace-autocreate` you can use the following:

```
[source](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/target/journal-keyspace.txt#L2-L3 "Go to snippet source")CREATE KEYSPACE IF NOT EXISTS akka
WITH REPLICATION = { 'class' : 'SimpleStrategy','replication_factor':1 };
```

There are multiple tables required. These need to be created before starting your application. For local testing you can enable `akka.persistence.cassandra.journal.tables-autocreate`. The default table definitions look like this:

```
[source](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/target/journal-tables.txt#L2-L81 "Go to snippet source")CREATE TABLE IF NOT EXISTS akka.messages (
  persistence_id text,
  partition_nr bigint,
  sequence_nr bigint,
  timestamp timeuuid,
  timebucket text,
  writer_uuid text,
  ser_id int,
  ser_manifest text,
  event_manifest text,
  event blob,
  meta_ser_id int,
  meta_ser_manifest text,
  meta blob,
  tags set<text>,
  PRIMARY KEY ((persistence_id, partition_nr), sequence_nr, timestamp))
  WITH gc_grace_seconds =864000
  AND compaction = {
    'class' : 'SizeTieredCompactionStrategy',
    'enabled' : true,
    'tombstone_compaction_interval' : 86400,
    'tombstone_threshold' : 0.2,
    'unchecked_tombstone_compaction' : false,
    'bucket_high' : 1.5,
    'bucket_low' : 0.5,
    'max_threshold' : 32,
    'min_threshold' : 4,
    'min_sstable_size' : 50
    };

CREATE TABLE IF NOT EXISTS akka.tag_views (
  tag_name text,
  persistence_id text,
  sequence_nr bigint,
  timebucket bigint,
  timestamp timeuuid,
  tag_pid_sequence_nr bigint,
  writer_uuid text,
  ser_id int,
  ser_manifest text,
  event_manifest text,
  event blob,
  meta_ser_id int,
  meta_ser_manifest text,
  meta blob,
  PRIMARY KEY ((tag_name, timebucket), timestamp, persistence_id, tag_pid_sequence_nr))
  WITH gc_grace_seconds =864000
  AND compaction = {
    'class' : 'SizeTieredCompactionStrategy',
    'enabled' : true,
    'tombstone_compaction_interval' : 86400,
    'tombstone_threshold' : 0.2,
    'unchecked_tombstone_compaction' : false,
    'bucket_high' : 1.5,
    'bucket_low' : 0.5,
    'max_threshold' : 32,
    'min_threshold' : 4,
    'min_sstable_size' : 50
    };

CREATE TABLE IF NOT EXISTS akka.tag_write_progress(
  persistence_id text,
  tag text,
  sequence_nr bigint,
  tag_pid_sequence_nr bigint,
  offset timeuuid,
  PRIMARY KEY (persistence_id, tag));

CREATE TABLE IF NOT EXISTS akka.tag_scanning(
  persistence_id text,
  sequence_nr bigint,
  PRIMARY KEY (persistence_id));

CREATE TABLE IF NOT EXISTS akka.metadata(
  persistence_id text PRIMARY KEY,
  deleted_to bigint,
  properties map<text,text>);

CREATE TABLE IF NOT EXISTS akka.all_persistence_ids(
  persistence_id text PRIMARY KEY);
```

### Messages table

Descriptions of the important columns in the messages table:

| Column | Description |
| --- | --- |
| persistence\_id | The persistence id |
| partition\_nr | Artificial partition key to ensure partitions do not grow too large |
| sequence\_nr | Sequence number of the event |
| timestamp | A [type 2 UUID a.k.a TimeUUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) for ordering events in the events by tag query |
| timebucket | The time bucket to partition the events by tag query. Only in this table as events by tag used to use a materialized view |
| writer\_uuid | A UUID for the actor system that wrote the event. Used to detect multiple writers for the same persistence id |
| ser\_id | The serialization id of the user payload |
| ser\_manifest | The serialization manifest of the user payload |
| event\_manifest | The manifest used by event adapters |
| event | The serialized user payload |

Old columns, no longer needed but may be in your schema if you have used older versions of the plugin and migrated. See [the migration guide](migrations.html) for when these have been removed.

| Column | Description |
| --- | --- |
| used | A static column to record that the artificial partition has been used to detected that all events in a partition have been deleted |
| message | Pre 0\.6 serialized the PersistentRepr (an internal Akka type) into this column. Newer versions use event and serialize the user payload |
|  |  |

## Configuration

To activate the journal plugin, add the following line to your Akka `application.conf`:

```
akka.persistence.journal.plugin = "akka.persistence.cassandra.journal"

```

This will run the journal with its default settings. The default settings can be changed with the configuration properties defined in [reference.conf](configuration.html#default-configuration). Journal configuration is under `akka.persistence.cassandra.journal`.

All Cassandra driver settings are via its [standard profile mechanism](https://docs.datastax.com/en/developer/java-driver/4.14/manual/core/configuration/).

One important setting is to configure the database driver to retry the initial connection:

`datastax-java-driver.advanced.reconnect-on-init = true`

It is not enabled automatically as it is in the driver’s reference.conf and is not overridable in a profile.

### Target partition size

The messages table that stores the events is partitioned by `(persistence_id, partition_nr)`. The `partition_nr` is an artificial partition key to ensure that the Cassandra partition does not get too large if there are a lot of events for a single `persistence_id`.

`akka.persistence.cassandra.journal.target-partition-size` controls the number of events that the journal tries to put in each Cassandra partition. It is a target as `persistAll` calls will have all the events in the same partition even if it will exceed the target partition size to ensure atomicity.

It is not possible to change the value once you have data so consider if the default of 500000 is right for your application before deploying to production. Multiply the value by your expected serialized event size to roughly work out how large the Cassandra partition will grow to. See [wide partitions in Cassandra](https://thelastpickle.com/blog/2019/01/11/wide-partitions-cassandra-3-11.html) for a summary of how large a partition should be depending on the version of Cassandra you are using. 

### Consistency

By default the journal uses `QUORUM` for all reads and writes. For setups with multiple datacenters this can set to `LOCAL_QUORUM` to avoid cross DC latency for writes and reads.

The risk of using `LOCAL_QUORUM` is that in the event of a datacenter outage events that have been confirmed and any side effects run may not have be replicated to the other datacenters. If a persistent actor for which this has happened is started in another datacenter it may not see the latest event if it wasn’t replicated. If the Cassandra data in the datacenter with the outage is recovered then the event that was not replicated will eventually be replicated to all datacenters resulting in a duplicate sequence number. With the default [`replay-filter`](https://doc.akka.io/libraries/akka-core/current/typed/persistence.html#replay-filter) the duplicate event from the original datacenter will is discarded in subsequent replays of the persistent actor.

Using `QUORUM` for multi datacenter setups increases latency and decreased availability as to reach `QUORUM` nodes in other datacenters need to respond. During a datacenter outage or a cross datacenter network partition this won’t be possible resulting in failed reads and writes.

Using a consistency level other than `QUORUM` or `LOCAL_QUORUM` is highly discouraged.

```
datastax-java-driver.profiles {
  akka-persistence-cassandra-profile {
    basic.request.consistency = QUORUM
  }
}

```

## Event deletion and retention

In applications with an Event Sourcing model of persistence, an idealized journal is *append\-only*: events are never deleted. However, it is possible in Akka Persistence to use [snapshot\-based retention](https://doc.akka.io/libraries/akka-core/current/typed/persistence-snapshot.html#event-deletion), and it is also possible to [perform bulk deletions of events](cleanup.html) in Akka Persistence Cassandra. If using these features, it’s important to be aware of [how deletion is performed in Cassandra](https://docs.datastax.com/en/cassandra-oss/3.0/cassandra/dml/dmlAboutDeletes.html). Specifically, deletion of events is actually inserting a tombstone telling Cassandra “this event is deleted”. In the presence of that tombstone, the deleted event will not be read by Cassandra, but until Cassandra’s [compaction process](https://docs.datastax.com/en/cassandra-oss/3.0/cassandra/dml/dmlHowDataMaintain.html#Compaction) has combined the tombstone with the deleted event, both will still be on disk in the Cassandra cluster.

The journal schema provided above uses the `SizeTieredCompactionStrategy`, which is a good fit for insert\-heavy workloads which don’t perform upserts or deletions (the combination of Event Sourcing as a persistence model with Cluster Sharding is an especially good example of such a workload). If events are being deleted after many events (across all persistence IDs, not just the persistence ID for which events are being deleted) have been written, there can be a substantial delay before the compaction process will actually delete the deleted event (the duration of the delay depends on the rate at which new events are written in the system: assuming that the rate is uniform and constant, the delay will tend to be approximately the duration which elapsed between when the deleted event was originally written and when the deletion in Akka Persistence Cassandra was performed), and the compaction process can only guarantee to work in the presence of free disk space of at least the total size of events which are not deleted.

Accordingly, if planning to delete events, and especially if an intention of such a deletion/retention policy is to minimize disk storage requirements, it is strongly recommended to keep disk utilization on all nodes in your Cassandra cluster below 50% (e.g. by treating crossing that utilization threshold as a signal that the cluster needs to be scaled out by adding nodes). There can be substantial operational complexity if attempting to delete events after disk utilization has gone above 50%.

### Delete all events

The [`Cleanup`](/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/Cleanup.html "akka.persistence.cassandra.cleanup.Cleanup")[`Cleanup`](/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/Cleanup.html "akka.persistence.cassandra.cleanup.Cleanup") tool can be used for deleting all events and/or snapshots given list of `persistenceIds` without using persistent actors. It’s important that the actors with corresponding `persistenceId` are not running at the same time as using the tool. See [Database Cleanup](cleanup.html) for more details.

## Code Examples

### Example 1: Schema

```text
CREATE KEYSPACE IF NOT EXISTS akka WITH replication = {'class': 'NetworkTopologyStrategy', '<your_dc_name>' : 3 };
```

### Example 2: Schema

```txt
CREATE KEYSPACE IF NOT EXISTS akka
WITH REPLICATION = { 'class' : 'SimpleStrategy','replication_factor':1 };
```

### Example 3: Schema

```txt
CREATE TABLE IF NOT EXISTS akka.messages (
  persistence_id text,
  partition_nr bigint,
  sequence_nr bigint,
  timestamp timeuuid,
  timebucket text,
  writer_uuid text,
  ser_id int,
  ser_manifest text,
  event_manifest text,
  event blob,
  meta_ser_id int,
  meta_ser_manifest text,
  meta blob,
  tags set<text>,
  PRIMARY KEY ((persistence_id, partition_nr), sequence_nr, timestamp))
  WITH gc_grace_seconds =864000
  AND compaction = {
    'class' : 'SizeTieredCompactionStrategy',
    'enabled' : true,
    'tombstone_compaction_interval' : 86400,
    'tombstone_threshold' : 0.2,
    'unchecked_tombstone_compaction' : false,
    'bucket_high' : 1.5,
    'bucket_low' : 0.5,
    'max_threshold' : 32,
    'min_threshold' : 4,
    'min_sstable_size' : 50
    };

CREATE TABLE IF NOT EXISTS akka.tag_views (
  tag_name text,
  persistence_id text,
  sequence_nr bigint,
  timebucket bigint,
  timestamp timeuuid,
  tag_pid_sequence_nr bigint,
  writer_uuid text,
  ser_id int,
  ser_manifest text,
  event_manifest text,
  event blob,
  meta_ser_id int,
  meta_ser_manifest text,
  meta blob,
  PRIMARY KEY ((tag_name, timebucket), timestamp, persistence_id, tag_pid_sequence_nr))
  WITH gc_grace_seconds =864000
  AND compaction = {
    'class' : 'SizeTieredCompactionStrategy',
    'enabled' : true,
    'tombstone_compaction_interval' : 86400,
    'tombstone_threshold' : 0.2,
    'unchecked_tombstone_compaction' : false,
    'bucket_high' : 1.5,
    'bucket_low' : 0.5,
    'max_threshold' : 32,
    'min_threshold' : 4,
    'min_sstable_size' : 50
    };

CREATE TABLE IF NOT EXISTS akka.tag_write_progress(
  persistence_id text,
  tag text,
  sequence_nr bigint,
  tag_pid_sequence_nr bigint,
  offset timeuuid,
  PRIMARY KEY (persistence_id, tag));

CREATE TABLE IF NOT EXISTS akka.tag_scanning(
  persistence_id text,
  sequence_nr bigint,
  PRIMARY KEY (persistence_id));

CREATE TABLE IF NOT EXISTS akka.metadata(
  persistence_id text PRIMARY KEY,
  deleted_to bigint,
  properties map<text,text>);

CREATE TABLE IF NOT EXISTS akka.all_persistence_ids(
  persistence_id text PRIMARY KEY);
```

### Example 4: Configuration

```text
akka.persistence.journal.plugin = "akka.persistence.cassandra.journal"
```

### Example 5: Consistency

```text
datastax-java-driver.profiles {
  akka-persistence-cassandra-profile {
    basic.request.consistency = QUORUM
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/Cleanup.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence-journals.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence-query.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence-snapshot.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/cleanup.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/configuration.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/migrations.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/overview.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/read-journal.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-cassandra/current/journal.html](https://doc.akka.io/libraries/akka-persistence-cassandra/current/journal.html)*
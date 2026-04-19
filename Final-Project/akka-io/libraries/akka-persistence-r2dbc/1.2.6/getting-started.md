---
description: An Akka Persistence backed by SQL database with R2DBC
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:31:33Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-r2dbc/current/getting-started.html
title: Getting Started • Akka Persistence R2DBC Documentation
---

# Getting Started • Akka Persistence R2DBC Documentation

> **Summary:** An Akka Persistence backed by SQL database with R2DBC

## Content

# Getting Started

## Dependencies

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

Maven
```
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>

```
sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/maven")

```
Gradle
```
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}

```

Additionally, add the dependency as below.

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-r2dbc_${scala.binary.version}</artifactId>
    <version>1.2.6</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-r2dbc" % "1.2.6"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-r2dbc_${versions.ScalaBinary}:1.2.6"
}
```

This plugin depends on Akka 2\.9\.4 or later, and note that it is important that all `akka-*` dependencies are in the same version, so it is recommended to depend on them explicitly to avoid problems with transient dependencies causing an unlucky mix of versions.

The plugin is published for Scala 2\.13 and 3\.3

## Enabling

To enable the plugins to be used by default, add the following line to your Akka `application.conf`:

```
akka.persistence.journal.plugin = "akka.persistence.r2dbc.journal"
akka.persistence.snapshot-store.plugin = "akka.persistence.r2dbc.snapshot"
akka.persistence.state.plugin = "akka.persistence.r2dbc.state"

```

More information about each individual plugin in:

- [journal](journal.html)
- [snapshot store](snapshots.html)
- [durable state store](durable-state-store.html)
- [queries](query.html)

### Selecting database dialect

You will also need to configure which database dialect to use:

#### Postgres

A transitive dependency pulls in Postgres drivers by default. To use Postgres you only configure the connection factory to the default Postgres block:

```
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.postgres}
akka.persistence.r2dbc.connection-factory = {
  # overrides for default values from the 'akka.persistence.r2dbc.postgres' config block
  user = "myuser"
}

```

See [Configuration](config.html) for more configuration details.

#### Yugabyte

A transitive dependency pulls in Postgres drivers that can be used to connect to Yugabyte by default. To use Yugabyte you only configure the connection factory to the default Yugabyte block:

```
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.yugabyte}
akka.persistence.r2dbc.connection-factory = {
  # overrides for default values from the 'akka.persistence.r2dbc.yugabyte' config block
  user = "myuser"
}

```

See [Configuration](config.html) for more configuration details.

#### H2

The H2 dependencies are marked as `provided` dependencies of `akka-persistence-r2dbc` to not be pulled in for projects not using H2\. They must be listed explicitly as dependencies in the build configuration for projects that use them. The two required artifacts are:

Maven
```
<dependencies&gt
  <dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <version>2.2.224</version>
  </dependency&gt
  <dependency>
    <groupId>io.r2dbc</groupId>
    <artifactId>r2dbc-h2</artifactId>
    <version>1.0.0.RELEASE</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies ++= Seq(
  "com.h2database" % "h2" % "2.2.224",
  "io.r2dbc" % "r2dbc-h2" % "1.0.0.RELEASE"
)
```
Gradle
```
dependencies {
  implementation "com.h2database:h2:2.2.224"
  implementation "io.r2dbc:r2dbc-h2:1.0.0.RELEASE"
}
```

With the dependencies added to your project, configure the connection factory to the default H2 block:

```
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.h2}
akka.persistence.r2dbc.connection-factory = {
  # overrides for default values from the 'akka.persistence.r2dbc.h2' config block
  protocol = "mem"
  database = "mydb"
}

```

See [Configuration](config.html) for more configuration details.

#### Microsoft SQL Server

Warning
The SQL Server dialect is marked `experimental` and not yet production ready until various [issues](https://github.com/akka/akka-persistence-r2dbc/issues?q=is%3Aopen+label%3Asqlserver+label%3Abug) with the integration of the `r2dbc-mssql` plugin have been resolved.

The SQL Server dependency is marked as `provided` dependencies of `akka-persistence-r2dbc` to not be pulled in for projects not using SQL Server. It must be listed explicitly as dependencies in the build configuration for projects that use it. The required artifacts is:

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>io.r2dbc</groupId>
    <artifactId>r2dbc-mssql_${scala.binary.version}</artifactId>
    <version>1.0.2.RELEASE</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "io.r2dbc" %% "r2dbc-mssql" % "1.0.2.RELEASE"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "io.r2dbc:r2dbc-mssql_${versions.ScalaBinary}:1.0.2.RELEASE"
}
```

With the dependencies added to your project, configure the connection factory to the default SQL Server block:

```
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.sqlserver}
akka.persistence.r2dbc.connection-factory = {
  # overrides for default values from the 'akka.persistence.r2dbc.sqlserver' config block
  user = "myuser"
}

```

See [Configuration](config.html) for more configuration details.

## Local testing with docker

The database can be run in Docker. Here’s a sample docker compose file:

Postgres

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/docker/docker-compose-postgres.yml "Go to snippet source")version: '2.2'
services:
  postgres-db:
    image: postgres:latest
    container_name: postgres-db
    ports:
      - 5432:5432
    environment:
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: postgres
    healthcheck:
      test: ['CMD', 'pg_isready', "-q", "-d", "postgres", "-U", "postgres"]
      interval: 5s
      retries: 5
      start_period: 5s
      timeout: 5s
```

Yugabyte

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/docker/docker-compose-yugabyte.yml "Go to snippet source")version: '2.2'

# Local Yugabyte database, see https://docs.yugabyte.com/latest/deploy/docker/docker-compose/

volumes:
  yb-master-data-1:
  yb-tserver-data-1:

services:
  yb-master:
    image: yugabytedb/yugabyte:2.16.0.0-b90
    container_name: yb-master-n1
    volumes:
      - yb-master-data-1:/mnt/master
    command: [ "/home/yugabyte/bin/yb-master",
               "--fs_data_dirs=/mnt/master",
               "--master_addresses=yb-master-n1:7100",
               "--rpc_bind_addresses=yb-master-n1:7100",
               "--replication_factor=1" ]
    ports:
      - "7000:7000"
    environment:
      SERVICE_7000_NAME: yb-master

  yb-tserver:
    image: yugabytedb/yugabyte:2.16.0.0-b90
    container_name: yb-tserver-n1
    shm_size: '512mb'
    volumes:
      - yb-tserver-data-1:/mnt/tserver
    command: [ "/home/yugabyte/bin/yb-tserver",
               "--fs_data_dirs=/mnt/tserver",
               "--start_pgsql_proxy",
               "--rpc_bind_addresses=yb-tserver-n1:9100",
               "--tserver_master_addrs=yb-master-n1:7100",
               "--ysql_sequence_cache_minval=1",
               "--yb_num_shards_per_tserver=1" ]
    ports:
      - "9042:9042"
      - "5433:5433"
      - "9000:9000"
    environment:
      SERVICE_5433_NAME: ysql
      SERVICE_9042_NAME: ycql
      SERVICE_6379_NAME: yedis
      SERVICE_9000_NAME: yb-tserver
    depends_on:
      - yb-master
```

SQLServer

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/docker/docker-compose-sqlserver.yml "Go to snippet source")version: '2.2'
services:
  sqlserver:
    image: mcr.microsoft.com/mssql/server:2022-CU13-ubuntu-22.04
    container_name: sqlserver-db
    environment:
      - MSSQL_SA_PASSWORD=<YourStrong@Passw0rd>
      - ACCEPT_EULA=Y
    ports:
      - 1433:1433
```

Start with:

Postgres

```
docker compose -f docker/docker-compose-postgres.yml up --wait

```

Yugabyte

```
docker compose -f docker/docker-compose-yugabyte.yml up

```

SQLServer

```
docker compose -f docker/docker-compose-sqlserver.yml up

```

### Creating the schema

Tables and indexes:

Postgres

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/ddl-scripts/create_tables_postgres.sql "Go to snippet source")CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload BYTEA NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id, seq_nr)
);

-- `event_journal_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice, entity_type, db_timestamp, seq_nr);

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot BYTEA NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id)
);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
CREATE INDEX IF NOT EXISTS snapshot_slice_idx ON snapshot(slice, entity_type, db_timestamp);

CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload BYTEA NOT NULL,
  tags TEXT ARRAY,

  PRIMARY KEY(persistence_id)
);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp);
```

Postgres JSONB

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/ddl-scripts/create_tables_postgres_jsonb.sql "Go to snippet source")CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload JSONB NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id, seq_nr)
);

-- `event_journal_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice, entity_type, db_timestamp, seq_nr);

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot JSONB NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id)
);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
CREATE INDEX IF NOT EXISTS snapshot_slice_idx ON snapshot(slice, entity_type, db_timestamp);

CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload JSONB NOT NULL,
  tags TEXT ARRAY,

  PRIMARY KEY(persistence_id)
);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp);
```

Yugabyte

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/ddl-scripts/create_tables_yugabyte.sql "Go to snippet source")CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload BYTEA NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id HASH, seq_nr ASC)
);

-- `event_journal_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice ASC, entity_type ASC, db_timestamp ASC, seq_nr ASC, persistence_id, deleted)
  SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot BYTEA NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id HASH)
);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
CREATE INDEX IF NOT EXISTS snapshot_slice_idx ON snapshot(slice ASC, entity_type ASC, db_timestamp ASC, persistence_id)
  SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));

CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload BYTEA NOT NULL,
  tags TEXT ARRAY,

  PRIMARY KEY(persistence_id HASH)
);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice ASC, entity_type ASC, db_timestamp ASC, persistence_id)
  SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));
```

SQLServer

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/ddl-scripts/create_tables_sqlserver.sql "Go to snippet source")IF object_id('event_journal') is null
  CREATE TABLE event_journal(
    slice INT NOT NULL,
    entity_type NVARCHAR(255) NOT NULL,
    persistence_id NVARCHAR(255) NOT NULL,
    seq_nr NUMERIC(10,0) NOT NULL,
    db_timestamp datetime2(6) NOT NULL,
    event_ser_id INTEGER NOT NULL,
    event_ser_manifest NVARCHAR(255) NOT NULL,
    event_payload VARBINARY(MAX) NOT NULL,
    deleted BIT DEFAULT 0 NOT NULL,
    writer NVARCHAR(255) NOT NULL,
    adapter_manifest NVARCHAR(255) NOT NULL,
    tags NVARCHAR(255),

    meta_ser_id INTEGER,
    meta_ser_manifest NVARCHAR(255),
    meta_payload VARBINARY(MAX),
    PRIMARY KEY(persistence_id, seq_nr)
  );

IF NOT EXISTS(SELECT * FROM sys.indexes WHERE name = 'event_journal_slice_idx' AND object_id = OBJECT_ID('event_journal'))
    BEGIN
        CREATE INDEX event_journal_slice_idx ON event_journal (slice, entity_type, db_timestamp, seq_nr);
    END;

IF object_id('snapshot') is null
	CREATE TABLE snapshot(
	  slice INT NOT NULL,
	  entity_type NVARCHAR(255) NOT NULL,
	  persistence_id NVARCHAR(255) NOT NULL,
	  seq_nr BIGINT NOT NULL,
	  db_timestamp  datetime2(6),
	  write_timestamp BIGINT NOT NULL,
	  ser_id INTEGER NOT NULL,
	  ser_manifest NVARCHAR(255) NOT NULL,
	  snapshot VARBINARY(MAX) NOT NULL,
	  tags NVARCHAR(255),
	  meta_ser_id INTEGER,
	  meta_ser_manifest NVARCHAR(255),
	  meta_payload VARBINARY(MAX),
	  PRIMARY KEY(persistence_id)
	);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
IF NOT EXISTS(SELECT * FROM sys.indexes WHERE name = 'snapshot_slice_idx' AND object_id = OBJECT_ID('snapshot'))
    BEGIN
        CREATE INDEX snapshot_slice_idx ON snapshot(slice, entity_type, db_timestamp);
    END;

IF object_id('durable_state') is null
	CREATE TABLE durable_state (
	  slice INT NOT NULL,
	  entity_type NVARCHAR(255) NOT NULL,
	  persistence_id NVARCHAR(255) NOT NULL,
	  revision BIGINT NOT NULL,
	  db_timestamp datetime2(6) NOT NULL,

	  state_ser_id INTEGER NOT NULL,
	  state_ser_manifest NVARCHAR(255),
	  state_payload VARBINARY(MAX) NOT NULL,
	  tags NVARCHAR(255),

	  PRIMARY KEY(persistence_id)
	);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
IF NOT EXISTS(SELECT * FROM sys.indexes WHERE name = 'durable_state_slice_idx' AND object_id = OBJECT_ID('durable_state'))
    BEGIN
        CREATE INDEX durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp);
    END;
```

The ddl script can be run in Docker with:

Postgres

```
docker exec -i postgres-db psql -U postgres -t < ddl-scripts/create_tables_postgres.sql

```

Yugabyte

```
docker exec -i yb-tserver-n1 /home/yugabyte/bin/ysqlsh -h yb-tserver-n1 -t < ddl-scripts/create_tables_yugabyte.sql

```

SQLServer

```
docker exec -i sqlserver-db /opt/mssql-tools/bin/sqlcmd -S localhost -U SA -P '<YourStrong@Passw0rd>' -d master < ddl-scripts/create_tables_sqlserver.sql

```

### Dropping the schema

Postgres

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/ddl-scripts/drop_tables_postgres.sql "Go to snippet source")DROP INDEX event_journal_slice_idx;
DROP INDEX snapshot_slice_idx;
DROP INDEX durable_state_slice_idx;
DROP TABLE IF EXISTS event_journal;
DROP TABLE IF EXISTS snapshot;
DROP TABLE IF EXISTS durable_state;
```

Yugabyte

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/ddl-scripts/drop_tables_postgres.sql "Go to snippet source")DROP INDEX event_journal_slice_idx;
DROP INDEX snapshot_slice_idx;
DROP INDEX durable_state_slice_idx;
DROP TABLE IF EXISTS event_journal;
DROP TABLE IF EXISTS snapshot;
DROP TABLE IF EXISTS durable_state;
```

SQLServer

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/ddl-scripts/drop_tables_sqlserver.sql "Go to snippet source")DROP INDEX event_journal.event_journal_slice_idx;
DROP INDEX snapshot.snapshot_slice_idx;
DROP INDEX durable_state.durable_state_slice_idx;
DROP TABLE IF EXISTS event_journal;
DROP TABLE IF EXISTS snapshot;
DROP TABLE IF EXISTS durable_state;
```

### Local testing in process with H2

H2 runs in the JVM process, either using a database directly in memory or in a local file. This means it requires no additional steps to start a database, it is started on first connection from the Akka Persistence R2DBC plugin.

The database for H2 is created on first connection. Additional database schema creation or changes can be applied using the setting `additional-init` setting.

Note that it is not possible to share the file based database storage between processes, usage in an Akka cluster is not possible. For other usages where several processes may run at the same time (for example a CI server) it is important to make sure each new process will use a separate file not shared with other processes.

## Code Examples

### Example 1: Dependencies

```xml
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>
```

### Example 2: Dependencies

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 3: Dependencies

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-r2dbc_${scala.binary.version}</artifactId>
    <version>1.2.6</version>
  </dependency&gt
</dependencies>
```

### Example 5: Dependencies

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-r2dbc" % "1.2.6"
```

### Example 6: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-r2dbc_${versions.ScalaBinary}:1.2.6"
}
```

### Example 7: Enabling

```text
akka.persistence.journal.plugin = "akka.persistence.r2dbc.journal"
akka.persistence.snapshot-store.plugin = "akka.persistence.r2dbc.snapshot"
akka.persistence.state.plugin = "akka.persistence.r2dbc.state"
```

### Example 8: Postgres

```hocon
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.postgres}
akka.persistence.r2dbc.connection-factory = {
  # overrides for default values from the 'akka.persistence.r2dbc.postgres' config block
  user = "myuser"
}
```

### Example 9: Yugabyte

```hocon
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.yugabyte}
akka.persistence.r2dbc.connection-factory = {
  # overrides for default values from the 'akka.persistence.r2dbc.yugabyte' config block
  user = "myuser"
}
```

### Example 10: H2

```xml
<dependencies&gt
  <dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <version>2.2.224</version>
  </dependency&gt
  <dependency>
    <groupId>io.r2dbc</groupId>
    <artifactId>r2dbc-h2</artifactId>
    <version>1.0.0.RELEASE</version>
  </dependency&gt
</dependencies>
```

### Example 11: H2

```scala
libraryDependencies ++= Seq(
  "com.h2database" % "h2" % "2.2.224",
  "io.r2dbc" % "r2dbc-h2" % "1.0.0.RELEASE"
)
```

### Example 12: H2

```gradle
dependencies {
  implementation "com.h2database:h2:2.2.224"
  implementation "io.r2dbc:r2dbc-h2:1.0.0.RELEASE"
}
```

### Example 13: H2

```hocon
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.h2}
akka.persistence.r2dbc.connection-factory = {
  # overrides for default values from the 'akka.persistence.r2dbc.h2' config block
  protocol = "mem"
  database = "mydb"
}
```

### Example 14: Microsoft SQL Server

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>io.r2dbc</groupId>
    <artifactId>r2dbc-mssql_${scala.binary.version}</artifactId>
    <version>1.0.2.RELEASE</version>
  </dependency&gt
</dependencies>
```

### Example 15: Microsoft SQL Server

```scala
libraryDependencies += "io.r2dbc" %% "r2dbc-mssql" % "1.0.2.RELEASE"
```

### Example 16: Microsoft SQL Server

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "io.r2dbc:r2dbc-mssql_${versions.ScalaBinary}:1.0.2.RELEASE"
}
```

### Example 17: Microsoft SQL Server

```hocon
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.sqlserver}
akka.persistence.r2dbc.connection-factory = {
  # overrides for default values from the 'akka.persistence.r2dbc.sqlserver' config block
  user = "myuser"
}
```

### Example 18: Local testing with docker

```yml
version: '2.2'
services:
  postgres-db:
    image: postgres:latest
    container_name: postgres-db
    ports:
      - 5432:5432
    environment:
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: postgres
    healthcheck:
      test: ['CMD', 'pg_isready', "-q", "-d", "postgres", "-U", "postgres"]
      interval: 5s
      retries: 5
      start_period: 5s
      timeout: 5s
```

### Example 19: Local testing with docker

```yml
version: '2.2'

# Local Yugabyte database, see https://docs.yugabyte.com/latest/deploy/docker/docker-compose/

volumes:
  yb-master-data-1:
  yb-tserver-data-1:

services:
  yb-master:
    image: yugabytedb/yugabyte:2.16.0.0-b90
    container_name: yb-master-n1
    volumes:
      - yb-master-data-1:/mnt/master
    command: [ "/home/yugabyte/bin/yb-master",
               "--fs_data_dirs=/mnt/master",
               "--master_addresses=yb-master-n1:7100",
               "--rpc_bind_addresses=yb-master-n1:7100",
               "--replication_factor=1" ]
    ports:
      - "7000:7000"
    environment:
      SERVICE_7000_NAME: yb-master

  yb-tserver:
    image: yugabytedb/yugabyte:2.16.0.0-b90
    container_name: yb-tserver-n1
    shm_size: '512mb'
    volumes:
      - yb-tserver-data-1:/mnt/tserver
    command: [ "/home/yugabyte/bin/yb-tserver",
               "--fs_data_dirs=/mnt/tserver",
               "--start_pgsql_proxy",
               "--rpc_bind_addresses=yb-tserver-n1:9100",
               "--tserver_master_addrs=yb-master-n1:7100",
               "--ysql_sequence_cache_minval=1",
               "--yb_num_shards_per_tserver=1" ]
    ports:
      - "9042:9042"
      - "5433:5433"
      - "9000:9000"
    environment:
      SERVICE_5433_NAME: ysql
      SERVICE_9042_NAME: ycql
      SERVICE_6379_NAME: yedis
      SERVICE_9000_NAME: yb-tserver
    depends_on:
      - yb-master
```

### Example 20: Local testing with docker

```yml
version: '2.2'
services:
  sqlserver:
    image: mcr.microsoft.com/mssql/server:2022-CU13-ubuntu-22.04
    container_name: sqlserver-db
    environment:
      - MSSQL_SA_PASSWORD=<YourStrong@Passw0rd>
      - ACCEPT_EULA=Y
    ports:
      - 1433:1433
```

### Example 21: Local testing with docker

```text
docker compose -f docker/docker-compose-postgres.yml up --wait
```

### Example 22: Local testing with docker

```text
docker compose -f docker/docker-compose-yugabyte.yml up
```

### Example 23: Local testing with docker

```text
docker compose -f docker/docker-compose-sqlserver.yml up
```

### Example 24: Creating the schema

```sql
CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload BYTEA NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id, seq_nr)
);

-- `event_journal_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice, entity_type, db_timestamp, seq_nr);

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot BYTEA NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id)
);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
CREATE INDEX IF NOT EXISTS snapshot_slice_idx ON snapshot(slice, entity_type, db_timestamp);

CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload BYTEA NOT NULL,
  tags TEXT ARRAY,

  PRIMARY KEY(persistence_id)
);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp);
```

### Example 25: Creating the schema

```sql
CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload JSONB NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id, seq_nr)
);

-- `event_journal_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice, entity_type, db_timestamp, seq_nr);

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot JSONB NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id)
);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
CREATE INDEX IF NOT EXISTS snapshot_slice_idx ON snapshot(slice, entity_type, db_timestamp);

CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload JSONB NOT NULL,
  tags TEXT ARRAY,

  PRIMARY KEY(persistence_id)
);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp);
```

### Example 26: Creating the schema

```sql
CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload BYTEA NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id HASH, seq_nr ASC)
);

-- `event_journal_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice ASC, entity_type ASC, db_timestamp ASC, seq_nr ASC, persistence_id, deleted)
  SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot BYTEA NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id HASH)
);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
CREATE INDEX IF NOT EXISTS snapshot_slice_idx ON snapshot(slice ASC, entity_type ASC, db_timestamp ASC, persistence_id)
  SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));

CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload BYTEA NOT NULL,
  tags TEXT ARRAY,

  PRIMARY KEY(persistence_id HASH)
);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice ASC, entity_type ASC, db_timestamp ASC, persistence_id)
  SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));
```

### Example 27: Creating the schema

```sql
IF object_id('event_journal') is null
  CREATE TABLE event_journal(
    slice INT NOT NULL,
    entity_type NVARCHAR(255) NOT NULL,
    persistence_id NVARCHAR(255) NOT NULL,
    seq_nr NUMERIC(10,0) NOT NULL,
    db_timestamp datetime2(6) NOT NULL,
    event_ser_id INTEGER NOT NULL,
    event_ser_manifest NVARCHAR(255) NOT NULL,
    event_payload VARBINARY(MAX) NOT NULL,
    deleted BIT DEFAULT 0 NOT NULL,
    writer NVARCHAR(255) NOT NULL,
    adapter_manifest NVARCHAR(255) NOT NULL,
    tags NVARCHAR(255),

    meta_ser_id INTEGER,
    meta_ser_manifest NVARCHAR(255),
    meta_payload VARBINARY(MAX),
    PRIMARY KEY(persistence_id, seq_nr)
  );

IF NOT EXISTS(SELECT * FROM sys.indexes WHERE name = 'event_journal_slice_idx' AND object_id = OBJECT_ID('event_journal'))
    BEGIN
        CREATE INDEX event_journal_slice_idx ON event_journal (slice, entity_type, db_timestamp, seq_nr);
    END;

IF object_id('snapshot') is null
	CREATE TABLE snapshot(
	  slice INT NOT NULL,
	  entity_type NVARCHAR(255) NOT NULL,
	  persistence_id NVARCHAR(255) NOT NULL,
	  seq_nr BIGINT NOT NULL,
	  db_timestamp  datetime2(6),
	  write_timestamp BIGINT NOT NULL,
	  ser_id INTEGER NOT NULL,
	  ser_manifest NVARCHAR(255) NOT NULL,
	  snapshot VARBINARY(MAX) NOT NULL,
	  tags NVARCHAR(255),
	  meta_ser_id INTEGER,
	  meta_ser_manifest NVARCHAR(255),
	  meta_payload VARBINARY(MAX),
	  PRIMARY KEY(persistence_id)
	);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
IF NOT EXISTS(SELECT * FROM sys.indexes WHERE name = 'snapshot_slice_idx' AND object_id = OBJECT_ID('snapshot'))
    BEGIN
        CREATE INDEX snapshot_slice_idx ON snapshot(slice, entity_type, db_timestamp);
    END;

IF object_id('durable_state') is null
	CREATE TABLE durable_state (
	  slice INT NOT NULL,
	  entity_type NVARCHAR(255) NOT NULL,
	  persistence_id NVARCHAR(255) NOT NULL,
	  revision BIGINT NOT NULL,
	  db_timestamp datetime2(6) NOT NULL,

	  state_ser_id INTEGER NOT NULL,
	  state_ser_manifest NVARCHAR(255),
	  state_payload VARBINARY(MAX) NOT NULL,
	  tags NVARCHAR(255),

	  PRIMARY KEY(persistence_id)
	);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
IF NOT EXISTS(SELECT * FROM sys.indexes WHERE name = 'durable_state_slice_idx' AND object_id = OBJECT_ID('durable_state'))
    BEGIN
        CREATE INDEX durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp);
    END;
```

### Example 28: Creating the schema

```text
docker exec -i postgres-db psql -U postgres -t < ddl-scripts/create_tables_postgres.sql
```

### Example 29: Creating the schema

```text
docker exec -i yb-tserver-n1 /home/yugabyte/bin/ysqlsh -h yb-tserver-n1 -t < ddl-scripts/create_tables_yugabyte.sql
```

### Example 30: Creating the schema

```text
docker exec -i sqlserver-db /opt/mssql-tools/bin/sqlcmd -S localhost -U SA -P '<YourStrong@Passw0rd>' -d master < ddl-scripts/create_tables_sqlserver.sql
```

### Example 31: Dropping the schema

```sql
DROP INDEX event_journal_slice_idx;
DROP INDEX snapshot_slice_idx;
DROP INDEX durable_state_slice_idx;
DROP TABLE IF EXISTS event_journal;
DROP TABLE IF EXISTS snapshot;
DROP TABLE IF EXISTS durable_state;
```

### Example 32: Dropping the schema

```sql
DROP INDEX event_journal_slice_idx;
DROP INDEX snapshot_slice_idx;
DROP INDEX durable_state_slice_idx;
DROP TABLE IF EXISTS event_journal;
DROP TABLE IF EXISTS snapshot;
DROP TABLE IF EXISTS durable_state;
```

### Example 33: Dropping the schema

```sql
DROP INDEX event_journal.event_journal_slice_idx;
DROP INDEX snapshot.snapshot_slice_idx;
DROP INDEX durable_state.durable_state_slice_idx;
DROP TABLE IF EXISTS event_journal;
DROP TABLE IF EXISTS snapshot;
DROP TABLE IF EXISTS durable_state;
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/config.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/durable-state-store.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/journal.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/overview.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/query.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/getting-started.html](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/getting-started.html)*
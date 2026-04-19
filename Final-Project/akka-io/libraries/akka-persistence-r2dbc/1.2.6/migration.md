---
description: An Akka Persistence backed by SQL database with R2DBC
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-r2dbc/current/migration.html
title: Migration tool • Akka Persistence R2DBC Documentation
---

# Migration tool • Akka Persistence R2DBC Documentation

> **Summary:** An Akka Persistence backed by SQL database with R2DBC

## Content

# Migration tool

There is a migration tool that is useful if you would like to migrate from another Akka Persistence plugin to the R2DBC plugin. It has been tested with Akka Persistence JDBC as source plugin, but it should work with any plugin that has support for `CurrentPersistenceIdsQuery` and `CurrentEventsByPersistenceIdQuery`.

The migration tool can be run while the source system is still active, and it can be run multiple times with idempotent result. Full rolling update when switching database or Persistence plugin is not supported, but you can migrate most of the data while the system is online and then have a short full shutdown while migrating the remaining data that was written after the previous online migration.

The migration tool is intended to run as a separate, standalone application and should not be part of the same jvm process as the main application is running under.

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
    <artifactId>akka-persistence-r2dbc-migration_${scala.binary.version}</artifactId>
    <version>1.2.6</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-r2dbc-migration" % "1.2.6"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-r2dbc-migration_${versions.ScalaBinary}:1.2.6"
}
```

## Progress table

To speed up processing of subsequent runs it stores migrated persistence ids and sequence numbers in the table `migration_progress`. In a subsequent run it will only migrate new events, snapshots and durable states compared to what was stored in `migration_progress`. It will also find and migrate new persistence ids in a subsequent run. You can delete from `migration_progress` if you want to re\-run the full migration.

It’s recommended that you create the `migration_progress` table before running the migration tool, but if it doesn’t exist the tool will try to create the table.

Postgres

```
CREATE TABLE IF NOT EXISTS migration_progress(
  persistence_id VARCHAR(255) NOT NULL,
  event_seq_nr BIGINT,
  snapshot_seq_nr BIGINT,
  state_revision  BIGINT,
  PRIMARY KEY(persistence_id)

```

SQLServer

```
IF object_id('migration_progress') is null
  CREATE TABLE migration_progress(
persistence_id NVARCHAR(255) NOT NULL,
event_seq_nr BIGINT,
snapshot_seq_nr BIGINT,
state_revision  BIGINT,
PRIMARY KEY(persistence_id)

```

Warning
The SQL Server dialect is marked `experimental` and not yet production ready until various [issues](https://github.com/akka/akka-persistence-r2dbc/issues?q=is%3Aopen+label%3Asqlserver+label%3Abug) with the integration of the `r2dbc-mssql` plugin have been resolved.

## Running

The migration tool can be run as main class `akka.persistence.r2dbc.migration.MigrationTool` provided by the above `akka-persistence-r2dbc-migration` dependency. The main method will run `MigrationTool.migrateAll`.

Note
Durable State is not migrated by `MigrationTool.migrateAll`, instead you need to use `MigrationTool.migrateDurableStates` for a given list of persistence ids.

## Configuration

You need to provide configuration for the source persistence plugin and the target Rd2BC plugin in your `application.conf`. An example of such configuration for migration from Akka Persistence JDBC:

Postgres

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/migration-tests/src/test/resources/application-postgres-example.conf "Go to snippet source")akka.persistence.r2dbc.migration {
  source {
    query-plugin-id = "jdbc-read-journal"
    snapshot-plugin-id = "jdbc-snapshot-store"
  }
}

akka.persistence.r2dbc {
  # use different table names or schema
  journal.table = "event_journal2"
  snapshot.table = "snapshot2"
  state.table = "durable_state2"
}

akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.postgres}
akka.persistence.r2dbc.connection-factory {
  driver = "postgres"
  host = "localhost"
  port = 5432
  user = "postgres"
  password = "postgres"
  database = "postgres"
}

akka-persistence-jdbc {
  shared-databases {
    default {
      profile = "slick.jdbc.PostgresProfile$"
      db {
        host = "localhost"
        url = "jdbc:postgresql://localhost:5432/postgres?reWriteBatchedInserts=true"
        user = postgres
        password = postgres
        driver = "org.postgresql.Driver"
        numThreads = 20
        maxConnections = 20
        minConnections = 5
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "default"
}
jdbc-snapshot-store {
  use-shared-db = "default"
}
jdbc-read-journal {
  use-shared-db = "default"
}

# application specific serializers for events and snapshots
# must also be configured and included in classpath
```

SQLServer

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/migration-tests/src/test/resources/application-sqlserver-example.conf "Go to snippet source")akka.persistence.r2dbc.migration {
  source {
    query-plugin-id = "jdbc-read-journal"
    snapshot-plugin-id = "jdbc-snapshot-store"
  }
}

akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.sqlserver}
akka.persistence.r2dbc.connection-factory {
  host = "localhost"
  port = 1433
  database = "your_db"
  user = "your_user"
  password = "your_password"
}

akka-persistence-jdbc {
  shared-databases {
    default {
      profile = "slick.jdbc.SQLServerProfile$"
      db {
        url = "jdbc:sqlserver://"127.0.0.1":1433;databaseName=master;integratedSecurity=false;"
        user = "user"
        password = "password"
        driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
        numThreads = 5
        maxConnections = 5
        minConnections = 1
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "default"
}
jdbc-snapshot-store {
  use-shared-db = "default"
}
jdbc-read-journal {
  use-shared-db = "default"
}

# application specific serializers for events and snapshots
# must also be configured and included in classpath
```

Note
Application specific serializers for events and snapshots must also be configured and included in classpath.

When running the migration tool for Durable State the single writer assertion must be disabled with configuration:

```
akka.persistence.r2dbc.state.assert-single-writer = off

```

### Reference configuration

The following can be overridden in your `application.conf` for the migration tool specific settings:

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.2.6/migration/src/main/resources/reference.conf "Go to snippet source")akka.persistence.r2dbc.migration {

  # Akka Persistence plugin to migrate from.
  # You must also define plugin specific configuration
  # and application specific serializers for events and snapshots.
  source {
    query-plugin-id = "jdbc-read-journal"
    snapshot-plugin-id = "jdbc-snapshot-store"
    durable-state-plugin-id = "jdbc-durable-state-store"
  }

  # R2DBC Akka Persistence plugin to migrate to.
  # You must also define akka-persistence-r2dbc specific configuration.
  target {
    # this must be a configuration path of akka-persistence-r2dbc
    persistence-plugin-id = "akka.persistence.r2dbc"

    # Events are stored in batches of this size.
    batch = 10
  }

  # How many persistence ids to migrate concurrently.
  parallelism = 10

}
```

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
    <artifactId>akka-persistence-r2dbc-migration_${scala.binary.version}</artifactId>
    <version>1.2.6</version>
  </dependency&gt
</dependencies>
```

### Example 5: Dependencies

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-r2dbc-migration" % "1.2.6"
```

### Example 6: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-r2dbc-migration_${versions.ScalaBinary}:1.2.6"
}
```

### Example 7: Progress table

```sql
CREATE TABLE IF NOT EXISTS migration_progress(
  persistence_id VARCHAR(255) NOT NULL,
  event_seq_nr BIGINT,
  snapshot_seq_nr BIGINT,
  state_revision  BIGINT,
  PRIMARY KEY(persistence_id)
```

### Example 8: Progress table

```sql
IF object_id('migration_progress') is null
  CREATE TABLE migration_progress(
persistence_id NVARCHAR(255) NOT NULL,
event_seq_nr BIGINT,
snapshot_seq_nr BIGINT,
state_revision  BIGINT,
PRIMARY KEY(persistence_id)
```

### Example 9: Configuration

```conf
akka.persistence.r2dbc.migration {
  source {
    query-plugin-id = "jdbc-read-journal"
    snapshot-plugin-id = "jdbc-snapshot-store"
  }
}

akka.persistence.r2dbc {
  # use different table names or schema
  journal.table = "event_journal2"
  snapshot.table = "snapshot2"
  state.table = "durable_state2"
}

akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.postgres}
akka.persistence.r2dbc.connection-factory {
  driver = "postgres"
  host = "localhost"
  port = 5432
  user = "postgres"
  password = "postgres"
  database = "postgres"
}

akka-persistence-jdbc {
  shared-databases {
    default {
      profile = "slick.jdbc.PostgresProfile$"
      db {
        host = "localhost"
        url = "jdbc:postgresql://localhost:5432/postgres?reWriteBatchedInserts=true"
        user = postgres
        password = postgres
        driver = "org.postgresql.Driver"
        numThreads = 20
        maxConnections = 20
        minConnections = 5
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "default"
}
jdbc-snapshot-store {
  use-shared-db = "default"
}
jdbc-read-journal {
  use-shared-db = "default"
}

# application specific serializers for events and snapshots
# must also be configured and included in classpath
```

### Example 10: Configuration

```conf
akka.persistence.r2dbc.migration {
  source {
    query-plugin-id = "jdbc-read-journal"
    snapshot-plugin-id = "jdbc-snapshot-store"
  }
}

akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.sqlserver}
akka.persistence.r2dbc.connection-factory {
  host = "localhost"
  port = 1433
  database = "your_db"
  user = "your_user"
  password = "your_password"
}

akka-persistence-jdbc {
  shared-databases {
    default {
      profile = "slick.jdbc.SQLServerProfile$"
      db {
        url = "jdbc:sqlserver://"127.0.0.1":1433;databaseName=master;integratedSecurity=false;"
        user = "user"
        password = "password"
        driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
        numThreads = 5
        maxConnections = 5
        minConnections = 1
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "default"
}
jdbc-snapshot-store {
  use-shared-db = "default"
}
jdbc-read-journal {
  use-shared-db = "default"
}

# application specific serializers for events and snapshots
# must also be configured and included in classpath
```

### Example 11: Configuration

```hcon
akka.persistence.r2dbc.state.assert-single-writer = off
```

### Example 12: Reference configuration

```conf
akka.persistence.r2dbc.migration {

  # Akka Persistence plugin to migrate from.
  # You must also define plugin specific configuration
  # and application specific serializers for events and snapshots.
  source {
    query-plugin-id = "jdbc-read-journal"
    snapshot-plugin-id = "jdbc-snapshot-store"
    durable-state-plugin-id = "jdbc-durable-state-store"
  }

  # R2DBC Akka Persistence plugin to migrate to.
  # You must also define akka-persistence-r2dbc specific configuration.
  target {
    # this must be a configuration path of akka-persistence-r2dbc
    persistence-plugin-id = "akka.persistence.r2dbc"

    # Events are stored in batches of this size.
    batch = 10
  }

  # How many persistence ids to migrate concurrently.
  parallelism = 10

}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/cleanup.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/migration-guide.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/migration.html](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/migration.html)*
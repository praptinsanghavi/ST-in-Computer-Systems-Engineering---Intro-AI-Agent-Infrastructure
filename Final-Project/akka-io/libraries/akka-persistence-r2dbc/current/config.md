---
description: An Akka Persistence backed by SQL database with R2DBC
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-r2dbc/current/config.html
title: Configuration • Akka Persistence R2DBC Documentation
---

# Configuration • Akka Persistence R2DBC Documentation

> **Summary:** An Akka Persistence backed by SQL database with R2DBC

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Configuration

## Connection configuration

Configuration for how to connect to the database and which dialect to use is located under `akka.persistence.r2dbc.connection-factory`.

Selecting a database dialect is done by first assigning one of the existing dialect blocks and then overriding specific configuration keys to specific values for your environment:

Postgres

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/resources/application-postgres.conf#L7-L23 "Go to snippet source")akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.postgres}
akka.persistence.r2dbc.connection-factory {
  host = "localhost"
  host = ${?DB_HOST}
  database = "postgres"
  database = ${?DB_NAME}
  user = "postgres"
  user = ${?DB_USER}
  password = "postgres"
  password = ${?DB_PASSWORD}

  # ssl {
  #   enabled = on
  #   mode = "VERIFY_CA"
  #   root-cert = "/path/db_root.crt"
  # }
}
```

Yugabyte

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/resources/application-yugabyte.conf#L7-L24 "Go to snippet source")akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.yugabyte}
akka.persistence.r2dbc.connection-factory {
  host = "localhost"
  host = ${?DB_HOST}
  port = 5433
  database = "yugabyte"
  database = ${?DB_NAME}
  user = "yugabyte"
  user = ${?DB_USER}
  password = "yugabyte"
  password = ${?DB_PASSWORD}

  # ssl {
  #   enabled = on
  #   mode = "VERIFY_CA"
  #   root-cert = "/path/db_root.crt"
  # }
}
```

H2

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/resources/application-h2.conf#L7-L13 "Go to snippet source")akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.h2}
akka.persistence.r2dbc.connection-factory {
  protocol = "file"
  # Note that this cannot be shared among processes on the same server,
  # each JVM needs its own file if using file based H2
  database = "/var/lib/my-app/database"
}
```

SQLServer

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/resources/application-sqlserver.conf#L7-L17 "Go to snippet source")akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.sqlserver}
akka.persistence.r2dbc.connection-factory {
  host = "localhost"
  host = ${?DB_HOST}
  database = "db"
  database = ${?DB_NAME}
  user = "user"
  user = ${?DB_USER}
  password = "password"
  password = ${?DB_PASSWORD}
}
```

Full set of settings that can be overridden for each of the dialects, and their default values:

Postgres

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/core/src/main/resources/reference.conf#L298-L352 "Go to snippet source")# the connection can be configured with a url, eg: "r2dbc:postgresql://<host>:5432/<database>"
url = ""

# The connection options to be used. Ignored if 'url' is non-empty
host = "localhost"
port = 5432
database = "postgres"
user = "postgres"
password = "postgres"

ssl {
  enabled = off
  # See PostgresqlConnectionFactoryProvider.SSL_MODE
  # Possible values:
  #  allow - encryption if the server insists on it
  #  prefer - encryption if the server supports it
  #  require - encryption enabled and required, but trust network to connect to the right server
  #  verify-ca - encryption enabled and required, and verify server certificate
  #  verify-full - encryption enabled and required, and verify server certificate and hostname
  #  tunnel - use a SSL tunnel instead of following Postgres SSL handshake protocol
  mode = ""

  # Server root certificate. Can point to either a resource within the classpath or a file.
  root-cert = ""

  # Client certificate. Can point to either a resource within the classpath or a file.
  cert = ""

  # Key for client certificate. Can point to either a resource within the classpath or a file.
  key = ""

  # Password for client key.
  password = ""
}

# Maximum time to create a new connection.
connect-timeout = 3 seconds

# Configures the statement cache size.
# 0 means no cache, negative values will select an unbounded cache
# a positive value will configure a bounded cache with the passed size.
statement-cache-size = 5000

# Abort any statement that takes more than the specified amount of time.
# This timeout is handled by the database server.
# This timeout should be less than `close-calls-exceeding`.
statement-timeout = off

# Possibility to programatically amend the ConnectionFactoryOptions.
# Enable by specifying the fully qualified class name of a
# `akka.persistence.r2dbc.ConnectionFactoryProvider.ConnectionFactoryOptionsProvider`.
# The class can optionally have a constructor with an ActorSystem parameter.
options-provider = ""
```

Yugabyte

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/core/src/main/resources/reference.conf#L298-L366 "Go to snippet source")# the connection can be configured with a url, eg: "r2dbc:postgresql://<host>:5432/<database>"
url = ""

# The connection options to be used. Ignored if 'url' is non-empty
host = "localhost"

ssl {
  enabled = off
  # See PostgresqlConnectionFactoryProvider.SSL_MODE
  # Possible values:
  #  allow - encryption if the server insists on it
  #  prefer - encryption if the server supports it
  #  require - encryption enabled and required, but trust network to connect to the right server
  #  verify-ca - encryption enabled and required, and verify server certificate
  #  verify-full - encryption enabled and required, and verify server certificate and hostname
  #  tunnel - use a SSL tunnel instead of following Postgres SSL handshake protocol
  mode = ""

  # Server root certificate. Can point to either a resource within the classpath or a file.
  root-cert = ""

  # Client certificate. Can point to either a resource within the classpath or a file.
  cert = ""

  # Key for client certificate. Can point to either a resource within the classpath or a file.
  key = ""

  # Password for client key.
  password = ""
}

# Maximum time to create a new connection.
connect-timeout = 3 seconds

# Configures the statement cache size.
# 0 means no cache, negative values will select an unbounded cache
# a positive value will configure a bounded cache with the passed size.
statement-cache-size = 5000

# Abort any statement that takes more than the specified amount of time.
# This timeout is handled by the database server.
# This timeout should be less than `close-calls-exceeding`.
statement-timeout = off

# Possibility to programatically amend the ConnectionFactoryOptions.
# Enable by specifying the fully qualified class name of a
# `akka.persistence.r2dbc.ConnectionFactoryProvider.ConnectionFactoryOptionsProvider`.
# The class can optionally have a constructor with an ActorSystem parameter.
options-provider = ""

port = 5433
database = "yugabyte"
user = "yugabyte"
password = "yugabyte"
```

H2

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/core/src/main/resources/reference.conf#L376-L413 "Go to snippet source")# the connection can be configured with a url, eg: 'r2dbc:h2:file:////some/path/db-file;DB_CLOSE_DELAY=-1'
url = ""
# 'file' or 'mem' default is mem, separate process over 'tcp' is not supported
protocol = "mem"
# For mem protocol, symbolic database name, all interactions with the same name in the same process see the same data,
# For file protocol, relative or absolute file path to where database is kept on disk
# Note: for file based the file cannot be shared by multiple JVMs, it must be one unique path per process
database = "akka-r2dbc"
# Enable trace logging via slf4j, logger used is named 'h2database'
# (Enabling may come with a performance overhead)
trace-logging = off
# DDL or DML included in init together with plugin table creation
additional-init=""

# Additional H2 options to use when creating the database.
# See https://h2database.com/javadoc/org/h2/engine/DbSettings.html for a list of available options
additional-options {
}

# Create database indexes to optimize slice queries on the journal and durable state
# has a slight overhead so can be disabled if not using the slice queries
create-slice-indexes = true

# The H2 driver blocks in suprising places, run potentiall blocking tasks on this dispatcher,
# can be configured to be a specific dispatcher but note that since it will be blocking it should
# not be together with other async tasks.
use-dispatcher = "akka.actor.default-blocking-io-dispatcher"

# Note: hack to pull in custom table names into schema creation in H2 connection properties
# for custom/multi journal configs where table and chema is changed and plugin config is not under
# 'akka.persistence.r2dbc' these have to be re-pointed to the actual config location
schema = ${akka.persistence.r2dbc.schema}
journal-table = ${akka.persistence.r2dbc.journal.table}
state-table = ${akka.persistence.r2dbc.state.table}
snapshot-table = ${akka.persistence.r2dbc.snapshot.table}
number-of-partitions = ${akka.persistence.r2dbc.data-partition.number-of-partitions}
```

SQLServer

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/core/src/main/resources/reference.conf#L424-L446 "Go to snippet source")# the connection can be configured with a url, eg: "r2dbc:sqlserver://<host>:1433/<database>"
url = ""

# The connection options to be used. Ignored if 'url' is non-empty
host = "localhost"

port = 1433
database = "master"
user = "SA"
password = "<YourStrong@Passw0rd>"

# Maximum time to create a new connection.
connect-timeout = 3 seconds

# Used to encode tags to and from db. Tags must not contain this separator.
tag-separator = ","

# Possibility to programatically amend the ConnectionFactoryOptions.
# Enable by specifying the fully qualified class name of a
# `akka.persistence.r2dbc.ConnectionFactoryProvider.ConnectionFactoryOptionsProvider`.
# The class can optionally have a constructor with an ActorSystem parameter.
options-provider = ""

```

Connection pool settings are the same across the different dialects, but are defined in\-line in the connection factory block:

```
akka.persistence.r2dbc.connection-factory = {
  # Initial pool size.
  initial-size = 10
  # Maximum pool size.
  max-size = 30  
}

```

The following connection pool settings be overridden directly in the `connection-factory` block:

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/core/src/main/resources/reference.conf#L244-L283 "Go to snippet source")# Initial pool size.
initial-size = 5
# Maximum pool size.
max-size = 20

# Maximum idle time of the connection in the pool.
# Background eviction interval of idle connections is derived from this property
# and max-life-time.
max-idle-time = 30 minutes

# Maximum lifetime of the connection in the pool.
# Background eviction interval of connections is derived from this property
# and max-idle-time.
max-life-time = 60 minutes

# Maximum time to acquire connection from pool.
acquire-timeout = 5 seconds
# Number of retries if the connection acquisition attempt fails.
# In the case the database server was restarted all connections in the pool will
# be invalid. To recover from that without failed acquire you can use the same number
# of retries as max-size of the pool
acquire-retry = 1

# Validate the connection when acquired with this SQL.
# Enabling this has some performance overhead.
# A fast query for Postgres is "SELECT 1"
validation-query = ""

# Maximum SQL statement execution duration. The current connection is closed if exceeded,
# and will not be reused by the pool.
# This timeout is handled on the client side and should be used in case the database server
# is unresponsive or the connection is broken but not closed.
# It can be used in combination with `statement-timeout`, which should be less than this
# timeout.
# The timeout is needed to handle some failure scenarios, when the database server is
# terminated in a non graceful way and there is a load balancer in front. The client
# connection and current execution in progress would not be completed without this timeout,
# resulting in a "connection leak".
# Set to "off" to disable this timeout.
close-calls-exceeding = 20 seconds
```

## Journal configuration

Journal configuration properties are by default defined under `akka.persistence.r2dbc.journal`.

See [Journal plugin configuration](journal.html#configuration).

## Snapshot configuration

Snapshot store configuration properties are by default defined under `akka.persistence.r2dbc.snapshot`.

See [Snapshot store plugin configuration](snapshots.html#configuration).

## Durable state configuration

Durable state store configuration properties are by default defined under `akka.persistence.r2dbc.state`.

See [Durable state plugin configuration](durable-state-store.html#configuration).

## Query configuration

Query configuration properties are by default defined under `akka.persistence.r2dbc.query`.

See [Query plugin configuration](query.html#configuration).

## Multiple plugins

To enable the plugins to be used by default, add the following lines to your Akka `application.conf`:

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/core/src/test/scala/akka/persistence/r2dbc/journal/MultiPluginSpec.scala#L26-L28 "Go to snippet source")akka.persistence.journal.plugin = "akka.persistence.r2dbc.journal"
akka.persistence.snapshot-store.plugin = "akka.persistence.r2dbc.snapshot"
akka.persistence.state.plugin = "akka.persistence.r2dbc.state"
```

Note that all plugins have a shared root config section `akka.persistence.r2dbc`, which also contains the [Connection configuration](config.html#connection-configuration) for the connection pool that is shared for the plugins.

You can use additional plugins with different configuration. For example if more than one database is used. Then you would define the configuration such as:

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/core/src/test/scala/akka/persistence/r2dbc/journal/MultiPluginSpec.scala#L32-L54 "Go to snippet source")second-r2dbc = ${akka.persistence.r2dbc}
second-r2dbc {
  # chose dialect unless using the same as the default
  # connection-factory = ${akka.persistence.r2dbc.postgres}
  connection-factory {
    # specific connection properties here

    # Note if using H2 and customizing table names you will need to repeat the custom table names
    # for the second config in this config block, see reference.conf for the table name config keys.
  }
  journal {
    # specific journal properties here
  }
  snapshot {
    # specific snapshot properties here
  }
  state {
    # specific durable state properties here
  }
  query {
    # specific query properties here
  }
}
```

To use the additional plugin you would defineoverride the plugin id.

Scala

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/core/src/test/scala/akka/persistence/r2dbc/journal/MultiPluginSpec.scala#L83-L85 "Go to snippet source")EventSourcedBehavior(persistenceId, emptyState = State(), commandHandler, eventHandler)
  .withJournalPluginId("second-r2dbc.journal")
  .withSnapshotPluginId("second-r2dbc.snapshot")
```

Java

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/java/jdocs/home/MultiPluginDocExample.java#L16-L54 "Go to snippet source")static class MyEntity
    extends EventSourcedBehavior<MyEntity.Command, MyEntity.Event, MyEntity.State> {
  @Override
  public String journalPluginId() {
    return "second-r2dbc.journal";
  }

  @Override
  public String snapshotPluginId() {
    return "second-r2dbc.snapshot";
  }
}
```

It is similar for `DurableStateBehavior`, define `withDurableStateStorePluginId("second-r2dbc.state")` override `durableStateStorePluginId` with `"second-r2dbc.state"`.

For queries and Projection `SourceProvider` you would use `"second-r2dbc.query"` instead of the default `R2dbcReadJournal.Identifier` `R2dbcReadJournal.Identifier()`.

For additional details on multiple plugin configuration for projections see [the Akka R2DBC projection docs](https://doc.akka.io/libraries/akka-projection/current/r2dbc.html#multiple-plugins)

## Code Examples

### Example 1: Connection configuration

```conf
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.postgres}
akka.persistence.r2dbc.connection-factory {
  host = "localhost"
  host = ${?DB_HOST}
  database = "postgres"
  database = ${?DB_NAME}
  user = "postgres"
  user = ${?DB_USER}
  password = "postgres"
  password = ${?DB_PASSWORD}

  # ssl {
  #   enabled = on
  #   mode = "VERIFY_CA"
  #   root-cert = "/path/db_root.crt"
  # }
}
```

### Example 2: Connection configuration

```conf
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.yugabyte}
akka.persistence.r2dbc.connection-factory {
  host = "localhost"
  host = ${?DB_HOST}
  port = 5433
  database = "yugabyte"
  database = ${?DB_NAME}
  user = "yugabyte"
  user = ${?DB_USER}
  password = "yugabyte"
  password = ${?DB_PASSWORD}

  # ssl {
  #   enabled = on
  #   mode = "VERIFY_CA"
  #   root-cert = "/path/db_root.crt"
  # }
}
```

### Example 3: Connection configuration

```conf
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.h2}
akka.persistence.r2dbc.connection-factory {
  protocol = "file"
  # Note that this cannot be shared among processes on the same server,
  # each JVM needs its own file if using file based H2
  database = "/var/lib/my-app/database"
}
```

### Example 4: Connection configuration

```conf
akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.sqlserver}
akka.persistence.r2dbc.connection-factory {
  host = "localhost"
  host = ${?DB_HOST}
  database = "db"
  database = ${?DB_NAME}
  user = "user"
  user = ${?DB_USER}
  password = "password"
  password = ${?DB_PASSWORD}
}
```

### Example 5: Connection configuration

```conf
# the connection can be configured with a url, eg: "r2dbc:postgresql://<host>:5432/<database>"
url = ""

# The connection options to be used. Ignored if 'url' is non-empty
host = "localhost"
port = 5432
database = "postgres"
user = "postgres"
password = "postgres"

ssl {
  enabled = off
  # See PostgresqlConnectionFactoryProvider.SSL_MODE
  # Possible values:
  #  allow - encryption if the server insists on it
  #  prefer - encryption if the server supports it
  #  require - encryption enabled and required, but trust network to connect to the right server
  #  verify-ca - encryption enabled and required, and verify server certificate
  #  verify-full - encryption enabled and required, and verify server certificate and hostname
  #  tunnel - use a SSL tunnel instead of following Postgres SSL handshake protocol
  mode = ""

  # Server root certificate. Can point to either a resource within the classpath or a file.
  root-cert = ""

  # Client certificate. Can point to either a resource within the classpath or a file.
  cert = ""

  # Key for client certificate. Can point to either a resource within the classpath or a file.
  key = ""

  # Password for client key.
  password = ""
}

# Maximum time to create a new connection.
connect-timeout = 3 seconds

# Configures the statement cache size.
# 0 means no cache, negative values will select an unbounded cache
# a positive value will configure a bounded cache with the passed size.
statement-cache-size = 5000

# Abort any statement that takes more than the specified amount of time.
# This timeout is handled by the database server.
# This timeout should be less than `close-calls-exceeding`.
statement-timeout = off

# Possibility to programatically amend the ConnectionFactoryOptions.
# Enable by specifying the fully qualified class name of a
# `akka.persistence.r2dbc.ConnectionFactoryProvider.ConnectionFactoryOptionsProvider`.
# The class can optionally have a constructor with an ActorSystem parameter.
options-provider = ""
```

### Example 6: Connection configuration

```conf
# the connection can be configured with a url, eg: "r2dbc:postgresql://<host>:5432/<database>"
url = ""

# The connection options to be used. Ignored if 'url' is non-empty
host = "localhost"

ssl {
  enabled = off
  # See PostgresqlConnectionFactoryProvider.SSL_MODE
  # Possible values:
  #  allow - encryption if the server insists on it
  #  prefer - encryption if the server supports it
  #  require - encryption enabled and required, but trust network to connect to the right server
  #  verify-ca - encryption enabled and required, and verify server certificate
  #  verify-full - encryption enabled and required, and verify server certificate and hostname
  #  tunnel - use a SSL tunnel instead of following Postgres SSL handshake protocol
  mode = ""

  # Server root certificate. Can point to either a resource within the classpath or a file.
  root-cert = ""

  # Client certificate. Can point to either a resource within the classpath or a file.
  cert = ""

  # Key for client certificate. Can point to either a resource within the classpath or a file.
  key = ""

  # Password for client key.
  password = ""
}

# Maximum time to create a new connection.
connect-timeout = 3 seconds

# Configures the statement cache size.
# 0 means no cache, negative values will select an unbounded cache
# a positive value will configure a bounded cache with the passed size.
statement-cache-size = 5000

# Abort any statement that takes more than the specified amount of time.
# This timeout is handled by the database server.
# This timeout should be less than `close-calls-exceeding`.
statement-timeout = off

# Possibility to programatically amend the ConnectionFactoryOptions.
# Enable by specifying the fully qualified class name of a
# `akka.persistence.r2dbc.ConnectionFactoryProvider.ConnectionFactoryOptionsProvider`.
# The class can optionally have a constructor with an ActorSystem parameter.
options-provider = ""

port = 5433
database = "yugabyte"
user = "yugabyte"
password = "yugabyte"
```

### Example 7: Connection configuration

```conf
# the connection can be configured with a url, eg: 'r2dbc:h2:file:////some/path/db-file;DB_CLOSE_DELAY=-1'
url = ""
# 'file' or 'mem' default is mem, separate process over 'tcp' is not supported
protocol = "mem"
# For mem protocol, symbolic database name, all interactions with the same name in the same process see the same data,
# For file protocol, relative or absolute file path to where database is kept on disk
# Note: for file based the file cannot be shared by multiple JVMs, it must be one unique path per process
database = "akka-r2dbc"
# Enable trace logging via slf4j, logger used is named 'h2database'
# (Enabling may come with a performance overhead)
trace-logging = off
# DDL or DML included in init together with plugin table creation
additional-init=""

# Additional H2 options to use when creating the database.
# See https://h2database.com/javadoc/org/h2/engine/DbSettings.html for a list of available options
additional-options {
}

# Create database indexes to optimize slice queries on the journal and durable state
# has a slight overhead so can be disabled if not using the slice queries
create-slice-indexes = true

# The H2 driver blocks in suprising places, run potentiall blocking tasks on this dispatcher,
# can be configured to be a specific dispatcher but note that since it will be blocking it should
# not be together with other async tasks.
use-dispatcher = "akka.actor.default-blocking-io-dispatcher"

# Note: hack to pull in custom table names into schema creation in H2 connection properties
# for custom/multi journal configs where table and chema is changed and plugin config is not under
# 'akka.persistence.r2dbc' these have to be re-pointed to the actual config location
schema = ${akka.persistence.r2dbc.schema}
journal-table = ${akka.persistence.r2dbc.journal.table}
state-table = ${akka.persistence.r2dbc.state.table}
snapshot-table = ${akka.persistence.r2dbc.snapshot.table}
number-of-partitions = ${akka.persistence.r2dbc.data-partition.number-of-partitions}
```

### Example 8: Connection configuration

```conf
# the connection can be configured with a url, eg: "r2dbc:sqlserver://<host>:1433/<database>"
url = ""

# The connection options to be used. Ignored if 'url' is non-empty
host = "localhost"

port = 1433
database = "master"
user = "SA"
password = "<YourStrong@Passw0rd>"

# Maximum time to create a new connection.
connect-timeout = 3 seconds

# Used to encode tags to and from db. Tags must not contain this separator.
tag-separator = ","

# Possibility to programatically amend the ConnectionFactoryOptions.
# Enable by specifying the fully qualified class name of a
# `akka.persistence.r2dbc.ConnectionFactoryProvider.ConnectionFactoryOptionsProvider`.
# The class can optionally have a constructor with an ActorSystem parameter.
options-provider = ""
```

### Example 9: Connection configuration

```shell
akka.persistence.r2dbc.connection-factory = {
  # Initial pool size.
  initial-size = 10
  # Maximum pool size.
  max-size = 30  
}
```

### Example 10: Connection configuration

```conf
# Initial pool size.
initial-size = 5
# Maximum pool size.
max-size = 20

# Maximum idle time of the connection in the pool.
# Background eviction interval of idle connections is derived from this property
# and max-life-time.
max-idle-time = 30 minutes

# Maximum lifetime of the connection in the pool.
# Background eviction interval of connections is derived from this property
# and max-idle-time.
max-life-time = 60 minutes

# Maximum time to acquire connection from pool.
acquire-timeout = 5 seconds
# Number of retries if the connection acquisition attempt fails.
# In the case the database server was restarted all connections in the pool will
# be invalid. To recover from that without failed acquire you can use the same number
# of retries as max-size of the pool
acquire-retry = 1

# Validate the connection when acquired with this SQL.
# Enabling this has some performance overhead.
# A fast query for Postgres is "SELECT 1"
validation-query = ""

# Maximum SQL statement execution duration. The current connection is closed if exceeded,
# and will not be reused by the pool.
# This timeout is handled on the client side and should be used in case the database server
# is unresponsive or the connection is broken but not closed.
# It can be used in combination with `statement-timeout`, which should be less than this
# timeout.
# The timeout is needed to handle some failure scenarios, when the database server is
# terminated in a non graceful way and there is a load balancer in front. The client
# connection and current execution in progress would not be completed without this timeout,
# resulting in a "connection leak".
# Set to "off" to disable this timeout.
close-calls-exceeding = 20 seconds
```

### Example 11: Multiple plugins

```scala
akka.persistence.journal.plugin = "akka.persistence.r2dbc.journal"
akka.persistence.snapshot-store.plugin = "akka.persistence.r2dbc.snapshot"
akka.persistence.state.plugin = "akka.persistence.r2dbc.state"
```

### Example 12: Multiple plugins

```scala
second-r2dbc = ${akka.persistence.r2dbc}
second-r2dbc {
  # chose dialect unless using the same as the default
  # connection-factory = ${akka.persistence.r2dbc.postgres}
  connection-factory {
    # specific connection properties here

    # Note if using H2 and customizing table names you will need to repeat the custom table names
    # for the second config in this config block, see reference.conf for the table name config keys.
  }
  journal {
    # specific journal properties here
  }
  snapshot {
    # specific snapshot properties here
  }
  state {
    # specific durable state properties here
  }
  query {
    # specific query properties here
  }
}
```

### Example 13: Multiple plugins

```scala
EventSourcedBehavior(persistenceId, emptyState = State(), commandHandler, eventHandler)
  .withJournalPluginId("second-r2dbc.journal")
  .withSnapshotPluginId("second-r2dbc.snapshot")
```

### Example 14: Multiple plugins

```java
static class MyEntity
    extends EventSourcedBehavior<MyEntity.Command, MyEntity.Event, MyEntity.State> {
  @Override
  public String journalPluginId() {
    return "second-r2dbc.journal";
  }

  @Override
  public String snapshotPluginId() {
    return "second-r2dbc.snapshot";
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/config.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/data-partition.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/durable-state-store.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/journal.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/projection.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/query.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/snapshots.html
- https://doc.akka.io/libraries/akka-projection/current/r2dbc.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-r2dbc/current/config.html](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/config.html)*
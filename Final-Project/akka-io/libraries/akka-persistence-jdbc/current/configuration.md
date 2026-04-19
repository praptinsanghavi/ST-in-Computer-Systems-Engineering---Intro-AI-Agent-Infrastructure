---
description: A plugin for storing events in an event journal akka-persistence-jdbc
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-jdbc/current/configuration.html
title: Configuration • Akka Persistence JDBC
---

# Configuration • Akka Persistence JDBC

> **Summary:** A plugin for storing events in an event journal akka-persistence-jdbc

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Configuration

The plugin relies on [Slick](https://scala-slick.org/doc/3.5.1/) to do create the SQL dialect for the database in use, therefore the following must be configured in `application.conf`

Configure `akka-persistence`:

- instruct akka persistence to use the `jdbc-journal` plugin,
- instruct akka persistence to use the `jdbc-snapshot-store` plugin,

Configure `slick`:

- The following slick profiles are supported:
- `slick.jdbc.PostgresProfile$`
- `slick.jdbc.MySQLProfile$`
- `slick.jdbc.H2Profile$`
- `slick.jdbc.OracleProfile$`
- `slick.jdbc.SQLServerProfile$`

## Database Schema

- [Postgres Schema](https://github.com/akka/akka-persistence-jdbc/blob/v5.5.4/core/src/main/resources/schema/postgres/postgres-create-schema.sql)
- [MySQL Schema](https://github.com/akka/akka-persistence-jdbc/blob/v5.5.4/core/src/main/resources/schema/mysql/mysql-create-schema.sql)
- [H2 Schema](https://github.com/akka/akka-persistence-jdbc/blob/v5.5.4/core/src/main/resources/schema/h2/h2-create-schema.sql)
- [Oracle Schema](https://github.com/akka/akka-persistence-jdbc/blob/v5.5.4/core/src/main/resources/schema/oracle/oracle-create-schema.sql)
- [SQL Server Schema](https://github.com/akka/akka-persistence-jdbc/blob/v5.5.4/core/src/main/resources/schema/sqlserver/sqlserver-create-schema.sql)

Note
Please note that the H2 database is not recommended to be used as a production database, and support for H2 is primarily for testing purposes.

For testing purposes the journal and snapshot tables can be created programmatically using the provided `SchemaUtils`.

Scala

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/scala/akka/persistence/jdbc/ScaladslSnippets.scala#L19-L22 "Go to snippet source")import akka.persistence.jdbc.testkit.scaladsl.SchemaUtils

implicit val system: ActorSystem = ActorSystem("example")
val done: Future[Done] = SchemaUtils.createIfNotExists()
```

Java

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/java/akka/persistence/jdbc/JavadslSnippets.java#L12-L43 "Go to snippet source")import akka.persistence.jdbc.testkit.javadsl.SchemaUtils;

ActorSystem actorSystem = ActorSystem.create("example");
CompletionStage<Done> done = SchemaUtils.createIfNotExists(actorSystem);
```

A `dropIfExists` variant is also available.

**Note**: `SchemaUtils` was introduced in version 5\.0\.0\.

## Reference Configuration

akka\-persistence\-jdbc provides the defaults as part of the [reference.conf](https://github.com/akka/akka-persistence-jdbc/blob/v5.5.4/core/src/main/resources/reference.conf). This file documents all the values which can be configured.

There are several possible ways to configure loading your database connections. Options will be explained below.

### One database connection pool per journal type

There is the possibility to create a separate database connection pool per journal\-type (one pool for the write\-journal, one pool for the snapshot\-journal, and one pool for the read\-journal). This is the default and the following example configuration shows how this is configured:

Postgres

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/resources/postgres-application.conf "Go to snippet source")# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

// general.conf is included only for shared settings used for the akka-persistence-jdbc tests
include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

jdbc-journal {
  slick = ${slick}
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  slick = ${slick}
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  slick = ${slick}
}

# the akka-persistence-jdbc provider in use for durable state store
jdbc-durable-state-store {
  slick = ${slick}
}

slick {
  profile = "slick.jdbc.PostgresProfile$"
  db {
    host = "localhost"
    host = ${?DB_HOST}
    url = "jdbc:postgresql://"${slick.db.host}":5432/docker?reWriteBatchedInserts=true"
    user = "docker"
    password = "docker"
    driver = "org.postgresql.Driver"
    numThreads = 5
    maxConnections = 5
    minConnections = 1
  }
}
```

MySQL

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/resources/mysql-application.conf "Go to snippet source")# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

// general.conf is included only for shared settings used for the akka-persistence-jdbc tests
include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

jdbc-journal {
  slick = ${slick}
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  slick = ${slick}
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  slick = ${slick}
}

# the akka-persistence-jdbc provider in use for durable state store
jdbc-durable-state-store {
  slick = ${slick}
}

slick {
  profile = "slick.jdbc.MySQLProfile$"
  db {
    host = ${docker.host}
    host = ${?DB_HOST}
    url = "jdbc:mysql://"${slick.db.host}":3306/docker?cachePrepStmts=true&cacheCallableStmts=true&cacheServerConfiguration=true&useLocalSessionState=true&elideSetAutoCommits=true&alwaysSendSetIsolation=false&enableQueryTimeouts=false&connectionAttributes=none&verifyServerCertificate=false&useSSL=false&allowPublicKeyRetrieval=true&useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC&rewriteBatchedStatements=true"
    user = "root"
    password = "root"
    driver = "com.mysql.cj.jdbc.Driver"
    numThreads = 5
    maxConnections = 5
    minConnections = 1
  }
}
```

H2

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/resources/h2-application.conf "Go to snippet source")# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

// general.conf is included only for shared settings used for the akka-persistence-jdbc tests
include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

jdbc-journal {
  slick = ${slick}
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  slick = ${slick}
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  slick = ${slick}
}

# the akka-persistence-jdbc provider in use for durable state store
jdbc-durable-state-store {
  slick = ${slick}
}

another-jdbc-durable-state-store = ${jdbc-durable-state-store}

slick {
  profile = "slick.jdbc.H2Profile$"
  db {
    url = "jdbc:h2:mem:test-database;DATABASE_TO_UPPER=false;"
    user = "root"
    password = "root"
    driver = "org.h2.Driver"
    numThreads = 5
    maxConnections = 5
    minConnections = 1
  }
}
```

Oracle

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/resources/oracle-application.conf "Go to snippet source")# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

// general.conf is included only for shared settings used for the akka-persistence-jdbc tests
include "general.conf"
include "oracle-schema-overrides.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

jdbc-journal {
  slick = ${slick}
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  slick = ${slick}
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  slick = ${slick}
}

slick {
  profile = "slick.jdbc.OracleProfile$"
  db {
    host = ${docker.host}
    host = ${?DB_HOST}
    url = "jdbc:oracle:thin:@//"${slick.db.host}":1521/xe"
    user = "system"
    password = "oracle"
    driver = "oracle.jdbc.OracleDriver"
    numThreads = 5
    maxConnections = 5
    minConnections = 1
  }
}
```

SQL Server

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/resources/sqlserver-application.conf "Go to snippet source")# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

jdbc-journal {
  tables {
    journal {
      schemaName = "dbo"
    }
  }

  slick = ${slick}
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  tables {
    snapshot {
      schemaName = "dbo"
    }
  }

  slick = ${slick}
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  tables {
    journal {
      schemaName = "dbo"
    }
  }

  slick = ${slick}
}

slick {
  profile = "slick.jdbc.SQLServerProfile$"
  db {
    host = ${docker.host}
    host = ${?DB_HOST}
    url = "jdbc:sqlserver://"${slick.db.host}":1433;databaseName=docker;integratedSecurity=false"
    user = "sa"
    password = "docker123abc#"
    driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
    numThreads = 5
    maxConnections = 5
    minConnections = 1
  }
}
```

### Sharing the database connection pool between the journals

In order to create only one connection pool which is shared between all journals the following configuration can be used:

Postgres

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/resources/postgres-shared-db-application.conf "Go to snippet source")# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

akka-persistence-jdbc {
  shared-databases {
    slick {
      profile = "slick.jdbc.PostgresProfile$"
      db {
        host = "localhost"
        host = ${?DB_HOST}
        url = "jdbc:postgresql://"${akka-persistence-jdbc.shared-databases.slick.db.host}":5432/docker?reWriteBatchedInserts=true"
        user = "docker"
        password = "docker"
        driver = "org.postgresql.Driver"
        numThreads = 5
        maxConnections = 5
        minConnections = 1
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "slick"
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  use-shared-db = "slick"
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  use-shared-db = "slick"
}

# the akka-persistence-jdbc provider in use for durable state store
jdbc-durable-state-store {
  use-shared-db = "slick"
}

another-jdbc-durable-state-store = ${jdbc-durable-state-store}
```

MySQL

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/resources/mysql-shared-db-application.conf "Go to snippet source")# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

akka-persistence-jdbc {
  shared-databases {
    slick {
      profile = "slick.jdbc.MySQLProfile$"
      db {
        host = ${docker.host}
        host = ${?DB_HOST}
        url = "jdbc:mysql://"${akka-persistence-jdbc.shared-databases.slick.db.host}":3306/docker?cachePrepStmts=true&cacheCallableStmts=true&cacheServerConfiguration=true&useLocalSessionState=true&elideSetAutoCommits=true&alwaysSendSetIsolation=false&enableQueryTimeouts=false&connectionAttributes=none&verifyServerCertificate=false&useSSL=false&allowPublicKeyRetrieval=true&useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC&rewriteBatchedStatements=true"
        user = "root"
        password = "root"
        driver = "com.mysql.cj.jdbc.Driver"
        numThreads = 5
        maxConnections = 5
        minConnections = 1
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "slick"
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  use-shared-db = "slick"
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  use-shared-db = "slick"
}

# the akka-persistence-jdbc provider in use for durable state store
jdbc-durable-state-store {
  use-shared-db = "slick"
}
```

H2

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/resources/h2-shared-db-application.conf "Go to snippet source")# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

akka-persistence-jdbc {
  shared-databases {
    slick {
      profile = "slick.jdbc.H2Profile$"
      db {
        url = "jdbc:h2:mem:test-database;DATABASE_TO_UPPER=false;"
        user = "root"
        password = "root"
        driver = "org.h2.Driver"
        numThreads = 5
        maxConnections = 5
        minConnections = 1
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "slick"
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  use-shared-db = "slick"
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  use-shared-db = "slick"
}

```

Oracle

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/resources/oracle-shared-db-application.conf "Go to snippet source")# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

include "general.conf"
include "oracle-schema-overrides.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

akka-persistence-jdbc {
  shared-databases {
    slick {
      profile = "slick.jdbc.OracleProfile$"
      db {
        host = ${docker.host}
        host = ${?DB_HOST}
        url = "jdbc:oracle:thin:@//"${akka-persistence-jdbc.shared-databases.slick.db.host}":1521/xe"
        user = "system"
        password = "oracle"
        driver = "oracle.jdbc.OracleDriver"
        numThreads = 5
        maxConnections = 5
        minConnections = 1
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "slick"
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  use-shared-db = "slick"
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  use-shared-db = "slick"
}
```

SQL Server

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/resources/sqlserver-shared-db-application.conf "Go to snippet source")# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

akka-persistence-jdbc {
  shared-databases {
    slick {
      profile = "slick.jdbc.SQLServerProfile$"
      db {
        host = ${docker.host}
        host = ${?DB_HOST}
        url = "jdbc:sqlserver://"${akka-persistence-jdbc.shared-databases.slick.db.host}":1433;databaseName=docker;integratedSecurity=false;"
        user = "sa"
        password = "docker123abc#"
        driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
        numThreads = 5
        maxConnections = 5
        minConnections = 1
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "slick"
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  use-shared-db = "slick"
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  use-shared-db = "slick"
}
```

### Customized loading of the db connection

It is also possible to load a custom database connection. In order to do so a custom implementation of [SlickDatabaseProvider](https://github.com/akka/akka-persistence-jdbc/blob/v5.5.4/core/src/main/scala/akka/persistence/jdbc/db/SlickExtension.scala) needs to be created. The methods that need to be implemented supply the Slick `Database` and `Profile` to the journals.

To enable your custom `SlickDatabaseProvider`, the fully qualified class name of the `SlickDatabaseProvider` needs to be configured in the application.conf. In addition, you might want to consider whether you want the database to be closed automatically:

```
akka-persistence-jdbc {
  database-provider-fqcn = "com.mypackage.CustomSlickDatabaseProvider"
}
jdbc-journal {
  use-shared-db = "enabled" // setting this to any non-empty string prevents the journal from closing the database on shutdown
}
jdbc-snapshot-store {
  use-shared-db = "enabled" // setting this to any non-empty string prevents the snapshot-journal from closing the database on shutdown
}

```

### DataSource lookup by JNDI name

The plugin uses `Slick` as the database access library. Slick [supports jndi](https://scala-slick.org/doc/3.5.1/database.html#using-a-jndi-name) for looking up [`DataSource`](https://docs.oracle.com/javase/8/docs/api/?javax/sql/DataSource.html "javax.sql.DataSource")s.

To enable the JNDI lookup, you must add the following to your application.conf:

```
jdbc-journal {
  slick {
    profile = "slick.jdbc.PostgresProfile$"
    jndiName = "java:jboss/datasources/PostgresDS"
  }
}

```

When using the `use-shared-db = slick` setting, the follow configuration can serve as an example:

```
akka-persistence-jdbc {
  shared-databases {
    slick {
      profile = "slick.jdbc.PostgresProfile$"
      jndiName = "java:/jboss/datasources/bla"
    }
  }
}

```

## Explicitly shutting down the database connections

The plugin automatically shuts down the HikariCP connection pool when the ActorSystem is terminated. This is done using [`ActorSystem.registerOnTermination`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem.registerOnTermination`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem").

## Tuning for Lower Latency

The `jdbc-read-journal.journal-sequence-retrieval.query-delay` configuration controls how often the actor queries for new data. The default is `1s`, but this can be set lower for latency\-sensitive applications to reduce the time between data retrievals.

Similarly, `jdbc-read-journal.refresh-interval` dictates how often the system polls for new events when idle, also defaulting to `1s`. In mostly idle applications that still require low latencies, it is important to adjust both `query-delay` and `refresh-interval` to achieve optimal performance. Lowering just one of these values might not be sufficient for reducing latency.

As with any performance tuning, it’s important to test these settings in your environment to find the right balance. Reducing these intervals will increase the load on your database, as each node in the cluster will be querying the event journal more frequently.

## Code Examples

### Example 1: Database Schema

```scala
import akka.persistence.jdbc.testkit.scaladsl.SchemaUtils

implicit val system: ActorSystem = ActorSystem("example")
val done: Future[Done] = SchemaUtils.createIfNotExists()
```

### Example 2: Database Schema

```java
import akka.persistence.jdbc.testkit.javadsl.SchemaUtils;

ActorSystem actorSystem = ActorSystem.create("example");
CompletionStage<Done> done = SchemaUtils.createIfNotExists(actorSystem);
```

### Example 3: One database connection pool per journal type

```conf
# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

// general.conf is included only for shared settings used for the akka-persistence-jdbc tests
include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

jdbc-journal {
  slick = ${slick}
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  slick = ${slick}
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  slick = ${slick}
}

# the akka-persistence-jdbc provider in use for durable state store
jdbc-durable-state-store {
  slick = ${slick}
}

slick {
  profile = "slick.jdbc.PostgresProfile$"
  db {
    host = "localhost"
    host = ${?DB_HOST}
    url = "jdbc:postgresql://"${slick.db.host}":5432/docker?reWriteBatchedInserts=true"
    user = "docker"
    password = "docker"
    driver = "org.postgresql.Driver"
    numThreads = 5
    maxConnections = 5
    minConnections = 1
  }
}
```

### Example 4: One database connection pool per journal type

```conf
# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

// general.conf is included only for shared settings used for the akka-persistence-jdbc tests
include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

jdbc-journal {
  slick = ${slick}
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  slick = ${slick}
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  slick = ${slick}
}

# the akka-persistence-jdbc provider in use for durable state store
jdbc-durable-state-store {
  slick = ${slick}
}

slick {
  profile = "slick.jdbc.MySQLProfile$"
  db {
    host = ${docker.host}
    host = ${?DB_HOST}
    url = "jdbc:mysql://"${slick.db.host}":3306/docker?cachePrepStmts=true&cacheCallableStmts=true&cacheServerConfiguration=true&useLocalSessionState=true&elideSetAutoCommits=true&alwaysSendSetIsolation=false&enableQueryTimeouts=false&connectionAttributes=none&verifyServerCertificate=false&useSSL=false&allowPublicKeyRetrieval=true&useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC&rewriteBatchedStatements=true"
    user = "root"
    password = "root"
    driver = "com.mysql.cj.jdbc.Driver"
    numThreads = 5
    maxConnections = 5
    minConnections = 1
  }
}
```

### Example 5: One database connection pool per journal type

```conf
# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

// general.conf is included only for shared settings used for the akka-persistence-jdbc tests
include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

jdbc-journal {
  slick = ${slick}
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  slick = ${slick}
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  slick = ${slick}
}

# the akka-persistence-jdbc provider in use for durable state store
jdbc-durable-state-store {
  slick = ${slick}
}

another-jdbc-durable-state-store = ${jdbc-durable-state-store}

slick {
  profile = "slick.jdbc.H2Profile$"
  db {
    url = "jdbc:h2:mem:test-database;DATABASE_TO_UPPER=false;"
    user = "root"
    password = "root"
    driver = "org.h2.Driver"
    numThreads = 5
    maxConnections = 5
    minConnections = 1
  }
}
```

### Example 6: One database connection pool per journal type

```conf
# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

// general.conf is included only for shared settings used for the akka-persistence-jdbc tests
include "general.conf"
include "oracle-schema-overrides.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}


jdbc-journal {
  slick = ${slick}
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  slick = ${slick}
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  slick = ${slick}
}

slick {
  profile = "slick.jdbc.OracleProfile$"
  db {
    host = ${docker.host}
    host = ${?DB_HOST}
    url = "jdbc:oracle:thin:@//"${slick.db.host}":1521/xe"
    user = "system"
    password = "oracle"
    driver = "oracle.jdbc.OracleDriver"
    numThreads = 5
    maxConnections = 5
    minConnections = 1
  }
}
```

### Example 7: One database connection pool per journal type

```conf
# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

jdbc-journal {
  tables {
    journal {
      schemaName = "dbo"
    }
  }

  slick = ${slick}
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  tables {
    snapshot {
      schemaName = "dbo"
    }
  }

  slick = ${slick}
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  tables {
    journal {
      schemaName = "dbo"
    }
  }

  slick = ${slick}
}

slick {
  profile = "slick.jdbc.SQLServerProfile$"
  db {
    host = ${docker.host}
    host = ${?DB_HOST}
    url = "jdbc:sqlserver://"${slick.db.host}":1433;databaseName=docker;integratedSecurity=false"
    user = "sa"
    password = "docker123abc#"
    driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
    numThreads = 5
    maxConnections = 5
    minConnections = 1
  }
}
```

### Example 8: Sharing the database connection pool between the journals

```conf
# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

akka-persistence-jdbc {
  shared-databases {
    slick {
      profile = "slick.jdbc.PostgresProfile$"
      db {
        host = "localhost"
        host = ${?DB_HOST}
        url = "jdbc:postgresql://"${akka-persistence-jdbc.shared-databases.slick.db.host}":5432/docker?reWriteBatchedInserts=true"
        user = "docker"
        password = "docker"
        driver = "org.postgresql.Driver"
        numThreads = 5
        maxConnections = 5
        minConnections = 1
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "slick"
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  use-shared-db = "slick"
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  use-shared-db = "slick"
}

# the akka-persistence-jdbc provider in use for durable state store
jdbc-durable-state-store {
  use-shared-db = "slick"
}

another-jdbc-durable-state-store = ${jdbc-durable-state-store}
```

### Example 9: Sharing the database connection pool between the journals

```conf
# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

akka-persistence-jdbc {
  shared-databases {
    slick {
      profile = "slick.jdbc.MySQLProfile$"
      db {
        host = ${docker.host}
        host = ${?DB_HOST}
        url = "jdbc:mysql://"${akka-persistence-jdbc.shared-databases.slick.db.host}":3306/docker?cachePrepStmts=true&cacheCallableStmts=true&cacheServerConfiguration=true&useLocalSessionState=true&elideSetAutoCommits=true&alwaysSendSetIsolation=false&enableQueryTimeouts=false&connectionAttributes=none&verifyServerCertificate=false&useSSL=false&allowPublicKeyRetrieval=true&useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC&rewriteBatchedStatements=true"
        user = "root"
        password = "root"
        driver = "com.mysql.cj.jdbc.Driver"
        numThreads = 5
        maxConnections = 5
        minConnections = 1
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "slick"
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  use-shared-db = "slick"
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  use-shared-db = "slick"
}

# the akka-persistence-jdbc provider in use for durable state store
jdbc-durable-state-store {
  use-shared-db = "slick"
}
```

### Example 10: Sharing the database connection pool between the journals

```conf
# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

akka-persistence-jdbc {
  shared-databases {
    slick {
      profile = "slick.jdbc.H2Profile$"
      db {
        url = "jdbc:h2:mem:test-database;DATABASE_TO_UPPER=false;"
        user = "root"
        password = "root"
        driver = "org.h2.Driver"
        numThreads = 5
        maxConnections = 5
        minConnections = 1
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "slick"
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  use-shared-db = "slick"
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  use-shared-db = "slick"
}
```

### Example 11: Sharing the database connection pool between the journals

```conf
# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

include "general.conf"
include "oracle-schema-overrides.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

akka-persistence-jdbc {
  shared-databases {
    slick {
      profile = "slick.jdbc.OracleProfile$"
      db {
        host = ${docker.host}
        host = ${?DB_HOST}
        url = "jdbc:oracle:thin:@//"${akka-persistence-jdbc.shared-databases.slick.db.host}":1521/xe"
        user = "system"
        password = "oracle"
        driver = "oracle.jdbc.OracleDriver"
        numThreads = 5
        maxConnections = 5
        minConnections = 1
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "slick"
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  use-shared-db = "slick"
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  use-shared-db = "slick"
}
```

### Example 12: Sharing the database connection pool between the journals

```conf
# Copyright 2016 Dennis Vriend
# Copyright (C) 2019 - 2022 Lightbend Inc. <https://www.lightbend.com>

include "general.conf"

akka {
  persistence {
    journal {
      plugin = "jdbc-journal"
      // Enable the line below to automatically start the journal when the actorsystem is started
      // auto-start-journals = ["jdbc-journal"]
    }
    snapshot-store {
      plugin = "jdbc-snapshot-store"
      // Enable the line below to automatically start the snapshot-store when the actorsystem is started
      // auto-start-snapshot-stores = ["jdbc-snapshot-store"]
    }
  }
}

akka-persistence-jdbc {
  shared-databases {
    slick {
      profile = "slick.jdbc.SQLServerProfile$"
      db {
        host = ${docker.host}
        host = ${?DB_HOST}
        url = "jdbc:sqlserver://"${akka-persistence-jdbc.shared-databases.slick.db.host}":1433;databaseName=docker;integratedSecurity=false;"
        user = "sa"
        password = "docker123abc#"
        driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
        numThreads = 5
        maxConnections = 5
        minConnections = 1
      }
    }
  }
}

jdbc-journal {
  use-shared-db = "slick"
}

# the akka-persistence-snapshot-store in use
jdbc-snapshot-store {
  use-shared-db = "slick"
}

# the akka-persistence-query provider in use
jdbc-read-journal {
  use-shared-db = "slick"
}
```

### Example 13: Customized loading of the db connection

```hocon
akka-persistence-jdbc {
  database-provider-fqcn = "com.mypackage.CustomSlickDatabaseProvider"
}
jdbc-journal {
  use-shared-db = "enabled" // setting this to any non-empty string prevents the journal from closing the database on shutdown
}
jdbc-snapshot-store {
  use-shared-db = "enabled" // setting this to any non-empty string prevents the snapshot-journal from closing the database on shutdown
}
```

### Example 14: DataSource lookup by JNDI name

```hocon
jdbc-journal {
  slick {
    profile = "slick.jdbc.PostgresProfile$"
    jndiName = "java:jboss/datasources/PostgresDS"
  }
}
```

### Example 15: DataSource lookup by JNDI name

```hocon
akka-persistence-jdbc {
  shared-databases {
    slick {
      profile = "slick.jdbc.PostgresProfile$"
      jndiName = "java:/jboss/datasources/bla"
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/migration.html
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/overview.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-jdbc/current/configuration.html](https://doc.akka.io/libraries/akka-persistence-jdbc/current/configuration.html)*
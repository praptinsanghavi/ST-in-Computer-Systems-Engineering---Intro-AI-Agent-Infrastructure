---
description: An Akka Persistence plugin backed by Amazon DynamoDB
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-dynamodb/current/getting-started.html
title: Getting Started • Akka Persistence DynamoDB Documentation
---

# Getting Started • Akka Persistence DynamoDB Documentation

> **Summary:** An Akka Persistence plugin backed by Amazon DynamoDB

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

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
    <artifactId>akka-persistence-dynamodb_${scala.binary.version}</artifactId>
    <version>2.0.10</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-dynamodb" % "2.0.10"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-dynamodb_${versions.ScalaBinary}:2.0.10"
}
```

This plugin depends on Akka 2\.10\.11 or later, and note that it is important that all `akka-*` dependencies are in the same version, so it is recommended to depend on them explicitly to avoid problems with transient dependencies causing an unlucky mix of versions.

The plugin is published for Scala 2\.13 and 3\.3\.

## Enabling

To enable the plugins to be used by default, add the following line to your Akka `application.conf`:

```
akka.persistence.journal.plugin = "akka.persistence.dynamodb.journal"
akka.persistence.snapshot-store.plugin = "akka.persistence.dynamodb.snapshot"

```

More information about each individual plugin in:

- [journal](journal.html)
- [snapshot store](snapshots.html)
- [queries](query.html)

## Local testing with docker

[DynamoDB local](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DynamoDBLocal.html) can be run in Docker. Here’s an example docker compose file:

```
[source](https://github.com/akka/akka-persistence-dynamodb/tree/v2.0.10/docker/docker-compose.yml "Go to snippet source")version: '3.8'
services:
  dynamodb-local:
    command: "-jar DynamoDBLocal.jar -sharedDb -inMemory"
    image: "amazon/dynamodb-local:latest"
    container_name: dynamodb-local
    ports:
      - "8000:8000"
    working_dir: /home/dynamodblocal
```

Start with:

```
docker compose -f docker/docker-compose.yml up

```

### Client local mode

The DynamoDB client [can be configured](config.html#dynamodb-client-configuration) with a local mode, for testing with DynamoDB local:

```
[source](https://github.com/akka/akka-persistence-dynamodb/tree/v2.0.10/docs/src/test/scala/docs/scaladsl/CreateTablesDocExample.scala#L27-L29 "Go to snippet source")akka.persistence.dynamodb {
  client.local.enabled = true
}
```

### Creating tables locally

A [`CreateTables`](/api/akka-persistence-dynamodb/2.0.10/akka/persistence/dynamodb/util/javadsl/CreateTables$.html "akka.persistence.dynamodb.util.javadsl.CreateTables")[`CreateTables`](/api/akka-persistence-dynamodb/2.0.10/akka/persistence/dynamodb/util/scaladsl/CreateTables$.html "akka.persistence.dynamodb.util.scaladsl.CreateTables") utility is provided for creating tables locally:

Java

```
[source](https://github.com/akka/akka-persistence-dynamodb/tree/v2.0.10/docs/src/test/java/docs/javadsl/CreateTablesDocExample.java#L12-L39 "Go to snippet source")import akka.persistence.dynamodb.DynamoDBSettings;
import akka.persistence.dynamodb.util.ClientProvider;
import akka.persistence.dynamodb.util.javadsl.CreateTables;
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient;

String dynamoDBConfigPath = "akka.persistence.dynamodb";
String dynamoDBClientConfigPath = dynamoDBConfigPath + ".client";

DynamoDBSettings settings =
    DynamoDBSettings.create(system.settings().config().getConfig(dynamoDBConfigPath));

DynamoDbAsyncClient client = ClientProvider.get(system).clientFor(dynamoDBClientConfigPath);

// create journal table, synchronously
CreateTables.createJournalTable(system, settings, client, /*deleteIfExists:*/ true)
    .toCompletableFuture()
    .get(10, TimeUnit.SECONDS);

// create snapshot table, synchronously
CreateTables.createSnapshotsTable(system, settings, client, /*deleteIfExists:*/ true)
    .toCompletableFuture()
    .get(10, TimeUnit.SECONDS);
```

Scala

```
[source](https://github.com/akka/akka-persistence-dynamodb/tree/v2.0.10/docs/src/test/scala/docs/scaladsl/CreateTablesDocExample.scala#L17-L53 "Go to snippet source")import akka.persistence.dynamodb.DynamoDBSettings
import akka.persistence.dynamodb.util.ClientProvider
import akka.persistence.dynamodb.util.scaladsl.CreateTables
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

val dynamoDBConfigPath = "akka.persistence.dynamodb"
val dynamoDBClientConfigPath = dynamoDBConfigPath + ".client"

val settings: DynamoDBSettings = DynamoDBSettings(system.settings.config.getConfig(dynamoDBConfigPath))
val client: DynamoDbAsyncClient = ClientProvider(system).clientFor(dynamoDBClientConfigPath)

// create journal table, synchronously
Await.result(CreateTables.createJournalTable(system, settings, client, deleteIfExists = true), 10.seconds)

// create snapshot table, synchronously
Await.result(CreateTables.createSnapshotsTable(system, settings, client, deleteIfExists = true), 10.seconds)
```

See the table definitions in the individual plugins for more information on the tables that are required:

- [journal tables](journal.html#tables)
- [snapshot tables](snapshots.html#tables)
- [projection tables](https://doc.akka.io/libraries/akka-projection/1.6/dynamodb.html#tables)

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
    <artifactId>akka-persistence-dynamodb_${scala.binary.version}</artifactId>
    <version>2.0.10</version>
  </dependency&gt
</dependencies>
```

### Example 5: Dependencies

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-dynamodb" % "2.0.10"
```

### Example 6: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-dynamodb_${versions.ScalaBinary}:2.0.10"
}
```

### Example 7: Enabling

```text
akka.persistence.journal.plugin = "akka.persistence.dynamodb.journal"
akka.persistence.snapshot-store.plugin = "akka.persistence.dynamodb.snapshot"
```

### Example 8: Local testing with docker

```yml
version: '3.8'
services:
  dynamodb-local:
    command: "-jar DynamoDBLocal.jar -sharedDb -inMemory"
    image: "amazon/dynamodb-local:latest"
    container_name: dynamodb-local
    ports:
      - "8000:8000"
    working_dir: /home/dynamodblocal
```

### Example 9: Local testing with docker

```text
docker compose -f docker/docker-compose.yml up
```

### Example 10: Client local mode

```scala
akka.persistence.dynamodb {
  client.local.enabled = true
}
```

### Example 11: Creating tables locally

```java
import akka.persistence.dynamodb.DynamoDBSettings;
import akka.persistence.dynamodb.util.ClientProvider;
import akka.persistence.dynamodb.util.javadsl.CreateTables;
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient;

String dynamoDBConfigPath = "akka.persistence.dynamodb";
String dynamoDBClientConfigPath = dynamoDBConfigPath + ".client";

DynamoDBSettings settings =
    DynamoDBSettings.create(system.settings().config().getConfig(dynamoDBConfigPath));

DynamoDbAsyncClient client = ClientProvider.get(system).clientFor(dynamoDBClientConfigPath);

// create journal table, synchronously
CreateTables.createJournalTable(system, settings, client, /*deleteIfExists:*/ true)
    .toCompletableFuture()
    .get(10, TimeUnit.SECONDS);

// create snapshot table, synchronously
CreateTables.createSnapshotsTable(system, settings, client, /*deleteIfExists:*/ true)
    .toCompletableFuture()
    .get(10, TimeUnit.SECONDS);
```

### Example 12: Creating tables locally

```scala
import akka.persistence.dynamodb.DynamoDBSettings
import akka.persistence.dynamodb.util.ClientProvider
import akka.persistence.dynamodb.util.scaladsl.CreateTables
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

val dynamoDBConfigPath = "akka.persistence.dynamodb"
val dynamoDBClientConfigPath = dynamoDBConfigPath + ".client"

val settings: DynamoDBSettings = DynamoDBSettings(system.settings.config.getConfig(dynamoDBConfigPath))
val client: DynamoDbAsyncClient = ClientProvider(system).clientFor(dynamoDBClientConfigPath)

// create journal table, synchronously
Await.result(CreateTables.createJournalTable(system, settings, client, deleteIfExists = true), 10.seconds)

// create snapshot table, synchronously
Await.result(CreateTables.createSnapshotsTable(system, settings, client, deleteIfExists = true), 10.seconds)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-persistence-dynamodb/2.0.10/akka/persistence/dynamodb/util/javadsl/CreateTables$.html
- https://doc.akka.io/api/akka-persistence-dynamodb/2.0.10/akka/persistence/dynamodb/util/scaladsl/CreateTables$.html
- https://doc.akka.io/libraries/akka-persistence-dynamodb/current/config.html
- https://doc.akka.io/libraries/akka-persistence-dynamodb/current/journal.html
- https://doc.akka.io/libraries/akka-persistence-dynamodb/current/overview.html
- https://doc.akka.io/libraries/akka-persistence-dynamodb/current/query.html
- https://doc.akka.io/libraries/akka-persistence-dynamodb/current/snapshots.html
- https://doc.akka.io/libraries/akka-projection/1.6/dynamodb.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-dynamodb/current/getting-started.html](https://doc.akka.io/libraries/akka-persistence-dynamodb/current/getting-started.html)*
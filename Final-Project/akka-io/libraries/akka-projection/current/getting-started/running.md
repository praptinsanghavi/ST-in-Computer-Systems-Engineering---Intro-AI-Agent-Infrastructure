---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:45:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/getting-started/running.html
title: Running the Projection • Akka Projection
---

# Running the Projection • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Running the Projection

Note
This example requires a Cassandra database to run. If you do not have a Cassandra database then you can run one locally as a Docker container. To run a Cassandra database locally you can use [`docker-compose`](https://docs.docker.com/compose/) to run the [`docker-compose.yaml`](https://raw.githubusercontent.com/akka/akka-projection/main/docker-compose.yml) found in the Projections project root. The `docker-compose.yml` file references the latest [Cassandra Docker Image](https://hub.docker.com/_/cassandra).

Change directory to the directory of the `docker-compose.yml` file and manage a Cassandra container with the following commands.

| Action | Docker Command |
| --- | --- |
| Run | `docker-compose --project-name getting-started up -d cassandra` |
| Stop | `docker-compose --project-name getting-started stop` |
| Delete container state | `docker-compose --project-name getting-started rm -f` |
| CQL shell (when running) | `docker run -it --network getting-started_default --rm cassandra cqlsh cassandra` |

To use a different Cassandra database update the [Cassandra driver’s contact\-points configuration](https://doc.akka.io/libraries/akka-persistence-cassandra/current/configuration.html#contact-points-configuration) found in `./examples/src/resources/guide-shopping-cart-app.conf`.

To run the Projection we must setup our Cassandra database to support the Cassandra Projection offset store as well as the new table we are *projecting* into with the `ItemPopularityProjectionHandler`.

Create a Cassandra keyspace.

```
CREATE KEYSPACE IF NOT EXISTS akka_projection WITH REPLICATION = { 'class' : 'SimpleStrategy','replication_factor':1 };

```

Create the Cassandra Projection offset store table. The DDL can be found in the [Cassandra Projection, Schema section](../cassandra.html#schema).

Create the `ItemPopularityProjectionHandler` projection table with the DDL below

```
CREATE TABLE IF NOT EXISTS akka_projection.item_popularity (
item_id text,
count counter,
PRIMARY KEY (item_id));

```

Source events are generated with the `EventGeneratorApp`. This app is configured to use [Akka Persistence Cassandra](https://doc.akka.io/libraries/akka-persistence-cassandra/current/index.html) and [Akka Cluster](https://doc.akka.io/libraries/akka-core/current/typed/cluster.html) [Sharding](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html) to persist random `ShoppingCartApp.Events` to a journal. It will checkout a shopping cart with random items and quantities every 1 second. The app will automatically create all the Akka Persistence infrastructure tables in the `akka` keyspace. We won’t go into any further detail about how this app functions because it falls outside the scope of Akka Projections. To learn more about the writing events with [Akka Persistence see the Akka documentation](https://doc.akka.io/libraries/akka-core/current/typed/index-persistence.html).

Add the Akka Cluster Sharding library to your project:

sbt
```
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding-typed" % "2.10.13"
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
    <version>2.10.13</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}:2.10.13"
}
```

Add the [EventGeneratorApp](event-generator-app.html) to your project.

Run `EventGeneratorApp`:

sbt

```
sbt "runMain docs.guide.EventGeneratorApp"

```

Maven

```
mvn compile exec:java -Dexec.mainClass="jdocs.guide.EventGeneratorApp"

```

If you don’t see any connection exceptions then you should eventually see log lines produced indicating that events are written to the journal.

Ex)

```
[2020-08-13 15:20:05,583] [INFO] [docs.guide.EventGeneratorApp$] [] [EventGenerator-akka.actor.default-dispatcher-22] - id [cb52b] tag [shopping-cart] event: ItemQuantityAdjusted(cb52b,skis,1,1) MDC: {persistencePhase=persist-evt, akkaAddress=akka://[[email protected]](/cdn-cgi/l/email-protection):25520, akkaSource=akka://EventGenerator/system/sharding/shopping-cart-event/678/cb52b, sourceActorSystem=EventGenerator, persistenceId=cb52b}

```

Finally, we can run `ShoppingCartApp` in a new terminal:

sbt

```
sbt "runMain docs.guide.ShoppingCartApp"

```

Maven

```
mvn compile exec:java -Dexec.mainClass="jdocs.guide.ShoppingCartApp"

```

After a few seconds you should see the `ItemPopularityProjectionHandler` logging that displays the current checkouts for the day:

```
[2020-08-12 12:16:34,216] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartApp-akka.actor.default-dispatcher-10] - ItemPopularityProjectionHandler(shopping-cart) item popularity for 'bowling shoes': [58]

```

Use the CQL shell to observe the full information in the `item_popularity` table.

```
cqlsh> SELECT item_id, count FROM akka_projection.item_popularity;

 item_id       | count
---------------+-------
  akka t-shirt |    37
   cat t-shirt |    34
          skis |    33
 bowling shoes |    65

(4 rows)

```

## Code Examples

### Example 1: Running the Projection

```text
CREATE KEYSPACE IF NOT EXISTS akka_projection WITH REPLICATION = { 'class' : 'SimpleStrategy','replication_factor':1 };
```

### Example 2: Running the Projection

```text
CREATE TABLE IF NOT EXISTS akka_projection.item_popularity (
item_id text,
count counter,
PRIMARY KEY (item_id));
```

### Example 3: Running the Projection

```scala
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding-typed" % "2.10.13"
```

### Example 4: Running the Projection

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
    <version>2.10.13</version>
  </dependency&gt
</dependencies>
```

### Example 5: Running the Projection

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}:2.10.13"
}
```

### Example 6: Running the Projection

```text
sbt "runMain docs.guide.EventGeneratorApp"
```

### Example 7: Running the Projection

```text
mvn compile exec:java -Dexec.mainClass="jdocs.guide.EventGeneratorApp"
```

### Example 8: Running the Projection

```shell
[2020-08-13 15:20:05,583] [INFO] [docs.guide.EventGeneratorApp$] [] [EventGenerator-akka.actor.default-dispatcher-22] - id [cb52b] tag [shopping-cart] event: ItemQuantityAdjusted(cb52b,skis,1,1) MDC: {persistencePhase=persist-evt, akkaAddress=akka://[email protected]:25520, akkaSource=akka://EventGenerator/system/sharding/shopping-cart-event/678/cb52b, sourceActorSystem=EventGenerator, persistenceId=cb52b}
```

### Example 9: Running the Projection

```text
sbt "runMain docs.guide.ShoppingCartApp"
```

### Example 10: Running the Projection

```text
mvn compile exec:java -Dexec.mainClass="jdocs.guide.ShoppingCartApp"
```

### Example 11: Running the Projection

```shell
[2020-08-12 12:16:34,216] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartApp-akka.actor.default-dispatcher-10] - ItemPopularityProjectionHandler(shopping-cart) item popularity for 'bowling shoes': [58]
```

### Example 12: Running the Projection

```text
cqlsh> SELECT item_id, count FROM akka_projection.item_popularity;

 item_id       | count
---------------+-------
  akka t-shirt |    37
   cat t-shirt |    34
          skis |    33
 bowling shoes |    65

(4 rows)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster.html
- https://doc.akka.io/libraries/akka-core/current/typed/index-persistence.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/configuration.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/index.html
- https://doc.akka.io/libraries/akka-projection/current/cassandra.html
- https://doc.akka.io/libraries/akka-projection/current/getting-started/event-generator-app.html
- https://doc.akka.io/libraries/akka-projection/current/getting-started/running-cluster.html
- https://doc.akka.io/libraries/akka-projection/current/getting-started/testing.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/getting-started/running.html](https://doc.akka.io/libraries/akka-projection/current/getting-started/running.html)*
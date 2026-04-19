---
description: Query side to Akka Persistence allowing for building CQRS applications
  using durable state.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:44:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/durable-state/persistence-query.html
title: Persistence Query • Akka Documentation
---

# Persistence Query • Akka Documentation

> **Summary:** Query side to Akka Persistence allowing for building CQRS applications using durable state.

## Content

# Persistence Query

## Dependency

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/maven")

```
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
Gradle
```
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}

```

To use Persistence Query, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.9.8"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-query" % AkkaVersion
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.9.8</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.9.8")

  implementation "com.typesafe.akka:akka-persistence-query_${versions.ScalaBinary}"
}
```

This will also add dependency on the [Akka Persistence](../persistence.html) module.

## Introduction

Akka persistence query provides a query interface to [Durable State Behaviors](../typed/durable-state/persistence.html). These queries are based on asynchronous streams. These streams are similar to the ones offered in the [Event Sourcing](../persistence-query.html) based implementation. Various state store plugins can implement these interfaces to expose their query capabilities.

One of the rationales behind having a separate query module for Akka Persistence is for implementing the so\-called query side or read side in the popular CQRS architecture pattern \- in which the writing side of the application implemented using Akka persistence, is completely separated from the query side.

Alternative
When using the R2DBC plugin an alternative to using Akka persistence query or Projection is to [store the query representation](https://doc.akka.io/docs/akka-persistence-r2dbc/current/durable-state-store.html#storing-query-representation) directly from the write side.

## Using query with Akka Projections

Akka Persistence and Akka Projections together can be used to develop a CQRS application. In the application the durable state is stored in a database and fetched as an asynchronous stream to the user. Currently queries on durable state, provided by the `DurableStateStoreQuery` interface, is used to implement tag based searches in Akka Projections. 

At present the query is based on *tags*. So if you have not tagged your objects, this query cannot be used.

The example below shows how to get the `DurableStateStoreQuery` from the `DurableStateStoreRegistry` extension.

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/DurableStateStoreQueryUsageCompileOnlySpec.scala#L17-L28 "Go to snippet source")import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.query.scaladsl.DurableStateStoreQuery
import akka.persistence.query.DurableStateChange
import akka.persistence.query.UpdatedDurableState

val durableStateStoreQuery =
  DurableStateStoreRegistry(system).durableStateStoreFor[DurableStateStoreQuery[Record]](pluginId)
val source: Source[DurableStateChange[Record], NotUsed] = durableStateStoreQuery.changes("tag", offset)
source.map {
  case UpdatedDurableState(persistenceId, revision, value, offset, timestamp) => Some(value)
  case _: DeletedDurableState[_]                                              => None
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/DurableStateStoreQueryUsageCompileOnlyTest.java#L13-L39 "Go to snippet source")import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.query.javadsl.DurableStateStoreQuery;
import akka.persistence.query.DurableStateChange;
import akka.persistence.query.UpdatedDurableState;

DurableStateStoreQuery<Record> durableStateStoreQuery =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(DurableStateStoreQuery.class, pluginId);
Source<DurableStateChange<Record>, NotUsed> source =
    durableStateStoreQuery.changes("tag", offset);
source.map(
    chg -> {
      if (chg instanceof UpdatedDurableState) {
        UpdatedDurableState<Record> upd = (UpdatedDurableState<Record>) chg;
        return upd.value();
      } else {
        throw new IllegalArgumentException("Unexpected DurableStateChange " + chg.getClass());
      }
    });
```

The [`DurableStateChange`](https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/DurableStateChange.html "akka.persistence.query.DurableStateChange")[`DurableStateChange`](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/DurableStateChange.html "akka.persistence.query.DurableStateChange") elements can be `UpdatedDurableState` or `DeletedDurableState`.

## Code Examples

### Example 1: Dependency

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 2: Dependency

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

### Example 3: Dependency

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Dependency

```scala
val AkkaVersion = "2.9.8"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-query" % AkkaVersion
```

### Example 5: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.9.8</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 6: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.9.8")

  implementation "com.typesafe.akka:akka-persistence-query_${versions.ScalaBinary}"
}
```

### Example 7: Using query with Akka Projections

```scala
import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.query.scaladsl.DurableStateStoreQuery
import akka.persistence.query.DurableStateChange
import akka.persistence.query.UpdatedDurableState

val durableStateStoreQuery =
  DurableStateStoreRegistry(system).durableStateStoreFor[DurableStateStoreQuery[Record]](pluginId)
val source: Source[DurableStateChange[Record], NotUsed] = durableStateStoreQuery.changes("tag", offset)
source.map {
  case UpdatedDurableState(persistenceId, revision, value, offset, timestamp) => Some(value)
  case _: DeletedDurableState[_]                                              => None
}
```

### Example 8: Using query with Akka Projections

```java
import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.query.javadsl.DurableStateStoreQuery;
import akka.persistence.query.DurableStateChange;
import akka.persistence.query.UpdatedDurableState;

DurableStateStoreQuery<Record> durableStateStoreQuery =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(DurableStateStoreQuery.class, pluginId);
Source<DurableStateChange<Record>, NotUsed> source =
    durableStateStoreQuery.changes("tag", offset);
source.map(
    chg -> {
      if (chg instanceof UpdatedDurableState) {
        UpdatedDurableState<Record> upd = (UpdatedDurableState<Record>) chg;
        return upd.value();
      } else {
        throw new IllegalArgumentException("Unexpected DurableStateChange " + chg.getClass());
      }
    });
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/docs/akka-persistence-r2dbc/current/durable-state-store.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/libraries/akka-core/2.9/durable-state/state-store-plugin.html
- https://doc.akka.io/libraries/akka-core/2.9/persistence-query.html
- https://doc.akka.io/libraries/akka-core/2.9/persistence.html
- https://doc.akka.io/libraries/akka-core/2.9/typed/durable-state/cqrs.html
- https://doc.akka.io/libraries/akka-core/2.9/typed/durable-state/persistence.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.9/durable-state/persistence-query.html](https://doc.akka.io/libraries/akka-core/2.9/durable-state/persistence-query.html)*
---
description: Akka library dependencies
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:50:19Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/docs/akka-dependencies/current/index.html
title: Akka library versions
---

# Akka library versions

> **Summary:** Akka library dependencies

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Akka library versions 25\.10

This table lists all Akka libraries that are part of the Akka 25\.10 release along with their current versions.

Akka 25\.10\.7 is cross\-built for Scala 2\.13 and Scala 3\.3\. Akka is certified for use with certain Java versions, see [Java Versions](java-versions.html).

Some libraries in Akka do not live up to the high standards we require to fully support them for Akka Licensees. Libraries are marked with their [readiness level](support-terminology.html) in the “project info” section of their documentation.

Akka is licensed under the Business Source License 1\.1, please see [Akka License FAQ](https://www.lightbend.com/akka/license-faq).

| Module | Current version | Documentation |
| --- | --- | --- |
| Akka Dependencies BOM | 25\.10\.7 |  |
| Akka (core) | 2\.10\.17 | [Documentation](https://doc.akka.io/libraries/akka-core/current/) [JavaDoc](https://doc.akka.io/japi/akka/current/index.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/) |
| Akka Actors | 2\.10\.17 | [Documentation](https://doc.akka.io/libraries/akka-core/current/typed/index.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/actor/typed/index.html) |
| Akka Cluster | 2\.10\.17 | [Documentation](https://doc.akka.io/libraries/akka-core/current/typed/index-cluster.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/cluster/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/cluster/index.html) |
| Akka Event Sourcing | 2\.10\.17 | [Documentation](https://doc.akka.io/libraries/akka-core/current/typed/index-persistence.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/persistence/typed/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html) |
| Akka Durable State | 2\.10\.17 | [Documentation](https://doc.akka.io/libraries/akka-core/current/typed/index-persistence-durable-state.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/index.html) |
| Akka Streams | 2\.10\.17 | [Documentation](https://doc.akka.io/libraries/akka-core/current/stream/index.html) [Operators](https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/stream/index.html) |
| Akka gRPC | 2\.5\.10 | [Documentation](https://doc.akka.io/libraries/akka-grpc/current/) [ScalaDoc](https://doc.akka.io/api/akka-grpc/current/akka/grpc/) |
| Akka HTTP | 10\.7\.3 | [Documentation](https://doc.akka.io/libraries/akka-http/current/) [Predefined Directives](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/alphabetically.html) [JavaDoc](https://doc.akka.io/japi/akka-http/current/) [ScalaDoc](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html) |
| Akka Persistence plugin for Cassandra | 1\.3\.4 | [Documentation](https://doc.akka.io/libraries/akka-persistence-cassandra/current/) |
| Akka Persistence plugin for JDBC | 5\.5\.4 | [Documentation](https://doc.akka.io/libraries/akka-persistence-jdbc/current/) |
| Akka Persistence plugin for R2DBC | 1\.3\.12 | [Documentation](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/) |
| Akka Persistence plugin for DynamoDB | 2\.0\.11 | [Documentation](https://doc.akka.io/libraries/akka-persistence-dynamodb/current/) |
| Akka Projections | 1\.6\.20 | [Documentation](https://doc.akka.io/libraries/akka-projection/current/) |
| Akka Management | 1\.6\.4 | [Documentation](https://doc.akka.io/libraries/akka-management/current/) |
| Akka Diagnostics | 2\.2\.3 | [Documentation](https://doc.akka.io/libraries/akka-diagnostics/current/) |
| Alpakka | 10\.0\.1 | [Documentation](https://doc.akka.io/docs/alpakka/current/) |
| Alpakka Kafka | 8\.0\.0 | [Documentation](https://doc.akka.io/docs/alpakka-kafka/current/) |
| Akka Edge Rust | 0\.8\.0 | [Guide](https://doc.akka.io/libraries/akka-edge/current/guide-rs.html) [API](https://doc.akka.io/api/akka-edge-rs/current/) |

## Repository

> \[!TIP] The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Maven
```
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/{your repository token here}/secure</url>
    </repository>
  </repositories&gt
</project>

```
sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/{your repository token here}/secure")

```
Gradle
```
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/{your repository token here}/secure"
    }
}

```

## Akka (core) 2\.10\.17

At the core of Akka: A model for concurrency and distribution without all the pain of threading primitives.

[Documentation](https://doc.akka.io/libraries/akka-core/current/) [JavaDoc](https://doc.akka.io/japi/akka/current/index.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/) [Migration guides](https://doc.akka.io/libraries/akka-core/current/project/migration-guides.html)

#### Complete dependency listing of Akka core libraries

Check the [documentation](https://doc.akka.io/libraries/akka-core/current/) to learn which dependencies you require. 

Maven
```
<properties>
  <akka.version>2.10.17</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-tools_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-distributed-data_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-multi-node-testkit_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
    <scope>test</scope>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-tck_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-protobuf-v3_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-remote_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor-testkit-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
    <scope>test</scope>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-slf4j_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
    <scope>test</scope>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-testkit_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-testkit_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-coordination_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-metrics_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```
sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools" % AkkaVersion,
  "com.typesafe.akka" %% "akka-discovery" % AkkaVersion,
  "com.typesafe.akka" %% "akka-distributed-data" % AkkaVersion,
  "com.typesafe.akka" %% "akka-multi-node-testkit" % AkkaVersion % Test,
  "com.typesafe.akka" %% "akka-persistence" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-tck" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-query" % AkkaVersion,
  "com.typesafe.akka" %% "akka-protobuf-v3" % AkkaVersion,
  "com.typesafe.akka" %% "akka-remote" % AkkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test,
  "com.typesafe.akka" %% "akka-slf4j" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % AkkaVersion,
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-coordination" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-metrics" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-sharding" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-sharding-typed" % AkkaVersion
)
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.17",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster-tools_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-distributed-data_${versions.ScalaBinary}:${versions.AkkaVersion}"
  testImplementation "com.typesafe.akka:akka-multi-node-testkit_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-persistence_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-persistence-tck_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-persistence-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-persistence-query_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-protobuf-v3_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-remote_${versions.ScalaBinary}:${versions.AkkaVersion}"
  testImplementation "com.typesafe.akka:akka-actor-testkit-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-slf4j_${versions.ScalaBinary}:${versions.AkkaVersion}"
  testImplementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-stream-testkit_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-stream-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-testkit_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-actor-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-coordination_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster-metrics_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster-sharding_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Akka Actors

The Actor Model provides a higher level of abstraction for writing concurrent and distributed systems. It alleviates the developer from having to deal with explicit locking and thread management, making it easier to write correct concurrent and parallel systems.

[Documentation](https://doc.akka.io/libraries/akka-core/current/typed/index.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/actor/typed/index.html)

### Akka Cluster

Akka Cluster provides a fault\-tolerant decentralized peer\-to\-peer based Cluster Membership Service with no single point of failure or single point of bottleneck. It does this using gossip protocols and an automatic failure detector.

[Documentation](https://doc.akka.io/libraries/akka-core/current/typed/index-cluster.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/cluster/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/cluster/index.html)

### Akka Event Sourcing

Akka Persistence enables stateful actors to persist their state so that it can be recovered when an actor is either restarted, such as after a JVM crash, by a supervisor or a manual stop\-start, or migrated within a cluster.

[Documentation](https://doc.akka.io/libraries/akka-core/current/typed/index-persistence.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/persistence/typed/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html)

### Akka Durable State

Enables stateful actors to persist their latest state, so that it can be recovered when an actor is restarted.

[Documentation](https://doc.akka.io/libraries/akka-core/current/typed/index-persistence-durable-state.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/index.html)

### Akka Streams

An intuitive and safe way to do asynchronous, non\-blocking backpressured stream processing.

[Documentation](https://doc.akka.io/libraries/akka-core/current/stream/index.html) [Operators](https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html) 

[JavaDoc](https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/stream/index.html)

## Akka gRPC 2\.5\.10

Akka gRPC provides support for building streaming gRPC servers and clients on top of Akka Streams and Akka HTTP.

[Documentation](https://doc.akka.io/libraries/akka-grpc/current/) [ScalaDoc](https://doc.akka.io/api/akka-grpc/current/akka/grpc/)

Maven

```
<project>
  <modelVersion>4.0.0</modelVersion>
  <name>Project name</name>
  <groupId>com.example</groupId>
  <artifactId>my-grpc-app</artifactId>
  <version>0.1-SNAPSHOT</version>
  <properties>
    <akka.grpc.version>2.5.10</akka.grpc.version>
    <project.encoding>UTF-8</project.encoding>
  </properties>
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/{your repository token here}/secure</url>
    </repository>
  </repositories>
  <pluginRepositories>
    <pluginRepository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/{your repository token here}/secure</url>
    </pluginRepository>
  </pluginRepositories>
  <dependencies>
    <dependency>
      <groupId>com.lightbend.akka.grpc</groupId>
      <artifactId>akka-grpc-runtime_2.13</artifactId>
      <version>${akka.grpc.version}</version>
    </dependency>
  </dependencies>
  <build>
    <plugins>
      <plugin>
        <groupId>com.lightbend.akka.grpc</groupId>
        <artifactId>akka-grpc-maven-plugin</artifactId>
        <version>${akka.grpc.version}</version>
        <executions>
          <execution>
            <goals>
              <goal>generate</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
    </plugins>
  </build>
</project>

```

sbt

```
// in project/plugins.sbt:
resolvers += "Akka library repository".at("https://repo.akka.io/{your repository token here}/secure")
addSbtPlugin("com.lightbend.akka.grpc" % "sbt-akka-grpc" % "2.5.10")
//
// in build.sbt:
resolvers += "Akka library repository".at("https://repo.akka.io/{your repository token here}/secure")
enablePlugins(AkkaGrpcPlugin)

```

Gradle

```
buildscript {
  repositories {
    gradlePluginPortal()
    maven {
      url "https://repo.akka.io/{your repository token here}/secure"
    }
  }
}
plugins {
  id 'java'
  id 'application'
  id 'com.lightbend.akka.grpc.gradle' version '2.5.10'
}
repositories {
  mavenCentral()
  maven {
    url "https://repo.akka.io/{your repository token here}/secure"
  }
}

```

## Akka HTTP 10\.7\.3

The Akka HTTP libraries implement a full server\- and client\-side HTTP stack on top of Akka Actors and Akka Streams.

[Documentation](https://doc.akka.io/libraries/akka-http/current/) [Predefined Directives](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/alphabetically.html) [Migration guides](https://doc.akka.io/libraries/akka-http/current/migration-guide/index.html)

[JavaDoc](https://doc.akka.io/japi/akka-http/current/) [ScalaDoc](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html)

#### Complete dependency listing of Akka HTTP libraries

Check the [documentation](https://doc.akka.io/libraries/akka-http/current/) to learn which dependencies you require.

Maven
```
<properties>
  <akka.http.version>10.7.3</akka.http.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-core_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-jackson_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-spray-json_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-testkit_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
    <scope>test</scope>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-xml_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
  </dependency&gt
</dependencies>
```
sbt
```
val AkkaHttpVersion = "10.7.3"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-core" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-jackson" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % AkkaHttpVersion % Test,
  "com.typesafe.akka" %% "akka-http-xml" % AkkaHttpVersion
)
```
Gradle
```
def versions = [
  AkkaHttpVersion: "10.7.3",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-http_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
  implementation "com.typesafe.akka:akka-http-core_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
  implementation "com.typesafe.akka:akka-http-jackson_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
  implementation "com.typesafe.akka:akka-http-spray-json_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
  testImplementation "com.typesafe.akka:akka-http-testkit_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
  implementation "com.typesafe.akka:akka-http-xml_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
}
```

## Akka Persistence plugin for Cassandra 1\.3\.4

The Akka Persistence Cassandra plugin allows for using Apache Cassandra as a backend for [Akka Persistence](https://doc.akka.io/libraries/akka-core/current/typed/index-persistence.html) and [Akka Persistence Query](https://doc.akka.io/libraries/akka-core/current/persistence-query.html).

[Documentation](https://doc.akka.io/libraries/akka-persistence-cassandra/current/) [Migration guides](https://doc.akka.io/libraries/akka-persistence-cassandra/current/migrations.html)

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-cassandra_${scala.binary.version}</artifactId>
    <version>1.3.4</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-cassandra" % "1.3.4"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-persistence-cassandra_${versions.ScalaBinary}:1.3.4"
}
```

## Akka Persistence plugin for DynamoDB 2\.0\.11

The Akka Persistence DynamoDB plugin allows for using AWS DynamoDB as a backend for [Akka Persistence](https://doc.akka.io/libraries/akka-core/current/typed/index-persistence.html).

[Documentation](https://doc.akka.io/libraries/akka-persistence-dynamodb/current/)

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-dynamodb_${scala.binary.version}</artifactId>
    <version>2.0.11</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-dynamodb" % "2.0.11"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-dynamodb_${versions.ScalaBinary}:2.0.11"
}
```

## Akka Persistence plugin for JDBC 5\.5\.4

The Akka Persistence JDBC plugin allows for using JDBC\-compliant databases as backend for [Akka Persistence](https://doc.akka.io/libraries/akka-core/current/typed/index-persistence.html) and [Akka Persistence Query](https://doc.akka.io/libraries/akka-core/current/persistence-query.html).

[Documentation](https://doc.akka.io/libraries/akka-persistence-jdbc/current/) [Migration guides](https://doc.akka.io/libraries/akka-persistence-jdbc/current/migration.html)

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-jdbc_${scala.binary.version}</artifactId>
    <version>5.5.4</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-jdbc" % "5.5.4"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-jdbc_${versions.ScalaBinary}:5.5.4"
}
```

## Akka Persistence plugin for R2DBC 1\.3\.12

The Akka Persistence R2DBC plugin allows for using SQL database with R2DBC as a backend for [Akka Persistence](https://doc.akka.io/libraries/akka-core/current/typed/index-persistence.html) and [Akka Persistence Query](https://doc.akka.io/libraries/akka-core/current/persistence-query.html).

[Documentation](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/) [Migration guides](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/migration.html)

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-r2dbc_${scala.binary.version}</artifactId>
    <version>1.3.12</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-r2dbc" % "1.3.12"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-r2dbc_${versions.ScalaBinary}:1.3.12"
}
```

## Akka Projections 1\.6\.20

Akka Projections is intended for implementing Command Query Responsibility Segregation (CQRS) and Service to service communication.

[Documentation](https://doc.akka.io/libraries/akka-projection/current/)

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-core_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-projection-core" % "1.6.20"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-core_${versions.ScalaBinary}:1.6.20"
}
```

## Akka Management 1\.6\.4

Akka Management is a suite of tools for operating Akka Clusters.

[Documentation](https://doc.akka.io/libraries/akka-management/current/) [Migration guides](https://doc.akka.io/libraries/akka-management/current/migration.html)

#### Complete dependency listing of Akka Management libraries

Check the [documentation](https://doc.akka.io/libraries/akka-management/current/) to learn which dependencies you require.

Maven
```
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management-cluster-http_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management-cluster-bootstrap_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-rolling-update-kubernetes_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-kubernetes-api_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```
sbt
```
val AkkaManagementVersion = "1.6.4"
libraryDependencies ++= Seq(
  "com.lightbend.akka.management" %% "akka-management" % AkkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-management-cluster-http" % AkkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-management-cluster-bootstrap" % AkkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-rolling-update-kubernetes" % AkkaManagementVersion,
  "com.lightbend.akka.discovery" %% "akka-discovery-kubernetes-api" % AkkaManagementVersion
)
```
Gradle
```
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-management_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
  implementation "com.lightbend.akka.management:akka-management-cluster-http_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
  implementation "com.lightbend.akka.management:akka-management-cluster-bootstrap_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
  implementation "com.lightbend.akka.management:akka-rolling-update-kubernetes_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
  implementation "com.lightbend.akka.discovery:akka-discovery-kubernetes-api_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

## Akka Diagnostics 2\.2\.3

The Akka Thread Starvation Detector is a diagnostic tool that monitors the dispatcher of an ActorSystem and will log a warning if the dispatcher becomes unresponsive. The Config Checker tries to help you by finding potential configuration issues.

[Documentation](https://doc.akka.io/libraries/akka-diagnostics/current/)

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-diagnostics_${scala.binary.version}</artifactId>
    <version>2.2.3</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-diagnostics" % "2.2.3"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-diagnostics_${versions.ScalaBinary}:2.2.3"
}
```

## Alpakka 10\.0\.1

The Alpakka project is an open source initiative to implement stream\-aware and reactive integration pipelines for Java and Scala. It is built on top of Akka Streams.

[Documentation](https://doc.akka.io/docs/alpakka/current/)

### Alpakka Cassandra

Alpakka Cassandra offers an Akka Streams API on top of a `CqlSession` from the Datastax Java Driver version 4\.0\+.

[Documentation](https://doc.akka.io/docs/alpakka/current/cassandra.html)

### Alpakka Comma\-separated files (CSV)

Comma\-Separated Values are used as interchange format for tabular data of text.

[Documentation](https://doc.akka.io/docs/alpakka/current/data-transformations/csv.html)

## Alpakka Kafka 8\.0\.0

Alpakka Kafka lets you connect Apache Kafka to Akka Streams.

[Documentation](https://doc.akka.io/docs/alpakka-kafka/current/)

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-kafka_${scala.binary.version}</artifactId>
    <version>8.0.0</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "com.typesafe.akka" %% "akka-stream-kafka" % "8.0.0"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-stream-kafka_${versions.ScalaBinary}:8.0.0"
}
```

## Akka Edge Rust 0\.8\.0

*[Incubating](support-terminology.html#incubating)*

*Extending the power of Akka’s event\-driven model to resource\-constrained devices.*

Akka Edge support in Rust is designed to empower Akka developers at the edge. Recognizing the resource constraints present at the edge, Akka Edge Rust enables event\-driven solutions for developers familiar with Akka Persistence and Projections.

[Guide](https://doc.akka.io/libraries/akka-edge/current/guide-rs.html)

[API](https://doc.akka.io/api/akka-edge-rs/current/)

## Akka Insights

[Akka Insights](https://doc.akka.io/libraries/akka-insights/current/index.html) provides a view into the distributed applications at runtime. This view allows developers and operations to respond quickly to problems, track down unexpected behavior and tune the system.

| Akka | Compatible Akka Insights |  |
| --- | --- | --- |
| Akka 25\.10 | Akka Insights version 2\.22 | [Documentation](https://doc.akka.io/libraries/akka-insights/current/) |
| Akka 25\.05 | Akka Insights version 2\.21 | [Documentation](https://doc.akka.io/libraries/akka-insights/2.21/home.html) |
| Akka 24\.10 | Akka Insights version 2\.21 | [Documentation](https://doc.akka.io/libraries/akka-insights/2.21/home.html) |
| Akka 24\.05 | Lightbend Telemetry version 2\.20 | [Documentation](https://doc.akka.io/libraries/akka-insights/2.20/home.html) |
| Akka 23\.10 | Lightbend Telemetry version 2\.19 | [Documentation](https://doc.akka.io/libraries/akka-insights/2.19/home.html) |
| Akka 23\.05 | Lightbend Telemetry version 2\.18 | [Documentation](https://doc.akka.io/libraries/akka-insights/2.18/home.html) |
| Akka 22\.10 (and older) | Lightbend Telemetry version 2\.17 | [Documentation](https://doc.akka.io/libraries/akka-insights/2.17/home.html) |

## Architecture

### Microservices

Tutorial bringing together essential parts of Akka to build resilient and scalable microservices. [Akka Guide](https://doc.akka.io/libraries/guide/microservices-tutorial/index.html)

### Security: assuming Zero Trust

Learn how the Zero Trust approach helps you to build secure systems with Akka. [Akka Guide](https://doc.akka.io/libraries/guide/security/zero-trust.html)

### Distributed Cluster

Connect Akka services across geographical locations for lower latency and higher availability. [Akka Distributed Cluster](https://doc.akka.io/libraries/akka-distributed-cluster/current/index.html)

### Edge

Move your endpoints to the edge of the cloud for lower latency and higher availability. *Akka Edge Rust* extends the power of Akka’s event\-driven model to resource\-constrained devices. [Akka Edge](https://doc.akka.io/libraries/akka-edge/current/index.html)

## Code Examples

### Example 1: Repository

```xml
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/{your repository token here}/secure</url>
    </repository>
  </repositories&gt
</project>
```

### Example 2: Repository

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/{your repository token here}/secure")
```

### Example 3: Repository

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/{your repository token here}/secure"
    }
}
```

### Example 4: Complete dependency listing of Akka core libraries

```xml
<properties>
  <akka.version>2.10.17</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-tools_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-distributed-data_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-multi-node-testkit_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
    <scope>test</scope>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-tck_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-protobuf-v3_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-remote_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor-testkit-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
    <scope>test</scope>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-slf4j_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
    <scope>test</scope>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-testkit_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-testkit_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-coordination_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-metrics_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 5: Complete dependency listing of Akka core libraries

```scala
val AkkaVersion = "2.10.17"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools" % AkkaVersion,
  "com.typesafe.akka" %% "akka-discovery" % AkkaVersion,
  "com.typesafe.akka" %% "akka-distributed-data" % AkkaVersion,
  "com.typesafe.akka" %% "akka-multi-node-testkit" % AkkaVersion % Test,
  "com.typesafe.akka" %% "akka-persistence" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-tck" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-query" % AkkaVersion,
  "com.typesafe.akka" %% "akka-protobuf-v3" % AkkaVersion,
  "com.typesafe.akka" %% "akka-remote" % AkkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test,
  "com.typesafe.akka" %% "akka-slf4j" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % AkkaVersion,
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-coordination" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-metrics" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-sharding" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-sharding-typed" % AkkaVersion
)
```

### Example 6: Complete dependency listing of Akka core libraries

```gradle
def versions = [
  AkkaVersion: "2.10.17",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster-tools_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-distributed-data_${versions.ScalaBinary}:${versions.AkkaVersion}"
  testImplementation "com.typesafe.akka:akka-multi-node-testkit_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-persistence_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-persistence-tck_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-persistence-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-persistence-query_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-protobuf-v3_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-remote_${versions.ScalaBinary}:${versions.AkkaVersion}"
  testImplementation "com.typesafe.akka:akka-actor-testkit-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-slf4j_${versions.ScalaBinary}:${versions.AkkaVersion}"
  testImplementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-stream-testkit_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-stream-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-testkit_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-actor-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-coordination_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster-metrics_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster-sharding_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 7: Akka gRPC 2.5.10

```xml
<project>
  <modelVersion>4.0.0</modelVersion>
  <name>Project name</name>
  <groupId>com.example</groupId>
  <artifactId>my-grpc-app</artifactId>
  <version>0.1-SNAPSHOT</version>
  <properties>
    <akka.grpc.version>2.5.10</akka.grpc.version>
    <project.encoding>UTF-8</project.encoding>
  </properties>
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/{your repository token here}/secure</url>
    </repository>
  </repositories>
  <pluginRepositories>
    <pluginRepository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/{your repository token here}/secure</url>
    </pluginRepository>
  </pluginRepositories>
  <dependencies>
    <dependency>
      <groupId>com.lightbend.akka.grpc</groupId>
      <artifactId>akka-grpc-runtime_2.13</artifactId>
      <version>${akka.grpc.version}</version>
    </dependency>
  </dependencies>
  <build>
    <plugins>
      <plugin>
        <groupId>com.lightbend.akka.grpc</groupId>
        <artifactId>akka-grpc-maven-plugin</artifactId>
        <version>${akka.grpc.version}</version>
        <executions>
          <execution>
            <goals>
              <goal>generate</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
    </plugins>
  </build>
</project>
```

### Example 8: Akka gRPC 2.5.10

```scala
// in project/plugins.sbt:
resolvers += "Akka library repository".at("https://repo.akka.io/{your repository token here}/secure")
addSbtPlugin("com.lightbend.akka.grpc" % "sbt-akka-grpc" % "2.5.10")
//
// in build.sbt:
resolvers += "Akka library repository".at("https://repo.akka.io/{your repository token here}/secure")
enablePlugins(AkkaGrpcPlugin)
```

### Example 9: Akka gRPC 2.5.10

```gradle
buildscript {
  repositories {
    gradlePluginPortal()
    maven {
      url "https://repo.akka.io/{your repository token here}/secure"
    }
  }
}
plugins {
  id 'java'
  id 'application'
  id 'com.lightbend.akka.grpc.gradle' version '2.5.10'
}
repositories {
  mavenCentral()
  maven {
    url "https://repo.akka.io/{your repository token here}/secure"
  }
}
```

### Example 10: Complete dependency listing of Akka HTTP libraries

```xml
<properties>
  <akka.http.version>10.7.3</akka.http.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-core_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-jackson_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-spray-json_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-testkit_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
    <scope>test</scope>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-xml_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
  </dependency&gt
</dependencies>
```

### Example 11: Complete dependency listing of Akka HTTP libraries

```scala
val AkkaHttpVersion = "10.7.3"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-core" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-jackson" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % AkkaHttpVersion % Test,
  "com.typesafe.akka" %% "akka-http-xml" % AkkaHttpVersion
)
```

### Example 12: Complete dependency listing of Akka HTTP libraries

```gradle
def versions = [
  AkkaHttpVersion: "10.7.3",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-http_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
  implementation "com.typesafe.akka:akka-http-core_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
  implementation "com.typesafe.akka:akka-http-jackson_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
  implementation "com.typesafe.akka:akka-http-spray-json_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
  testImplementation "com.typesafe.akka:akka-http-testkit_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
  implementation "com.typesafe.akka:akka-http-xml_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
}
```

### Example 13: Akka Persistence plugin for Cassandra 1.3.4

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-cassandra_${scala.binary.version}</artifactId>
    <version>1.3.4</version>
  </dependency&gt
</dependencies>
```

### Example 14: Akka Persistence plugin for Cassandra 1.3.4

```scala
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-cassandra" % "1.3.4"
```

### Example 15: Akka Persistence plugin for Cassandra 1.3.4

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-persistence-cassandra_${versions.ScalaBinary}:1.3.4"
}
```

### Example 16: Akka Persistence plugin for DynamoDB 2.0.11

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-dynamodb_${scala.binary.version}</artifactId>
    <version>2.0.11</version>
  </dependency&gt
</dependencies>
```

### Example 17: Akka Persistence plugin for DynamoDB 2.0.11

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-dynamodb" % "2.0.11"
```

### Example 18: Akka Persistence plugin for DynamoDB 2.0.11

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-dynamodb_${versions.ScalaBinary}:2.0.11"
}
```

### Example 19: Akka Persistence plugin for JDBC 5.5.4

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-jdbc_${scala.binary.version}</artifactId>
    <version>5.5.4</version>
  </dependency&gt
</dependencies>
```

### Example 20: Akka Persistence plugin for JDBC 5.5.4

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-jdbc" % "5.5.4"
```

### Example 21: Akka Persistence plugin for JDBC 5.5.4

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-jdbc_${versions.ScalaBinary}:5.5.4"
}
```

### Example 22: Akka Persistence plugin for R2DBC 1.3.12

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-r2dbc_${scala.binary.version}</artifactId>
    <version>1.3.12</version>
  </dependency&gt
</dependencies>
```

### Example 23: Akka Persistence plugin for R2DBC 1.3.12

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-r2dbc" % "1.3.12"
```

### Example 24: Akka Persistence plugin for R2DBC 1.3.12

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-r2dbc_${versions.ScalaBinary}:1.3.12"
}
```

### Example 25: Akka Projections 1.6.20

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-core_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
</dependencies>
```

### Example 26: Akka Projections 1.6.20

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-projection-core" % "1.6.20"
```

### Example 27: Akka Projections 1.6.20

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-core_${versions.ScalaBinary}:1.6.20"
}
```

### Example 28: Complete dependency listing of Akka Management libraries

```xml
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management-cluster-http_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management-cluster-bootstrap_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-rolling-update-kubernetes_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-kubernetes-api_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Example 29: Complete dependency listing of Akka Management libraries

```scala
val AkkaManagementVersion = "1.6.4"
libraryDependencies ++= Seq(
  "com.lightbend.akka.management" %% "akka-management" % AkkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-management-cluster-http" % AkkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-management-cluster-bootstrap" % AkkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-rolling-update-kubernetes" % AkkaManagementVersion,
  "com.lightbend.akka.discovery" %% "akka-discovery-kubernetes-api" % AkkaManagementVersion
)
```

### Example 30: Complete dependency listing of Akka Management libraries

```gradle
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-management_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
  implementation "com.lightbend.akka.management:akka-management-cluster-http_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
  implementation "com.lightbend.akka.management:akka-management-cluster-bootstrap_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
  implementation "com.lightbend.akka.management:akka-rolling-update-kubernetes_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
  implementation "com.lightbend.akka.discovery:akka-discovery-kubernetes-api_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

### Example 31: Akka Diagnostics 2.2.3

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-diagnostics_${scala.binary.version}</artifactId>
    <version>2.2.3</version>
  </dependency&gt
</dependencies>
```

### Example 32: Akka Diagnostics 2.2.3

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-diagnostics" % "2.2.3"
```

### Example 33: Akka Diagnostics 2.2.3

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-diagnostics_${versions.ScalaBinary}:2.2.3"
}
```

### Example 34: Alpakka Kafka 8.0.0

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-kafka_${scala.binary.version}</artifactId>
    <version>8.0.0</version>
  </dependency&gt
</dependencies>
```

### Example 35: Alpakka Kafka 8.0.0

```scala
libraryDependencies += "com.typesafe.akka" %% "akka-stream-kafka" % "8.0.0"
```

### Example 36: Alpakka Kafka 8.0.0

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-stream-kafka_${versions.ScalaBinary}:8.0.0"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-edge-rs/current/
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/docs/akka-dependencies/current/java-versions.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/docs/alpakka-kafka/current/
- https://doc.akka.io/docs/alpakka/current/
- https://doc.akka.io/docs/alpakka/current/cassandra.html
- https://doc.akka.io/docs/alpakka/current/data-transformations/csv.html
- https://doc.akka.io/japi/akka-http/current/
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/index.html
- https://doc.akka.io/libraries/akka-core/current/
- https://doc.akka.io/libraries/akka-core/current/persistence-query.html
- https://doc.akka.io/libraries/akka-core/current/project/migration-guides.html
- https://doc.akka.io/libraries/akka-core/current/stream/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/typed/index-cluster.html
- https://doc.akka.io/libraries/akka-core/current/typed/index-persistence-durable-state.html
- https://doc.akka.io/libraries/akka-core/current/typed/index-persistence.html
- https://doc.akka.io/libraries/akka-core/current/typed/index.html
- https://doc.akka.io/libraries/akka-diagnostics/current/
- https://doc.akka.io/libraries/akka-distributed-cluster/current/index.html
- https://doc.akka.io/libraries/akka-edge/current/guide-rs.html
- https://doc.akka.io/libraries/akka-edge/current/index.html
- https://doc.akka.io/libraries/akka-grpc/current/
- https://doc.akka.io/libraries/akka-http/current/
- https://doc.akka.io/libraries/akka-http/current/migration-guide/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/alphabetically.html
- https://doc.akka.io/libraries/akka-insights/2.17/home.html
- https://doc.akka.io/libraries/akka-insights/2.18/home.html
- https://doc.akka.io/libraries/akka-insights/2.19/home.html
- https://doc.akka.io/libraries/akka-insights/2.20/home.html
- https://doc.akka.io/libraries/akka-insights/2.21/home.html
- https://doc.akka.io/libraries/akka-insights/current/
- https://doc.akka.io/libraries/akka-insights/current/index.html
- https://doc.akka.io/libraries/akka-management/current/
- https://doc.akka.io/libraries/akka-management/current/migration.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/

---
*Source: [https://doc.akka.io/docs/akka-dependencies/current/index.html](https://doc.akka.io/docs/akka-dependencies/current/index.html)*
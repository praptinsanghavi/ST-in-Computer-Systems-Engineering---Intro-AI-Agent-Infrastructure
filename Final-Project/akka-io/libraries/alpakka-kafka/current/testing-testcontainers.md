---
description: Alpakka Kafka provides Testcontainers support for running a Kafka cluster
  locally using Docker containers.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:05:52Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/testing-testcontainers.html
title: Testing with a Docker Kafka cluster • Alpakka Kafka Documentation
---

# Testing with a Docker Kafka cluster • Alpakka Kafka Documentation

> **Summary:** Alpakka Kafka provides Testcontainers support for running a Kafka cluster locally using Docker containers.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Testing with a Docker Kafka cluster

The [Testcontainers](https://java.testcontainers.org/) project contains a nice API to start and stop Apache Kafka in Docker containers. This becomes very relevant when your application code uses a Scala version which Apache Kafka doesn’t support so that *EmbeddedKafka* can’t be used. Testcontainers also allow you to create a complete Kafka cluster (using Docker containers) to simulate production use cases.

## Settings

You can override testcontainers settings to create multi\-broker Kafka clusters, or to finetune Kafka Broker, ZooKeeper and Schema Registry configuration, by updating [`KafkaTestkitTestcontainersSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/testkit/KafkaTestkitTestcontainersSettings.html "akka.kafka.testkit.KafkaTestkitTestcontainersSettings")[`KafkaTestkitTestcontainersSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/testkit/KafkaTestkitTestcontainersSettings.html "akka.kafka.testkit.KafkaTestkitTestcontainersSettings") in code or configuration. The [`KafkaTestkitTestcontainersSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/testkit/KafkaTestkitTestcontainersSettings.html "akka.kafka.testkit.KafkaTestkitTestcontainersSettings")[`KafkaTestkitTestcontainersSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/testkit/KafkaTestkitTestcontainersSettings.html "akka.kafka.testkit.KafkaTestkitTestcontainersSettings") type can be used to perform actions such as:

- Set the docker image and tag of Kafka, ZooKeeper, and Schema Registry version to use (a recent Confluent Platform version is used by default)
- Define number of Kafka brokers
- Overriding container settings and environment variables (i.e. to change default Broker config)
- Apply custom docker configuration to the Kafka and ZooKeeper containers used to create a cluster

To change defaults for all settings update the appropriate configuration in `akka.kafka.testkit.testcontainers`.

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/testkit/src/main/resources/reference.conf#L16-L52 "Go to snippet source")akka.kafka.testkit.testcontainers {

  # define these settings to select a different Kafka/ZooKeeper docker image
  # we recommend using Confluent Platform docker images and using the same version across all images
  # Confluent publishes images on DockerHub: https://hub.docker.com/r/confluentinc/cp-kafka/tags
  # Kafka versions in Confluent Platform: https://docs.confluent.io/current/installation/versions-interoperability.html
  zookeeper-image = "confluentinc/cp-zookeeper"
  zookeeper-image-tag = ${akka.kafka.testkit.testcontainers.confluent-platform-version}
  kafka-image = "confluentinc/cp-kafka"
  kafka-image-tag = ${akka.kafka.testkit.testcontainers.confluent-platform-version}
  schema-registry-image = "confluentinc/cp-schema-registry"
  schema-registry-image-tag = ${akka.kafka.testkit.testcontainers.confluent-platform-version}
  # See https://docs.confluent.io/platform/current/installation/versions-interoperability.html
  confluent-platform-version = "7.0.0"

  # the number of Kafka brokers to include in a test cluster
  num-brokers = 1

  # set this to use a replication factor for internal Kafka topics such as Consumer Offsets and Transaction log.
  # this replication factor must be less than or equal to `num-brokers`
  internal-topics-replication-factor = 1

  # set this to true to launch a testcontainer for Confluent Schema Registry
  use-schema-registry = false

  # set this to true to stream the STDOUT and STDERR of containers to SLF4J loggers
  # this requires the SLF4J dependency to be on the classpath and the loggers enabled in your logging configuration
  container-logging = false

  # set this to the total length of time to wait for a Kafka container cluster to start. this includes all brokers
  # zookeeper, and schema registry nodes. note that this can take a considerable time in limited resource environments.
  cluster-start-timeout = 360 s

  # set this to the total length of time to wait for a Kafka container readiness check to complete. note that this can
  # take a considerable time in limited resource environments.
  readiness-check-timeout = 360 s
}
```

You can override all these defaults in code and per test class. By applying settings in code you can also configure the Kafka and ZooKeeper containers themselves.

For example, the following demonstrates creating a 3 Broker Kafka cluster and disables the automatic topic creation broker configuration using environment variables.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/main/scala/akka/kafka/scaladsl/SpecBase.scala#L11-L30 "Go to snippet source")import akka.kafka.testkit.scaladsl.ScalatestKafkaSpec
import org.scalatest.concurrent.{Eventually, IntegrationPatience, ScalaFutures}
import org.scalatest.wordspec.AnyWordSpecLike
import org.scalatest.matchers.should.Matchers

abstract class SpecBase(kafkaPort: Int)
    extends ScalatestKafkaSpec(kafkaPort)
    with AnyWordSpecLike
    with Matchers
    with ScalaFutures
    with Eventually {

  protected def this() = this(kafkaPort = -1)
}

import akka.kafka.testkit.KafkaTestkitTestcontainersSettings
import akka.kafka.testkit.scaladsl.TestcontainersKafkaPerClassLike

class TestcontainersNewSettingsSampleSpec extends SpecBase with TestcontainersKafkaPerClassLike {

  override val testcontainersSettings = KafkaTestkitTestcontainersSettings(system)
    .withNumBrokers(3)
    .withInternalTopicsReplicationFactor(2)
    .withConfigureKafka { brokerContainers =>
      brokerContainers.foreach(_.withEnv("KAFKA_AUTO_CREATE_TOPICS_ENABLE", "false"))
    }

  // ...
}
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/TestkitTestcontainersTest.java#L9-L45 "Go to snippet source")import akka.actor.ActorSystem;
import akka.kafka.testkit.KafkaTestkitTestcontainersSettings;
import akka.kafka.testkit.javadsl.TestcontainersKafkaTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestkitTestcontainersTest extends TestcontainersKafkaTest {

  private static final ActorSystem system = ActorSystem.create("TestkitTestcontainersTest");

  private static KafkaTestkitTestcontainersSettings testcontainersSettings =
      KafkaTestkitTestcontainersSettings.create(system)
          .withNumBrokers(3)
          .withInternalTopicsReplicationFactor(2)
          .withConfigureKafkaConsumer(
              brokerContainers ->
                  brokerContainers.forEach(
                      b -> b.withEnv("KAFKA_AUTO_CREATE_TOPICS_ENABLE", "false")));

  TestkitTestcontainersTest() {
    // this will only start a new cluster if it has not already been started.
    //
    // you must stop the cluster in the afterClass implementation if you want to create a cluster
    // per test class
    // using (TestInstance.Lifecycle.PER_CLASS)
    super(system, testcontainersSettings);
  }

  // ...

  // omit this implementation if you want the cluster to stay up for all your tests
  @AfterAll
  void afterClass() {
    TestcontainersKafkaTest.stopKafka();
  }
}
```

To see what options are available for configuring testcontainers using `configureKafka` and `configureZooKeeper` in [`KafkaTestkitTestcontainersSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/testkit/KafkaTestkitTestcontainersSettings.html "akka.kafka.testkit.KafkaTestkitTestcontainersSettings")[`KafkaTestkitTestcontainersSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/testkit/KafkaTestkitTestcontainersSettings.html "akka.kafka.testkit.KafkaTestkitTestcontainersSettings") see the API docs for [`AlpakkaKafkaContainer`](/api/alpakka-kafka/8.0.1/akka/kafka/testkit/internal/AlpakkaKafkaContainer.html "akka.kafka.testkit.internal.AlpakkaKafkaContainer")[`AlpakkaKafkaContainer`](/api/alpakka-kafka/8.0.1/akka/kafka/testkit/internal/AlpakkaKafkaContainer.html "akka.kafka.testkit.internal.AlpakkaKafkaContainer") and [`GenericContainer`](https://www.javadoc.io/static/org.testcontainers/testcontainers/1.21.3/org/testcontainers/containers/GenericContainer.html).

### Testing with Schema Registry

If you use Confluent’s Schema Registry in your client code you may optionally run a Schema Registry container as well. The following snippet demonstrates overriding a test class to use the container, or you can enable it for all tests in your `application.conf`.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/SchemaRegistrySerializationSpec.scala#L38-L223 "Go to snippet source")class SchemaRegistrySerializationSpec extends DocsSpecBase with TestcontainersKafkaPerClassLike {

  override val testcontainersSettings = KafkaTestkitTestcontainersSettings(system).withSchemaRegistry(true)

  // tests..
}
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/SchemaRegistrySerializationTest.java#L50-L136 "Go to snippet source")public class SchemaRegistrySerializationTest extends TestcontainersKafkaJunit4Test {

  private static final ActorSystem sys = ActorSystem.create("SchemaRegistrySerializationTest");
  private static final Executor ec = Executors.newSingleThreadExecutor();

  public SchemaRegistrySerializationTest() {
    super(
        sys,
        KafkaTestkitTestcontainersSettings.create(sys)
            .withInternalTopicsReplicationFactor(1)
            .withSchemaRegistry(true));
  }

}
```

You can retrieve the Schema Registry URL in your test configuration by calling `getSchemaRegistryUrl()` or `schemaRegistryUrl`.

## Testing with a Docker Kafka cluster from Java code

The Alpakka Kafka testkit contains helper classes to start Kafka via Testcontainers. Alternatively, you may use just Testcontainers, as it is designed to be used with JUnit and you can follow [their documentation](https://java.testcontainers.org/modules/kafka/) to start and stop Kafka. To start a single instance for many tests see [Singleton containers](https://java.testcontainers.org/test_framework_integration/manual_lifecycle_control/).

The Testcontainers dependency must be added to your project explicitly.

Maven
```
<dependencies&gt
  <dependency>
    <groupId>org.testcontainers</groupId>
    <artifactId>kafka</artifactId>
    <version>1.21.3</version>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "org.testcontainers" % "kafka" % "1.21.3" % Test
```
Gradle
```
dependencies {
  testImplementation "org.testcontainers:kafka:1.21.3"
}
```

The example below shows skeleton test classes for JUnit 4 and JUnit 5\. The Kafka broker will start before the first test and be stopped after all test classes are finished.

Java JUnit 4

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/AssignmentTest.java#L18-L214 "Go to snippet source")import akka.kafka.javadsl.Producer;
import akka.kafka.testkit.javadsl.TestcontainersKafkaJunit4Test;
import akka.testkit.javadsl.TestKit;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;

public class AssignmentTest extends TestcontainersKafkaJunit4Test {

  private static final ActorSystem sys = ActorSystem.create("AssignmentTest");

  public AssignmentTest() {
    super(sys);
  }

  @AfterClass
  public static void afterClass() {
    TestKit.shutdownActorSystem(sys);
  }
}
```

Java JUnit 5

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ProducerTest.java#L17-L237 "Go to snippet source")import akka.kafka.testkit.javadsl.TestcontainersKafkaTest;
import akka.testkit.javadsl.TestKit;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;

@TestInstance(Lifecycle.PER_CLASS)
class ProducerTest extends TestcontainersKafkaTest {

  private static final ActorSystem system = ActorSystem.create();

  ProducerTest() {
    super(system);
  }

  @AfterAll
  void shutdownActorSystem() {
    TestKit.shutdownActorSystem(system);
  }

}
```

## Testing with a Docker Kafka cluster from Scala code

The Testcontainers dependency must be added to your project explicitly.

Maven
```
<dependencies&gt
  <dependency>
    <groupId>org.testcontainers</groupId>
    <artifactId>kafka</artifactId>
    <version>1.21.3</version>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "org.testcontainers" % "kafka" % "1.21.3" % Test
```
Gradle
```
dependencies {
  testImplementation "org.testcontainers:kafka:1.21.3"
}
```

To ensure proper shutdown of all stages in every test, wrap your test code in [`assertAllStagesStopped`](https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/javadsl/StreamTestKit.html "akka.stream.testkit.javadsl.StreamTestKit")[`assertAllStagesStopped`](https://doc.akka.io/api/akka/2.10/akka/stream/testkit/scaladsl/StreamTestKit$.html "akka.stream.testkit.scaladsl.StreamTestKit"). This may interfere with the `stop-timeout` which delays shutdown for Alpakka Kafka consumers. You might need to configure a shorter timeout in your `application.conf` for tests.

### One cluster for all tests

By mixing in [`TestcontainersKafkaLike`](/api/alpakka-kafka/8.0.1/akka/kafka/testkit/scaladsl/TestcontainersKafkaLike.html "akka.kafka.testkit.scaladsl.TestcontainersKafkaLike") the Kafka Docker cluster will be started before the first test and shut down after all tests are finished.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/main/scala/akka/kafka/scaladsl/SpecBase.scala#L11-L30 "Go to snippet source")import akka.kafka.testkit.scaladsl.ScalatestKafkaSpec
import org.scalatest.concurrent.{Eventually, IntegrationPatience, ScalaFutures}
import org.scalatest.wordspec.AnyWordSpecLike
import org.scalatest.matchers.should.Matchers

abstract class SpecBase(kafkaPort: Int)
    extends ScalatestKafkaSpec(kafkaPort)
    with AnyWordSpecLike
    with Matchers
    with ScalaFutures
    with Eventually {

  protected def this() = this(kafkaPort = -1)
}

import akka.kafka.testkit.scaladsl.TestcontainersKafkaLike

class TestcontainersSampleSpec extends SpecBase with TestcontainersKafkaLike {
  // ...
}
```

With this `TestcontainersSampleSpec` class test classes can extend it to automatically start and stop a Kafka broker to test with.

### One cluster per test class

By mixing in [`TestcontainersKafkaPerClassLike`](/api/alpakka-kafka/8.0.1/akka/kafka/testkit/scaladsl/TestcontainersKafkaPerClassLike.html "akka.kafka.testkit.scaladsl.TestcontainersKafkaPerClassLike") a specific Kafka Docker cluster will be started for that test class and stopped after its run finished.

## Code Examples

### Example 1: Settings

```conf
akka.kafka.testkit.testcontainers {

  # define these settings to select a different Kafka/ZooKeeper docker image
  # we recommend using Confluent Platform docker images and using the same version across all images
  # Confluent publishes images on DockerHub: https://hub.docker.com/r/confluentinc/cp-kafka/tags
  # Kafka versions in Confluent Platform: https://docs.confluent.io/current/installation/versions-interoperability.html
  zookeeper-image = "confluentinc/cp-zookeeper"
  zookeeper-image-tag = ${akka.kafka.testkit.testcontainers.confluent-platform-version}
  kafka-image = "confluentinc/cp-kafka"
  kafka-image-tag = ${akka.kafka.testkit.testcontainers.confluent-platform-version}
  schema-registry-image = "confluentinc/cp-schema-registry"
  schema-registry-image-tag = ${akka.kafka.testkit.testcontainers.confluent-platform-version}
  # See https://docs.confluent.io/platform/current/installation/versions-interoperability.html
  confluent-platform-version = "7.0.0"

  # the number of Kafka brokers to include in a test cluster
  num-brokers = 1

  # set this to use a replication factor for internal Kafka topics such as Consumer Offsets and Transaction log.
  # this replication factor must be less than or equal to `num-brokers`
  internal-topics-replication-factor = 1

  # set this to true to launch a testcontainer for Confluent Schema Registry
  use-schema-registry = false

  # set this to true to stream the STDOUT and STDERR of containers to SLF4J loggers
  # this requires the SLF4J dependency to be on the classpath and the loggers enabled in your logging configuration
  container-logging = false

  # set this to the total length of time to wait for a Kafka container cluster to start. this includes all brokers
  # zookeeper, and schema registry nodes. note that this can take a considerable time in limited resource environments.
  cluster-start-timeout = 360 s

  # set this to the total length of time to wait for a Kafka container readiness check to complete. note that this can
  # take a considerable time in limited resource environments.
  readiness-check-timeout = 360 s
}
```

### Example 2: Settings

```scala
import akka.kafka.testkit.scaladsl.ScalatestKafkaSpec
import org.scalatest.concurrent.{Eventually, IntegrationPatience, ScalaFutures}
import org.scalatest.wordspec.AnyWordSpecLike
import org.scalatest.matchers.should.Matchers

abstract class SpecBase(kafkaPort: Int)
    extends ScalatestKafkaSpec(kafkaPort)
    with AnyWordSpecLike
    with Matchers
    with ScalaFutures
    with Eventually {

  protected def this() = this(kafkaPort = -1)
}

import akka.kafka.testkit.KafkaTestkitTestcontainersSettings
import akka.kafka.testkit.scaladsl.TestcontainersKafkaPerClassLike

class TestcontainersNewSettingsSampleSpec extends SpecBase with TestcontainersKafkaPerClassLike {

  override val testcontainersSettings = KafkaTestkitTestcontainersSettings(system)
    .withNumBrokers(3)
    .withInternalTopicsReplicationFactor(2)
    .withConfigureKafka { brokerContainers =>
      brokerContainers.foreach(_.withEnv("KAFKA_AUTO_CREATE_TOPICS_ENABLE", "false"))
    }

  // ...
}
```

### Example 3: Settings

```java
import akka.actor.ActorSystem;
import akka.kafka.testkit.KafkaTestkitTestcontainersSettings;
import akka.kafka.testkit.javadsl.TestcontainersKafkaTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestkitTestcontainersTest extends TestcontainersKafkaTest {

  private static final ActorSystem system = ActorSystem.create("TestkitTestcontainersTest");

  private static KafkaTestkitTestcontainersSettings testcontainersSettings =
      KafkaTestkitTestcontainersSettings.create(system)
          .withNumBrokers(3)
          .withInternalTopicsReplicationFactor(2)
          .withConfigureKafkaConsumer(
              brokerContainers ->
                  brokerContainers.forEach(
                      b -> b.withEnv("KAFKA_AUTO_CREATE_TOPICS_ENABLE", "false")));

  TestkitTestcontainersTest() {
    // this will only start a new cluster if it has not already been started.
    //
    // you must stop the cluster in the afterClass implementation if you want to create a cluster
    // per test class
    // using (TestInstance.Lifecycle.PER_CLASS)
    super(system, testcontainersSettings);
  }

  // ...

  // omit this implementation if you want the cluster to stay up for all your tests
  @AfterAll
  void afterClass() {
    TestcontainersKafkaTest.stopKafka();
  }
}
```

### Example 4: Testing with Schema Registry

```scala
class SchemaRegistrySerializationSpec extends DocsSpecBase with TestcontainersKafkaPerClassLike {

  override val testcontainersSettings = KafkaTestkitTestcontainersSettings(system).withSchemaRegistry(true)

  // tests..
}
```

### Example 5: Testing with Schema Registry

```java
public class SchemaRegistrySerializationTest extends TestcontainersKafkaJunit4Test {

  private static final ActorSystem sys = ActorSystem.create("SchemaRegistrySerializationTest");
  private static final Executor ec = Executors.newSingleThreadExecutor();

  public SchemaRegistrySerializationTest() {
    super(
        sys,
        KafkaTestkitTestcontainersSettings.create(sys)
            .withInternalTopicsReplicationFactor(1)
            .withSchemaRegistry(true));
  }

}
```

### Example 6: Testing with a Docker Kafka cluster from Java code

```xml
<dependencies&gt
  <dependency>
    <groupId>org.testcontainers</groupId>
    <artifactId>kafka</artifactId>
    <version>1.21.3</version>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```

### Example 7: Testing with a Docker Kafka cluster from Java code

```scala
libraryDependencies += "org.testcontainers" % "kafka" % "1.21.3" % Test
```

### Example 8: Testing with a Docker Kafka cluster from Java code

```gradle
dependencies {
  testImplementation "org.testcontainers:kafka:1.21.3"
}
```

### Example 9: Testing with a Docker Kafka cluster from Java code

```java
import akka.kafka.javadsl.Producer;
import akka.kafka.testkit.javadsl.TestcontainersKafkaJunit4Test;
import akka.testkit.javadsl.TestKit;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;


public class AssignmentTest extends TestcontainersKafkaJunit4Test {

  private static final ActorSystem sys = ActorSystem.create("AssignmentTest");

  public AssignmentTest() {
    super(sys);
  }

  @AfterClass
  public static void afterClass() {
    TestKit.shutdownActorSystem(sys);
  }
}
```

### Example 10: Testing with a Docker Kafka cluster from Java code

```java
import akka.kafka.testkit.javadsl.TestcontainersKafkaTest;
import akka.testkit.javadsl.TestKit;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;


@TestInstance(Lifecycle.PER_CLASS)
class ProducerTest extends TestcontainersKafkaTest {

  private static final ActorSystem system = ActorSystem.create();

  ProducerTest() {
    super(system);
  }

  @AfterAll
  void shutdownActorSystem() {
    TestKit.shutdownActorSystem(system);
  }

}
```

### Example 11: Testing with a Docker Kafka cluster from Scala code

```xml
<dependencies&gt
  <dependency>
    <groupId>org.testcontainers</groupId>
    <artifactId>kafka</artifactId>
    <version>1.21.3</version>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```

### Example 12: Testing with a Docker Kafka cluster from Scala code

```scala
libraryDependencies += "org.testcontainers" % "kafka" % "1.21.3" % Test
```

### Example 13: Testing with a Docker Kafka cluster from Scala code

```gradle
dependencies {
  testImplementation "org.testcontainers:kafka:1.21.3"
}
```

### Example 14: One cluster for all tests

```scala
import akka.kafka.testkit.scaladsl.ScalatestKafkaSpec
import org.scalatest.concurrent.{Eventually, IntegrationPatience, ScalaFutures}
import org.scalatest.wordspec.AnyWordSpecLike
import org.scalatest.matchers.should.Matchers

abstract class SpecBase(kafkaPort: Int)
    extends ScalatestKafkaSpec(kafkaPort)
    with AnyWordSpecLike
    with Matchers
    with ScalaFutures
    with Eventually {

  protected def this() = this(kafkaPort = -1)
}

import akka.kafka.testkit.scaladsl.TestcontainersKafkaLike

class TestcontainersSampleSpec extends SpecBase with TestcontainersKafkaLike {
  // ...
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/stream/testkit/scaladsl/StreamTestKit$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/KafkaTestkitTestcontainersSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/internal/AlpakkaKafkaContainer.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/scaladsl/TestcontainersKafkaLike.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/scaladsl/TestcontainersKafkaPerClassLike.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/javadsl/StreamTestKit.html
- https://doc.akka.io/libraries/alpakka-kafka/current/production.html
- https://doc.akka.io/libraries/alpakka-kafka/current/testing.html

---
*Source: [https://doc.akka.io/libraries/alpakka-kafka/current/testing-testcontainers.html](https://doc.akka.io/libraries/alpakka-kafka/current/testing-testcontainers.html)*
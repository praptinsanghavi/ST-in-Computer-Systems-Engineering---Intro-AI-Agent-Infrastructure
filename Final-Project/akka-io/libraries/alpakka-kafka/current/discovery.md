---
description: Akka Discovery can be used to achieve Kafka broker discovery from the
  operations environment.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:09Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/discovery.html
title: Service discovery • Alpakka Kafka Documentation
---

# Service discovery • Alpakka Kafka Documentation

> **Summary:** Akka Discovery can be used to achieve Kafka broker discovery from the operations environment.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Service discovery

By using [Akka Discovery](https://doc.akka.io/libraries/akka-core/2.10/discovery/index.html) Alpakka Kafka may read the Kafka bootstrap server addresses from any Akka Discovery\-compatible service discovery mechanism.

Akka Discovery supports Configuration (HOCON), DNS (SRV records), and aggregation of multiple discovery methods out\-of\-the\-box. Kubernetes API, AWS API: EC2 Tag\-Based Discovery, AWS API: ECS Discovery and Consul implementations for Akka Discovery are available in [Akka Management](https://doc.akka.io/libraries/akka-management/current/).

## Dependency

The Akka Discovery version must match the Akka version used in your build. To use the implementations provided by Akka Management, you need to add the desired dependency.

Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```
sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies += "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

## Configure consumer settings

To use Akka Discovery with Alpakka Kafka consumers, configure a section for your consumer settings which inherits the default settings (by using `${akka.kafka.consumer}`) and add a service name and a timeout for the service lookup. Setting the `service-name` in the `akka.kafka.consumer` config will work, if all your consumers connect to the same Kafka broker.

The service name must match the one configured with the discovery technology you use. Overwrite the `resolve-timeout` depending on the discovery technology used, and your environment.

Note that consumers and producers may share a service (as shown in the examples on this page).

application.conf
 

```
discovery-consumer: ${akka.kafka.consumer} {
  service-name = "kafkaService1"
}

```

Mount the [`DiscoverySupport`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/DiscoverySupport$.html "akka.kafka.javadsl.DiscoverySupport")[`DiscoverySupport`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/DiscoverySupport$.html "akka.kafka.scaladsl.DiscoverySupport") in your consumer settings:

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/akka/kafka/ConsumerSettingsSpec.scala#L236-L240 "Go to snippet source")import akka.kafka.scaladsl.DiscoverySupport

val consumerConfig = config.getConfig("discovery-consumer")
val settings = ConsumerSettings(consumerConfig, new StringDeserializer, new StringDeserializer)
  .withEnrichAsync(DiscoverySupport.consumerBootstrapServers(consumerConfig))
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerSettingsTest.java#L14-L39 "Go to snippet source")import akka.kafka.javadsl.DiscoverySupport;

Config consumerConfig = system.settings().config().getConfig("discovery-consumer");
ConsumerSettings<String, String> settings =
    ConsumerSettings.create(consumerConfig, new StringDeserializer(), new StringDeserializer())
        .withEnrichCompletionStage(
            DiscoverySupport.consumerBootstrapServers(consumerConfig, system));
```

## Configure producer settings

To use Akka Discovery with Alpakka Kafka producers, configure a section for your producer settings which inherits the default settings (by using `${akka.kafka.producer}`) and add a service name and a timeout for the service lookup. Setting the `service-name` in the `akka.kafka.producer` config will work, if all your producers connect to the same Kafka broker.

The service name must match the one configured with the discovery technology you use. Overwrite the `resolve-timeout` depending on the discovery technology used, and your environment.

Note that consumers and producers may share a service (as shown in the examples on this page).

application.conf
 

```
discovery-producer: ${akka.kafka.producer} {
  service-name = "kafkaService1"
}

```

Mount the [`DiscoverySupport`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/DiscoverySupport$.html "akka.kafka.javadsl.DiscoverySupport")[`DiscoverySupport`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/DiscoverySupport$.html "akka.kafka.scaladsl.DiscoverySupport") in your producer settings:

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/akka/kafka/ProducerSettingsSpec.scala#L209-L213 "Go to snippet source")import akka.kafka.scaladsl.DiscoverySupport

val producerConfig = config.getConfig("discovery-producer")
val settings = ProducerSettings(producerConfig, new StringSerializer, new StringSerializer)
  .withEnrichAsync(DiscoverySupport.producerBootstrapServers(producerConfig))
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ProducerSettingsTest.java#L12-L36 "Go to snippet source")import akka.kafka.javadsl.DiscoverySupport;

Config producerConfig = system.settings().config().getConfig("discovery-producer");
ProducerSettings<String, String> settings =
    ProducerSettings.create(producerConfig, new StringSerializer(), new StringSerializer())
        .withEnrichCompletionStage(
            DiscoverySupport.producerBootstrapServers(producerConfig, system));
```

## Provide a service name via environment variables

To set the service name for lookup of the Kafka brokers bootstrap addresses via environment variables, use the built\-in s support in Typesafe Config as below. This example will use the value from the environment variable `KAFKA_SERVICE_NAME` and in case that is not defined default to `kafkaServiceDefault`.

application.conf
 

```
akka.kafka.producer {
  service-name = "kafkaServiceDefault"
  service-name = ${?KAFKA_SERVICE_NAME}
}

akka.kafka.consumer {
  service-name = "kafkaServiceDefault"
  service-name = ${?KAFKA_SERVICE_NAME}
}

```

## Specify a different service discovery mechanism

The Actor System\-wide service discovery is used by default, to choose a different Akka Discovery implementation, set the `discovery-method` setting in the producer and consumer configurations accordingly.

application.conf
 

```
discovery-producer: ${akka.kafka.producer} {
  discovery-method = "kubernetes-api"
  service-name = "kafkaService1"
  resolve-timeout = 3 seconds
}

```

## Use Config (HOCON) to describe the bootstrap servers

The setup below uses the built\-in Akka Discovery implementation reading from Config (HOCON) files. That might be a good choice for development and testing. You may use the [Aggregate implementation](https://doc.akka.io/libraries/akka-core/2.10/discovery/index.html#discovery-method-aggregate-multiple-discovery-methods) to first use another discovery technology, before falling back to the config file.

application.conf
 

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/akka/kafka/ConsumerSettingsSpec.scala#L266-L274 "Go to snippet source")akka.discovery.method = config
akka.discovery.config.services = {
  kafkaService1 = {
    endpoints = [
      { host = "cat", port = 1233 }
      { host = "dog", port = 1234 }
    ]
  }
}
```

## Code Examples

### Example 1: Dependency

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 2: Dependency

```scala
val AkkaVersion = "2.10.11"
libraryDependencies += "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
```

### Example 3: Dependency

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 4: Configure consumer settings

```hocon
discovery-consumer: ${akka.kafka.consumer} {
  service-name = "kafkaService1"
}
```

### Example 5: Configure consumer settings

```scala
import akka.kafka.scaladsl.DiscoverySupport

val consumerConfig = config.getConfig("discovery-consumer")
val settings = ConsumerSettings(consumerConfig, new StringDeserializer, new StringDeserializer)
  .withEnrichAsync(DiscoverySupport.consumerBootstrapServers(consumerConfig))
```

### Example 6: Configure consumer settings

```java
import akka.kafka.javadsl.DiscoverySupport;

Config consumerConfig = system.settings().config().getConfig("discovery-consumer");
ConsumerSettings<String, String> settings =
    ConsumerSettings.create(consumerConfig, new StringDeserializer(), new StringDeserializer())
        .withEnrichCompletionStage(
            DiscoverySupport.consumerBootstrapServers(consumerConfig, system));
```

### Example 7: Configure producer settings

```hocon
discovery-producer: ${akka.kafka.producer} {
  service-name = "kafkaService1"
}
```

### Example 8: Configure producer settings

```scala
import akka.kafka.scaladsl.DiscoverySupport

val producerConfig = config.getConfig("discovery-producer")
val settings = ProducerSettings(producerConfig, new StringSerializer, new StringSerializer)
  .withEnrichAsync(DiscoverySupport.producerBootstrapServers(producerConfig))
```

### Example 9: Configure producer settings

```java
import akka.kafka.javadsl.DiscoverySupport;

Config producerConfig = system.settings().config().getConfig("discovery-producer");
ProducerSettings<String, String> settings =
    ProducerSettings.create(producerConfig, new StringSerializer(), new StringSerializer())
        .withEnrichCompletionStage(
            DiscoverySupport.producerBootstrapServers(producerConfig, system));
```

### Example 10: Provide a service name via environment variables

```hocon
akka.kafka.producer {
  service-name = "kafkaServiceDefault"
  service-name = ${?KAFKA_SERVICE_NAME}
}

akka.kafka.consumer {
  service-name = "kafkaServiceDefault"
  service-name = ${?KAFKA_SERVICE_NAME}
}
```

### Example 11: Specify a different service discovery mechanism

```hocon
discovery-producer: ${akka.kafka.producer} {
  discovery-method = "kubernetes-api"
  service-name = "kafkaService1"
  resolve-timeout = 3 seconds
}
```

### Example 12: Use Config (HOCON) to describe the bootstrap servers

```scala
akka.discovery.method = config
akka.discovery.config.services = {
  kafkaService1 = {
    endpoints = [
      { host = "cat", port = 1233 }
      { host = "dog", port = 1234 }
    ]
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/DiscoverySupport$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/DiscoverySupport$.html
- https://doc.akka.io/libraries/akka-core/2.10/discovery/index.html
- https://doc.akka.io/libraries/akka-management/current/
- https://doc.akka.io/libraries/alpakka-kafka/current/cluster-sharding.html
- https://doc.akka.io/libraries/alpakka-kafka/current/consumer-metadata.html

---
*Source: [https://doc.akka.io/libraries/alpakka-kafka/current/discovery.html](https://doc.akka.io/libraries/alpakka-kafka/current/discovery.html)*
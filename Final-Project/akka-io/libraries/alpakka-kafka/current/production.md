---
description: Consider these areas when using Alpakka Kafka in production.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:05:06Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/production.html
title: Production considerations • Alpakka Kafka Documentation
---

# Production considerations • Alpakka Kafka Documentation

> **Summary:** Consider these areas when using Alpakka Kafka in production.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Production considerations

## Alpakka Kafka API

1. Do not use `Consumer.atMostOnceSource` in production as it internally commits the offset after every element.
2. If you create `Producer` sinks in “inner flows”, be sure to [share the `Producer` instance](producer.html#sharing-the-kafkaproducer-instance). This avoids the expensive creation of `KafkaProducer` instances.

Note
This is just a start, please add your experiences to this list by [opening a Pull Request](https://github.com/akka/alpakka-kafka/pulls).

## Monitoring and Tracing

For performance monitoring consider [Lightbend Telemetry](https://developer.lightbend.com/docs/telemetry/current/home.html) which gives insights into Akka and Akka Streams.

Lightbend Telemetry supports OpenTracing context propagation so that you can follow individual messages through Kafka producers and consumers.

![OpenTracing with Alpakka Kafka](images/alpakka-kafka-stream-trace.png)

See [Enabling OpenTracing in your app](https://developer.lightbend.com/docs/telemetry/current/extensions/opentracing/enabling.html#alpakka-kafka-configuration).

## Security setup

The different security setups offered by Kafka brokers are described in the [Apache Kafka documentation](https://kafka.apache.org/41/documentation.html#security).

### SSL

The properties described in Kafka’s [Configuring Kafka Clients for SSL](https://kafka.apache.org/41/documentation.html#security_configclients) go in the `akka.kafka.consumer.kafka-clients` and `akka.kafka.producer.kafka-clients` sections of the configuration, or can be added programmatically via `ProducerSettings.withProperties` and `ConsumerSettings.withProperties`. The necessary property name constants are available in [`SslConfigs`](https://kafka.apache.org/41/javadoc/org/apache/kafka/common/config/SslConfigs.html "org.apache.kafka.common.config.SslConfigs").

```
akka.kafka.producer { # and akka.kafka.consumer respectively
  kafka-clients {
    security.protocol=SSL
    ssl.truststore.location=/var/private/ssl/kafka.client.truststore.jks
    ssl.truststore.password=test1234
    ssl.keystore.location=/var/private/ssl/kafka.client.keystore.jks
    ssl.keystore.password=test1234
    ssl.key.password=test1234
  }
}

```

The truststore and keystore locations may specify URLs, absolute paths or relative paths (starting with `./`).

You have the option to pass the passwords as command line parameters or environment values via the support in [Config](https://github.com/lightbend/config#optional-system-or-env-variable-overrides).

### Kerberos

The properties described in Kafka’s [Configuring Kafka Clients for Kerberos](https://kafka.apache.org/41/documentation.html#security_sasl_kerberos_clientconfig) go in the `akka.kafka.consumer.kafka-clients` and `akka.kafka.producer.kafka-clients` sections of the configuration, or can be added programmatically via `ProducerSettings.withProperties` and `ConsumerSettings.withProperties`.

```
akka.kafka.producer { # and akka.kafka.consumer respectively
  kafka-clients {
    security.protocol=SASL_PLAINTEXT # (or SASL_SSL)
    sasl.mechanism=GSSAPI
    sasl.kerberos.service.name=kafka
  }
}

```

## Code Examples

### Example 1: SSL

```hocon
akka.kafka.producer { # and akka.kafka.consumer respectively
  kafka-clients {
    security.protocol=SSL
    ssl.truststore.location=/var/private/ssl/kafka.client.truststore.jks
    ssl.truststore.password=test1234
    ssl.keystore.location=/var/private/ssl/kafka.client.keystore.jks
    ssl.keystore.password=test1234
    ssl.key.password=test1234
  }
}
```

### Example 2: Kerberos

```hocon
akka.kafka.producer { # and akka.kafka.consumer respectively
  kafka-clients {
    security.protocol=SASL_PLAINTEXT # (or SASL_SSL)
    sasl.mechanism=GSSAPI
    sasl.kerberos.service.name=kafka
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/alpakka-kafka/current/producer.html
- https://doc.akka.io/libraries/alpakka-kafka/current/snapshots.html
- https://doc.akka.io/libraries/alpakka-kafka/current/testing-testcontainers.html

---
*Source: [https://doc.akka.io/libraries/alpakka-kafka/current/production.html](https://doc.akka.io/libraries/alpakka-kafka/current/production.html)*
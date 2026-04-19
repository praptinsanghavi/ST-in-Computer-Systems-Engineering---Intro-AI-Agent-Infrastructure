---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:24Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/projects/message-brokers.html
title: 'Configure message brokers :: Akka Documentation'
---

# Configure message brokers :: Akka Documentation

## Content

# Configure message brokers

Akka eventing integrates with *Google Cloud Pub/Sub* and managed Kafka services such as *Confluent Cloud*, *Amazon Managed Streaming for Apache Kafka (Amazon MSK)*, *Aiven for Apache Kafka*, and *Azure Event Hubs* to enable asynchronous messaging and integrations with other systems.

Message brokers are configured at the Akka project level. A project can have one broker configuration. Akka eventing is independent of the broker technology.

## Broker services

Follow the detailed steps to configure the desired message broker service for use with your Akka project:

- [Google Pub/Sub](broker-google-pubsub.html)
- [Confluent Cloud](broker-confluent.html)
- [Amazon MSK](broker-aws-msk.html)
- [Aiven for Apache Kafka](broker-aiven.html)
- [Azure Event Hubs](broker-azure-eventhubs.html)

We continuously evaluate additional integrations for potential built\-in support in Akka. If you have specific requirements, please contact us at [\[email protected]](/cdn-cgi/l/email-protection#95e6e0e5e5fae7e1d5f4fefef4bbfcfa).

For running Akka services that integrate with a message broker locally, see [running a service with broker support](../../sdk/running-locally.html#_local_broker_support).

## See also

- [`akka projects config` commands](../../reference/cli/akka-cli/akka_projects_config.html#_see_also)
- [Google Cloud Pub/Sub](https://cloud.google.com/pubsub/docs/overview)
- [Confluent Cloud](https://www.confluent.io/confluent-cloud)
- [Amazon MSK](https://aws.amazon.com/msk/)
- [Aiven for Apache Kafka](https://aiven.io/kafka)

## Related Pages (Internal Links)

- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/operations/projects/broker-aiven.html
- https://doc.akka.io/operations/projects/broker-aws-msk.html
- https://doc.akka.io/operations/projects/broker-azure-eventhubs.html
- https://doc.akka.io/operations/projects/broker-confluent.html
- https://doc.akka.io/operations/projects/broker-google-pubsub.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_config.html
- https://doc.akka.io/sdk/running-locally.html

---
*Source: [https://doc.akka.io/operations/projects/message-brokers.html](https://doc.akka.io/operations/projects/message-brokers.html)*
---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:39:30Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/project/examples.html
title: Example projects • Akka core
---

# Example projects • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Example projects

The following example projects can be downloaded. They contain build files and have instructions of how to run.

## Quickstart

- Scala [akka\-quickstart\-scala.zip](../attachments/akka-quickstart-scala.zip)
- Java [akka\-quickstart\-java.zip](../attachments/akka-quickstart-java.zip)

The *Quickstart* sample is described in [Introduction to Actors](../typed/actors.html#first-example) and walks you through example code that introduces how to define actor systems, actors, and messages.

## FSM

- Scala [Dining hackers with FSM](https://github.com/akka/akka-core/tree/main/samples/akka-sample-fsm-scala) ([akka\-sample\-fsm\-scala.zip](../attachments/akka-sample-fsm-scala.zip))
- Java [Dining hackers with FSM](https://github.com/akka/akka-core/tree/main/samples/akka-sample-fsm-java) ([akka\-sample\-fsm\-java.zip](../attachments/akka-sample-fsm-java.zip))

This project contains a Dining Hakkers sample illustrating how to model a Finite State Machine (FSM) with actors.

## Cluster

- Scala [Cluster example project](https://github.com/akka/akka-core/tree/main/samples/akka-sample-cluster-scala#readme) ([akka\-sample\-cluster\-scala.zip](../attachments/akka-sample-cluster-scala.zip))
- Java [Cluster example project](https://github.com/akka/akka-core/tree/main/samples/akka-sample-cluster-java#readme) ([akka\-sample\-cluster\-java.zip](../attachments/akka-sample-cluster-java.zip))

This project contains samples illustrating different Cluster features, such as subscribing to cluster membership events, and sending messages to actors running on nodes in the cluster with Cluster aware routers.

It also includes Multi JVM Testing with the `sbt-multi-jvm` plugin.

## Distributed Data

- Scala [Distributed data example project](https://github.com/akka/akka-core/tree/main/samples/akka-sample-distributed-data-scala#readme) ([akka\-sample\-distributed\-data\-scala.zip](../attachments/akka-sample-distributed-data-scala.zip))
- Java [Distributed data example project](https://github.com/akka/akka-core/tree/main/samples/akka-sample-distributed-data-java#readme) ([akka\-sample\-distributed\-data\-java.zip](../attachments/akka-sample-distributed-data-java.zip))

This project contains several samples illustrating how to use Distributed Data.

## Cluster Sharding

- Scala [Cluster Sharding example](https://github.com/akka/akka-core/tree/main/samples/akka-sample-sharding-scala#readme) ([akka\-sample\-sharding\-scala.zip](../attachments/akka-sample-sharding-scala.zip))
- Java [Cluster Sharding example](https://github.com/akka/akka-core/tree/main/samples/akka-sample-sharding-java#readme) ([akka\-sample\-sharding\-java.zip](../attachments/akka-sample-sharding-java.zip))

This project contains a KillrWeather sample illustrating how to use Cluster Sharding.

## Persistence and CQRS

The [Microservices with Akka tutorial](https://doc.akka.io/libraries/guide/microservices-tutorial/) contains a Shopping Cart sample illustrating how to use Event Sourcing and Projections together. The events are consumed by even processors to build other representations from the events, or publish the events to other services.

## Replicated Event Sourcing

The [Akka Distributed Cluster Guide](https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/3-active-active.html) illustrates how to use [Replicated Event Sourcing](../typed/replicated-eventsourcing.html) that supports active\-active persistent entities.

## Kafka to Cluster Sharding

- Scala [akka\-sample\-kafka\-to\-sharding\-scala.zip](../attachments/akka-sample-kafka-to-sharding-scala.zip)

This project demonstrates how to use the External Shard Allocation strategy to co\-locate the consumption of Kafka partitions with the shard that processes the messages.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/additional/books.html
- https://doc.akka.io/libraries/akka-core/current/attachments/akka-quickstart-java.zip
- https://doc.akka.io/libraries/akka-core/current/attachments/akka-quickstart-scala.zip
- https://doc.akka.io/libraries/akka-core/current/attachments/akka-sample-cluster-java.zip
- https://doc.akka.io/libraries/akka-core/current/attachments/akka-sample-cluster-scala.zip
- https://doc.akka.io/libraries/akka-core/current/attachments/akka-sample-distributed-data-java.zip
- https://doc.akka.io/libraries/akka-core/current/attachments/akka-sample-distributed-data-scala.zip
- https://doc.akka.io/libraries/akka-core/current/attachments/akka-sample-fsm-java.zip
- https://doc.akka.io/libraries/akka-core/current/attachments/akka-sample-fsm-scala.zip
- https://doc.akka.io/libraries/akka-core/current/attachments/akka-sample-kafka-to-sharding-scala.zip
- https://doc.akka.io/libraries/akka-core/current/attachments/akka-sample-sharding-java.zip
- https://doc.akka.io/libraries/akka-core/current/attachments/akka-sample-sharding-scala.zip
- https://doc.akka.io/libraries/akka-core/current/project/links.html
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing.html
- https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/3-active-active.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/

---
*Source: [https://doc.akka.io/libraries/akka-core/current/project/examples.html](https://doc.akka.io/libraries/akka-core/current/project/examples.html)*
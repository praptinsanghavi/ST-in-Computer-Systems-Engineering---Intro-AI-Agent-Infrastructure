---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:13:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/project/examples.html
title: Example projects • Akka Documentation
---

# Example projects • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Example projects

The following example projects can be downloaded. They contain build files and have instructions of how to run.

## Quickstart

[Quickstart Guide](https://developer.lightbend.com/guides/akka-quickstart-scala/) [Quickstart Guide](https://developer.lightbend.com/guides/akka-quickstart-java/)

The *Quickstart* guide walks you through example code that introduces how to define actor systems, actors, and messages as well as how to use the test module and logging.

## FSM

[FSM example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-fsm-java) [FSM example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-fsm-scala)

This project contains a Dining Hakkers sample illustrating how to model a Finite State Machine (FSM) with actors.

## Cluster

[Cluster example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-java) [Cluster example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-scala)

This project contains samples illustrating different Cluster features, such as subscribing to cluster membership events, and sending messages to actors running on nodes in the cluster with Cluster aware routers.

It also includes Multi JVM Testing with the `sbt-multi-jvm` plugin.

## Distributed Data

[Distributed Data example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-distributed-data-java) [Distributed Data example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-distributed-data-scala)

This project contains several samples illustrating how to use Distributed Data.

## Cluster Sharding

[Sharding example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-sharding-java) [Sharding example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-sharding-scala)

This project contains a KillrWeather sample illustrating how to use Cluster Sharding.

## Persistence

[Persistence example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-persistence-java) [Persistence example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-persistence-scala)

This project contains a Shopping Cart sample illustrating how to use Akka Persistence.

## CQRS

The [Microservices with Akka tutorial](https://developer.lightbend.com/docs/akka-platform-guide/microservices-tutorial/) contains a Shopping Cart sample illustrating how to use Event Sourcing and Projections together. The events are tagged to be consumed by even processors to build other representations from the events, or publish the events to other services.

## Replicated Event Sourcing

[Multi\-DC Persistence example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-persistence-dc-java) [Multi\-DC Persistence example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-persistence-dc-scala)

Illustrates how to use [Replicated Event Sourcing](../typed/replicated-eventsourcing.html) that supports active\-active persistent entities across data centers.

## Cluster with Docker

[Cluster with docker\-compse example project](https://developer.lightbend.com/start/?group=akka&project=akka-sample-cluster-docker-compose-java) [Cluster with docker\-compose example project](https://developer.lightbend.com/start/?group=akka&project=akka-sample-cluster-docker-compose-scala)

Illustrates how to use Akka Cluster with Docker compose.

## Cluster with Kubernetes

[Cluster with Kubernetes example project](https://developer.lightbend.com/start/?group=akka&project=akka-sample-cluster-kubernetes-java)

This sample illustrates how to form an Akka Cluster with Akka Bootstrap when running in Kubernetes.

## Distributed workers

[Distributed workers example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-distributed-workers-scala)

This project demonstrates the work pulling pattern using Akka Cluster.

## Kafka to Cluster Sharding

[Kafka to Cluster Sharding example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-kafka-to-sharding)

This project demonstrates how to use the External Shard Allocation strategy to co\-locate the consumption of Kafka partitions with the shard that processes the messages.

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.6/additional/books.html
- https://doc.akka.io/libraries/akka-core/2.6/project/links.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/replicated-eventsourcing.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/project/examples.html](https://doc.akka.io/libraries/akka-core/2.6/project/examples.html)*
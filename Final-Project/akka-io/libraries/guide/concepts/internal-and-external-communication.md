---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/concepts/internal-and-external-communication.html
title: 'Internal and External Communication :: Akka Guide'
---

# Internal and External Communication :: Akka Guide

## Content

# Internal and External Communication

Microservices should be [isolated](isolation.html) and [autonomous](autonomy.html).

Multiple services communicate with each other (**inter\-service**) by sending messages over a network. To achieve performance and resilience, you will often run multiple instances of the same service, typically on different nodes, and such **intra\-service** communication also goes over the network. In addition, third\-party and/or legacy systems might also consume or provide information for your microservice system.

## Communication within a Microservices system

Inter\-service communication must use loosely\-coupled protocols and message formats to maintain isolation and autonomy. Coordinating change between different services can be difficult and costly. You can achieve this in your system by taking advantage of the following:

- [Akka gRPC ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-grpc/current), either unary or streaming, allow services to communicate with each other using published APIs and standard protocols.
- Publishing messages to a broker, such as Apache Kafka, decouples communication even further. If a new instance starts publishing information, its messages are added to events previously emitted. If a new instance subscribes to a topic, they will receive all events, past, present, and future (as long as they are subscribed).

Nodes of a single service (collectively called a cluster) require less decoupling. They share the same code and are managed together, as a set, by a single team or individual. For this reason, intra\-service communication can take advantage of mechanisms that have less overhead and better performance.

- [Akka Cluster ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/typed/index-cluster.html) provides multiple features (pub\-sub, distributed data, sharding, reliable delivery,…​) for intra\-service communication.
- Databases and other persistent storage can be seen as another way that nodes of a service communicate. For Microservices that use persistent entities, we encourage [Event Sourcing](event-sourcing.html) , which also takes advantage of asynchronous communication and provides guarantees via an event log.

This diagram illustrates each of these types of inter\- and intra\-service communication in a Microservices system distributed across three servers. In the example, the Order service publishes to one or more Kafka topics, while the User service subscribes to consume the information. The User service communicates with other User service instances (cluster members) using Akka Cluster. The Shipping service and User service exchange information by streaming it in service calls.

![Internal and External Communication](_images/concepts/internal-and-external-communication.png)

Example of Internal and External Communications

|  | The [Implementing Microservices with Akka](../microservices-tutorial/index.html) tutorial illustrates some of the concepts presented above:   - In [Section 7: Service\-to\-Service Eventing](../microservices-tutorial/projection-over-grpc.html) you will learn how to use service\-to\-service eventing for brokerless communication between Microservices. - In [Section 8: Projection calling gRPC service](../microservices-tutorial/projection-grpc-client.html) you will learn how to use Akka gRPC for synchronous communication between two Microservices. - In [Section 4: Create the Event Sourced Cart entity](../microservices-tutorial/entity.html) you will learn how to use Akka Cluster Sharding for communication within a Microservice. - In [Section 6: Projection for queries](../microservices-tutorial/projection-query.html) you will learn how to use the event journal (database) for communication within a Microservice. |
| --- | --- |

## Communication with parties outside of a Microservices system

Akka promotes use of asynchronous communication without preventing use of synchronous communication where necessary. Third parties can obtain data asynchronously from Akka services that publish to the Broker API. Akka services can also expose an API for third parties to exchange data synchronously. This is usually mapped to gRPC or HTTP.

Interaction with the outside world could mean that clients use the services over the internet, such as browsers, mobile apps or IoT devices. While using standard HTTP or WebSockets, typically such clients do not communicate directly with individual services. Usually, a network boundary acts as a perimeter, and a well\-controlled communication point acts as the intermediary between the outside world and the inside world. This communication point is a service gateway. Envision your Microservices system as a Medieval town with a wall around it and one gate offers the only way in or out. Communication inside the walls is free and direct, but communication to or from the outside world must come through the service gateway.

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/current/typed/index-cluster.html
- https://doc.akka.io/libraries/akka-grpc/current
- https://doc.akka.io/libraries/guide/concepts/autonomy.html
- https://doc.akka.io/libraries/guide/concepts/event-sourcing.html
- https://doc.akka.io/libraries/guide/concepts/isolation.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/entity.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/index.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/projection-grpc-client.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/projection-over-grpc.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/projection-query.html

---
*Source: [https://doc.akka.io/libraries/guide/concepts/internal-and-external-communication.html](https://doc.akka.io/libraries/guide/concepts/internal-and-external-communication.html)*
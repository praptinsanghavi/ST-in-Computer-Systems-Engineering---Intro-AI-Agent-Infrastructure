---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/microservices-tutorial/index.html
title: 'Implementing Microservices with Akka :: Akka Guide'
---

# Implementing Microservices with Akka :: Akka Guide

## Content

# Implementing Microservices with Akka

This tutorial illustrates how Microservices can interact to implement a shopping cart system. The sections listed below show how to build the services piece by piece, from scratch.

- [Shopping Cart example architecture](overview.html)
- [Section 1: Set up your development environment](dev-env.html)
- [Section 2: Start a project](template.html)
- [Section 3: Create the gRPC Cart service](grpc-service.html)
- [Section 4: Create the Event Sourced Cart entity](entity.html)
- [Section 5: Complete Event Sourced entity](complete-entity.html)
- [Section 6: Projection for queries](projection-query.html)
- [Section 7: Service\-to\-Service Eventing](projection-over-grpc.html)
- [Section 8: Projection calling gRPC service](projection-grpc-client.html)

## Learn more

The following links provide more information about some of the Akka features used in the tutorial.

- [Akka Cluster Sharding ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html) to distribute Event Sourced cart entities and Projections
- [Akka Event Sourcing ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/typed/persistence.html) to store the state of the shopping carts
- [Akka Projections ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-projection/current/) to enable CQRS and event based communication with other services
- [Akka gRPC ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-grpc/current/) to implement a gRPC service API and communication with other services
- [Akka Management ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-management/current/) for Akka Cluster formation and health checks

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence.html
- https://doc.akka.io/libraries/akka-grpc/current/
- https://doc.akka.io/libraries/akka-management/current/
- https://doc.akka.io/libraries/akka-projection/current/
- https://doc.akka.io/libraries/guide/microservices-tutorial/complete-entity.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/dev-env.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/entity.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/grpc-service.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/overview.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/projection-grpc-client.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/projection-over-grpc.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/projection-query.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/template.html

---
*Source: [https://doc.akka.io/libraries/guide/microservices-tutorial/index.html](https://doc.akka.io/libraries/guide/microservices-tutorial/index.html)*
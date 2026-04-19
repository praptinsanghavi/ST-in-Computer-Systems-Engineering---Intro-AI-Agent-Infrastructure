---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:55Z'
section: guide
site: akka-io
source_url: https://doc.akka.io/libraries/guide/microservices-tutorial/overview.html
title: 'Shopping Cart example architecture :: Akka Guide'
---

# Shopping Cart example architecture :: Akka Guide

## Content

# Shopping Cart example architecture

This tutorial shows how to build the functionality for a Shopping Cart system. When complete, end users will be able to add items to a cart and checkout, creating an order. As shown in the following illustration, the system includes three services that use [Akka gRPC](../concepts/akka-grpc.html) and Kafka as transport mechanisms: Cart, Order, and Analytics.

![Example overview](_images/example-overview.drawio.svg)

Each user’s cart is represented by a Cart Entity. Cart state is persisted using [Event Sourcing](../concepts/event-sourcing.html): When a user updates their cart, the Entity persists events in an *Event Journal* database. Using [Command Query Responsibility Segregation](../concepts/cqrs.html) (CQRS), which separates read and write responsibility, [Akka Projections ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-projection/current/) provide the data necessary for the Order and Analytics services.

The `PopularityProjection` uses the events from all shopping carts to store a representation in the database to answer queries of how popular the items are.

Follow the steps in the tutorial to build functionality a bit at a time and try running it as you go.

## Related Pages (Internal Links)

- https://doc.akka.io/guide/concepts/akka-grpc.html
- https://doc.akka.io/guide/concepts/cqrs.html
- https://doc.akka.io/guide/concepts/event-sourcing.html
- https://doc.akka.io/libraries/akka-projection/current/

---
*Source: [https://doc.akka.io/guide/microservices-tutorial/overview.html](https://doc.akka.io/guide/microservices-tutorial/overview.html)*
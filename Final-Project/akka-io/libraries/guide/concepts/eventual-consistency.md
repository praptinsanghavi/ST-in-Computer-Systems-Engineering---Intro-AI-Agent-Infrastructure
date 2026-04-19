---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:28Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/concepts/eventual-consistency.html
title: 'Eventual Consistency :: Akka Guide'
---

# Eventual Consistency :: Akka Guide

## Content

# Eventual Consistency

A [Stateful Aggregate](ddd.html#aggregate) is a consistency boundary and its Event Sourced entity can have strong consistency guarantees. Many other parts of a Microservice can’t be updated atomically together with the entities, such as [Projections](akka-projections.html) that update different representations from the events of the entities. Those updates are eventually consistent with the origin change. Eventual consistency means that the updates may take some time to propagate but eventually they will, also in the case of failures that are eventually resolved. Updates between different Microservices are typically also eventually consistent.

|  | [Accept Uncertainty new tab](https://www.reactiveprinciples.org/principles/accept-uncertainty.html) [Tailor Consistency new tab](https://www.reactiveprinciples.org/principles/tailor-consistency.html) is one of the Reactive Principles. |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/guide/concepts/akka-projections.html
- https://doc.akka.io/libraries/guide/concepts/ddd.html

---
*Source: [https://doc.akka.io/libraries/guide/concepts/eventual-consistency.html](https://doc.akka.io/libraries/guide/concepts/eventual-consistency.html)*
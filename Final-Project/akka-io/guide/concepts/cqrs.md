---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:48:17Z'
section: guide
site: akka-io
source_url: https://doc.akka.io/libraries/guide/concepts/cqrs.html
title: 'Command Query Responsibility Segregation (CQRS) :: Akka Guide'
---

# Command Query Responsibility Segregation (CQRS) :: Akka Guide

## Content

# Command Query Responsibility Segregation (CQRS)

Command Query Responsibility Segregation (abbreviated as CQRS) is an architecture pattern that promotes the divide into read and write operations of your datastore.

In traditional systems where both reads and updates use a single set of database tables you either model and design for speed of read or speed of write. As your application grows, you may need to produce different representations of the same data (e.g daily reports, listing, etc…​) and these eventually become either very slow to produce or happen in a transaction during a write operation slowing the operation down.

In CQRS, the write\-side, responsible for handling Commands, stores data using a database form with the least impedance mismatch in order to increase the throughput. As incremental changes in the state happen, a mechanism processes these increments asynchronously and produces a new database representation tailored for the read\-side. The read\-side, responsible for handling Queries, processes read operations and accesses the information on the read datastore.

|  | The terms **data** and **information** should not be used interchangeably:   - **data** refers to the source of truth - **information** refers to derived representations of the data     It is safe to lose some information as long as the loss doesn’t affect the data that produced that information. |
| --- | --- |

You can start refactoring an application towards a CQRS architecture by identifying the operations that produce a change in the state (the Commands) and the operations that only read from the state (the Queries).

## CQRS and Event Sourcing

As described above, CQRS doesn’t require the write\-side handling the commands to be implemented using [Event Sourcing](event-sourcing.html). Using Event Sourcing, though, is a perfect fit for CQRS.

In CQRS, in order to build the read\-side representations we want a stream of data changes to build projections from, and that is exactly what Event Sourcing provides. In Event Sourcing, state is stored as an append\-only, ordered list of changes (referred to as events).

Summing up, in a CQRS application, the write\-side and the read\-side operate [autonomously ![new tab](../_images/new-tab.svg)](https://www.reactiveprinciples.org/principles/assert-autonomy.html). Generally, the write\-side provides [strong consistency ![new tab](../_images/new-tab.svg)](https://www.reactiveprinciples.org/principles/tailor-consistency.html) while the read\-side provides [eventual consistency](eventual-consistency.html).

## Learn more

- [How to migrate from CRUD to Event Sourcing](../how-to/from-crud-to-eventsourcing.html)
- To see a project implementing CQRS in action, have a look at the ["Implementing Microservices with Akka" tutorial](../microservices-tutorial/index.html). In steps [Section 4: Create the Event Sourced Cart entity](../microservices-tutorial/entity.html), and [Section 5: Complete Event Sourced entity](../microservices-tutorial/complete-entity.html) you will implement a write\-side using [Akka Persistence ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/typed/persistence.html) which implements Event Sourcing. Then, in the step [Section 6: Projection for queries](../microservices-tutorial/projection-query.html) you will implement a read\-side using [Akka Projection ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-projection/current).
- The [Introduction to Akka Projections video ![new tab](../_images/new-tab.svg)](https://akka.io/blog/news/2020/09/10/akka-projection-intro-video) is a good starting point for learning Akka Projections.
- See also the CQRS documentation in the [Akka Projections documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-projection/current/use-cases.html) for more details on how Akka Projection can be used to build a Query side.

## Related Pages (Internal Links)

- https://doc.akka.io/guide/concepts/event-sourcing.html
- https://doc.akka.io/guide/concepts/eventual-consistency.html
- https://doc.akka.io/guide/how-to/from-crud-to-eventsourcing.html
- https://doc.akka.io/guide/microservices-tutorial/complete-entity.html
- https://doc.akka.io/guide/microservices-tutorial/entity.html
- https://doc.akka.io/guide/microservices-tutorial/index.html
- https://doc.akka.io/guide/microservices-tutorial/projection-query.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence.html
- https://doc.akka.io/libraries/akka-projection/current
- https://doc.akka.io/libraries/akka-projection/current/use-cases.html

---
*Source: [https://doc.akka.io/guide/concepts/cqrs.html](https://doc.akka.io/guide/concepts/cqrs.html)*
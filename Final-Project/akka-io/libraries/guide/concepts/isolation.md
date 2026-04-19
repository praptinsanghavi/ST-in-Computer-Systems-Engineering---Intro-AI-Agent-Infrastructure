---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/concepts/isolation.html
title: 'Isolation :: Akka Guide'
---

# Isolation :: Akka Guide

## Content

# Isolation

|  | This concept is related to [resilience new tab](https://www.reactivemanifesto.org) and [elasticity new tab](https://www.reactivemanifesto.org/glossary#Elasticity) which are two properties of [Reactive Systems new tab](https://www.reactivemanifesto.org). |
| --- | --- |

|  | The following is an excerpt from [**Reactive Microservices Architecture: Design Principles For Distributed Systems** — By Jonas Bonér new tab](https://content.akka.io/hubfs/collateral/ebook/ebook-reactive-microservices-architecture.pdf). |
| --- | --- |

Isolation is a prerequisite for [resilience ![new tab](../_images/new-tab.svg)](https://www.reactivemanifesto.org) and [elasticity ![new tab](../_images/new-tab.svg)](https://www.reactivemanifesto.org/glossary#Elasticity) and requires [asynchronous communication ![new tab](../_images/new-tab.svg)](https://www.reactivemanifesto.org/glossary#Asynchronous) boundaries between services to decouple them in:

- *Time*: Allowing concurrency
- *Space*: Allowing distribution and mobility—the ability to move services around

When adopting Microservices, it is also essential to eliminate shared mutable state and thereby minimize coordination, contention and coherency cost, as defined in the Universal Scalability Law by embracing a Share\-Nothing Architecture.

[Resilience ![new tab](../_images/new-tab.svg)](https://www.reactivemanifesto.org) — the ability to heal from failure — depends on compartmentalization and containment of failure, and can only be achieved by breaking free from the strong coupling of synchronous communication. Microservices communicating over a process boundary using asynchronous message\-passing enable the level of indirection and decoupling necessary to capture and manage failure, orthogonally to the regular workflow, using service supervision.

Isolation also makes it easier to scale each service, as well as allowing them to be monitored, debugged and tested independently—something that is very hard if the services are all tangled up in the big bulky monolith.

|  | Decoupling Time, Decoupling Space and Embracing Failure are three of the [Reactive Principles new tab](https://www.reactiveprinciples.org/principles/). |
| --- | --- |

---
*Source: [https://doc.akka.io/libraries/guide/concepts/isolation.html](https://doc.akka.io/libraries/guide/concepts/isolation.html)*
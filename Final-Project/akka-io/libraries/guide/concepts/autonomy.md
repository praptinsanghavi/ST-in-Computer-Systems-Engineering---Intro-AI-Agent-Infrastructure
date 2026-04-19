---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:49Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/concepts/autonomy.html
title: 'Autonomy :: Akka Guide'
---

# Autonomy :: Akka Guide

## Content

# Autonomy

|  | The following is an excerpt from [**Reactive Microservices Architecture: Design Principles For Distributed Systems** — By Jonas Bonér new tab](https://content.akka.io/hubfs/collateral/ebook/ebook-reactive-microservices-architecture.pdf). |
| --- | --- |

[Isolation](isolation.html) is a prerequisite for autonomy. Only when services are isolated can they be fully autonomous and make decisions independently, act independently, and cooperate and coordinate with others to solve problems.

An [autonomous service ![new tab](../_images/new-tab.svg)](https://en.wikipedia.org/wiki/Service_autonomy_principle) can only promise its own behaviour by publishing its protocol/API. Embracing this simple yet fundamental fact has profound impact on how we can understand and model collaborative systems with autonomous services.

Another aspect of autonomy is that if a service only can make promises about its own behavior, then all information needed to resolve a conflict or to repair under failure scenarios are available within the service itself, removing the need for communication and coordination.

Working with autonomous services opens up flexibility around service orchestration, workflow management and collaborative behavior, as well as scalability, availability and runtime management, at the cost of putting more thought into well\-defined and composable APIs that can make communication—and consensus—a bit more challenging—something we will discuss shortly.

|  | Autonomy is one of the [Reactive Principles new tab](https://www.reactiveprinciples.org/principles/assert-autonomy.html). |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/guide/concepts/isolation.html

---
*Source: [https://doc.akka.io/libraries/guide/concepts/autonomy.html](https://doc.akka.io/libraries/guide/concepts/autonomy.html)*
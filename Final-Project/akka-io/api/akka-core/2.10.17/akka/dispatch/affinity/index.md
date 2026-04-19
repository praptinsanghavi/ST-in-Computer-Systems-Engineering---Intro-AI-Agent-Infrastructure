---
description: Akka 2.10.17 - akka.dispatch.affinity
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:04:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/affinity/index.html
title: Akka 2.10.17 - akka.dispatch.affinity
---

# Akka 2.10.17 - akka.dispatch.affinity

> **Summary:** Akka 2.10.17 - akka.dispatch.affinity

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/dispatch/index.html "Permalink")  package [dispatch](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/dispatch/affinity/index.html "Permalink")  package affinityDefinition Classes[dispatch](../index.html)
- [QueueSelector](QueueSelector.html "A QueueSelector is responsible for, given a Runnable and the number of available queues, return which of the queues that Runnable should be placed in.")
- [QueueSelectorFactory](QueueSelectorFactory.html)
- [RejectionHandler](RejectionHandler.html)
- [RejectionHandlerFactory](RejectionHandlerFactory.html)
p[akka](../../index.html).[dispatch](../index.html)

# affinity[**](../../../akka/dispatch/affinity/index.html "Permalink")

#### package affinity

### Type Members

1. [**](../../../akka/dispatch/affinity/QueueSelector.html "Permalink")  trait [QueueSelector](QueueSelector.html "A QueueSelector is responsible for, given a Runnable and the number of available queues, return which of the queues that Runnable should be placed in.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A `QueueSelector` is responsible for, given a `Runnable` and the number of available
queues, return which of the queues that `Runnable` should be placed in.
2. [**](../../../akka/dispatch/affinity/QueueSelectorFactory.html "Permalink")  trait [QueueSelectorFactory](QueueSelectorFactory.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../akka/dispatch/affinity/RejectionHandler.html "Permalink")  trait [RejectionHandler](RejectionHandler.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../akka/dispatch/affinity/RejectionHandlerFactory.html "Permalink")  trait [RejectionHandlerFactory](RejectionHandlerFactory.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/affinity/QueueSelector.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/affinity/QueueSelectorFactory.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/affinity/RejectionHandler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/affinity/RejectionHandlerFactory.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/affinity/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/affinity/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/affinity/index.html)*
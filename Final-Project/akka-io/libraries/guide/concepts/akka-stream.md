---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:42Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/concepts/akka-stream.html
title: 'Akka Streams :: Akka Guide'
---

# Akka Streams :: Akka Guide

## Content

# Akka Streams

[Akka Streams ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/stream/stream-introduction.html) provides an intuitive and safe way to formulate stream processing setups such that we can then execute them efficiently and with bounded resource usage —\- no more OutOfMemoryErrors.

The Akka Streams API is completely decoupled from the [Reactive Streams](reactive-streams.html) interfaces. While Akka Streams focus on the formulation of transformations on data streams the scope of Reactive Streams is to define a common mechanism of how to move data across an asynchronous boundary without losses, buffering or resource exhaustion.

The relationship between Akka Streams and Reactive Streams is that the Akka Streams API is geared towards end\-users while the Akka Streams implementation uses the Reactive Streams interfaces internally to pass data between the different operators. What this means is that you can implement an application where Akka Streams interconnect with other Reactive Streams implementations in a fully compatible way.

## Learn more

To learn more, have a look at the [Akka Streams documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/stream/stream-introduction.html) dedicated sections:

- Read the [Quick Start Guide ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/stream/stream-quickstart.html) to get a feel for how streams look like and what they can do.
- Read the [Design Principles behind Akka Streams ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/general/stream/stream-design.html) for a top down learning approach.
- Have a look at the [operator index ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html) for a complete overview of the built\-in processing operators.
- Check the [reference guide ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/stream/stream-flows-and-basics.html) for an in\-depth documentation into specific topics.

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/current/general/stream/stream-design.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-flows-and-basics.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-introduction.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-quickstart.html
- https://doc.akka.io/libraries/guide/concepts/reactive-streams.html

---
*Source: [https://doc.akka.io/libraries/guide/concepts/akka-stream.html](https://doc.akka.io/libraries/guide/concepts/akka-stream.html)*
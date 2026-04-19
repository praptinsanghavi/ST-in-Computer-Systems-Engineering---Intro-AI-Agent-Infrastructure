---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:04:51Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/guide/introduction.html
title: Introduction to Akka • Akka Documentation
---

# Introduction to Akka • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Introduction to Akka

Welcome to Akka, a set of open\-source libraries for designing scalable, resilient systems that span processor cores and networks. Akka allows you to focus on meeting business needs instead of writing low\-level code to provide reliable behavior, fault tolerance, and high performance.

Many common practices and accepted programming models do not address important challenges inherent in designing systems for modern computer architectures. To be successful, distributed systems must cope in an environment where components crash without responding, messages get lost without a trace on the wire, and network latency fluctuates. These problems occur regularly in carefully managed intra\-datacenter environments \- even more so in virtualized architectures.

To help you deal with these realities, Akka provides:

- Multi\-threaded behavior without the use of low\-level concurrency constructs like atomics or locks — relieving you from even thinking about memory visibility issues.
- Transparent remote communication between systems and their components — relieving you from writing and maintaining difficult networking code.
- A clustered, high\-availability architecture that is elastic, scales in or out, on demand — enabling you to deliver a truly reactive system.

Akka’s use of the actor model provides a level of abstraction that makes it easier to write correct concurrent, parallel and distributed systems. The actor model spans the full set of Akka libraries, providing you with a consistent way of understanding and using them. Thus, Akka offers a depth of integration that you cannot achieve by picking libraries to solve individual problems and trying to piece them together.

By learning Akka and how to use the actor model, you will gain access to a vast and deep set of tools that solve difficult distributed/parallel systems problems in a uniform programming model where everything fits together tightly and efficiently.

## How to get started

If this is your first experience with Akka, we recommend that you start by running a simple Hello World project. See the [Quickstart Guide](https://developer.lightbend.com/guides/akka-quickstart-scala/) [Quickstart Guide](https://developer.lightbend.com/guides/akka-quickstart-java/) for instructions on downloading and running the Hello World example. The *Quickstart* guide walks you through example code that introduces how to define actor systems, actors, and messages as well as how to use the test module and logging. Within 30 minutes, you should be able to run the Hello World example and learn how it is constructed.

This *Getting Started* guide provides the next level of information. It covers why the actor model fits the needs of modern distributed systems and includes a tutorial that will help further your knowledge of Akka. Topics include:

- [Why modern systems need a new programming model](actors-motivation.html)
- [How the actor model meets the needs of concurrent, distributed systems](actors-intro.html)
- [Overview of Akka libraries and modules](modules.html)
- A [more complex example](tutorial.html) that builds on the Hello World example to illustrate common Akka patterns.

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.6/typed/guide/actors-intro.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/guide/actors-motivation.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/guide/index.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/guide/modules.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/guide/tutorial.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/typed/guide/introduction.html](https://doc.akka.io/libraries/akka-core/2.6/typed/guide/introduction.html)*
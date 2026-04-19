---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:55Z'
section: guide
site: akka-io
source_url: https://doc.akka.io/libraries/guide/microservices-tutorial/dev-env.html
title: 'Section 1: Set up your development environment :: Akka Guide'
---

# Section 1: Set up your development environment :: Akka Guide

## Content

# Section 1: Set up your development environment

Language

Select your preferred language (Java/Scala) above.

To follow tutorial steps you will need a code editor, a build tool, and `grpcurl` (a CLI for sending gRPC calls). You can use your preferred code editor. We provide the steps for using [IntelliJ IDEA ![new tab](../_images/new-tab.svg)](https://www.jetbrains.com/idea/) from JetBrains. For the Scala Java version of the example, we use `sbt` `Apache Maven` as the build tool.

This tutorial uses a PostgreSQL database and Kafka. You may run local installations during development, but we recommend running both services using [Docker ![new tab](../_images/new-tab.svg)](https://docs.docker.com). The template project’s root directory includes a [Docker Compose ![new tab](../_images/new-tab.svg)](https://docs.docker.com/compose/) file that you can use to run PostgreSQL and Kafka. The provided Docker Compose file also runs Zookeeper which is required to run a Kafka broker.

The following sections provide links for downloading and installing:

- [IntelliJ IDEA](#_intellij_idea)
- [Build tool](#_build_tool)
- [The grpcurl tool](#_the_grpcurl_tool)
- [Docker and Docker Compose](#docker)

We also provide [Downloadable example source](#_downloadable_example_source) of the different phases of completion.

|  | The Java example takes advantage of some of the Java features introduced in Java 21 such as records and advanced pattern matching. If you can’t have Java 21 installed, you can still follow the tutorial, but you will need to adjust some code accordingly to the Java version in use. |
| --- | --- |

## IntelliJ IDEA

Java

Download and install [IntelliJ ![new tab](../_images/new-tab.svg)](https://www.jetbrains.com/idea/download/).

Scala

To install IntelliJ and prepare to develop the Scala example, follow these steps:

1. Download and install [IntelliJ ![new tab](../_images/new-tab.svg)](https://www.jetbrains.com/idea/download/).
2. From the **Preferences** menu, add the **Scala** plugin.

## Build tool

Java

For the Java Shopping Cart example, we use `Maven` as the build tool. [Install Maven](https://maven.apache.org/install.html) if you haven’t already.

Scala

For the Scala Shopping Cart example, we use `sbt` as the build tool. [Install sbt](https://www.scala-sbt.org/download) if you haven’t already.

|  | `sbt` is an interactive shell. If you start it with the `sbt` command, you can repeatedly run tasks like `compile` and `test` in the sbt shell. In the tutorial we use the full command for clarity, such as `sbt compile`. You can run tasks independently in this way, but it’s faster to leave the `sbt` shell running and only enter the tasks. For example:     ``` $ sbt ... sbt:shopping-cart-service> compile ... sbt:shopping-cart-service> test ... ``` |
| --- | --- |

## The grpcurl tool

The [grpcurl ![new tab](../_images/new-tab.svg)](https://github.com/fullstorydev/grpcurl) tool is useful for making gRPC calls from the command line. It is used in tutorial procedures and we recommend that you install it as described in [the grpcurl documentation ![new tab](../_images/new-tab.svg)](https://github.com/fullstorydev/grpcurl#installation).

## Docker and Docker Compose

See the instructions for installing [Docker ![new tab](../_images/new-tab.svg)](https://docs.docker.com/get-started/get-docker/) and [Docker Compose ![new tab](../_images/new-tab.svg)](https://docs.docker.com/compose/install/) on your platform.

## Downloadable example source

We encourage you to enter the example code, even if by copying and pasting. If you get stuck or prefer to skip some main steps, we provide source files for download. The introduction of each page with tutorial development steps includes links to two zip files: one with completed source up to that point, and one with completed source for the steps described on that page.

In [next step](template.html) you will find instructions of how to download the starting template for the tutorial.

Java

If you would like to run the full example, you can download the [full Java sources](_attachments/6-shopping-cart-complete-java.zip). In this case, we suggest you scan the tutorial instructions to identify the source files that you can learn from.

Scala

If you would like to run the full example, you can download the [full Scala sources](_attachments/6-shopping-cart-complete-scala.zip). In this case, we suggest you scan the tutorial instructions to identify the source files that you can learn from.

## Related Pages (Internal Links)

- https://doc.akka.io/guide/microservices-tutorial/_attachments/6-shopping-cart-complete-java.zip
- https://doc.akka.io/guide/microservices-tutorial/_attachments/6-shopping-cart-complete-scala.zip
- https://doc.akka.io/guide/microservices-tutorial/template.html

---
*Source: [https://doc.akka.io/guide/microservices-tutorial/dev-env.html](https://doc.akka.io/guide/microservices-tutorial/dev-env.html)*
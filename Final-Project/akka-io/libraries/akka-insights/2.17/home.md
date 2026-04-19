---
description: Telemetry for Lightbend Platform
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:07Z'
section: libraries
site: akka-io
source_url: https://developer.lightbend.com/docs/telemetry/current//home.html
title: Lightbend Telemetry
---

# Lightbend Telemetry

> **Summary:** Telemetry for Lightbend Platform

## Content

# Lightbend Telemetry

Telemetry, part of Lightbend’s Intelligent Monitoring feature set, is a suite of insight tools that provides a view into the workings of our distributed platforms. This view allows developers and operations to respond quickly to problems, track down unexpected behavior and even tune your system. As a result, you can deploy your applications to production with confidence.

What is Lightbend Telemetry? A picture says more than 1000 words, so let’s begin with an architecture overview of Intelligent Monitoring from Lightbend and its components:

![Lightbend monitoring overview](images/lightbend-monitoring-basic-overview.png)

As you can see above Monitoring consists of Telemetry (Cinnamon). Telemetry makes it possible to gather metric, event and trace information from Akka, Scala, Play, and Lagom based applications. The information is transferred to various backends. The rest of this documentation provides an overview of Telemetry and explains how to get started, configure and run Telemetry in production.

Lightbend Telemetry requires a [subscription from Lightbend](https://www.lightbend.com/lightbend-platform-subscription).

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.17/home.html](https://doc.akka.io/libraries/akka-insights/2.17/home.html)*
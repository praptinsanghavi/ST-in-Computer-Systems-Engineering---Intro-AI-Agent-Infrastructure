---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:12Z'
section: libraries
site: akka-io
source_url: /extensions/opentracing/opentracing.html
title: OpenTracing • Akka Insights
---

# OpenTracing • Akka Insights

## Content

# OpenTracing

[OpenTracing](https://opentracing.io) is an open standard for distributed tracing. Distributed tracing can be used for *optimizing end\-user latency* (the trace gives a breakdown of where time has been spent in distributed requests), *root\-cause analysis for errors* (errors can be annotated in the trace and show how other parts of a distributed system relate to an error), and *understanding the bigger picture of the system* (traces can give insight into the distinct pieces of a distributed system and how they are connected).

As an example, here’s a simple message flow across actors:

![Actor trace example](../../images/actor-trace-example.png)

Actor **A** sends messages to actors **B** and **C** (which is running in a different actor system), and actor **C** sends a message to actor **D**.

Here’s what a possible trace for this message flow looks like conceptually:

![Conceptual actor trace](../../images/actor-trace.png)

A **trace** shows a dataflow or an execution path through a distributed system. Each **span** in the trace represents a logical unit of work. In the case of actors, each span represents the processing of a message by an actor. The duration of the span is recorded. Spans may be nested to model causal relationships, with spans referencing other spans, and for actor tracing these relationships are message sends. Events can be logged within a span.

An actor trace shows the flow of messages, and records when messages were processed and how long it took to process each message. Message sends to other actors are logged within the trace span, as well as any actor events such as actor failures, unhandled messages, dead letters, or logged errors and warnings.

For configuring tracing, or integrating with tracing solutions, see the following documentation:

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-insights/2.21/extensions/custom-metrics.html
- https://doc.akka.io/libraries/akka-insights/2.21/extensions/opentracing/enabling.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.21/extensions/opentracing/opentracing.html](https://doc.akka.io/libraries/akka-insights/2.21/extensions/opentracing/opentracing.html)*